import java.sql.*;

class App {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/databaseName", "username", "password");// change
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getString(0));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
