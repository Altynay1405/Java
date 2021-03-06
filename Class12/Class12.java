/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class12;

import Class8.Stats;
import Class11.DailyPrices;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
      
public class Class12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Downloads\\MSFT.csv");
        //Example of checked exception handling
        HashMap<String,DailyPrices> msft = new HashMap<>();
        try {
            //Step1
            FileReader filereader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(filereader);
            buffread.readLine();//header and we are reading off so we don't have to deal with it.
            String line = "";
            String key;
            DailyPrices value;
            while ((line = buffread.readLine()) != null) {
                String lineArray[] = line.trim().split(",");                
                key = lineArray[0];
                value = new DailyPrices(lineArray);
//                msft.add(dailyPrices);
                msft.put(key, value);
            }
        } 
        catch (IOException io) {
            io.printStackTrace();
//            System.out.println(io.getLocalizedMessage());
        } finally {
            System.out.println("We read the file successfully");
        }
            
        Scanner kb = new Scanner(System.in);
        String date;
        boolean found = false;
        do{
            System.out.println("Please enter a date: ");
            date = kb.nextLine();
            if (msft.containsKey(date)) {
                found = true;
                DailyPrices dailyPrices = msft.get(date);
                System.out.println ("Date:" +dailyPrices.getDate());
                System.out.println ("Open:" +dailyPrices.getOpen());
                System.out.println ("High:" +dailyPrices.getHigh());
                System.out.println ("Low:" +dailyPrices.getLow());
                System.out.println ("Close:" +dailyPrices.getClose());
                System.out.println ("AdjClose" +dailyPrices.getAdjClose());
                System.out.println ("Volume:" +dailyPrices.getVolume());
                System.out.println ("Dollar Volume:" +dailyPrices.getDollarVolume());
                System.out.println ("Daily Average:" +dailyPrices.getDailyAverage());
                System.out.println ("Daily STDEV:" +dailyPrices.getDailySTDEV());
            }
            
        }while(!found);
            
   
    }
}
