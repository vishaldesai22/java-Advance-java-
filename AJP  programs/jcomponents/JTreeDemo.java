import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class JTreeDemo
{
    public static void main(String[] args) 
{
        JFrame JFrameMain = new JFrame();
        JFrameMain.setVisible(true);
        JFrameMain.setSize(400,400);
 
DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("India");
         
 DefaultMutableTreeNode maharashtraNode =    new DefaultMutableTreeNode("Maharashtra");

DefaultMutableTreeNode gujrathNode = new DefaultMutableTreeNode("Gujrat");

rootNode.add(maharashtraNode);
rootNode.add(gujrathNode);  
DefaultMutableTreeNode mumbaiSubNode = new DefaultMutableTreeNode("Mumbai");
DefaultMutableTreeNode puneSubNode = new DefaultMutableTreeNode("Pune");
DefaultMutableTreeNode nashikSubNode = new DefaultMutableTreeNode("Nashik");
DefaultMutableTreeNode nagpurSubNode = new DefaultMutableTreeNode("Nagpur");
maharashtraNode.add(mumbaiSubNode);
maharashtraNode.add(puneSubNode);
maharashtraNode.add(nashikSubNode);
maharashtraNode.add(nagpurSubNode);
JTree tree = new JTree(rootNode);   
JFrameMain.add(tree);
    }
}
