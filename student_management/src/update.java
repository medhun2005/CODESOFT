
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class update {
    void add(JFrame page2,String code,String roll)throws Exception
    {
      Class.forName("com.mysql.jdbc.Driver");
        String connectionurl = "jdbc:mysql://localhost:3306/course_registration";

        Connection con= (Connection) DriverManager.getConnection(connectionurl, "root", "bhoomi");

        Statement st = con.createStatement();
        int result=0;
        result=st.executeUpdate("update student set c1="+code+"where roll_number="+roll+");");
        if(result==0)
        {
            System.out.println("Not Inserted");            
        }
        else
        {
            System.out.println("Inserted");            
            JOptionPane.showMessageDialog(page2, "Inserted Sucessfully");
        }
       st.close();       
       con.close();           
  
    }
}
