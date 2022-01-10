package test.this2;

public class circle {
   private int r;
   private double circum, area;
   
   public circle (int r) {
      this.r=r;
   }

   public int getR() {
      return r;
   }

   public double getCircum() {
      return circum;
   }

   public double getArea() {
      return area;
   }
   
   public void calcCircum() {
      circum = 2* Math.PI * r;
   }
   
   public void calcArea() {
      area=Math.PI * Math.pow(r, 2);
      
   }
   public void showInfo() {
      calcCircum();
      calcArea();
      PrintCircle.print(this);
   }

}