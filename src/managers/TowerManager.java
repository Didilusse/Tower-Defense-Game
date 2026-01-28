package managers;

import helper.LoadSave;
import scenes.Playing;

import java.awt.image.BufferedImage;

public class TowerManager {
    private Playing playing;
    private BufferedImage[] towerImgs;

    public TowerManager(Playing playing) {
        this.playing = playing;

        loadTowerImgs();
    }

    private void loadTowerImgs() {
        BufferedImage atlas = LoadSave.getSpriteAtlas();
        towerImgs = new BufferedImage[3];
        for(int i = 0; i < 3; i++){
            towerImgs[i] = atlas.getSubimage((4+i) * 32, 32, 32, 32);
        }
    }
}
