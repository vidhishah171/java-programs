package jdbcdatabase;
import java.sql.*;

public class SybaseConnection {

	 public static void main(String[] args) throws SQLException {
	        // uid - user id
	        // pwd - password
	        // eng - Sybase database server name
	        // database - sybase database name
	        // host - database host machine ip
	        String dburl = "jdbc:sqlanywhere:uid=DBA;pwd=1m2p3k4n;eng=dell37_2;database=dell37db2;links=tcpip(host=172.16.14.37)";
	         
	        // Connect to Sybase Database
	        Connection con = DriverManager.getConnection(dburl);
	        Statement statement = con.createStatement();
	 
	        // We use Sybase specific select getdate() query to return date
	        ResultSet rs = statement.executeQuery("SELECT GETDATE()");
	         
	         
	        if (rs.next()) {
	            Date currentDate = rs.getDate(1); // get first column returned
	            System.out.println("Current Date from Sybase is : "+currentDate);
	        }
	        rs.close();
	        statement.close();
	        con.close();
	    }

}
