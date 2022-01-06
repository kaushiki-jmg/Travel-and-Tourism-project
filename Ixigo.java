/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ixigo extends JFrame{
    Ixigo(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://www.google.com/aclk?sa=l&ai=DChcSEwi53onu1pn0AhUGmWYCHdCiBEcYABAEGgJzbQ&ae=2&sig=AOD64_3QwhKVmt4WXYDCOQPd_QWssR4Cgw&q&adurl&ved=2ahUKEwjY6YLu1pn0AhU8zDgGHfvSAk4Q0Qx6BAgFEAE");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        j.add(back);
        
        setSize(800,600);
        setLocation(600,220);
        setVisible(true);
    }
    public static void main(String[] args){
        new Ixigo().setVisible(true);
    }
}

