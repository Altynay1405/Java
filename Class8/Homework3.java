/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author User
 */
public class Homework3 {
   public static void main(String[] args) {

        File file = new File("C:\\Users\\User\\Downloads\\MSFT.csv");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffread = new BufferedReader(fileReader);
            buffread.readLine();
            String line = "";
            String lineArray[];
            byte lookBack = 7;
            short counter =0;
            double[] sevenDaysClosePrices = new double[lookBack];

            while ((line = buffread.readLine())!= null){
                counter++;

                //System.out.println(line);
                //System.out.println(line.substring(11,19));

                lineArray = line.split(",");

                //System.out.println("First Comma: " + locationOfFirstComma + " Second Comma: " + locationOfSecondComma );
                String date = lineArray[0];
//                String open = line.substring(locationOfFirstComma+1, locationOfSecondComma);

                double[] dailyPrices = new double[5];
                int volume;


                for (int i = 0; i < dailyPrices.length; i = i + 1) {
                    try{
                        dailyPrices[i] = Double.parseDouble(lineArray[i + 1]);
                    }catch (NumberFormatException e) {

                        System.out.println(e.getLocalizedMessage());
                       dailyPrices[i] = 1;
                    }


                }

                try{
                    volume = Integer.parseInt(lineArray[6]);

                }catch (NumberFormatException nb){
                    System.out.println(nb.getLocalizedMessage());

                    volume = 1;

                }
                if (counter > lookBack){

                    System.out.printf("Date:%s, Open:%f, High:%f, Low:%f, Close:%f,"
                                    +  "AdjClose:%f, Volume:%d, DollarVolume:$%f, "
                                    + "Average Price:$%f, Stedv of Daily Price:%f, "
                                    + "7DayMovingAverage:%f \n",
                            date, dailyPrices[0],
                            dailyPrices[1], dailyPrices[2],
                            dailyPrices[3], dailyPrices[4], volume,
                            dailyPrices[3] * volume, Stats.averageOfElements(dailyPrices),
                            Stats.stdevOfElements(dailyPrices, "P"),
                            Stats.averageOfElements(sevenDaysClosePrices));
               for (int i = 0; i < sevenDaysClosePrices.length; i++){

                   sevenDaysClosePrices[lookBack - 1] = sevenDaysClosePrices[i];

               }
               sevenDaysClosePrices[6] = dailyPrices[3];
                }else{
                    sevenDaysClosePrices[counter - 1] = dailyPrices[3];
                }

                // (open + close + high + low) getting the average price



            }

        }
//        }catch (FileNotFoundException fn){
//
//            System.out.println(fn.getLocalizedMessage());
//
//        }

        catch (IOException io){
            io.printStackTrace();

        }finally {


            System.out.println("We read the file succesfully");
        }


    }
 
}
