/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class bookdest extends JFrame implements ActionListener{
    
    Choice c1,c2,c3,c0;
    JLabel l21,l22,l23,l24,l25,l260;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    String dest,stut, user,cc;
    String destt,stutt;
    
    public bookdest (String username){
        user=username;
        setBounds(400,150,1100,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("sample/icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l12=new JLabel(i3);
        l12.setBounds(500,50,600,400);
        add(l12);
        
        
        JLabel l1=new JLabel("BOOK DESTINATION");
        l1.setBounds(100,0,300,30);
        l1.setFont(new Font("Times new roman",Font.PLAIN,24));
        add(l1);
        
        JLabel l2=new JLabel("Username:");
        l2.setBounds(20,70,100,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l2);
        
        l21=new JLabel();
        l21.setBounds(250,70,150,30);
        l21.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l21);
        
        JLabel l00=new JLabel("Destination:");
        l00.setBounds(20,110,110,30);
        l00.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l00);
        
        c0=new Choice();
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from destination");
            while(rs.next()){
                c0.add(rs.getString("place"));
            }
        }catch(Exception e){}
        c0.setBounds(250,110,150,30);
        add(c0);
         
       
        
        
//        JLabel l3=new JLabel("Select Hotel:");
//        l3.setBounds(20,150,100,30);
//        l3.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l3);
        
       /* c1=new Choice();
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel where city='"+dest+"'");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch(Exception e){System.out.println(e.toString());}
        c1.setBounds(250,150,150,30);
        add(c1);*/
        
        
//        JLabel l4=new JLabel("Total Persons");
//        l4.setBounds(20,190,100,30);
//        l4.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l4);
//        
//        t1=new JTextField("1");
//        t1.setBounds(250,190,150,25);
//        add(t1);
//        
//        JLabel l5=new JLabel("No. of Days");
//        l5.setBounds(20,230,100,30);
//        l5.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l5);
//        
//        t2=new JTextField("1");
//        t2.setBounds(250,230,150,25);
//        add(t2);
//        
//        
//        JLabel l6=new JLabel("AC / Non-AC:");
//        l6.setBounds(20,270,100,30);
//        l6.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l6);
//        
//        c2=new Choice();
//        c2.add("Yes");
//        c2.add("No");
//        c2.setBounds(250,270,150,30);
//        add(c2);
//        
//        JLabel l7=new JLabel("Food Included?:");
//        l7.setBounds(20,310,100,30);
//        l7.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l7);
//        
//        c3=new Choice();
//        c3.add("Yes");
//        c3.add("No");
//        c3.setBounds(250,310,150,30);
//        add(c3);
//        
        JLabel l8=new JLabel("ID:");
        l8.setBounds(20,150,100,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l8);
        
        l22=new JLabel();
        l22.setBounds(250,150,150,30);
        l22.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l22);
        
        
        JLabel l9=new JLabel("Number:");
        l9.setBounds(20,190,100,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l9);
        
        l23=new JLabel();
        l23.setBounds(250,190,150,30);
        l23.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l23);
        
        JLabel l10=new JLabel("Phone:");
        l10.setBounds(20,230,100,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l10);
        
        l24=new JLabel();
        l24.setBounds(250,230,150,30);
        l24.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l24);
        
//        JLabel l11=new JLabel("Total:");
//        l11.setBounds(20,470,100,30);
//        l11.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l11);
//        
//        l25=new JLabel();
//        l25.setBounds(250,470,150,30);
//        l25.setForeground(Color.red);
//        l25.setFont(new Font("Tahoma",Font.PLAIN,16));
//        add(l25);
        
        
       
        
        
        
        
        
         try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next()){
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("id"));
                l23.setText(rs.getString("number"));
                l24.setText(rs.getString("phone"));
               
            }
        }catch(Exception e){}
         
         
//        b1=new JButton("Check Price");
//        b1.setBackground(Color.BLUE);
//        b1.setForeground(Color.WHITE);
//        b1.setBounds(50,540,120,30);
//        b1.addActionListener(this);
//        add(b1);
        
        
        b2=new JButton("Book");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setBounds(50,290,120,30);
        b2.addActionListener(this);
        add(b2);
        
        
        b3=new JButton("Back");
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        b3.setBounds(200,290,120,30);
        b3.addActionListener(this);
        add(b3);
        
        
        b4=new JButton("book hotel");
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        b4.setBounds(350,290,120,30);
        b4.addActionListener(this);
        add(b4);
        
        
       
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            String dd=c0.getSelectedItem();
            
        
        try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from destination where place='"+dd+"'");
                while(rs.next()){
                     destt=rs.getString("city");
                     stutt=rs.getString("su");
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
           try{
               Conn c=new Conn();
               c.s.executeUpdate("insert into bookDest values('"+l21.getText()+"','"+c0.getSelectedItem()+"','"+destt+"','"+stutt+"','"+l22.getText()+"','"+l23.getText()+"','"+l24.getText()+"')");
               JOptionPane.showMessageDialog(null,"Destination Booked Successfully");
               //this.setVisible(false);
           }catch(Exception e){}
        }else if(ae.getSource()==b3){
            this.setVisible(false);
        }else if(ae.getSource()==b4){
             String dd=c0.getSelectedItem();
        
        try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from destination where place='"+dd+"'");
                while(rs.next()){
                     cc=rs.getString("city");
                     stut=rs.getString("su");
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
            new BookHotel2(user,cc,dd,stut).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new bookdest("").setVisible(true);
    }
}

