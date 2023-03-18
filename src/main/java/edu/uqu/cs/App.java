package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters(){
for (int n= 1; n<=110;n++){
    if (n%2 ==0){
        System.out.print(" Tweetle");
        if (n%4==0){
            System.out.print("Beetle");
    }
       if (n%6==0){
         System.out.print("Poodle");
       }
  }
  
else {
System.out.print(" "+n);
}
}
}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/

 public static void phoneKeypad( String str){ 
    String number="";
    str =str.toUpperCase();
    for(int n =0; n<=str.length()-1;n++)
    switch (str.charAt(n)){
        case 'A':
        case 'B':
        case 'C':
       number = "2";
       System.out.print(number);
        break;
        case 'D':
        case 'E':
        case 'F':
        number ="3";
        System.out.print(number);
        break;
        case 'G':
        case 'H':
        case 'I':
        number = "4";
        System.out.print(number);
        break;
        case 'J':
        case 'K':
        case 'L':
        number = "5";
        System.out.print(number);
        break;
        case 'M':
        case 'N':
        case 'O':
        number = "6";
        System.out.print(number);
        break;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        number = "7";
        System.out.print(number);
        break;
        case 'T':
        case 'U':
        case 'V':
        number = "8";
        System.out.print(number);
        break;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        number ="9";
        System.out.print(number);
        break;
       
    }
  
 }

    public static void main(String [] args) {
        

        /* Write your code here */
        Scanner input= new Scanner(System.in);
       //call method twisters()
       twisters();
       //prompt user to enter a string 
       //call method phoneKeypad(string)
       System.out.println("Enter a statement ");
       phoneKeypad(input.nextLine());


    }

}

