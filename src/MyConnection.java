
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    
    public static Connection getConnection() 
    {
        Connection con=null;
        try{
	String url="jdbc:mysql://localhost:3306/users_db";
	String username="root";
	String password="Vaibhu_jan22";
       con= DriverManager.getConnection(url,username,password);
        }
    catch (SQLException e){
            System.out.println(e);
            }
        return con;
}
}
