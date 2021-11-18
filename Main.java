package com.thoughtworksProgram;
import  java.util.Scanner;
public class Main {

    public static int typeOfArray(int size, int[]array)
    {

        boolean containsEven=false,containsOdd=false;

        for(int i=0;i<size;i++){
            if(array[i]%2==0)
                containsEven=true;
            else
                containsOdd=true;
        }
        if(containsEven==true && containsOdd==true)
            return 3;
        else if(containsEven==true)
            return 1;
        else
            return 2;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);

        int size=scanner.nextInt();

        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int type=typeOfArray(size,array);
        if(type==1)
            System.out.println("Even");
        else if(type==2)
            System.out.println("Odd");
        else
            System.out.println("mixed");

    }
}
