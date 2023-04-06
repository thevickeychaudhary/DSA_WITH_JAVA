import java.util.*;

     //Q. Array input & output
/*
public class Arrays {
public static void main (String args[]){
   
       // creating a array 
       int marks[]=new int[100];
       // find length array
       System.out.println("array of length :"+marks.length);

       Scanner sc=new Scanner(System.in);

       marks[0]=sc.nextInt();
       marks[1]=sc.nextInt();
       marks[2]=sc.nextInt();

       System.out.println("ph :"+marks[0]);
       System.out.println("chem :"+marks[1]);
       System.out.println("math :"+marks[2]);

       int percentage=(marks[0]+marks[1]+marks[2])/3;

       System.out.println("Percentage :"+percentage);
}
}
*/
     // Q.  passing Array as Argument
/*
public class Arrays {

    public static void update(int marks[],int nonchangeable){
         nonchangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            // System.out.print(marks[i]+" ");

        }
       // System.out.println();
    }
public static void main (String args[]){

    int marks[]={97,98,99};
    int nonchangeable=5;
    System.out.println(nonchangeable);

    update(marks,nonchangeable);
    for(int i=0;i<marks.length;i++){
           
            System.out.print(marks[i]+" ");
    }
    System.out.println();
}
}

*/

       // Q. Linear search
/*
       public class Arrays {
       public static int  Linear_search(int numbers[],int key){ 

               for(int i=0;i<numbers.length;i++){
                if(numbers[i]==key){
                    return i;
                }
               }
               return -1;
       }
       public static void main (String args[]){

              int numbers[]={10,20,30,40,50,60,70,80,90};
              int key=-50;
            int index=Linear_search(numbers,key);
              if(index==-1){
                System.out.println("key not found");
              }else{
                System.out.println("key found at :"+index+" position");
              }
       }
       }
*/
            // Q. largest number in array
/*
             public class Arrays {
       public static int  getLargest(int numbers[]){ 
                int largest=Integer.MIN_VALUE;  // -infinity
                int smallest=Integer.MAX_VALUE;  // +infinity
               for(int i=0;i<numbers.length;i++){
                if(largest<numbers[i]){
                    largest=numbers[i];
                }
                if(smallest>numbers[i]){
                    smallest=numbers[i];
                }
               }
               System.out.println("smallest numbers is :"+smallest);
               return largest;
       }
       public static void main (String args[]){

              int numbers[]={1,2,5,6,3};
              System.out.println("largest number is :"+getLargest(numbers));
             
       }
       } 
*/

          // Q. binary search 
/*
          public class Arrays {
          public static int binarysearch(int numbers[], int key) { 
                  int start=0,end=numbers.length-1;
                
                while(start<=end){
                  int mid=(start+end)/2;
                  if(numbers[mid]==key){  // found
                    return mid;
                  }
                  if(numbers[mid]<key){//right
                    start=mid+1;
                  }else{   // left
                    end=mid-1;
                  }
                }
                return -1;
          }
          public static void main (String args[]){

            int numbers[]={2,4,6,8,10,12,14};
            int key=10;

            System.out.println("index for key : "+binarysearch(numbers,key));

          }
          }
*/
          // Q. reverse Array
/*            public class Arrays {
          public static void reverse(int numbers[]) { 
                  int first=0,last=numbers.length-1;
                
                while(first<last){
                  int temp=numbers[last];
                   numbers[last]=numbers[first];
                   numbers[first]=temp;

                  first++;
                  last--;
                }
          //        for(int i=0;i<numbers.length;i++){
          //   System.out.print(numbers[i]+" ");

          // }
          // System.out.println();
                  
          }
          public static void main (String args[]){

            int numbers[]={2,4,6,8,10,12,14};
           
           reverse(numbers);

           for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

          }
          System.out.println();
          }
            }
*/
        // Q. Pairs in array
/*
        public class Arrays {
        public static void Printpairs(int numbers[]){
          int tp=0; // total pairs
          for(int i=0;i<numbers.length;i++){
            int curr=numbers[i]; // 2 4 6 8 10
            for(int j=i+1;j<numbers.length;j++){
              System.out.print("("+curr+","+numbers[j]+")");
              tp++;
            }
            System.out.println();
          } 
          System.out.println("total no. of pairs :"+tp);
        }
        public static void main (String args[]){
          int numbers[]={2,4,6,8,10};
          Printpairs(numbers);
        }
        }
*/
        // Q. Print a Subarray
/*        
        public class Arrays {
        public static void Subarray(int numbers[]){ 
          int ts=0;
          for(int i=0;i<numbers.length;i++ ){ // start  subarray
            int start=i;
          
            for(int j=i;j<numbers.length;j++){  // end subarray
              int end=j;
              for(int k=start;k<=end;k++) {// print subarray
              System.out.print(numbers[k]+" ");
            }
            ts++;
            System.out.println();
          }
           System.out.println();
        }
        System.out.println("total numbers of subarray :"+ts);
         
        }
        public static void main (String args[]){
          int numbers[]={2,4,6,8,10};
          Subarray(numbers);
        }
        }
*/
         // Q. max syb array sum ( brute force method)           
/*          public class Arrays {
        public static void maxSubarray(int numbers[]){ 
          int currsum=0;
          int maxsum=Integer.MIN_VALUE;
          for(int i=0;i<numbers.length;i++ ){ // start  subarray
            int start=i;
          
            for(int j=i;j<numbers.length;j++){  // end subarray
              int end=j;
              currsum=0;
              for(int k=start;k<=end;k++) {// print subarray
                  //  sub array max
                  currsum+=numbers[k];
            }
            System.out.println(currsum);
            if(maxsum<currsum){
              maxsum=currsum;
            }     
          }
           }
       System.out.println("max sum :"+maxsum);
         
        }
        public static void main (String args[]){
          int numbers[]={1,-2,6,-1,3};
          maxSubarray(numbers);
        }
        }
*/ 
      // Q. max sub array by prefix method
/*
       public class Arrays {
        public static void prefixSubarray(int numbers[]){ 
           int currsum=0;
          int maxsum=Integer.MIN_VALUE;
          int prefix[]=new int [numbers.length];

           prefix[0]=numbers[0];
          // calculated prefix
          for (int i=1;i<prefix.length;i++){  
           prefix[i]=prefix[i-1]+numbers[i];
          }
          for(int i=0;i<numbers.length;i++ ){ // start  subarray
            int start=i;
          
            for(int j=i;j<numbers.length;j++){  // end subarray
              int end=j;

              currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];

              if(maxsum<currsum){
              maxsum=currsum; 
           }
      
        }
          }
      System.out.println("max is :"+maxsum);
         
        
        }
        public static void main (String args[]){
          int numbers[]={2,4,6,8,10};
          prefixSubarray(numbers);
        }
        } 
*/ 
         // Q... kadane algorithm

         // it consider negative value as zero....
/*      public class Arrays{
        public static void kadane(int numbers[]){
          int ms=Integer.MIN_VALUE;
          int cs=0;
          for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
              cs=0;
            }
            ms=Math.max(cs,ms);
          }
        
          System.out.println("max is :"+ms); 
          
        }
        public static void main (String args[]){
          int numbers[]={-2,-3,4,-1,-2,1,5,-3};
          kadane(numbers);
        }
        
      }   
*/                       
        // Q... Rain trapped water problem
/*
        public class Arrays {
        public static int  trappedRainwater(int height[]) {
          int n=height.length;

          // calculate left max boundary array
          int leftMax[]=new int [n];
          leftMax[0]=height[0];
         for(int i=1;i<n;i++){
          leftMax[i]=Math.max(height[i],leftMax[i-1]);
         }
         // calculated right max boundary array
         int rightMax[]=new int[n];
         rightMax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
          rightMax[i]=Math.max(height[i],rightMax[i+1]);
         }  
         int trappedwater=0;
         // loop
         for(int i=0;i<n;i++){
          // waterlevel = Math.min(leftMax[i],rightMax[i])
          int waterlevel=Math.min(leftMax[i],rightMax[i]);

          // trappedwater= waterlevel-height[i]
          trappedwater += waterlevel-height[i];
         }
         return trappedwater;

         }
        
        public static void main (String args[]){

          int height[]={4,2,0,6,3,2,5};
          
          System.out.println(trappedRainwater(height));

        }
        }
*/
        // buy and sell stock problem
/*        public class  Arrays{
        public static int buyAndsell (int prices[]){
          int buyprices=Integer.MAX_VALUE;   // ++infinity
          int maxProfit=0;
          for(int i=0;i<prices.length;i++){
            if(buyprices<prices[i]){          // profit
              int profit=prices[i]-buyprices;   // today profit 
              maxProfit=Math.max(maxProfit,profit);
            } else {
              buyprices=prices[i];
            }
          } 
          return maxProfit;
        }
        public static void main (String args[]){
          int prices[]={7,3,1,5,6,4};
          System.out.println(buyAndsell(prices));
        }
        }
*/
        // Assigment questions
        // Q.1 return true if array have least value
        public class Arrays{
        public static boolean index(int num[]){ 
          for(int i=0;i<num.length-1;i++){
             
             for(int j=i+1;j<num.length;j++){
              if(num[i]==num[j]){
                return true;
              }
             }
            
        
          }
          return false;
        }

        
        public static void main (String args[]){
             int num[]={1,2,3,4};
             
           System.out.println(index(num));
        }
        }