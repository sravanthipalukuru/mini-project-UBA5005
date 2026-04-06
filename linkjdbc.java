import java.sql.*;
public class linkjdbc{
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement",
        "root","Sharmila@05");
        System.out.println("Connected Successfully!");
        con.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}
