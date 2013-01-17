/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cabservice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PopUpMenu extends JFrame implements MouseListener {
  JPopupMenu Pmenu;
  JMenuItem menuItem;
  public static void main(String[] args) {
  new PopUpMenu();
  }
public void paint(Graphics g)
{
   
    g.setColor(Color.black);
    g.fillOval(20, 20, 9, 9);
}
  public PopUpMenu(){
  //JFrame frame = new JFrame("Creating a Popup Menu");
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Pmenu = new JPopupMenu();
  menuItem = new JMenuItem("Add LandMark");
  Pmenu.add(menuItem);
  menuItem = new JMenuItem("Delete LandMark");
  Pmenu.add(menuItem);
  
  
  menuItem.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
     String command=e.getActionCommand();
     if(command.equals("Add LandMark"))
     {
         
     }
     if(command.equals("Delete LandMark"))
     {
         
     }
     
  }
  });
  addMouseListener(this);
  this.setSize(400,400);
  this.setVisible(true);
  }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
   if(me.isPopupTrigger()){
  Pmenu.show(me.getComponent(), me.getX(), me.getY());
  }
 
  }
  
    
    @Override
    public void mouseEntered(MouseEvent me) {
      
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}