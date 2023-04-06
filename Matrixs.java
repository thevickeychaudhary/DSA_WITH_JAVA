//import java.util.*;

/* 
public class Matrixs {
  public static boolean search(int matrix[][],int key) { 
         for(int i=0; i<matrix.length;i++){  // row loop
        for(int j=0 ;j<matrix[0].length;j++){ // columns
           if(matrix[i][j]==key){
            System.out.println("found at cell (" +i+","+j+")");
            return true;
           }
             
        }
    }
      return false;
  }
   public static void main (String args[]){
    
    int matrix [][] = new int [3][3];
    int key=5;
    int n = matrix.length;
    int m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
          // input
          // matrix[i][j] = sc.nextInt();
    for(int i=0; i<n;i++){  // row loop
        for(int j=0 ;j<m;j++){ // columns
            matrix[i][j] = sc.nextInt();
             
        }
    }
       // output
        for(int i=0; i<n;i++){  // row loop
           for(int j=0;j<m;j++){ // columns
            System.out.print(matrix[i][j]+ " ");
             
        }
          System.out.println();
    }
   search(matrix,key);
}
}
*/
/*
     //Q.. SPIRAL MATRIX 

public class Matrixs{
     public static void printspiral(int matrix[][]) { 
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
     while(startrow<=endrow && startcol<=endcol){
        // top
        for(int j=startcol;j<=endcol;j++){
            System.out.print(matrix[startrow][j]+ " ");
        }
        //Right
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+ " ");
        }
        //bottom
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][j]+ " ");
        }
        //left
        for(int i=endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            System.out.print(matrix[i][startcol]+ " ");
        }
        startcol++;
        startrow++;
        endrow--;
        endcol--;
      }
      System.out.println();
     }
     public static void main (String args[]){

        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
         
         printspiral(matrix);               

    }    
}
*/
/*
     // Q.. Diagonal sum

     public class Matrixs {
       public static int diagonalsum (int matrix[][]) { 
        int sum=0;
        //  time complexity is O(n^2)

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //     if(i==j){
        //         sum+=matrix[i][j];
        //     }else if(i+j==matrix.length-1){
        //         sum+=matrix[i][j];
        //     }
        //    }
        //  }
        // return sum;

        // optimize code    // time complexity is O(n)
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
       }
     public static void main (String args[]){
        int matrix [][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},};
         System.out.println(diagonalsum(matrix));
     }
     }
*/
/* 
      // Staircase matrix 

      public class Matrixs {
          //  bottom left approach

        //   public static boolean staircasesearch(int matrix[][],int key) { 
        //     int row=0;
        //     int col=matrix[0].length-1;
        //     while(row<matrix.length && col>=0){
        //         if(key==matrix[row][col]){
        //         System.out.println("key found at("+row+","+col+")");
        //         return true;
        //        }
        //        else if(key<matrix[row][col]){
        //            col--;
        //        }else{
        //         row++;
        //        }
        //     }
        //     System.out.println("key does not found");
        //     return false;
        //  }
            // right , top approach
         public static boolean staircasesearch(int matrix[][],int key) { 
            int row=matrix.length-1;
            int col=0;
            while(row<matrix.length && col>=0){
                if(key==matrix[row][col]){
                System.out.println("key found at("+row+","+col+")");
                return true;
               }
               else if(key<matrix[row][col]){
                   row--;
               }else{
                   col++;
               }
            }
            System.out.println("key does not found");
            return false;
         }
        public static void main (String args[]){
            int matrix[][]={{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
            int key=29;
            staircasesearch(matrix,key);
       }
      }
*/
//  Assignment questions 
// Q.1  PRINT THE NUMBER OF 7,S THAT ARE IN THE 2D ARRAY
/*         
public class Matrixs {
public static void searchprint(int nums[][],int key) { 
   int countof7=0;
   for(int i=0;i<nums.length;i++){
       for(int j=0;j<nums[0].length;j++){
           if(nums[i][j]==key){
               countof7++;
           }

       }
   }
   
  System.out.println("count of 7 is : "+countof7); 

   

}
public static void main (String args[]){
   int nums[][]={{4,7,8},
                  {8,8,7}};
    int key=7;
    searchprint(nums,key);
}
}
*/
// Q.2 PRINT OUT THE SUM OF THR NUMBERS IN THE SEDOND ROE OF THE NUMS ARRAY
/* 
     public class Matrixs{
     public static void sumofrow(int [][]nums) { 
        int sum=0;

        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
     System.out.println("sum of :"+sum);

     }
     public static void main (String args[]){
        int [][] nums={{1,4,9},
                      {11,4,3},
                      {2,2,3}};
        sumofrow(nums);

     }
     }
*/
// Q.3 write a programe to find Transpose of a Matrix 
// Tranpose matrix is the process of swapping the rows to columns 
public class Matrixs {
    // public static void printmatrix(int matrix[][]) {
    // System.out.println("the matrix is :");
    // for(int i=0;i<matrix.length;i++){
    // for(int j=0;j<matrix[0].length;j++){
    // System.out.print(matrix[i][j]+" ");
    // }
    // System.out.println();
    // }

    // }
    public static void main(String args[]) {
        int row = 3, col = 2;
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 }, };
        printmatrix(matrix);

        int transpose[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = matrix[j][i];

            }
        }
        // print transpose matrix
        printmatrix(transpose);
    }

    public static void printmatrix(int matrix[][]) {
        System.out.println("the matrix is :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

}