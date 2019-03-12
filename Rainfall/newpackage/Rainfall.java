/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rainfall.newpackage;

/**
 *
 * @author User
 */
public class Rainfall {
   final int SIZE =12;
   private double [] value = new double [12];
   
   private double total=0;
   
   
  public Rainfall(double arr[]) {
 
      for(int i=0;i<arr.length;i++){
          value[i]=arr[i];
      }
   
  }
   
   public double totalRain(){

       
       for (int i=0; i<value.length;i++) {
       total+=value[i];
       }
         return total;
       
   }
    
   public double aveRain(){
       
       return totalRain()/SIZE;
       
       
   }
   
   public int maxRain (){
     double max = value [0];
     int index=0;
     for (int i=1;i<value.length;i++){
         if( max<value[i]){
       max=value[i];
         index=i;
         }
     }
    return index;
       
   }
   
   
   public int minRain(){
       
       double min = value[0];
       int index=0;
       for (int i=1; i<value.length;i++){
           if(min>value[i]){
               min=value[i];
            index=i;  
           }
           }
       return index;
   }
   
   
}
