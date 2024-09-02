package ProjectJAVA.Pages;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class RegisterPage extends JFrame implements ActionListener
{
  Container d;
  JFrame jframe=new JFrame("New Registration");
  JLabel l1,l2,l3,l4;
  JTextField t1,t2,t3,t4;
  JButton b,c,r;
  public RegisterPage()
  {
  d=getContentPane();
  l1 = new javax.swing.JLabel();
  JLabel l5 = new javax.swing.JLabel();
  l2 = new javax.swing.JLabel();
  b = new javax.swing.JButton();
  r = new javax.swing.JButton();
  c = new javax.swing.JButton();
  t2 = new javax.swing.JTextField();
  l3 = new javax.swing.JLabel();
  t3 = new javax.swing.JPasswordField();
  l4 = new javax.swing.JLabel();
  t4 = new javax.swing.JPasswordField();
  t1 = new javax.swing.JTextField();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  l1.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
  l1.setText("ENTER NAME");

  l5.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
  l5.setText("  REGISTRATION");

  l2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
  l2.setText("USER ID");

  b.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
  b.setText("SUBMIT");
  
  r.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
  r.setText("BACK");
  
  c.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
  c.setText("CLEAR");
  
  

  l3.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
  l3.setText("PASSWORD");

  t3.setText("");

  l4.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
  l4.setText("CONFIRM PASSWORD");

  t4.setText("");


  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
          .addGap(79, 79, 79)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(51, 51, 51)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                          .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                  .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(51, 51, 51)
                  .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addContainerGap(112, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(198, 198, 198))
      .addGroup(layout.createSequentialGroup()
          .addGap(179, 179, 179)
          .addComponent(b)
          .addGap(18, 18, 18)
          .addComponent(c)
          .addGap(18, 18, 18)
          .addComponent(r)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );
  layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
          .addGap(37, 37, 37)
          .addComponent(l5)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                  .addGap(45, 45, 45)
                  .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(13, 13, 13))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(18, 18, 18)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(14, 14, 14)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGap(43, 43, 43)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(b)
              .addComponent(c)
              .addComponent(r))
          .addContainerGap(43, Short.MAX_VALUE))
  );

  pack();
  
    b.addActionListener(this);
    c.addActionListener(this);
    r.addActionListener(this);
    setTitle("New Registration");
    d.setBackground(Color.LIGHT_GRAY);
    setSize(600,500);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==b){
       t1.getText();
       t2.getText();
       String pswd=t3.getText();
       String re=t4.getText();
       if((re.compareTo(pswd))==0)
       {
        Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		try{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/details";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection (url, userName, password);                
			stmt = conn.createStatement();  
      PreparedStatement ps=conn.prepareStatement("insert into logindetails values (?,?)");
			String user=t2.getText();
        String pass=t3.getText();
        ;
			ps.setString(1, user);
      ps.setString(2, pass);
      int res=ps.executeUpdate();
      if(res==0)
       System.out.println(" notAdded");
      else{
        JOptionPane.showMessageDialog(this, "Registered Successfully, Try Logging In");

      System.out.println("Added");
      }
      ps.close();
			} 
		catch (SQLException ex){
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception k){
      System.out.println(k);
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException sqlEx) { } // ignore
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close ();// System.out.println ("Database connection terminated");
				} catch (Exception k) { /* ignore close errors */ }
			}
		}
       }
       else
       {
        JOptionPane.showMessageDialog(this, "Password did not match");
       }
      }
      if(e.getSource()==c)
      {
        t1.setText(" ");
        t2.setText(" ");
        t3.setText(" ");
        t4.setText(" ");
      }
      if(e.getSource()==r)
      {
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
      }
    }
    public static void main (String[] args)
    {
      new RegisterPage();
    }
}