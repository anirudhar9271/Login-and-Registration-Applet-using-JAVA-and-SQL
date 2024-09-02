package ProjectJAVA.Pages;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame  implements ActionListener 
{
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    Container c;
    public Login()
    {
      
      l1 = new javax.swing.JLabel();
      l3 = new javax.swing.JLabel();
      l2 = new javax.swing.JLabel();
      b2 = new javax.swing.JButton();
      b3 = new javax.swing.JButton();
      b1 = new javax.swing.JButton();
      t1 = new javax.swing.JTextField();
      t2 = new javax.swing.JPasswordField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      l1.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
      l1.setText("USER ID");

      l3.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
      l3.setText("            LOGIN");

      l2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
      l2.setText("PASSWORD");

      b2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
      b2.setText("REGISTER");
      

      b3.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
      b3.setText("CLEAR");
      

      b1.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
      b1.setText("SUBMIT");
      

      t1.setText("");
    

      t2.setText("");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                      .addGap(79, 79, 79)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(t2))
                          .addGroup(layout.createSequentialGroup()
                              .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addGroup(layout.createSequentialGroup()
                      .addGap(122, 122, 122)
                      .addComponent(b2)
                      .addGap(18, 18, 18)
                      .addComponent(b1)
                      .addGap(18, 18, 18)
                      .addComponent(b3))
                  .addGroup(layout.createSequentialGroup()
                      .addGap(125, 125, 125)
                      .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addContainerGap(74, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addGap(28, 28, 28)
              .addComponent(l3)
              .addGap(54, 54, 54)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                      .addGap(1, 1, 1)
                      .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                  .addComponent(t2))
              .addGap(34, 34, 34)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(b2)
                  .addComponent(b1)
                  .addComponent(b3))
              .addContainerGap(50, Short.MAX_VALUE))
      );

      pack();
       c=getContentPane();
    
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setTitle("Login page");
        setSize(550, 350);
        setVisible(true);
        c.setBackground(Color.gray);
      }
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == b1) {
        String username = t1.getText();
        char[] password = t2.getPassword();
  
        if (checkLogin(username, password)) {
          // user has entered correct login details, show details page
          DetailsPage detailsPage = new DetailsPage();
          detailsPage.setVisible(true);
          this.dispose();
        } else {
          // user has entered incorrect login details, show error message
          JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
      } else if (e.getSource() == b3) {
        // user has clicked cancel, close the login page
        this.dispose();
      }
      else if(e.getSource()==b2)
      {
        RegisterPage r=new RegisterPage();
        r.setVisible(true);
        this.dispose();
      }
    }
  
    public boolean checkLogin(String user, char[] pass) {
      Connection conn = null;
		Statement stmt = null; 
		ResultSet rec = null;
    int flag=0;
    try{
      String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/details";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);                
			stmt = conn.createStatement();  
       rec = stmt.executeQuery("SELECT username,pswd FROM logindetails");

    while (rec.next()) {
        if (user.equals(rec.getString("username")))
        {
          String stringPass = new String(pass);
          if(stringPass.equals( rec.getString("pswd"))) 
            {
                flag=1;
                break;
            } 
           
        }
        
      }
    
    }catch(Exception j)
    {
      
      //c.setBackground(Color.red);
    }
    if(flag==1)
    {
      return true;
    }
    else
    {
      return false;
    }
    
  
    
  }
  
    public static void Start() {
      new Login();
    }
  }
  