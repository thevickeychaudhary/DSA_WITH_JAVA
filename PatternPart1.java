import java.util.*;

public class PatternPart1{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);

       //  Q. print star Pattern 
       /*
        for(int line=1;line<=10;line++){         // outer loop
          for(int star=1;star<=line;star++){       // inner loop
            System.out.print(" * ");
          }
          System.out.println();
       }
       
           // Q. print Reverse star Parrern

          int n=4;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
          }
          
           // Q.Print half pyramid pattern

          int n=5;
          for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
          } 
          */
          // Q. print character pattern

          int n=5;
          char ch='A';
          for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
          }

   





    }
}