package MyTestings;

import javax.swing.*;

public class framesPanels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("E aí Kaleb", SwingConstants.CENTER));
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
