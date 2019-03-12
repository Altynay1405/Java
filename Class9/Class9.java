/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class9;


import java.util.ArrayList;

public class Class9 {

    public static void main(String [] args) {

        ArrayList<Integer> var = new ArrayList<Integer>();
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 15;
        a[2] = 20;

        var.add(10);
        var.add(15);
        var.add(20);

        var.set(1, 13);

        System.out.println(var.size());

        for (int i = 0; i < var.size(); i++){
            System.out.println("The value at " +i+ " " +var.get(i));
        }
        for (int b : var){
            System.out.println("Value is " + b);
        }

    }
}


