import java.awt.*;
 
public class ChoiceDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
         
        Choice c = new Choice();
        c.add("Maths");
        c.add("Physics");
        c.add("Chemistry"); 
	c.add("Biology");
     
        f.add(c);
    }
}