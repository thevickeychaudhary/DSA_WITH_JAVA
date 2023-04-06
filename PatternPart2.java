import java.util.*;

      // Q. print hollow rectangle pattern
/*
public class PatternPart2 {
  public static void HollowRectangle(int totrows,int totcols) {
       // outer loop 
    for(int i=1;i<=totrows;i++){
         // inner loop
        for(int j=1;j<=totcols;j++){
            // cel=(i,j)
            if(i==1 || i==totrows || j==1 || j==totcols){
                  // boundary
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
          }
          System.out.println();

    } 
}
public static void main (String args[]){

    HollowRectangle(4,5);
}
}
*/

     // Q.  Print inverted or rotated half pyramid
/*
     public class PatternPart2 {
       public static void inverted_rotated_half_pyramid(int n) {
       // outer loop 
        for(int i=1;i<=n;i++){
         // spaces
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
            // stars
         for(int j=1;j<=i;j++){
                System.out.print("*");
            }
          
          System.out.println();

    } 
}
public static void main (String args[]){

    inverted_rotated_half_pyramid(5);
}
}
*/

    // Q.  Print inverted or rotated half pyramid

/*     public class PatternPart2 {
       public static void inverted_rotated_half_pyramid_withNumbers(int n) {
       // outer loop 
        for(int i=1;i<=n;i++){
         // inner loop
          for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
          }
            System.out.println();

         } 
        } 
        public static void main (String args[]){

           inverted_rotated_half_pyramid_withNumbers(5);
       }
    }
*/

           // Q.  Print floy's Triangle
/*
     public class PatternPart2 {
       public static void floydTriangle(int n) {
       
           int counter=1;
           //outer loop
        for(int i=1;i<=n;i++){
         // inner loop
          for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
          }
            System.out.println();

         } 
        } 
        public static void main (String args[]){

           floydTriangle(4);
       }
    }
*/
          // Q. Zero One triangle pattern
/*
           public class PatternPart2 {
       public static void Zero_one_triangle(int n) {
       
           //outer loop
        for(int i=1;i<=n;i++){
         // inner loop
          for(int j=1;j<=i;j++){
            
            if((i+j)%2==0){
              System.out.print("1");
            }else{
              System.out.print("0");
            }
          }
            System.out.println();

         } 
        } 
        public static void main (String args[]){

           Zero_one_triangle(5);
       }
    }
*/
          // Q. butterfly pattern
/*
               public class PatternPart2 {
       public static void butterfly(int n) {
        
        // 1st half 

           //outer loop
        for(int i=1;i<=n;i++){
         // inner loop
          for(int j=1;j<=i;j++){
               // star=(i)
            System.out.print("*");
          }
             // space= 2*(n-i)
          for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
          }
            // star=(i)
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
            System.out.println();
        } 
        // 2nd half

          //outer loop
        for(int i=n;i>=1;i--){
         // inner loop
          for(int j=1;j<=i;j++){
               // star=(i)
            System.out.print("*");
          }
             // space= 2*(n-i)
          for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
          }
            // star=(i)
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
            System.out.println();
        } 


        } 
        public static void main (String args[]){

           butterfly(5);
       }
    }
*/

       // Q. Solid rhombus Pattern
/*     
      public class PatternPart2{
         
         public static void solid_rhombus(int n){

          // outer loop
          for(int i=1;i<=n;i++){
            // space=(n-i)
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
            }
            //star=i
            for(int j=1;j<=n;j++){
              System.out.print("*");
            }
            
            System.out.println();
          }
         }

        public static void main(String args[]){

          solid_rhombus(5);

        }
      }
*/

      // Q. HOLLOW Rhombus Pattern
/*
       public class PatternPart2{
         
         public static void hollow_rhombus(int n){

          // outer loop
          for(int i=1;i<=n;i++){
            // space=(n-i)
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
            }
            //star=i
            for(int j=1;j<=n;j++){
               // boundry rectangle = hollow rectangle
               // cel=(i,j)
              if(i==1 || i==n || j==1 || j==n){
                // boundary
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
           }
            
            System.out.println();
          }
         }

        public static void main(String args[]){

          hollow_rhombus(5);

        }
      }
*/
        // Q. Diamond pattern

         public class PatternPart2{
         
         public static void Diamond(int n){
           // 1st half 
          // outer loop
          for(int i=1;i<=n;i++){
            // space=(n-i)
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
            }
            // star=(2*i)-1
            for(int j=1;j<=(2*i)-1;j++){
              System.out.print("*");
              }
             System.out.println();
           }
           // 2nd half
          // outer loop
          for(int i=n;i>=1;i--){
            // space=(n-i)
            for(int j=1;j<=(n-i);j++){
              System.out.print(" ");
            }
            // star=(2*i)-1
            for(int j=1;j<=(2*i)-1;j++){
              System.out.print("*");
              }
             System.out.println();
           }
          }
        public static void main(String args[]){

           Diamond(3);
           }
      }


       