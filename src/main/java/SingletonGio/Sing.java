package SingletonGio;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqlClient{

    public static mysqlClient client = null;
    public static mysqlClient MysqlClient;



    private mysqlClient(){
        try{
            MysqlClient = mysqlClients.create(System.getProperty("mysql.url"));
        }
        catch (mysqlException me){
            me.getStaktrace();
        }

    }
    pubic static mysqlClient getClient()
    {
        if (client == null){
            client = new mysqlClient();

    }
        return client;
    }
    public  consult con() {
        String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("Select * from Empleados");

        } catch (SQLException e) {

        }
    }
}





