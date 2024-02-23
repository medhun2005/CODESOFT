/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import javax.swing.*;
import java.sql.*;
public class view_course {
    void display(JTable jTable1) throws Exception
    {
       Class.forName("com.mysql.jdbc.Driver");
        String connectionurl = "jdbc:mysql://localhost:3306/course_registration";
        Connection con= (Connection) DriverManager.getConnection(connectionurl, "root", "bhoomi");
        Statement st = con.createStatement();
        ResultSet s;
        s = st.executeQuery("select * from course");        
        int row=0;
        int col=0;
        String course_code;
        String course_title;
        String capacity;
        String time_schedule;
        
        while(s.next())
        {
        col=0;
        course_code=s.getString(1);
        course_title=s.getString(2);
        capacity=s.getString(3);
        time_schedule=s.getString(4);

        
        jTable1.setValueAt(course_code, row, col);
        col++;
        jTable1.setValueAt(course_title, row, col);
        col++;
        jTable1.setValueAt(capacity, row, col);
        col++;
        jTable1.setValueAt(time_schedule, row, col);
        row++;
        }

        s.close();        st.close();         con.close();
    }
}
