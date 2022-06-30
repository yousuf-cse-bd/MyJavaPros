package yousuf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui extends JFrame{
    /****
     * Best Divisor:
     * @Autor: Muhammad Yousuf Ali
     * @Since: FriDay; 23 08 2019
     */

        private JButton clickBtn;
        private JTextField textField;
        private Container container;
        private Font font;
        private Cursor cursor;
    public SimpleGui(){
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.GRAY);

        font = new Font("Arial",Font.BOLD,20);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        clickBtn = new JButton("Click Now");
        clickBtn.setBounds(100,100,150,50);
        clickBtn.setFont(font);
        clickBtn.setCursor(cursor);
        clickBtn.setBackground(Color.RED);
        clickBtn.setForeground(Color.WHITE);
        container.add(clickBtn);

        textField = new JTextField();
        textField.setBounds(100,200,150,100);
        textField.setBackground(Color.PINK);
        textField.setForeground(Color.WHITE);
        textField.setFont(font);
        container.add(textField);

        clickBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                JOptionPane.showConfirmDialog(null,"Clicked");
            }
        });

    }


    public static void main(String[] args) {

        SimpleGui frame = new SimpleGui();
        frame.setBounds(750,100,450,450);
        frame.setVisible(true);
        frame.setTitle("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
