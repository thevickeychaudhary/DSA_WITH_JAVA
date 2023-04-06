import java.util.*;
import java.util.Arrays;

/*
public class Strings {

    public static void main (String[] args){
           // strings declaration
           char arr[]={'a','b','c','d'};
           String str="abcd";
           String str2= new String("xyz");

           // Input or Output 
           Scanner sc=new Scanner (System.in);
           String name;
           //name=sc.next();    // single world
           name=sc.nextLine();  // whole line ke lie
           System.out.println(name);

         // String length
            String fullName="vicky chaudhary";
            System.out.println(fullName.length());

        // Concatenation -> add two string and more called concatenation
           String firstname = "vicky";
           String lastname = "chaudhary";
           String fullname = firstname+" "+lastname;
           System.out.println(fullname+" is this");

        // String charAt method 
           System.out.println(fullname.charAt(0));
           printletters(fullname);
    }

           public static void printletters(String fullname){
               for(int i=0;i<fullname.length();i++){
                  System.out.print(fullname.charAt(i)+" ");
               }
             System.out.println();
       }
}
 */
 
     // Q.... check palindrome or not
/*      
      public class Strings {
      public static boolean ispalindrome( String str) { 

            for(int i=0;i<str.length()/2;i++){
                int n=str.length();
                if(str.charAt(i)!=str.charAt(n-1-i)){
                   return false;
                  // System.out.print(false);
                
                }
            }
           // System.out.println(true);
           return true;
      }
      public static void main (String args[]){
            
        String str="nooon";
        ispalindrome(str);
      }
      }
*/
       // Direction shorttest path find 
/*        
       public class Strings {
       public static float getshorttestpath(String path){
         int x=0,y=0;
         //char dir = path.charAt();
         for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // South
            if(dir == 'S'){
               y--;
            }
            //North
           else if(dir=='N'){
               y++;
            }
            //East
            else if(dir=='E'){
               x++;
            }
            //WEST
            else if(dir=='w'){
               x--;
            }
         } 

         int X2=x*x;
         int Y2=y*y;
         return (float)Math.sqrt(X2+Y2);  // type casting float

       }
       public static void main (String args[]){
         String path="WNEENESENNN";
        System.out.println(getshorttestpath(path));
       }
       }
*/
            //  String function compare 
            // equals() use for string comapre
/* 
           public class Strings{
         
           public static void main (String args[]){
              String s1= "tony";
              String s2= "tony";
              String s3= new String ("tony");

               if(s1==s2){
               System.out.println("string are equal ");
               }
               else{
               System.out.println("string are not equal ");
                
            }
            
            // if(s1==s3){
            //    System.out.println("string are equal ");
            //    }
            //    else{
            //    System.out.println("string are not equal ");
                
            // }
            if(s1.equals(s3)){
               System.out.println("string are equal");
            }else{
               System.out.println("String are not equal");
            }
            }
            }
*/ 
          
            // sub string function
/*
               // str.substring(si,ei) available in java for sub string

            public class Strings{
            // public static String substring(String str, int si,int ei) {
            //    String substr = "";
            //    for(int i=si;i<ei;i++){
            //       substr+=str.charAt(i);
            //    }
            //    return substr;
            // } 
            public static void main (String args[]){
               String str = "helloworld";

             //  System.out.println(substring(str,0,5));

               System.out.println(str.substring(0,5));
 
            }
            }
*/
            
             // Print largest String 
/*              
             public class Strings {
            
              public static void main (String args[]){
                String fruits[] ={"aPPle","maNgo","banana"};

                String largest = fruits[0];
                for(int i=1;i<fruits.length;i++){
                  // if(largest.compareTo(fruits[i])<0){     // 'a','A' = treat different 
                  if(largest.compareToIgnoreCase(fruits[i])<0){  //  // 'a','A' = treat same
                     largest = fruits[i];
                  }
                }
                System.out.println(largest); 
              }
             }
*/
             
         // String Builder 
/* 
         public class Strings {
         
            public static void main (String args[]){

               StringBuilder sb= new StringBuilder("");
               for(char ch='a';ch<='z';ch++){
                   sb.append(ch);
               } // abcdefgh.....
                // O(26)
               System.out.println(sb);
               System.out.println(sb.length());
           }
             
         }
*/        

           // String compression 
/* 
           public class Strings {
           
            public static String compress (String str){
               String newStr = "";
               //abcd
                for(int i=0;i<str.length();i++){
                  Integer count = 1;
                  while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                     count++;
                     i++;
                  }
                  newStr += str.charAt(i);
                  if(count>1){
                       newStr += count.toString();
                      
                  }
                }

               return newStr;
            }
            public static void main (String args[]){
              String str = "aaaaabcd";
               
               System.out.println(compress(str));

            }
           }
 */          
            
           // compress using string builder
/* 
           public class Strings{
         
            public static void main (String args[]){

               StringBuilder str=new StringBuilder("aabcd");

               for(int i=0;i<str.length();i++){
                  Integer count = 1;
                  while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                     count++;
                     i++;
                  }
                  str.append(str);
                  // System.out.println(str);
                  if(count>1){
                      str.append(i);
                 //     System.out.println(str);

                      
                  }
                }
                System.out.println(str);
           }
           }
*/
             // Assignment  problem
               
            // Q... print lowercase laetter
/* 
            public class Strings{
           
            public static void main (String args[]){

               String str = new Scanner (System.in).next();
               int count =0;

               for(int i=0;i<str.length();i++){
                  char ch = str.charAt(i);
                  if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='u'){
                     count++;
                  }
               }
               System.out.println("count of vowels is :" +count);
            }
            }
*/
            // Q... determine if 2 strings are anagram of each other
            // if 2 string contain the same characters but in a different order,
            // they can be said to be anagrams ..

            public class Strings {
                public static void main (String args[]){
                  String str1 = "earth";
                  String str2 = "HEART";
                  // convert strings to lowercase. why ? so we donot have to check
                  // separately for lower & uppercase...
                  str1 = str1.toLowerCase();
                  str2 = str2.toLowerCase();

                  // first check - if the lengths are the same
                  if(str1.length()==str2.length()){
                     // convert strings into char array
                     char[] str1charArray = str1.toCharArray();
                     char[] str2charArray = str2.toCharArray();
                     // sort the char array
                     Arrays.sort(str1charArray);
                     Arrays.sort(str2charArray);

                     // if the sorted arrays are same or identical then
                     // the strings are anagram

                     boolean result = Arrays.equals(str1charArray,str2charArray);
                     if(result){
                        System.out.println(str1 +" and "+ str2 +" are anagram of each other");
                     } else{ 
                        // case when lengths are not equal
                        System.out.println(str1+" and "+str2+"are not anagram of each other");
                     }

                  }

               }
            }
