

package sample;

import javax.swing.*;
import java.awt.*;
public class Splash{
public static void main(String[] args){
      SplashFrame frame=new SplashFrame();
      frame.setVisible(true);
      int x=1;
      int i;
      for(i=2; i<=600; i+=10, x+=7){
            frame.setLocation(900 - ((i+x)/2), 500 - (i/2));
            frame.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
      frame.setVisible(true);
}
}

class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("sample/icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        JLabel l4=new JLabel("WELCOME");
        l4.setBounds(320,230,1000,70);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Times new roman",Font.BOLD,70));
        l1.add(l4);
        setUndecorated(true);
        t1=new Thread(this);
        t1.start();
        
        //setBounds(200, 100, 1200, 700);
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            new Login2().setVisible(true);
        }
    catch(Exception e){}
}
}

