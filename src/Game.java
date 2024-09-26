import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Game extends JFrame {

    private GameScreen gameScreen;

    private BufferedImage img;

    private double timePerFrames;
    private long lastFrame;

    public Game(){
        timePerFrames = 1000000000 / 60.0;
        importImg();

        setSize(640, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen(img);
        add(gameScreen);
        setVisible(true);

        gameScreen = new GameScreen(img);
        add(gameScreen);
    }

    private void importImg() {

        InputStream is = getClass().getResourceAsStream("/spriteatlas.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void gameLoop(){
        while(true){
            if(System.nanoTime() - lastFrame >= timePerFrames) {
                lastFrame = System.nanoTime();
                repaint();
            }else{

            }
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.gameLoop();
    }
}
