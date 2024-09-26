import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScreen extends JPanel {

    private Random random;

    public GameScreen(){
        random = new Random();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int y = 0; y < 20; y++){
            for (int x = 0; x < 20; x++){
                g.setColor(getRandomColor());
                g.fillRect(x*32,y * 32,32,32);
            }
        }


    }

    private Color getRandomColor(){
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        return new Color(red,green,blue);
    }


}
