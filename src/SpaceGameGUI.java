
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public final class SpaceGameGUI extends JFrame {
    JFrame main;
    JPanel spacePanel;
    JPanel enemyPanel;
    //JPanel [] enPanel = new JPanel[6];
    JPanel[] starPanel = new JPanel[6];
    JPanel gamePanel;
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
 
        gamePanel = new JPanel();
        //enPanel[1] = spacePanel;
        //enPanel[1].setSize(20, 20);
        //starPanel[1] = starPanel1;
        spacePanel.setSize(100, 100);        
        enemyPanel.setSize(80, 80);
        gamePanel.setSize(500, 700);    
        //starPanel[1].setSize(20, 20);
        main.setContentPane(new JLabel(new ImageIcon("bakgroun.png")));
        //main.getContentPane().setBackground(Color.black);
        JLabel ship = new JLabel(new ImageIcon("playerrocket (resize).png"));
        JLabel asteroid = new JLabel (new ImageIcon("asteroid(resize).png"));
        JLabel over = new JLabel (new ImageIcon("gameover.jpg"));
        enemyPanel.add(asteroid);
        spacePanel.add(ship);
        gamePanel.add(over);
        enemyPanel.setOpaque(false);
        gamePanel.setVisible(false);
        gamePanel.setBackground(Color.black);
        enemyPanel.setLocation(100, 0);
        spacePanel.setLocation(190, 578);
        spacePanel.setOpaque(false);
        //spacePanel.setBackground(Color.black);
        main.add(spacePanel);
        main.add(enemyPanel);
        main.add(gamePanel);
        
        main.setSize(500, 700);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.addKeyListener(hnd);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int maxX = main.getWidth() - 81;
        int y = -100;
        int ran = (int)Math.round(Math.random()*maxX+1);
        int [] rany = new int[6];
        //System.out.println(spacePanel.getWidth() + "  qdeqw");
        for(int i = 0; i < 6; i++){
            starPanel[i] = enemyPanel;
            rany[i] = (int)Math.round(Math.random()*maxX+1);
            
        }
        main.add(starPanel[1]);
        
        while(y<700){
            try {
                enemyPanel.setLocation(ran, y);
                
                starPanel[1].setLocation(300, y);
                
                Thread.sleep(40);
                y = y+SPEED;
                
                if (y >= 700){
                    y = -100;
                    ran = (int)Math.round(Math.random()*maxX+1);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(SpaceGameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
            boolean candy = false;
            boolean bandy = false;
            
            if (enemyPanel.getX() + enemyPanel.getWidth() - 50 >= spacePanel.getX() /*+ enemyPanel.getWidth() */ && spacePanel.getX() >= enemyPanel.getX() - 50){
                candy = true;
            }
            
            if (enemyPanel.getY() + enemyPanel.getHeight() - 10 >= spacePanel.getY() /*+ enemyPanel.getWidth() */ && spacePanel.getY() >= enemyPanel.getY()){
                bandy = true;
            }            
            
            if (candy == true && bandy == true) {
                gamePanel.setVisible(true);
                System.out.println("print");
            }
            else{
                gamePanel.setVisible(false);
            }
        }
        

        
        

                //main.repaint();
                //main.revalidate();
            
                //System.out.println(y);
            //}
        


        //enemyPanel.setLocation(ran, y);
        
    }

    /**
     *
     * @pa
     */

    
        



    
}

