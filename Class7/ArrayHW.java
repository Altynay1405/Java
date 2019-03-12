/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class7;

import java.util.Arrays;

public class ArrayHW {
   
    
    public static void main(String[] args) {
        
        //7.1 a) A 100-element int array referenced by the variable employeeNumbers.
        int[] employeeNumbers = new int[100]; 
        
        //b) A 25-element double array referenced by the variable payRates.
        double [] payRates = new double [25];
        
        //c) A 14-element float array referenced by the variable miles.
        float [] miles = new float [14];
        
        //d) A 1000-element char array referenced by the variable letters
        char [] letters = new char [1000];
      
       
//7.2 What’s wrong with the following array declarations?

/* int[] readings = new int[-1];   Array`s size cannot be a negative
   double[] measurements = new double[4.5];  Array`s size cannot be a float number */

//7.3 What would the valid subscript values be in a four-element array of doubles?
//0 through 3

//7.4 What is the difference between an array’s size declarator and a subscript?
//Size declarator identifies the number of elements in an array. 
//Subscript identifies a specific element in the array.

//7.5 What does it mean for a subscript to be out-of-bounds?
//The subscript is outside the range of valid subscripts for the array.

/*7.6 What happens in Java when a program tries to use a subscript that 
is outof-bounds?
When the statement executes, it crashes the program and displays a runtime error message.
*/

//7.7 What is the output of the following code?

int[] values = new int[5];

for (int count = 0; count < 5; count++)

values[count] = count + 1;

for (int count = 0; count < 5; count++)

System.out.println(values[count]);


/*Output will be:
1
2
3
4
5
*/
 

/*7.8 Write a statement that creates and initializes a double array with the following

values: 1.7, 6.4, 8.9, 3.1, and 9.2. How many elements are in the array?*/

double a[] = {1.7, 6.4, 8.9, 3.1,9.2}; //a array has 5 elements

//Question1
        int [] question1 = {3,4,6,7,2,5,8,4};
        //1
        System.out.println("There are "+question1.length+" elements");
        //2
        System.out.println(Arrays.toString(question1));
        question1[0] = question1[1]+question1[2]+question1[7];
        System.out.println(Arrays.toString(question1));
        
        //3
        question1[6] = question1[2]-(question1[1]*question1[2]);
        System.out.println(Arrays.toString(question1));
        
        //4
        question1[5] = (int)( Math.sqrt(question1[1]) + Math.pow(question1[4], 2) );
        System.out.println(Arrays.toString(question1));
        //5
        question1[2] = (int)(Math.sqrt(question1[4] + question1[1] * question1[2] + Math.pow(3*question1[5]+question1[3], 3)));
        System.out.println(Arrays.toString(question1));
    
        //question #2
        int question2[][] = {{3,4,6},{7,2,5},{8,4,5},{3,2,5}};        
        //1
        System.out.println("There are "+question2.length+" elements");
        
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //2
        question2[2][0] = question2[2][2]+question2[1][1]+question2[0][0];
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //3
        question2[3][1] = question2[0][1] - (question2[3][1]*question2[0][2]);
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //4
        question2[1][2] = (int)(Math.sqrt(question2[0][1])+ Math.pow(question2[1][2], 2));
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        //5
        question2[0][1] = (int)(Math.sqrt(question2[0][0] + question2[1][1]*question2[1][0] + Math.pow(3*question2[2][2]+question2[3][2], 3)));
        System.out.println(Arrays.toString(question2[0]));
        System.out.println(Arrays.toString(question2[1]));
        System.out.println(Arrays.toString(question2[2]));
        System.out.println(Arrays.toString(question2[3]));
        System.out.println("***********");
        
        //Split text over pipes.
        String info = "Lawrence|Khan|100 Church Street";
        String infoArray[] = info.split("\\|");
        System.out.println(Arrays.toString(infoArray));
    }
    
    
}