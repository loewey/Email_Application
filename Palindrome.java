import java.util.Scanner;
import java.util.Random;

public class Palindrome {


    public static void main(String[] args) {
        isPalindrome("racecar");
    }
    public static void isPalindrome(String input){

        boolean isPalindrome = true;

        for(int i =0,j = input.length()-1;i<j;i++,j--){

            if(input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
                break;
            }
        }
            if(isPalindrome){
                System.out.println(input + " is a palindrome");
            }else{
                System.out.println(input + " is not a palindrome");
            }


        }




}