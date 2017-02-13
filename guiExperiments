

package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class Window extends JFrame implements ActionListener, KeyListener, MouseListener  {
    
    
    

      
    JPanel win = new JPanel() ; 
    JButton btn1 = new JButton("Information");
     JButton btn2 = new JButton("Warning");
      JButton btn3 = new JButton("Error");
      
      JTextField field = new JTextField(38); // textfield with space for 38 characters
      JTextArea txtarea = new JTextArea(8,38); // same with the textfield plus 2 rows
    
      int x , y ; 
     
    //Constructor Method 
    public Window() {
        super("My Window");
        setSize(640,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(win);
        setVisible(true);
     //   setResizable(false); // fixed size (cannot be maximized)
        setLocationRelativeTo(null); // opens window in the center of the screen
     
        //add buttons
       win.add(btn1); 
       win.add(btn2); 
       win.add(btn3); 
       win.add(field);
       win.add(txtarea);
   
          
          btn1.addActionListener(this);
            btn2.addActionListener(this);
              btn3.addActionListener(this);
          
          field.addKeyListener(this);
          
          txtarea.addMouseListener(this);
          txtarea.addMouseMotionListener(this);
          
          
       
    }
    public static void main(String[] args) {
       
        Window gui = new Window();
         
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btn1)
            
            JOptionPane.showMessageDialog(this, "Information", 
                    "This is Information!" , 
                    JOptionPane.INFORMATION_MESSAGE );
  
    
     if (event.getSource() == btn2)
            
            JOptionPane.showMessageDialog(this, "Warning", 
                    "This is a Warning!" , 
                    JOptionPane.INFORMATION_MESSAGE );
     
      if (event.getSource() == btn3)
            
            JOptionPane.showMessageDialog(this, "Error", 
                    "This is an Error!" , 
                    JOptionPane.INFORMATION_MESSAGE );
     
       
       }
    
    public void keyPressed(KeyEvent pressed) {
        
        txtarea.setText("You pressed a key!");
    }
    
    public void keyTyped(KeyEvent typing) {
        
        txtarea.append("\n You typed the character:" + typing.getKeyChar());
    }
    
    public void keyReleased(KeyEvent released) {
        
        //null
    }
    
    public void mouseMove(MouseEvent moved) {
        
        x = moved.getX();
        y = moved.getY();
    }
      public void mouseDragged (MouseEvent dragged) {
          
      }
      
        public void mouseEntered(MouseEvent entered) {
            
            txtarea.setText("The Mouse entered");
            
        }
          public void mousePressed(MouseEvent pressed) {
              
          }
            public void mouseReleased( MouseEvent released) {
                
            }
            
               public void mouseClicked( MouseEvent clicked) {
                
                  txtarea.append("\nThe mouse is at:" + x + "," +y);
            }
            
              public void mouseExited(MouseEvent exited) {
                  
                  txtarea.setText("The mouse exited");
              }
 }
