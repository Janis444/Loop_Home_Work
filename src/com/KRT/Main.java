package com.KRT;

public class Main {
//import java.util.Scanner;
    public static void main(String[] args) {

        //Pirmais uzdevums
        System.out.println("1. uzdevums");
        for (int j=0; j<=6; j++){

            for (int i=0; i<=6; i++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //Otrais uzdevums
        System.out.println("2. uzdevums");
        for (int j=0; j<=6; j++){

            for (int i=0; i<=j; i=i+1){
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("3. uzdevums");
        for (int j=0; j<=6; j++) {

            for (int k=7-j; k>=2; k=k-1) {
                System.out.print(" ");
            }

            for (int i = 0; i<=j; i++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4. uzdevums");
        for (int j=0; j<=6; j++) {

            for (int k=7-j; k>=2; k=k-1) {
                System.out.print(" ");
            }

            for (int i = 0; i<=4*j; i=i+2) {


                System.out.print("*");
            }
            System.out.println();
        }
        // write your code here
    }
}
