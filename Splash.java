package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {  // Corrected 'Jframe' to 'JFrame' and class name to 'Splash'

    Splash() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.png"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);


        setSize(1170, 650); // Corrected syntax: no named parameters in Java
        setLayout(null);
        setVisible(true); // Important to make the frame visible
        setLocationRelativeTo(null); // Optional: centers the window on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Optional: closes app on exit

        try {
            Thread.sleep(5000); // Sleep for 5 seconds
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }
}