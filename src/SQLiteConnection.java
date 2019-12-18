package edrummondMS3;

import java.sql.*;

public class SQLiteConnection {
  public static void main( String args[] ) {
      Connection c = null;
      
      try {
    	  
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\jmmof\\Documents\\MS3\\edrummondMS3.db3");
         
      } catch ( Exception e ) {
    	  
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
         
      }
      
      System.out.println("Database connection established");
      
   }

}