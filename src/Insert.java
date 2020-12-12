import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Sraboni akter
 */
public class Insert extends SharedClass{
    
    public void insert() throws SQLException{
        Scanner sc=new Scanner(System.in);
int date=0;
String month="";
String duetime="";
int year=2020;
        System.out.println("What is the Date(INT type) : ");
        date=sc.nextInt();
        sc.nextLine();
        System.out.println("What is the Month name(String type) : ");
        month=sc.nextLine();
        System.out.println("What is the Year(INT type) : ");
        year=sc.nextInt();
        sc.nextLine();
        System.out.println("Due Time in AM/PM(String type)\nExample: 10 PM\n:");
        duetime=sc.nextLine();
        String insertquery="INSERT INTO worklist(Todo,Date) VALUES(?,'"+date+","+month+","+year+" -> "+duetime+"')";
    Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(insertquery);
        System.out.println("Give TO-Do item as Input: ");
        st.setString(1, sc.nextLine());

        int count=st.executeUpdate();
         System.out.println("ROWS/Column Effected: "+count);
         System.out.println("Done....");
         st.close();
        con.close();
}
}
