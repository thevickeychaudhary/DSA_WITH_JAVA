import java.util.*;

public class Javabasic{
    public static void main(String args[]) 
    {
     /*   System.out.println("hello world");

        // PRINT PATTERN
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

        // variable in java 
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        String name="tony";
        System.out.println(name);
        a=b;
        System.out.println(a);

        // sum of a and b
        int c=10;
        int d=5;
        int  sum=c+d;
        System.out.println(sum);
      */
        // input in java 

        Scanner sc=new Scanner(System.in);
       // String input=sc.next();
       // System.out.println(name);

       // String input=sc.nextLine();
       // System.out.println(input);

       // int num=sc.nextInt();
       // System.out.println(num);

         // product and sum of a and b by user input
   
       /*  int a=sc.nextInt();
       int b=sc.nextInt();
      // int sum=a+b;
      int product=a*b;
       System.out.println(product);
      */
      
      // area of a circle
      /*

      float rad=sc.nextFloat();
      float area=3.14f*rad*rad;
      System.out.println(area);
      */

      // type conversion
      /*

      int a=25;
      long b=a;
      System.out.println(b);
      */


      // type casting 
      /*

      float a=99.91f;
      int b=(int)(a);
      System.out.println(b);

      char ch='a';
      char ch2='b';
      int number=ch;
      int number2=ch2;
      System.out.println(number);
      System.out.println(number2);
      */
        
      // type promotion in expressions
      /*
      char a='a';
      char b='b';
      System.out.println((int)(a));
      System.out.println((int)(b));
      System.out.println(b-a);
      


      char a=5;
      byte b=25;
      char c='c';
      byte bt=(byte) (a+b+c);
      System.out.println(bt);
      
      
       int c=30;
      float a=24.45f;
      long b=56;
      double d=30;
      double ans=a+b+c+d;
      System.out.println(ans);
      

   byte b=10;
    byte a= (byte)(b*2);
    System.out.println(a);

     

     // variable and data type questions
     // Q.1 input 3 number and calculate average

     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int av=(a+b+c)/3;
     System.out.println(av);
     

     // Q.2 in a program , input the side of a square.
     //     you have to output the area of the square

     int side=sc.nextInt();
     int area=side*side;
     System.out.println(" area of a square : "+ area);
     

     //Q.3 enter cost of 3 item from the user(float) a pencil, a pen and a eraser
     //    you have to output the total cost of the items back to the user as their bill
     
     float pencil=50.50f;
     float pen=25.34f;
     float eraser=30.45f;
     float totalamount=pencil+pen+eraser;
     float gstamount=(totalamount)*18/100;
     float netprice=totalamount+gstamount;
     System.out.println("the user bill is : "+netprice);
     

     // Q.4 what is the type of the result in the following java code 

     byte b=4;
     char c='a';
     short s=512;
     int i=1000;
     float f=3.14f;
     double d=99.9954;
     double result =(f*b)+(i%c)-(d*s);
     System.out.println(result);

     ans -> double
    
     
     // Q.5 will the following statement give any error in jaava 
     int $=24;
     System.out.println($);

     ans.-> the following statement not given any error in java beacuse it is identifier
     

     //Operators

       // 1. arithmetic operators

           // binary
           
           int a=20;
           int b=5;
           System.out.println(" "+(a+b));
           System.out.println(" "+(a-b));
           System.out.println(" "+(a*b));
           System.out.println(" "+(a/b));
           System.out.println(" "+(a%b));

           // unary

           int c=10;
           int d=++c;
           int e=10;
           int f=e++;
           System.out.println(c);
           System.out.println(d);
           System.out.println(e);
           System.out.println(f);
           
           int c=10;
           int d=--c;
           int e=10;
           int f=e--;
           System.out.println(c);
           System.out.println(d);
           System.out.println(e);
           System.out.println(f);
      

         // relation operators

         int a=20;
         int b=10;
         System.out.println(a==b);
         System.out.println(a!=b);
         System.out.println(a>b);
         System.out.println(a<b);
         System.out.println(a>=b);
         System.out.println(a<=b);
          

          // logical operators

          System.out.println((5>2) && (4>1));
          System.out.println((10>20) || (4>10));
          System.out.println( !(4>1));
         

         // assigment operators 

         int a=10;
         int b=a;
         b-=2;
         b*=2;
         b/=2;
         b%=2;
         System.out.println(b);
         

         // Q.1
         int x = 2, y = 5;
         int exp1 = (x * y / x);
         int exp2 = (x * (y / x));
         System.out.println(exp1);
         System.out.print(exp2);
         
        // Q.2

        int x = 200, y = 50, z = 100;
        if(x > y && y > z)
        {System.out.println("Hello");}
        if(z > y && z < x)
        {System.out.println("Java");}
        if((y+200) < x && (y+150) < z)
        {System.out.println("Hello Java");}
        */

        //Q.3
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
        








         


  







    } 
}