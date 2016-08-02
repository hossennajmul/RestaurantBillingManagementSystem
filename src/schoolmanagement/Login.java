
package schoolmanagement;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author cursed
 */
public class Login {
    
    
    
    private Frame mainframe;
    private Label headerlabel;
    private Label statuslabel;
    private Panel controlpanel;
    private Label msglabel;
    
    
    public Login(){
        prepareGUI();
    }
    
    
    public static void main(String[] args){
       /* Statement stmt = null;
        try{
        SchoolManagement sch = new SchoolManagement();
        Connection conn=sch.getConnection();
        
        
        
        stmt = conn.createStatement();
        String sql,username,type;
        username ="cursedvoot";
        type="ADMIN";
        sql = "select * from Login where username='"+username+"' && type='"+type+"'";
        ResultSet rs = stmt.executeQuery(sql);
        
        if(rs.next()==true){
            System.out.println("Hello"+username+"login successfully");
        }
        else
                System.out.println("schoolmanagement");
        
        
        rs.close();
        stmt.close();
        conn.close();
        
        }
        
        
       catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }*/
       
       Login log = new Login();
       log.showDemo();
       
    }
    
    private void prepareGUI(){
        
        mainframe = new Frame("SchoolManagement");
        mainframe.setSize(400, 400);
        mainframe.setLayout(new GridLayout(3,1));
        mainframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowevent){
                System.exit(0);
            }
});
        headerlabel = new Label();
        headerlabel.setAlignment(Label.CENTER);
        statuslabel = new Label();
        statuslabel.setAlignment(Label.CENTER);
        statuslabel.setSize(350,100);

        msglabel = new Label();
        msglabel.setAlignment(Label.CENTER);
        msglabel.setText("Welcome to my page this is my first code");
        
        controlpanel = new Panel();
        controlpanel.setLayout(new FlowLayout());
        
        mainframe.add(headerlabel);
        mainframe.add(statuslabel);
        mainframe.add(controlpanel);
        mainframe.setVisible(true);
    }
    
    private void showDemo(){
        
         
         // headerlabel.setText("This is new Header label");
        final Frame frame = new Frame();
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        frame.add(msglabel);
        frame.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent windowevent){
            System.exit(0);
        }
    });
         Label  namelabel= new Label("User ID: ", Label.RIGHT);
         Label  passwordLabel = new Label("Password: ", Label.CENTER);
         final TextField userText = new TextField(6);
         final TextField passwordText = new TextField(6);
         passwordText.setEchoChar('*');
         Button okbutton = new Button("Login");
        okbutton.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
               
                try{
                SchoolManagement sch = new SchoolManagement();
                Connection conn = sch.getConnection();
                
                Statement stmt = null;
                stmt = conn.createStatement();
                String sql,un,pass;
                un = userText.getText();
                pass = passwordText.getText();
                sql = "Select * from login where username='"+un+"' && password='"+pass+"'";
                ResultSet rs = stmt.executeQuery(sql);
                
                if(rs.next()==true){
                frame.setVisible(true);
                }
                
                
                
                }
                
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
       
      
        
        controlpanel.add(namelabel);
        controlpanel.add(userText);
        controlpanel.add(passwordLabel);
        controlpanel.add(passwordText);
        controlpanel.add(okbutton);
        mainframe.setVisible(true);
        
    }
    
    
    
    
}
