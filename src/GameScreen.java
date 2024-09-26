import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;

import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {

    private Random random;
    private BufferedImage img;

    private ArrayList<BufferedImage> sprites = new ArrayList<>();

    public GameScreen(BufferedImage img){
        this.img = img;

        loadSprites();
        
        random = new Random();
    }
    //320x96
    //function to load the sprites
    private void loadSprites() {
        for(int y = 0; y < 10; y++){
            for (int x = 0; x < 10; x++){
                //looping through the grid of the image
                //adding every 32 x 32 pixels to the sprites
                sprites.add(img.getSubimage(x * 32, y * 32, 32, 32));
            }
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //g.drawImage(sprites.get(19), 0, 0, this);


        for(int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                g.drawImage(sprites.get(getRndInt(20)), x * 32, y * 32, null);
            }
        }


    }

    private int getRndInt(int max){
        return random.nextInt(max);
    }

    private Color getRandomColor(){
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        return new Color(red,green,blue);
    }


}
