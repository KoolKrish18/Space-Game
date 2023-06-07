
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public class SpaceGameGUI extends JFrame {
    JFrame main;
    JPanel spacePanel;
    JPanel enemyPanel;
    ShipMovement hnd;
    final int SPEED;

    public SpaceGameGUI(){
        SPEED = 7;
        hnd = new ShipMovement(this);
        initGUI();
    }
    public void initGUI()
    {
        main = new JFrame("Space Game");
        main.setLayout(null);
        spacePanel = new JPanel();
        enemyPanel = new JPanel();
        spacePanel.setSize(100, 100);        
        enemyPanel.setSize(120, 120);
        main.setContentPane(new JLabel(new ImageIcon("bakgroun.png")));
        JLabel ship = new JLabel(new ImageIcon("playerrocket (resize).png"));
        JLabel asteroid = new JLabel (new ImageIcon("asteroid(resize).png"));
        enemyPanel.add(asteroid);
        spacePanel.add(ship);
        enemyPanel.setOpaque(false);
        enemyPanel.setLocation(100, 0);
        spacePanel.setLocation(346, 370);
        spacePanel.setOpaque(false);
        //spacePanel.setBackground(Color.black);
        main.add(spacePanel);
        main.add(enemyPanel);
        main.setSize(800, 500);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.addKeyListener(hnd);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int maxX = main.getWidth() - 81;
        int y = -100;
        int ran = 80 + (int)Math.round(Math.random()*maxX+1);
        
        
        
        while(y<300){
            //ran = 80 + (int)Math.round(Math.random()*maxX+1);
            enemyPanel.setLocation(40, y); 
            y = y+1;
            
            if (y >= 300){
                y = 0;
            }
        }

                //main.repaint();
                //main.revalidate();
            
                //System.out.println(y);
            //}
        


        //enemyPanel.setLocation(ran, y);
    }   
    
        



    
}
