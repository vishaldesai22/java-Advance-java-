import java.awt.*;
public class BorderDemo
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new BorderLayout());
         
        Button b1 = new Button("North");    
        Button b2 = new Button("South");    
        Button b3 = new Button("East"); 
        Button b4 = new Button("West"); 
        Button b5 = new Button("Center");   
         
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
    }
}