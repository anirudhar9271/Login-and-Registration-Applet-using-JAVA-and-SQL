package ProjectJAVA.Database;
import java.sql.*;

public class Database {
    public static void main(String[] args) throws SQLException {
      try{
        String url = "jdbc:mysql://localhost:3306/";
      String username = "root";
      String password = "root";
      Connection connection = DriverManager.getConnection(url, username, password);

      // Check if the database exists
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SHOW DATABASES");
      boolean databaseExists = false;
        while (resultSet.next()) {
        String databaseName = resultSet.getString(1);
        if (databaseName.equalsIgnoreCase("details")) {
        databaseExists = true;
        break;
    }
    }
if (!databaseExists) {
  statement.executeUpdate("CREATE DATABASE details");
}

connection.close();

    Connection connection1 = DriverManager.getConnection(url + "details", username, password);
      Statement statement1 = connection1.createStatement();
      Statement statement2 = connection1.createStatement();

    //   Create the two tables
    ResultSet resultSet1 = statement1.executeQuery("SHOW TABLES");
    ResultSet resultSet2 = statement2.executeQuery("SHOW TABLES");

    boolean TableExists = false;
    while (resultSet1.next()) {
    String TableName = resultSet1.getString(1);
    if (TableName.equalsIgnoreCase("det")) {
    TableExists = true;
    break;
}
}
    boolean TableExists1 = false;
    while (resultSet2.next()) {
    String TableName1 = resultSet2.getString(1);
    if (TableName1.equalsIgnoreCase("logindetails")) {
    TableExists1 = true;
    break;
}

}
  if(!TableExists){
    statement1.executeUpdate("CREATE TABLE det(Name varchar(20),Age varchar(20),Gender varchar(20),Phone varchar(20),Employeeid varchar(20),occupation varchar(20))");
  
  }
  if(!TableExists1){
    statement2.executeUpdate("CREATE TABLE logindetails(username varchar(20),pswd varchar(20))");
    System.out.println("TABLE CREATED");
  }
      // Close the connection
      connection.close();

    
}
catch(Exception e){
    System.out.println(e);
}
  }
}