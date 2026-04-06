import java.sql.*;
public class selecttab{
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement",
        "root","Sharmila@05");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        while(rs.next()){
             int id = rs.getInt("RollNo");
             String name = rs.getString("name");
             int id1 = rs.getInt("DeptID");
            System.out.println(id + " " + name+" "+id1);
        }
        con.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}
