package scenes;

import java.awt.Color;
import java.awt.Graphics;

import UI.BottomBar;
import UI.MyButton;
import helper.LevelBuild;
import main.Game;
import managers.TileManager;

public class Playing extends GameScene implements SceneMethods {

    private int[][] lvl;
    private TileManager tileManager;
    private MyButton bMenu;

    private BottomBar bottomBar;

    public Playing(Game game) {
        super(game);
        initButtons();
        lvl = LevelBuild.getLevelData();
        tileManager = new TileManager();
        bottomBar = new BottomBar(0, 640, 640, 100);

        //The level


    }

    private void initButtons() {
        bMenu = new MyButton("Menu", 2, 2, 100, 30);
    }


    @Override
    public void render(Graphics g) {
        for(int y = 0; y < lvl.length; y++) {
            for(int x = 0; x < lvl[y].length; x++) {
                int id = lvl[y][x];
                g.drawImage(tileManager.getSprite(id), x * 32, y * 32, null);
            }
        }
        drawButtons(g);
        bottomBar.draw(g );
    }

    private void drawButtons(Graphics g) {
        bMenu.draw(g);
    }

    @Override
    public void mouseClicked(int x, int y) {

    }

    @Override
    public void mouseMoved(int x, int y) {

    }

    @Override
    public void mousePressed(int x, int y) {

    }
    @Override
    public void mouseReleased(int x, int y) {

    }

}
