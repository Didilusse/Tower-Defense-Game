package managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import helper.ImgFix;
import helper.LoadSave;
import objects.Tile;

public class TileManager {

    public Tile GRASS, WATER, ROAD, BR_WATER_CORNER;
    private BufferedImage atlas;
    public ArrayList<Tile> tiles = new ArrayList<>();

    public TileManager() {

        loadAtalas();
        createTiles();

    }

    private void createTiles() {

        int id = 0;
        tiles.add(GRASS = new Tile(getSprite(9, 0), id++, "Grass"));
        tiles.add(WATER = new Tile(getSprite(0, 0), id++, "Water"));
        tiles.add(ROAD = new Tile(getSprite(8, 0), id++, "Road"));
        tiles.add(BR_WATER_CORNER = new Tile(
                ImgFix.buildImg(
                        getImgs(0, 0, 5, 0)), id++, "Br Water Corner"));

    }

    private BufferedImage[] getImgs(int firstX, int firstY, int secondX, int secondY) {
        return new BufferedImage[] {getSprite(firstX, firstY), getSprite(secondX, secondY)};
    }

    private void loadAtalas() {

        atlas = LoadSave.getSpriteAtlas();

    }

    public Tile getTile(int id) {
        return tiles.get(id);
    }

    public BufferedImage getSprite(int id) {
        return tiles.get(id).getSprite();
    }

    private BufferedImage getSprite(int xCord, int yCord) {
        return atlas.getSubimage(xCord * 32, yCord * 32, 32, 32);
    }

}
