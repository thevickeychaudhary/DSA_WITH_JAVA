import java.util.*;
 
 /*     // Q.Function syntax or parameters
public class Function{

    public static int calculateSum(int num1,int num2){   //  formal parameters
       
        int sum=num1+num2;
         return sum;
      }
  public static void main(String args[]){
   
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum= calculateSum(a,b);  // actual parameters
    System.out.println("the sum is " +sum);
}
} */

     // Q. Exchange value a and b 
 /*
     public class Function{

           public static void change(int a,int b){
            
            int  temp=a;
               a=b;
              b=temp;
            System.out.println("a=" +a);
            System.out.println("b=" +b);
            }
      public static void main (String args[]){
            int a=10;
            int b=20;
            change(a,b);

        }
     }
   */
     
     // Q. find product a and b
   /*
     public class Function {
     public static int product(int a, int b) { 
        int product=a*b;
        return product;
     }
     public static void main (String args[]){
       int a=10;
        int b=5;
        int prod=product(a,b);
       System.out.println("a*b=" +prod);
       prod=product(200,10);
       System.out.println("a*b="+prod);
      }
     }
     */

 
      // Q. find factorial 
     /*
      public class Function {
            public static int factorial(int n) { 
               int f=1;
              for(int i=1;i<=n;i++){
                f=f*i;
               }
             return f;
            }

         public static void main (String args[]){

        System.out.println(factorial(4));
        
      }
      }
   */

           // Q. find binominal coefficient 
    /*
      public class Function {
            public static int factorial(int n) { 
               int f=1;
              for(int i=1;i<=n;i++){
                f=f*i;
               }
             return f;
            }

           public static int bincoeff(int n,int r){
          
          int fact_n=factorial(n);
          int fact_r=factorial(r);
          int fact_nmr=factorial(n-r);

        int bincoeff=fact_n/fact_r*fact_nmr;
        return bincoeff;
        }
        public static void main (String args[]){

          System.out.println(bincoeff(5,2));
         }
     }
  */

           // Methods : there are two type of methods 
                // 1. user defined
                //     ex. sum, factorial, product
                // 2. inbuilt 
                //    ex. pow,sqrt,max

        // Function overloading :
                             //    multiple function with same name but difference parameter

     /*
        public class Function {
            public static int sum (int a,int b) {   // parameters of 2 no
            int sum=a+b;
            return sum;
            }
           public static int sum(int a,int b, int c){  // parameters of 3 no.
           int sum=a+b+c;
           return sum;
           }
           public static void main (String args[]){
            System.out.println(sum(5,3));
           System.out.println(sum(5,2,1));
          }
        }
      */

        // function overloading using data type

    /*    public class Function {
            public static int sum (int a,int b) {   // fun of call int sum
            int sum=a+b;
            return sum;
            }
           public static float sum(float a,float b, float c){  // fun of call float sum
           float sum=a+b+c;
           return sum;
           }
           public static void main (String args[]){
            System.out.println(sum(5,3));
           System.out.println(sum(5.3f,2.3f,1.2f));
          }
        }
    */

        // Q. check a number is prime or not
    /*
        public class Function {
            public static boolean isPrime (int n) { 

              if(n==2){
                return true;
              }

              for(int i=2;i<=n-1;i++){
                if (n%i==0){   // not follow this condition completely prime 
                  return false;
                
                }
              }
                return true;
            }
             public static void main (String args[]){
             System.out.println(isPrime(2));
          }
        }
    */
        

         // Q. check a number is prime or not

            // optimized method

    /*   public class Function {
            public static boolean isPrime (int n) { 

              if(n==2){
                return true;
              }

              for(int i=2;i<=Math.sqrt(n);i++){  // optimized method
                if (n%i==0){   // not follow this condition completely prime 
                  return false;
                
                }
              }
                return true;
            }
             public static void main (String args[]){
             System.out.println(isPrime(7));
          }
        }
    */
        // Q. print all prime numbers in range
    /*
        public class Function {
            public static boolean isPrime (int n) { 

              if(n==2){
                return true;
              }

              for(int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){   // not follow this condition completely prime 
                  return false;
                }
              }
                return true;
            }
            public static void Printrange(int n){
              for(int i=2;i<=n;i++)
                 if(isPrime(i)){  // true
                  System.out.print(i+ " ");
                 }
              System.out.println();
              }
          public static void main (String args[]){
             Printrange(100);
          }
        }
    */

         // Q.  convert a number of binary to decimal
    /*
        public class Function {
            public static void BintoDec (int binNum) { 

              int mynum=binNum;
              int pow=0;
              int decNum=0;
              int lastdigit=0;
              while(binNum>0){
                lastdigit=binNum%10;
                decNum=decNum+(lastdigit*((int)Math.pow(2,pow)));
                pow++;
                binNum=binNum/10;
              }
              System.out.println("decimal of "+mynum+" = "+decNum);

            }
             public static void main (String args[]){

              BintoDec(101);
             
          }
        }
    */
           // Q.  convert a decimal number to binary

    /*    public class Function {
            public static void DectoBin (int n) { 

              int mynum=n;
              int pow=0;
              int binNum=0;
              int reminder;
              while(n>0){
                reminder=n%2;
                binNum=binNum+(reminder*((int)Math.pow(10,pow)));
                pow++;
                n=n/2;
              }
              System.out.println("binary form of "+mynum+" = "+binNum);

            }
             public static void main (String args[]){

              DectoBin(100);
             
          }
        }
    */   

          // ASSIGMENT QUESTION

         // write a java method compute the average of three
    /*
         public class Function {
         public static int average(int a,int b,int c) { 
        
          int avg=(a+b+c)/3;
          return avg;
         // System.out.println("the average of three numbers = "+avg);
         }
         public static void main (String args[]){

             int avg=average(10,20,30);
                 System.out.println("the average of three numbers = "+avg);
         }
         }
    */

          // Q.2 write a method isEven and it return true other wise file check it
    /*
        public class Function {
        public static boolean isEven(int num) {
          if(num%2==0){
            return true;
          } 
          return false;
        }
        public static void main (String args[]){

          Scanner sc=new Scanner(System.in);
          System.out.print("enter a number : ");
          int num=sc.nextInt();
            System.out.println(isEven(num));
        }
        }
    */  

        // Q. check a number is palindrome or not
        // if a number is palindrome it has his reverse value like 121 
    /*
        public class Function {
          public static void isPalindrome(int number) { 
              int palindrome=number;;  // copied number into variable
              int reverse=0;
               while(number!=0){
                int rem=number%10;
                reverse=reverse*10+rem;
                number=number/10;
              }
              if(palindrome==reverse){
                 System.out.println("number is palindrome");
              }else{
                  System.out.println("number is not palindrome");
                 }  
           }
        public static void main (String args[]){
             Scanner sc=new Scanner(System.in);
             System.out.println("enter a number");
             int number=sc.nextInt();

             isPalindrome(number);
         }
        }
    */
    /*      //Q.4 method class in java

          public class Function   
                                 {    
    public static void main(String[] args)     
      {    
        double x = 28;    
        double y = 4;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));   
          
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
          
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));  
       }    
     } 
    */

         // Q.5 write a java method to sum of of integer' digit

         public class Function{
         public static int sum(int number){

          int sumOfdigits=0;
          while(number>0){
           int lastdigit=number%10;
            sumOfdigits+=lastdigit;
            number/=10;
          }
          return sumOfdigits;

         }
         public static void main (String args[]){

          //int digit=sum(sumOfdigits);

          System.out.println(" sum of a inteders digit is :"+sum(897));
         }
         }













