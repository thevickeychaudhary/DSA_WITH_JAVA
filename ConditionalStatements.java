import java.util.*;
public class conditionalstatements {
    public static void main(String args[]){
 Scanner sc= new Scanner(System.in);
 /*
 System.out.println("enter your age :");
 int age=sc.nextInt();
 if (age>=18){
     System.out.println(" you can vote\n you can drive \n you are adult");
 if(age>13 && age<=18){
    System.out.println("you are teenger");
}  
 }
else 
    System.out.println("you are not adult");

// Q. largest of 2 number

System.out.println(" enter the value of a : ");
int a=sc.nextInt();
System.out.println("enter the value of b : ");
int b=sc.nextInt();
if(a>b){
    System.out.println("A is largest of 2");
}
else{
    System.out.println("B is largest of 2");
}


// Q. Print a number is even of odd

System.out.print("enter a number : ");
int n=sc.nextInt();
if(n%2==0){
    System.out.println("the number is even ");
}
else{
    System.out.println("the number is odd ");
}

// Q. if else if statements
System.out.println("enter your age :");
 int age=sc.nextInt();
 if (age>=18){
     System.out.println(" you can vote\n you can drive \n you are adult");
 }
   else if(age>13 && age<=18){
    System.out.println("you are teenger");

 }
else {
    System.out.println("you are not adult");
}

//Q. Income tax calculatar

System.out.println("enter your income :");
int income=sc.nextInt();
int tax;
if(income<500000){
    tax=0;
}
else if (income>500000 && income<1000000){
    tax =(int)(income*0.2);
}
else{
    tax =(int)(income*0.3);
}
System.out.println("your tax is :" +tax);

// Q. print is largest of 3
int a=100, b=20,c=15;
if(a>=b && a>=c){
    System.out.println("a is largest of 3");
}
else if (b>=c){
    System.out.println(" b is largest of 3");
}
else {
    System.out.println(" c is largest of 3 ");
}


       // Ternary operator
   
   int larger=(5>3)?5:3;
   System.out.println(larger);
   
   //int number=2;
   //String type=((number%2)==0)?"even":"odd";
   //System.out.println(type);

    // check a student pass or fail
   int marks=30;
   String Reportcard=(marks>=33)?"pass":"fail";
   System.out.println(Reportcard);


     // SWITCH STATEMENT

  int number=6;
  switch(number){
    case 1: System.out.println("samosa");
            break;
    case 2: System.out.println("burger");
           break;
    case 3: System.out.println("momosh");
           break;
    default : System.out.println("you are dreaming ");         
  }   

      // calculator 

    System.out.println(" enter number of a") ;
    int a=sc.nextInt();
    System.out.println(" enter number of b");
    int b=sc.nextInt();
    System.out.println("search operator :");
    char operator=sc.next().charAt(0);
    switch(operator){
        case '+' : System.out.println(a+b);
                   break;
      case '-' : System.out.println(a-b);
                 break;
      case '*' : System.out.println(a*b);
                   break;
      case '/' : System.out.println(a/b);
                   break;                 
     case '%' : System.out.println(a%b);
                   break;
     default : System.out.println(" wrong operator");
                   break;                            
    }
  


    //  Q.1 wap to positive or negative by give the user 
     System.out.println("enter a number : ");
     int number=sc.nextInt();
     if(number>0){
        System.out.println("it os positive number");
     }
     else{
        System.out.println("it is a negative number : ");
     }
      
      // Q.2 temparure name
      double temp=103.5;
      if(temp>100){
        System.out.print("you have a fever ");
      }
      else{
        System.out.println("you have not fever");
      } 
      
      System.out.println("enter week day(1-7) : ");
      int weekdays=sc.nextInt();
      switch(weekdays){
        case 1 : System.out.println("Monday");
        case 2 : System.out.println("tuesday");
        case 3 :System.out.println("wednesday");
        case 4 : System.out.println("thursday");
        case 5 : System.out.println("friday");
        case 6 : System.out.println("saturday");
        case 7 : System.out.println("sunday");
         default : System.out.println ("this is not a valid number , enter 1-7 for week days number ");
      }
      */
      // Q.5 leap year or not 
        System.out.println("enter a year ");
        int year=sc.nextInt();
        boolean  x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100==0) && (year%400==0));
        if(x && (y || z)){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+" is not a leep year");
        }



   



}
}