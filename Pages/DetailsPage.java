package ProjectJAVA.Pages;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import java.sql.*;

public class DetailsPage extends JFrame implements ActionListener {
    Container c;
    JFrame jframe=new JFrame("Details");
    JLabel l1, l2, l3, l4,l5,l6,l7;
    JTextField t1, t2, t3,t4,t5,t6;
    JButton b1, b2;
    JRadioButton r1,r2,r3;
    public DetailsPage() {
      c=getContentPane();
      ButtonGroup buttonGroup2 = new javax.swing.ButtonGroup();
        l7 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        l4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  

        l7.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        l7.setText("                     DETAILS");

        l1.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l1.setText("NAME");


        l2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l2.setText("AGE");

       

        l3.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l3.setText("GENDER");

        buttonGroup2.add(r1);
        r1.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        r1.setText("MALE");
        

        buttonGroup2.add(r2);
        r2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        r2.setText("OTHER");
        

        buttonGroup2.add(r3);
        r3.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        r3.setText("FEMALE");
       

        l4.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l4.setText("PHONE NUMBER");


        l5.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l5.setText("EMPLOYEE ID");

       

        l6.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        l6.setText("OCCUPATION");

        b1.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        b1.setText("SUBMIT");


        b2.setFont(new java.awt.Font("MS PGothic", 1, 12)); // NOI18N
        b2.setText("BACK");
        


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 94, Short.MAX_VALUE))
                            .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(b1)
                        .addGap(40, 40, 40)
                        .addComponent(b2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(l7)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l4)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();


    b1.addActionListener(this);
    b2.addActionListener(this);
    c.setBackground(Color.LIGHT_GRAY);
    setTitle("Enter Details");
    // setLayout(null);
    setSize(600,500);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==b1)
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
      PreparedStatement ps=conn.prepareStatement("insert into det values (?,?,?,?,?,?)");
			String Name=t1.getText();
        String age=t2.getText();
        String gender="";
        if(r1.isSelected())
        {
          gender=r1.getText();
        }
        else if(r2.isSelected())
        {
          gender=r2.getText();
        }
        else if(r3.isSelected())
        {
           gender=r3.getText();
        }
      String phone=t4.getText();
      System.out.println(phone);
      String employeeid=t5.getText();
      String occupation =t6.getText();
			ps.setString(1, Name);
      ps.setString(2, age);
      ps.setString(3, gender);
      ps.setString(4, phone);
      ps.setString(5, employeeid);
      ps.setString(6, occupation);
      int res=ps.executeUpdate();
      if(res==0)
       System.out.println(" notAdded");
      else{
      System.out.println("Added");
      JOptionPane.showMessageDialog(this, "Details Added Successfully");

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
  if(e.getSource()==b2)
    {
      Login l=new Login();
      l.setVisible(true);
      this.dispose();
    }
    }
  public static void main(String[] args) {
    new DetailsPage();
    
  }
}