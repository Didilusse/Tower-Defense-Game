package managers;

import enemies.Enemy;
import helper.LoadSave;
import scenes.Playing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class EnemyManager {
    private Playing playing;
    private BufferedImage[] enemyImgs;
    public Enemy testEnemy;

    public EnemyManager(Playing playing) {
        this.playing = playing;
        enemyImgs = new BufferedImage[4];
        testEnemy = new Enemy(32 * 3,32 * 9,0,0);
        loadEnemyImgs();
    }

    private void loadEnemyImgs() {
        BufferedImage atlas = LoadSave.getSpriteAtlas();
        enemyImgs[0] = atlas.getSubimage(0, 32, 32, 32);
        enemyImgs[1] = atlas.getSubimage(32, 32, 32, 32);
        enemyImgs[2] = atlas.getSubimage(64, 32, 32, 32);
        enemyImgs[3] = atlas.getSubimage(96, 32, 32, 32);
    }

    public void Update(){

    }

    public void draw(Graphics g){
        drawEnemy(testEnemy, g);
    }

    private void drawEnemy(Enemy e, Graphics g) {
        g.drawImage(enemyImgs[0], (int)e.getX(), (int)e.getY(), null);
    }

}
