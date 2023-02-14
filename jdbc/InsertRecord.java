package jdbc;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class InsertRecord {

		// values specific to each database
		   
		   // variables
		   private static final String url = "jdbc:mysql:///books";
		   private static final String user = "root";
		   private static final String password = "sql361";
		   // SQL Query
		   private static final String INSERT_Books_QUERY =
		                "INSERT INTO bookDetails VALUES (?,?,?,?)";
	  
			 public static void main(String[] args ) {

			     // declare variables
			     Scanner scan = null;
			     int n = 0;
//			     int SNo = 0;
			     int bookId = 0;
			     String bookName = null;
			     String authorName = null;
			     String edition = null;
			     Connection con = null;
			     PreparedStatement ps = null;
			     int result = 0;

			     try {
			        // create Scanner class object
			        scan = new Scanner(System.in);
			        
			        // take number of students
			        if(scan != null) {
			            System.out.print("Enter Number of Books: ");
			            n = scan.nextInt();
			        }

			        // establish the connection
			        con = DriverManager.getConnection(url, user, password);
				      // create JDBC statement object
				    

			        // compile SQL query and store it in
			        // PreparedStatement object
			        if(con != null) {
			           ps = con.prepareStatement(INSERT_Books_QUERY);
			        }
			        
			        if(scan != null && ps != null) {
			           for(int i=0; i<n; i++) {

			              // read input values
			              System.out.println("\nEnter Book "+(i+1)+" details,");
//			              System.out.print("Number: ");
//			              SNo = scan.nextInt();
			              System.out.print("bookId: ");
			              bookId = scan.nextInt();
			              System.out.print("bookName: ");
			              bookName = scan.nextLine();
			              bookName+=scan.nextLine();
			              System.out.print("authorName: ");
			              authorName = scan.nextLine();
			              authorName+=scan.nextLine();
			              System.out.print("edition: ");
			              edition = scan.nextLine();
			              edition+=scan.nextLine();

			              // set parameters values
//			              ps.setInt(1, SNo);
			              ps.setInt(1, bookId);
			              ps.setString(2, bookName);
			              ps.setString(3, authorName);
			              ps.setString(4, edition);
			              
			              // execute the query
			              result = ps.executeUpdate();
			           }
			        }
			        
			        // process the result
			        if(result == 0) {
			           System.out.println("\nRecords insertion failed");
			        } else {
			           System.out.println("\nRecords inserted successfully.");
			        }

			     } catch(SQLException se) {
			        se.printStackTrace();
			     } catch(Exception e) {
			        e.printStackTrace();
			     } // try-catch block 

			     finally {
			        // close JDBC objects
			        try {
			           if(ps != null) ps.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(con != null) con.close();
			        } catch(SQLException se) {
			           se.printStackTrace();
			        }
			        try {
			           if(scan != null) scan.close();
			        } catch(Exception e) {
			           e.printStackTrace();
			        }
			     } // finally
			   } // main()
		}

	/*

	  Book Management System
	  
	  1. Add New Book 
	  2. Delete Book 
	  3. Update Book 
	  4. Search Book 
	  5. Show Book
	  6.Exit 
	  
	  enter your choice : 1
	  
	  
	  
	  Welcome to BMS 
	  
	  enter book id : 1
	  Enter Book Name : introduction Java
	  Author Name : Daniel liang
	  Edition : 9th
	 
	  
	  enter your choice : 4
	   enter bookid  to search :
	   enter Name  to search : 
	  
	*/
