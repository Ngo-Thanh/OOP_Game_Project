package thanh.userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements Runnable, KeyListener {
    private Thread thread;
    private boolean isRunning;
    private InputManager inputManager;
    public GamePanel() {
        inputManager = new InputManager();
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, GameFrame.SCREEN_WIDTH, GameFrame.SCREEN_HEIGHT);

    }
    public void startGame() {
        if(thread == null) {
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }
    }
    @Override
    public void run() {
            long FPS = 80;
            long period = 1000*1000000/FPS;
            long beginTime;
            long sleepTime;
            int a = 1;
            beginTime= System.nanoTime();

            while(isRunning) {
                //System.out.println("a = "+(a++));
                //Update
                //Render
                long deltaTime = System.nanoTime() - beginTime;
                sleepTime = period - deltaTime;

                try {
                    if (sleepTime > 0)
                    Thread.sleep(sleepTime/1000000);
                    else  Thread.sleep(period/2000000);
                } catch (InterruptedException ex) {
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        inputManager.processKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

        inputManager.processKeyReleased(e.getKeyCode());
    }
}
