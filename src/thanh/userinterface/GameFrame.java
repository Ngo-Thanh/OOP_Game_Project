package thanh.userinterface;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
public class GameFrame extends JFrame {
    public static final int SCREEN_WIDTH= 1000;
    public static final int SCREEN_HEIGHT= 600;
    GamePanel gamePanel;
    public GameFrame () {
        Toolkit toolkit = this.getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        this.setBounds((dimension.width - SCREEN_WIDTH)/2 , (dimension.height - SCREEN_HEIGHT)/2, SCREEN_WIDTH, SCREEN_HEIGHT );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel = new GamePanel();
        add(gamePanel);
        this.addKeyListener(gamePanel);

    }
    public void startGame() {
        gamePanel.startGame();
    }

    public static void  main(String args[]) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.setVisible(true);
        gameFrame.startGame();
    }
}
