
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class view_std {
      void display(JTable jTable2) throws Exception
    {
       Class.forName("com.mysql.jdbc.Driver");
        String connectionurl = "jdbc:mysql://localhost:3306/course_registration";
        Connection con= (Connection) DriverManager.getConnection(connectionurl, "root", "bhoomi");
        Statement st = con.createStatement();
        ResultSet s;
        s = st.executeQuery("select * from student");        
        int row=0;
        int col=0;
        String roll_number;
        String course;
        String name;
        
        while(s.next())
        {
        col=0;
        roll_number=s.getString(1);
        name=s.getString(2);
        course=s.getString(3);
        //time_schedule=s.getString(4);

        
        jTable2.setValueAt(roll_number, row, col);
        col++;
        jTable2.setValueAt(name, row, col);
        col++;
        jTable2.setValueAt(course, row, col);
        row++;
        }

        s.close();        st.close();         con.close();
    }
}
