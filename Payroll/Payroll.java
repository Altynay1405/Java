/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

/**
 *
 * @author User
 */
public class Payroll {

    final int SIZE = 7;
    
   private int employeeID [] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int hours [] = new int [SIZE];
    private double payRate [] = new double [SIZE];
    private double wages [] = new double [SIZE];

    public int getID (int i){
    
    return employeeID[i];
}
    
public void setHours(int[] h){
    
    for (int i=0;i<SIZE;i++){
        hours[i]=h[i];
        
    }
}
    
public void setPayRate(double p[]){
    
    
    for (int i=0;i<SIZE;i++){
        payRate[i]=p[i];
        
    }
}
   
public void setWages(){
    
    for (int i=0;i<SIZE;i++){
        wages[i]=0;
        
    }
    grossPay();
}

public int [] getHours(){
    
    return hours;
}
   


public double [] getPayRate(){
    
    return payRate;
}

public double getWages(int i){
    
    return wages[i];
}


//wagesPerID is for only the one employee that the user ask for
public double grossPay(int id){
    
    double wagesPerID=0;
    for (int i=0;i<SIZE;i++){
       if (id==employeeID[i]){
       
          wagesPerID =wages[i];
     
} 
       
    } return wagesPerID;
}

public void grossPay(){
   
    for (int i=0;i<SIZE;i++){
       wages[i]=hours[i]*payRate[i];
        
       }
       
    
}


    }
    

