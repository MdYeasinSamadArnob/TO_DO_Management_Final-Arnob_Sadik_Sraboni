
import java.sql.SQLException;
import java.util.Scanner;
//package sql;

/**
 *
 * MD Yeasin Samad Arnob 
 */
public class SqlClient {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        
        Search sqlsearch=new Search();
        SharedClass s=new SharedClass();
        

        Class.forName("com.mysql.jdbc.Driver");
        

       while(true){
           System.out.println("\nPress 1 --> Show To-Do List");
           System.out.println("\nPress 2 --> Insert To-Do Item");
           System.out.println("\nPress 3 --> Update To-Do Item");
           System.out.println("\nPress 4 --> Search To-Do Item");
           System.out.println("\nPress 5 --> Delete To-Do Item");
           System.out.println("\nPress 6 --> Exit");
           int input=0;
           Scanner sc=new Scanner(System.in);
           input=sc.nextInt();
           
           switch(input){
               case 1:{
                   s.showPreview();
                   break;
               }
               case 2:{
                   //here will be insert
                   break;
               }
               case 3:{
                   //here will be update
                   break;
               }
               case 4:{
                   sqlsearch.search();
                   break;
               }
               case 5:{
                  // here will be delete
                   break;
               }
               case 6:{
                   System.exit(0);
                   break;
               }
               default:{
                   System.out.println("Give Valid Input");
                   break;
               }
           }
       }
        
        
        
    }
    
}

