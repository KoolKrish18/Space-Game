
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public class ShipMovement implements KeyListener {
    SpaceGameGUI s;
    public ShipMovement(SpaceGameGUI ref)
    {
        this.s = ref;
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();
        System.out.println("Key Pressed code:\t" + code);
        if (code == 37)
        {
            System.out.println("left key pressed");
            int x = s.spacePanel.getX();
            int y = s.spacePanel.getY();
            System.out.println(x + "," + y);
            if (x-s.SPEED > 0)
            {
                s.spacePanel.setLocation(x-s.SPEED, y);
            }
        }
        else if (code == 39)
        {
            int x = s.spacePanel.getX();
            int y = s.spacePanel.getY();
            System.out.println("right key pressed");
            System.out.println(x + "," + y);
            int maxX = s.main.getWidth();
            int shipWidth = s.spacePanel.getWidth();
            if (x+s.SPEED + shipWidth <= maxX)
            {
                s.spacePanel.setLocation(x+s.SPEED, y);
            }
        }
        /*
        if (code == 38)
        {
            System.out.println("up key pressed");
            int x = s.spacePanel.getX();
            int y = s.spacePanel.getY();
            System.out.println(x + "," + y);
            if (y-s.SPEED > 0)
            {
                s.spacePanel.setLocation(x, y-s.SPEED);
            }            
            
        }
        else if (code == 40)
        {
            int x = s.spacePanel.getX();
            int y = s.spacePanel.getY();
            System.out.println("down key pressed");
            System.out.println(x + "," + y);
            int shipH = s.spacePanel.getHeight();
            int maxY = s.main.getHeight();
            if (y+s.SPEED <= 370)
            {
                s.spacePanel.setLocation(x, y+s.SPEED);
            }
        }
        */
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
