/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cabservice;

import java.sql.SQLException;
import javax.swing.JFrame;




public class cabi extends JFrame {

   public cabi() throws SQLException
   {
       Current_cab c=new Current_cab();
       add(c);
       setSize(1000, 100);
       setVisible(true);
       
   }
    
   public static void main(String args[]) throws SQLException
   {
       cabi c=new cabi();
               
   }
}
    