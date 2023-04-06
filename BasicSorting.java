import java.util.*;
import java.util.Arrays;
import java.util.Collections;
/*
        // Bubble sort
public class BasicSorting{
public static void  BubbleSort(int arr[]){

     for(int turn=0;turn<arr.length-1;turn++) {
        //int swap=0;  if array already sorted
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                // sawp
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                //swap++;
            }
        }
     }
}
public static void printarr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main (String args[]){
    int arr[]={1,2,3,4,5};
     BubbleSort(arr);
     printarr(arr);
   
}
}
*/
         // selection sort
/*        
public class BasicSorting{
public static void  SelectionSort(int arr[]){

     for(int i=0;i<arr.length-1;i++) {
        int minpos=i;
        
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
            minpos=j;
            }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
     }
}
public static void printarr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main (String args[]){
    int arr[]={5,4,1,3,2};
     SelectionSort(arr);
     printarr(arr);
   
}
}
*/
     // Insertion Sort
/*
     public class BasicSorting{
       public static void  InsertionSort(int arr[]){

       for(int i=1;i<arr.length;i++) {
        
        int curr=arr[i];
        int prev=i-1;
        // finding out the current position to insert
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1]=curr;

     }
}

public static void printarr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void main (String args[]){
    int arr[]={5,4,1,3,2};
     InsertionSort(arr);
     printarr(arr);
   
}
*/
   // Inbuilt Function
/*
  public class BasicSorting{
   public static void printarr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public static void main (String args[]){
    int arr[]={5,4,1,3,2};
     //InsertionSort(arr);
     Arrays.sort(arr);
     printarr(arr);
   
}
}
*/
    // Counting Sort

   public class BasicSorting{
public static void  countingSort(int arr[]){
    int largest=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++) {
          largest=Math.max(largest,arr[i]);
     }
     int count[]=new int [largest+1];   
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
     int j=0;
     for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
     }
}
public static void printarr(int arr[]){
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static void main (String args[]){
    int arr[]={7,4,3,1,4,3,5,6,1,5,5};
     countingSort(arr);
     printarr(arr);
   
}
} 