/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import Class8.Stats;

/**
 *
 * @author User
 */
public class Homework {
    
        public static void main(String[] args) {
        // TODO code application logic here
          Question3();
          Countries();
          Question6And7();}
        
        public static void Question3(){
                
    String[] scientists = {"Einstein", "Newton", "Copernicus", "Kepler"};
    
    for (int i = 0; i < scientists.length; i++) 
        
        System.out.println(scientists[i]);
    
    int total = 0; 
    
    for (int i = 0; i < scientists.length; i++) total += scientists[i].length(); 
    
        System.out.println("The total length is " + total);
      
}
        
        
    public static void Countries(){
        String[] countries = {"United States", "Kazakhstan", "Australia",   "Japan", "Germany",  "Holy See","PR"};
        int[] population = { 319111000,          16000000,     25000000,    60783711,  127090000,  801,12000000};
        for (int i = 0; i < countries.length; i++) {
            System.out.print(countries[i]+" : ");
            System.out.print(population[i] + "\n");                        
        }
        HashMap<String, Integer> census = new HashMap<>();
            census.put("United States", 319111000);
            census.put("Kazakhstan", 16000000);
            census.put("Australia", 25000000);
            census.put("Japan", 60783711);
            census.put("Germany", 127090000);
            census.put("Holy See", 801);
            census.put("PR", 12000000);
        //print just the keys
        for(String str : census.keySet()){
            System.out.println(str);
        }
        //print just the values
        for(int value:census.values()){
            System.out.println(value);
        }
        //print key and value
        for(String str : census.keySet()){
            System.out.println(str + ":" +census.get(str));
        }
        //another way to print key and value using a Map.Entry
        for(Map.Entry<String,Integer> item : census.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());
        }
    }
    
    public static void Question6And7(){
        //Question6
        int[][]grades = new int [30][10];
        
        for (int i = 0; i < grades.length; i++) {
        
            //fill
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = (int)Math.round(Math.random()*100);
                
            }
            //print
            System.out.println(Arrays.toString(grades[i])+ ":"+Stats.averageOfElements(grades[i]));
        }
    }
}
