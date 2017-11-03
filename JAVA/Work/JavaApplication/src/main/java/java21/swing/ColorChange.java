package java21.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorChange extends JFrame {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private JPanel contentPane;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ColorChange frame = new ColorChange();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public ColorChange() {
        setTitle("바탕색 바꾸기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton yellowButton = new JButton("노란색");
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.YELLOW);
            }
        });
        yellowButton.setBounds(39, 64, 120, 51);
        contentPane.add(yellowButton);
        
        JButton pinkButton = new JButton("핑크색");
        pinkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentPane.setBackground(Color.PINK);
            }
        });
        pinkButton.setBounds(234, 64, 111, 51);
        contentPane.add(pinkButton);
    }
}
