/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.practice.samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author altyn
 */
public class WriteToCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String ID = "1234";
        String name = "Bob";
        String age = "22";
        String filepath = "cake.txt";
        
        saveRecord(ID,name,age,filepath);
    }
    
    public static void saveRecord(String ID, String name, String age, String filepath){
        
        try{
            FileWriter fw = new FileWriter("C:\\Users\\altyn\\OneDrive\\Documents",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(ID+","+name+","+age);
            pw.flush();
            pw.close();
       
        JOptionPane.showMessageDialog(null,"Record saved");
        
        }
        
               catch(Exception E){
            
                JOptionPane.showMessageDialog(null,"Record not saved");
        }
    
}

}

