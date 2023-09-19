package thanh.userinterface;

import javax.swing.*;
import java.awt.*;
public class GamePanel extends JPanel implements Runnable {
    private Thread thread;
    private boolean isRunning;
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
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
                System.out.println("a = "+(a++));
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
}
