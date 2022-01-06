/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;

public class Login2 extends JFrame implements ActionListener{

    JButton b1,b2,b3;
    JTextField t1;
    JPasswordField t2;
    Login2(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500,20,600,700);
        
        JPanel p1=new JPanel();
        p1.setBackground(Color.BLACK);
        p1.setBounds(120,30,360,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("sample/icons/loginbackk.png"));
        Image i5=i4.getImage().getScaledInstance(90, 80, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel("SIGN IN");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setBounds(135,50,90,80);
        p1.add(l2);
        
        
        
        t1=new JTextField("Username");
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        t1.setFont(new Font("Tahoma",Font.PLAIN,16));
        t1.setBounds(110,150,150,40);
        p1.add(t1);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("sample/icons/username.png"));
        Image i8=i7.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(70,150,40,40);
        p1.add(l3);
        
        t2=new JPasswordField("Password");
        t2.setBackground(Color.BLACK);
        t2.setForeground(Color.WHITE);
        t2.setFont(new Font("Tahoma",Font.PLAIN,16));
        t2.setBounds(110,220,150,40);
        p1.add(t2);
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("sample/icons/pass.jpg"));
        Image i11=i10.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel l4=new JLabel(i12);
        l4.setBounds(70,220,40,40);
        p1.add(l4);
        
         b1=new JButton("Login");
        b1.setBounds(235,440,130,50);
        b1.setBackground(new Color(153,153,225));
        b1.setFont(new Font("Tahoma",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Signup");
        b2.setBounds(30,300,100,30);
        b2.setForeground(new Color(153,153,225));
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBorder(new LineBorder(new Color(153,153,225)));
        p1.add(b2);
        
        b3=new JButton("Forgot Password?");
        b3.setBounds(150,300,160,30);
        b3.setForeground(new Color(153,153,225));
        b3.setBackground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBorder(new LineBorder(new Color(153,153,225)));
        p1.add(b3);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("sample/icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,600,800);
        add(l1);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
                String username=t1.getText();
                String password=t2.getText();
                String sql="select * from account where username= '"+username+"' and password= '"+password+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                }
                
                
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new Signup().setVisible(true);
            
        }else if(ae.getSource()==b3){
            this.setVisible(false);
            new ForgetPassword().setVisible(true);
        }
    }
     
      public static void main(String[] args){
        new Login2().setVisible(true);
    }


    
}
