package school1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    static Connection con;
    static ResultSet rs;
    static Statement st;
    public Connect(){
        conact_to_DB();
    }
    private void conact_to_DB() {
        try{
            String host = "jdbc:oracle:thin:@localhost:1521:orcl";
            String uName = "system";
            String uPass = "1234";
            con = DriverManager.getConnection(host, uName, uPass);
            st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        }
        catch(SQLException e){
            System.out.println("Error of connection check ur SQL Exception");
            e.printStackTrace();
        }
    }
}
