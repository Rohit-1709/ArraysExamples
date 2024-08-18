import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Creating components
        JLabel label = new JLabel("This is a label");
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Using BorderLayout for the main content pane
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());

        // Adding components to the layout
        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(button1, BorderLayout.WEST);
        contentPane.add(button2, BorderLayout.EAST);

        // Using FlowLayout for a panel at the center
        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.add(button3);
        centerPanel.add(button4);
        contentPane.add(centerPanel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
