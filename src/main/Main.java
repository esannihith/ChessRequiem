package main;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.getContentPane().setBackground(new Color(145, 99, 149));
            frame.setLayout(new GridBagLayout());
            frame.setMinimumSize(new Dimension(1000, 1000));
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Board board = new Board();
            frame.add(board);
            frame.setVisible(true);
        });
    }
}
