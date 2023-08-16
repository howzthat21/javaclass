import  java.util.Scanner;
class circle{
    private double r;
    private double area;

    
    public void getdata(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the radius");
        r=scanner.nextDouble();
    }
    public void calcarea(){
        area=3.14* r*r;
    }
    public void display(){
        System.out.println("radious"+r);
        System.out.printf("area: %.2fn", area);
    }
}

   public class Main {
    public static void main(String[] args) {
        circle circleInstance = new circle();
        
        circleInstance.getdata();
        circleInstance.calcarea();
        circleInstance.display();
    }
}