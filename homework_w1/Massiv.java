package ITEducation;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Buch
 * Date: 16.05.2015
 * Time: 14:03:46
 * Homework week 1
 */
public class Massiv {
    //Create Arrays
    public static int [] arrayHelper (int sizeArray) {
        int []mas=new int [sizeArray];
        for (int i=0; i<mas.length; i++){
            mas[i]=(int)(Math.random()*sizeArray+1);
            System.out.print(mas[i] + " ");
            }
        System.out.println("");
        return mas;
    }

    //Medium arefmatic value
    public static void   betwin (int [] array){
        int result=0, betwinResult=0, count=0;
        for (int i=0; i<array.length; i++){
            result=result+array[i];
            count=array.length;
        }
        betwinResult=result/count;
        System.out.println("\nBetwin arefmatic value - "+betwinResult);
        }

    //Find Moda
    public static void moda(int [] array) {
        int i, j, count, findMode,oldcount=0, md, oldmd=0;
        for (i=0; i<array.length; i++) {
            md = array[i];
            count = 1;
            for (j = i+1; j < array.length; j++) {
                if (md==array[j]) {
                    count=count+1;
                }
                if (count>oldcount) {
                    oldmd=md;
                    oldcount=count;
                }
            }
        }
        findMode=oldmd;
        System.out.println("Moda - "+findMode);
    }

    //Sort Arrays
    public static void sortArray (int [] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    //Meridian
    public static void meridian (int [] array){
        System.out.println("Meridian - "+array[4]);
    }

}
