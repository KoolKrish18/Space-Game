
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public class SpaceGameGUI {
    JFrame main;
    JPanel spacePanel;
    ShipMovement hnd;
    final int SPEED;
    public SpaceGameGUI(){
        SPEED = 7;
        hnd = new ShipMovement(this);
        initGUI();
    }
    private void initGUI()
    {
        main = new JFrame("Space Game");
        main.setLayout(null);
        spacePanel = new JPanel();
        spacePanel.setSize(100, 100);        
        main.setContentPane(new JLabel(new ImageIcon("bakgroun.png")));
        JLabel ship = new JLabel(new ImageIcon("playerrocket (resize).png"));
        spacePanel.add(ship);
        spacePanel.setLocation(346, 370);
        spacePanel.setBackground(Color.black);
        main.add(spacePanel);
        main.setSize(800, 500);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.addKeyListener(hnd);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
