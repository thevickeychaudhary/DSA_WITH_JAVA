import java.util.*;


/* 
    public class BitManipulation {
      public static void main (String args[]){

      System.out.println(5 & 6);  // Binary And &
      System.out.println(5 | 6);  // Binary OR |
      System.out.println(5 ^ 6);  // Binary XOR ^
      System.out.println(~5);     // one's complement 0->1 or1->0
      System.out.println(5<<2);   // binary left shift
      System.out.println(6>>1);   // binary right shift
    }
  }
  */
/*   
       // check if number is even or odd
       public class BitManipulation {
       public static void oddoreven(int n) { 
         int bitmask=1;
         if((n & bitmask) == 0){
               //even number
              System.out.println("even number");
         } else {
               System.out.println("odd number");
         }
       }

       public static void main (String args[]){
               oddoreven(3);
               oddoreven(4);
               oddoreven(5);
               oddoreven(6);
               oddoreven(7);
       }
       }
*/
          // OPERATIONS : Set it bit
/*           
          public class BitManipulation {
            public static int getithbit (int n,int i) { 
               int bitmask = 1<<i;
               if((n & bitmask) == 0){
                   return 0;
               }else{
                return 1;
               }
            }
            public static void main (String args[]){
              System.out.println(getithbit(10,3));
            }
          }
*/          

          // SET ITH BIT
/*          
          public class BitManipulation {
            public static int setithbit (int n,int i) { 
               int bitmask = 1<<i;
               return n | bitmask;
            }
            public static void main (String args[]){
              System.out.println(setithbit(10,2));
            }
          }
*/          

           // Clear Ith bit
/* 
           public class BitManipulation {
            public static int clearithbit (int n,int i) { 
               int bitmask = ~(1<<i);
               return n & bitmask;
            }
              public static void main (String args[]){
              System.out.println(clearithbit(10,1));
            }
          }
*/          

            // Update Ith bit
/*             
            public class BitManipulation {
              public static int setithbit (int n,int i) { 
                int bitmask = 1<<i;
                return n | bitmask;
             }
              
              public static int clearithbit (int n,int i) { 
                 int bitmask = ~(1<<i);
                return n & bitmask;
              }
               public static int updateithbit (int n,int i,int newBit) { 
                 if(newBit == 0){
                  return clearithbit(n,i);
                 } else{
                   return setithbit(n,i);
                 }
              }
                  // n = clearithbit(n,i);
                  // int bitmask = newBit<<i;
                  // return n | bitmask;
             
                public static void main (String args[]){
                System.out.println(updateithbit(10,2,1));
              }
            }
*/
           
               // clear last bit
/*
             public class BitManipulation {
              public static int clearlastbit (int n,int i) { 
               int bitmask = (~0)<<i;
               return n & bitmask;
             }
             public static void main (String args[]){
                System.out.println(clearlastbit(15,2));
              }
             }
*/
            //  clear range all bits
/*          
            public class BitManipulation {
            public static int clearbitsinrange(int n,int i,int j) { 
              int a = ((~0)<<(j+1));
              int b = (1<<i)-1;
              int bitmask = a | b;
              return n & bitmask;
            }
            public static void main (String args[]){

             System.out.println(clearbitsinrange(10,2,4));
            }
            }  
*/    

            // Q.... check if number is a power of 2 or not
/* 
            public class BitManipulation {
            public static boolean isPowerofTwo(int n) { 
                return (n&(n-1)) == 0;
            }
            public static void main (String args[]){
              System.out.println(isPowerofTwo(16));
            }
            }
*/
             //  Q.... count set bit
             public class BitManipulation {
               public static int countsetbit(int n) {
                int count =0;
                while(n>0){
                  if((n & 1)!=0){
                    count++;
                   }
                   n=n>>1;
                } 
                  return count;  
              }
                 public static void main (String args[]){
                System.out.println(countsetbit(15));
                }
              }
              

         