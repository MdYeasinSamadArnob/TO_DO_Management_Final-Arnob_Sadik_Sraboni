import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * MD Yeasin samad Arnob
 * ID:192-15-13247
 */
public class SharedClass {
     String url="jdbc:mysql://localhost/todomanage";
        String uname="root";
        String pass="";
        String query="SELECT * FROM worklist";
    public void showPreview() throws SQLException{

        Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        Statement st=(Statement)con.createStatement();
        ResultSet rs=st.executeQuery(query);
         String name="";
         System.out.println("\t\t\t\t\tTHE TO-DO TABLE\n");
         System.out.println("--------------------------------------------------------------------------------------------------");
         System.out.println("| Serial | ToDo-Work\t\t\t\t\t\t | Date\t\t\t\t |");
         System.out.println("--------------------------------------------------------------------------------------------------");

        while(rs.next()){
        name="| "+rs.getInt("Serial")+"\t | "+String.format("%-53s | %-29s |" , rs.getString(2), rs.getString(3) );
        System.out.println(name);
        
        }
         System.out.println("--------------------------------------------------------------------------------------------------\n");

         //System.out.println(rs);
         st.close();
        con.close();
}
}
