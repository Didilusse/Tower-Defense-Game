package enemies;

import java.awt.Rectangle;

public abstract class Enemy {
    private float x;
    private float y;
    private Rectangle bounds;
    private int health;
    private int ID;
    private int enemyType;
    private int lastDir;

    public Enemy(float x, float y, int ID, int enemyType) {
        this.x = x;
        this.y = y;
        this.ID = ID;
        this.enemyType = enemyType;
        this.bounds = new Rectangle((int)x, (int)y, 32, 32);
        this.lastDir = -1;
    }

    public void move(float speed, int dir) {
        this.lastDir = dir;
        switch (dir) {
            case 0 -> this.x -= speed;
            case 1 -> this.y -= speed;
            case 2 -> this.x += speed;
            case 3 -> this.y += speed;
        }

    }

    public void setPos(int x, int y) {
        this.x = (float)x;
        this.y = (float)y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public Rectangle getBounds() {
        return this.bounds;
    }

    public int getHealth() {
        return this.health;
    }

    public int getID() {
        return this.ID;
    }

    public int getEnemyType() {
        return this.enemyType;
    }

    public int getLastDir() {
        return this.lastDir;
    }
}
