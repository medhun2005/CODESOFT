/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class num_check {
    
    public boolean ck(int num1,int a)
    {
         if(num1<=a)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter the number between the range", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }
    public boolean ck1(int num)
    {
        if(num!=0)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Click gendrate randam number to gendrate the number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public int ran(int a)
    {
        Random rand = new Random();
         int rand_int1 = rand.nextInt(a);
         return rand_int1;
    }
}
