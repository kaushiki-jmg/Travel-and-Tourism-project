/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookFlight extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4;
    BookFlight(){
        setBounds(590,200,800,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("sample/icons/flight.jpg"));
        Image i2=i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,800,600);
        add(l1);
        
        
        b1=new JButton("Travolook");
        b1.setBounds(420,0,100,40);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);
        
        b3=new JButton("Ixigo");
        b3.setBounds(400,60,100,40);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l1.add(b3);
        
        b4=new JButton("EaseTrip");
        b4.setBounds(540,60,100,40);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l1.add(b4);
        
         
        b2=new JButton("Back");
        b2.setBounds(560,0,80,40);
        b2.addActionListener(this);
        l1.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Travolook().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new Ixigo().setVisible(true);
        }else if(ae.getSource()==b4){
            this.setVisible(false);
            new EaseTrip().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new BookFlight().setVisible(true);
    }
}

