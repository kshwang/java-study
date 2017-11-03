package java21.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEmail extends JFrame {
    
    private JPanel contentPane;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textEmail;
    private JTextArea textArea;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmEmail frame = new frmEmail();
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
    public frmEmail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 497, 516);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLUE, 4, true));
        panel.setBounds(12, 20, 436, 103);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setBounds(12, 47, 57, 15);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("직책");
        lblNewLabel_1.setBounds(12, 72, 57, 15);
        panel.add(lblNewLabel_1);
        
        textField3 = new JTextField();
        textField3.setBounds(43, 47, 116, 21);
        panel.add(textField3);
        textField3.setColumns(10);
        
        textField4 = new JTextField();
        textField4.setBounds(43, 72, 116, 21);
        panel.add(textField4);
        textField4.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("아이디");
        lblNewLabel_2.setBounds(214, 72, 57, 15);
        panel.add(lblNewLabel_2);
        
        textField5 = new JTextField();
        textField5.setBounds(253, 69, 116, 21);
        panel.add(textField5);
        textField5.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Name");
        lblNewLabel_3.setBounds(12, 10, 57, 15);
        panel.add(lblNewLabel_3);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(Color.BLUE, 4, true));
        panel_1.setBounds(12, 144, 436, 249);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblEmail = new JLabel("E-mail");
        lblEmail.setBounds(12, 10, 57, 15);
        panel_1.add(lblEmail);
        
        JLabel label = new JLabel("이메일 주소");
        label.setBounds(12, 44, 70, 15);
        panel_1.add(label);
        
        textEmail = new JTextField();
        textEmail.setBounds(94, 41, 240, 21);
        panel_1.add(textEmail);
        textEmail.setColumns(10);
        
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(339, 72, 85, 23);
        panel_1.add(btnEdit);
        
        JButton btnRemove = new JButton("Remove");
        btnRemove.setBounds(339, 105, 85, 23);
        panel_1.add(btnRemove);
        
        JButton btnDefault = new JButton("Default");
        btnDefault.setBounds(339, 134, 85, 23);
        panel_1.add(btnDefault);
        
        JLabel lblNewLabel_4 = new JLabel("Mail Format");
        lblNewLabel_4.setBounds(12, 199, 120, 15);
        panel_1.add(lblNewLabel_4);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Html");
        rdbtnNewRadioButton.setBounds(12, 220, 57, 23);
        panel_1.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plain Text");
        rdbtnNewRadioButton_1.setBounds(73, 220, 85, 23);
        panel_1.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Custom");
        rdbtnNewRadioButton_2.setBounds(175, 220, 121, 23);
        panel_1.add(rdbtnNewRadioButton_2);

        JButton btnNewButton = new JButton("Add");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = textEmail.getText() ;
                String text = textArea.getText();
                String val = text + "\r\n" + email ;
                textArea.setText( val );
            }
        });
        btnNewButton.setBounds(339, 40, 85, 23);
        panel_1.add(btnNewButton);
        panel_1.add(getTextArea());
        
        JButton btnNewButton_1 = new JButton("OK");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = "";
                message += textArea.getText() + "\r\n";
                message += textField3.getText() + "\r\n";
                message += textField4.getText() + "\r\n";
                message += textField5.getText() + "\r\n";
                
                JOptionPane.showMessageDialog(null, message);
            }
        });
        btnNewButton_1.setBounds(224, 403, 97, 60);
        contentPane.add(btnNewButton_1);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnCancel.setBounds(350, 403, 97, 60);
        contentPane.add(btnCancel);
    }
    private JTextArea getTextArea() {
        if (textArea == null) {
        	textArea = new JTextArea();
        	textArea.setBounds(12, 72, 322, 83);
        }
        return textArea;
    }
}
