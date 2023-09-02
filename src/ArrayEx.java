/*
//          Natalie Ferraro
//          arrayEx
//          09-01-2023 
//  Arrays class that demonstrates use of scanner, arrays, and array lists
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayEx {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the first array ");
        int length = sc.nextInt();

        while(0 >= length || length  > 100){
            System.out.println("Enter a length that is > 0 and <= 100 ");
            length = sc.nextInt();
        }

        int[] array1 = new int[length];

        System.out.println("Enter the values you would like to insert into the first array ");
        for(int i = 0; i < length; i++){
            array1[i] = sc.nextInt();
        }
        Arrays.sort(array1);
        System.out.println("Sorted array1 ");
        System.out.print("[");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i]);
            if(array1[i] == array1[array1.length - 1]){
                System.out.print("]");
            }
            else{
                System.out.print(", ");
            }
        }
        
        System.out.println("\n");
        System.out.println("Enter the length of the second array ");
        length = sc.nextInt();

        while(0 >= length || length > 100){
            System.out.println("Enter a length that is > 0 and <= 100 ");
            length = sc.nextInt();
        }

        int[] array2 = new int[length];

        System.out.println("Enter the values you would like to insert into the second array ");
        for(int i = 0; i < length; i++){
            array2[i] = sc.nextInt();
        }
        Arrays.sort(array2);
        System.out.println("Sorted array2 ");
        System.out.println(Arrays.toString(array2));

        sc.close();

        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i]==array2[j]){
                    if(!resultArray.contains(array1[i])){
                        resultArray.add(array1[i]);
                    }
                }
            }
        }
        System.out.println("The intersection of boths lists are " + resultArray);
    }
}