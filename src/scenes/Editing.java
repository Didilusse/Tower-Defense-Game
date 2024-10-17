package scenes;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import helper.LoadSave;
import main.Game;
import objects.Tile;
import UI.Toolbar;

public class Editing extends GameScene implements SceneMethods {

    private int[][] lvl;
    private Tile selectedTile;
    private int mouseX, mouseY;
    private int lastTileX, lastTileY, lastTileId;
    private boolean drawSelect;
    private Toolbar toolbar;

    public Editing(Game game) {
        super(game);
        loadDefaultLevel();
        toolbar = new Toolbar(0, 640, 640, 100, this);
    }

    private void loadDefaultLevel() {
        lvl = LoadSave.GetLevelData("new_level");
    }

    public void update() {
        updateTick();
    }

    @Override
    public void render(Graphics g) {

        drawLevel(g);
        toolbar.draw(g);
        drawSelectedTile(g);

    }

    private void drawLevel(Graphics g) {
        for (int y = 0; y < lvl.length; y++) {
            for (int x = 0; x < lvl[y].length; x++) {
                int id = lvl[y][x];
                if (isAnimation(id)) {
                    g.drawImage(getSprite(id, animationIndex), x * 32, y * 32, null);
                } else
                    g.drawImage(getSprite(id), x * 32, y * 32, null);
            }
        }
    }

    private void drawSelectedTile(Graphics g) {
        if (selectedTile != null && drawSelect) {
            g.drawImage(selectedTile.getSprite(), mouseX, mouseY, 32, 32, null);
        }

    }

    public void saveLevel() {

        LoadSave.SaveLevel("new_level", lvl);
        game.getPlaying().setLevel(lvl);

    }

    public void setSelectedTile(Tile tile) {
        this.selectedTile = tile;
        drawSelect = true;
    }

    private void changeTile(int x, int y) {
        if (selectedTile != null) {

            int tileX = x / 32;
            int tileY = y / 32;

            if (lastTileX == tileX && lastTileY == tileY && lastTileId == selectedTile.getId())
                return;

            lastTileX = tileX;
            lastTileY = tileY;
            lastTileId = selectedTile.getId();

            lvl[tileY][tileX] = selectedTile.getId();
        }
    }

    @Override
    public void mouseClicked(int x, int y) {
        if (y >= 640) {
            toolbar.mouseClicked(x, y);
        } else {
            changeTile(mouseX, mouseY);
        }

    }

    @Override
    public void mouseMoved(int x, int y) {

        if (y >= 640) {
            toolbar.mouseMoved(x, y);
            drawSelect = false;
        } else {
            drawSelect = true;
            mouseX = (x / 32) * 32;
            mouseY = (y / 32) * 32;
        }

    }

    @Override
    public void mousePressed(int x, int y) {
        if (y >= 640)
            toolbar.mousePressed(x, y);

    }

    @Override
    public void mouseReleased(int x, int y) {
        toolbar.mouseReleased(x, y);

    }

    @Override
    public void mouseDragged(int x, int y) {
        if (y >= 640) {

        } else {
            changeTile(x, y);
        }

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_R)
            toolbar.rotateSprite();
    }

}
