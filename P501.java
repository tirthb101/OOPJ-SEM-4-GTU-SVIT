import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class P501 {
    public static void main(String[] args) {
        Random random = new Random();
        JFrame frame = new JFrame("Tic tac toe");
        frame.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            Boolean boola = random.nextBoolean();
            if (boola) {
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon("crossmark.gif"));
                frame.add(label);
            } else {
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon("ezgif.com-resize.gif"));
                frame.add(label);
            }
        }
        frame.setSize(1080, 1080);
        frame.setVisible(true);

    }
}
