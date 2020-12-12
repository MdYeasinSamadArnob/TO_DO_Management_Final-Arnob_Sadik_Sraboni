import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * MD YEasin SAMAD Arnob
 * ID:192-15-13247
 */
public class Search extends SharedClass {
    public void search() throws SQLException{
            String value="";
            System.out.println("Give Input Search Parameter : ");
            Scanner sc =new Scanner(System.in);
             value=sc.nextLine();
                     

                String searchquery="SELECT * FROM worklist WHERE CONCAT(Serial,Todo,Date) LIKE '%"+value+"%'";

        Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        Statement st=(Statement)con.createStatement();
        ResultSet rs=st.executeQuery(searchquery);
       
         String name="";
         System.out.println("\t\t\t\t\tSEARCH RESULTS\n");
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
