import java.util.*;
import java.util.Scanner;

public class Loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*
        int counter=0;
        while(counter<100){
            System.out.println("Hello World");
            counter++;
        }

        // Q. PRINT 1 TO 10 0r n NUMBER

        int range=sc.nextInt();
        int counter=1;
        while(counter<=range){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
        
         
       //  Q. print sum of first n natural number

       System.out.println("enter n natural number : ");
       int n=sc.nextInt();
       int sum=0;
       int i=1;
       while(i<=n){
        sum=sum+i;
        i++;
       }
       System.out.println(sum);
      

      // FOR LOOP 

      for(int i=1;i<=10; i++){
        System.out.println("hello world");
      }
        
        // print a star pattern 

      for(int line=1;line<=5;line++){
        System.out.println(" * * * * ");
      }
       
       // print reverse a number 
       int n=10895;
       while(n>0){
        int lastdigit=n%10;
        System.out.print(lastdigit);
        n=n/10;//n/=10
       }
       

       // Q. reverse the given number 

       int n=10899;
       int rev=0;
       while(n>0){
        int lastdigit=n%10;
        rev=(rev*10)+lastdigit;
        n=n/10;
       }
       System.out.println(rev);
       
       // do while loop

       int i=0;
     do{
        System.out.println("hello world");
        i++;
       }
       while(i<10);
      
       
       // break statements

      for(int i=1;i<=10;i++){
        if(i==8){
          break;
        }
        System.out.println(" break statements ");
      }
        
        // keep entering the numbers then 10 divide reminder zero not gor
       do{
        System.out.print("enter a number :");
        int n=sc.nextInt();
        if(n%10==0){
          break;
        }
        }
       while(true);
       

       // check the number is prime or not
         
        System.out.println("enter a number :");
        int n=sc.nextInt();
        boolean isPrime=true;

        if(n==2){
          System.out.println(n+ " is a prime number");
        }
        else{
         for(int i=2;i<=Math.sqrt(n);i++){
          if(n%i==0){   // N HAVE multiple choice of i  
              isPrime=false;
              }
            }
            if(isPrime==true){
              System.out.println(n+ " is a prime number");
            }
            else{
            System.out.println(n+ " is not a prime number");
            }
            }
              */

            // Q.1 how many time hello world print
            for(int i=1;i<5;i++){
             System.out.println("Hello");
             i+=2;
            }
            /*
            // Q.2 sum of an integers

          
            int number;
            int evensum=0;
            int oddsum=0;
            int choice;
            do{
              System.out.println(" enter the number :");
              number=sc.nextInt();

              if(number%2==0){
                evensum=+number;
                
              }
              else{
                oddsum=+number;
                 
              }
              System.out.println("do you want to yes for 1 and no for 0");
                 choice=sc.nextInt();
            }
              while(choice==1);

               System.out.println("sum of even numbers " +evensum);
               System.out.println("sum of odd numbers "  +oddsum);
              

              // find the factorial of n numbers

              int number;
              int fact=1;
              System.out.println("enter a number");
              number=sc.nextInt();
              for(int i=1;i<=number;i++){
                fact*=i;
              }
              System.out.println("the factoricial of " +number+ " is " +fact );
              

              // write a n number of multiple table

              int n;
              int j;
              System.out.print(" enter the number :");
              n=sc.nextInt();
              System.out.println("your multiplication table of "+n+" is :");

              for(int i=1;i<=10;i++){
                j=n*i;
                System.out.println(j);
              }

              


              // Q.5 what is wrong in the follwing

              for(int i=1;i<=5;i++){
                System.out.println("i= " +i);
              } 
              System.out.println(" i after loop " +i);


              // ans.  run time error because i is declare in loop not class
            */
            
      } 
      }
        
       

    
