import javax.swing.*;
import java.awt.*;
 
public class JProgresBarDemo 
{
    JProgressBar JProgressBarObj;
    int i=0,num=0;
     
    JProgresBarDemo()
    {
        JFrame JFrameMain  = new JFrame();
 
        JFrameMain.setVisible(true);
        JFrameMain.setSize(400,400);
        JFrameMain.setLayout(new FlowLayout());
         
        JProgressBarObj = new JProgressBar(0,2000);
        JProgressBarObj.setValue(0);
        JProgressBarObj.setStringPainted(true);
 
        JFrameMain.add(JProgressBarObj);
    }
 
    public static void main(String[] args) 
    {
        JProgresBarDemo jpd = new JProgresBarDemo();
        jpd.iterate();
    }
 
    public void iterate()
    {
        while(i<=2000){
            JProgressBarObj.setValue(i);
            i =i+20;
            try
            {
                Thread.sleep(150);
            } 
            catch(Exception e)
            {
 
            }
        }
    }
 
}
