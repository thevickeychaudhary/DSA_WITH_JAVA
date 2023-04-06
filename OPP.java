
public class OPP {
   public static void main(String args[]) {
      Pen p1 = new Pen(); // created a pen object
      p1.setColor("blue");
      System.out.println(p1.color);

   }

}

class Pen {
   String color;
   int tip;

   void setColor(String newColor) {
      color = newColor;
   }

   void setTip(int newTip) {
      tip = newTip;
   }
}

class Student {
   String name;
   int age;
   int rollnumber;
   float percentage;

   void calPercentage(int phy, int chem, int math) {
      percentage = (phy + chem + math) / 3;
   }
}
