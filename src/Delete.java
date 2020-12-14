import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * Sraboni Akter
 */
public class Delete extends SharedClass {
    public void delete() throws SQLException{
        Scanner sc=new Scanner(System.in);
                String deletequery="DELETE FROM worklist WHERE Serial=?";

        Connection con=(Connection)DriverManager.getConnection(url,uname,pass);
        PreparedStatement st=con.prepareStatement(deletequery);
        System.out.println("Give Serial Number To Delete the Row: ");
        st.setInt(1, sc.nextInt());
        int count=st.executeUpdate();
        System.out.println(count);
        String resetquery1="SET @autoSerial :=0";
        int t=st.executeUpdate(resetquery1);
        System.out.println("Deleting....\nResetting From:"+t+1);
        String resetquery2="UPDATE worklist SET Serial= @autoSerial :=(@autoSerial+1)";
        int resetdone=st.executeUpdate(resetquery2);
        System.out.println("To : "+resetdone);
        String resetquery3="ALTER TABLE worklist AUTO_INCREMENT=1";
        st.executeUpdate(resetquery3);
        System.out.println("Congrats....Done!!!");
       // st.executeBatch("SET @autoSerial :=0;")
        
         st.close();
        con.close();
}
}
