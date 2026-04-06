import java.sql.*;
public class deletetab {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/placement","root","Sharmila@05");
            Statement stmt = con.createStatement();
            String query = "DELETE FROM Student WHERE RollNo = 2";
            int rows = stmt.executeUpdate(query);
            System.out.println(rows + " row deleted");
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}