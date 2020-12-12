import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Sadik Hasan Rafi
 */
public class Update extends SharedClass {
    

    public void update() throws SQLException{
//        String url="jdbc:mysql://localhost/todomanage";
//        String uname="root";
//        String pass="";
//        String query="SELECT * FROM worklist";
Scanner sc=new Scanner(System.in);
int select=0;
System.out.println("Press 1 for updating To-Do field\nPress 2 for updating Date Field : ");
 select=sc.nextInt();
 sc.nextLine();
 
 if(select==1){
     String updatequery1="UPDATE worklist SET Todo= ? WHERE Serial=?";
     Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(updatequery1);
        System.out.println("Give TO-Do item to Update: ");
        st.setString(1, sc.nextLine());
        System.out.println("Give Serial Number : ");
        st.setInt(2, sc.nextInt());
        int count=st.executeUpdate();
        System.out.println("ROWS/Column Effected: "+count);
        System.out.println("Done....");
        st.close();
        con.close();
 }
 else if(select==2){
     int date=0;
String month="";
int year=2020;
int serial;
String duetime="";
System.out.println("Give Serial Number : ");
serial=sc.nextInt();
System.out.println("What is the New Date(INT type) : ");
        date=sc.nextInt();
        sc.nextLine();
        System.out.println("What is the New Month name(String type) : ");
        month=sc.nextLine();
        System.out.println("What is the New Year(INT type) : ");
        year=sc.nextInt();
        sc.nextLine();
         System.out.println("New Due Time in AM/PM(String type)\nExample: 10 PM\n:");
        duetime=sc.nextLine();
      String updatequery2="UPDATE worklist SET Date='"+date+","+month+","+year+"->"+duetime+"' WHERE Serial="+serial;
     Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(updatequery2);
        //System.out.println("Give Serial Number : ");
       // st.setInt(1, sc.nextInt());
        int count=st.executeUpdate();
        System.out.println("ROWS/Column Effected: "+count);
        System.out.println("Done....");
        st.close();
        con.close();
 }
                
}
}
