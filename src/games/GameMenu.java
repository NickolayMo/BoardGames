package games;


import games.ui.PlayGame2048Kt;
import games.ui.PlayGameOfFifteenKt;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameMenu {
    private JPanel panel;
    private JLabel head;
    private JLabel gaTwo;
    private JLabel gaOne;

    private GameMenu() {
        gaOne.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                PlayGame2048Kt.main();
            }
        });
        gaTwo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                PlayGameOfFifteenKt.main();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board Games");
        GameMenu menu = new GameMenu();
        menu.head.setText("Game Time!");
        menu.gaOne.setToolTipText("Click here to launch 2048");
        menu.gaTwo.setToolTipText("Click here to launch Game of 15");
        frame.setContentPane(menu.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
