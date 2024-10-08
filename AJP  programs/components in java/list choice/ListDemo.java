
import java.awt.*;
import java.applet.*;
 
public class ListDemo extends Applet
{
    public void init()
    {
        List c = new List();
        c.setMultipleSelections(true);
        c.add("The Times of India Maharashtra");
        c.add("Lokmat");
        c.add("Divya Marathi");
        c.add("Navbharat Times");
	c.add("Sakal");
	c.add("Pudhari");   
        add(c);
    }
}
 
