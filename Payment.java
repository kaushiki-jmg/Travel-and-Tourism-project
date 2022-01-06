/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4;
    Payment(){
        setBounds(590,200,800,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("sample/icons/payment.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,800,600);
        add(l1);
        
        JLabel label=new JLabel("Go Cashless!!");
        label.setFont(new Font("Raleway", Font.ITALIC, 40));
        label.setForeground(Color.RED);
        label.setBounds(50, 20, 350, 45);
        l1.add(label);
        
        
        b1=new JButton("Paytm");
        b1.setBounds(420,0,80,40);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);
        
        b3=new JButton("Razorpay");
        b3.setBounds(400,60,100,40);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l1.add(b3);
        
        b4=new JButton("Googlepay");
        b4.setBounds(540,60,100,40);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l1.add(b4);
        
         
        b2=new JButton("Back");
        b2.setBounds(520,0,80,40);
        b2.addActionListener(this);
        l1.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new Razorpay().setVisible(true);
        }else if(ae.getSource()==b4){
            this.setVisible(false);
            new Googlepay().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Payment().setVisible(true);
    }
}
