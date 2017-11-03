package java21.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.JButton;
import javax.swing.JTextField;

public class frmButton extends JFrame {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private JPanel contentPane;
    private JTextField textField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmButton frame = new frmButton();
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
    public frmButton() {
        setTitle("테스트 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("왼쪽 버튼");
        btnNewButton.setBounds(12, 34, 118, 36);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("가운데 버튼");
        btnNewButton_1.setBounds(146, 34, 125, 36);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("오른쪽 버튼");
        btnNewButton_2.setBounds(283, 34, 125, 36);
        contentPane.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("닫 기");
        btnNewButton_3.setBounds(153, 190, 118, 36);
        contentPane.add(btnNewButton_3);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        textField = new JTextField();
        textField.setBounds(12, 121, 259, 28);
        contentPane.add(textField);
        textField.setColumns(10);
    }
}
