import java.util.Scanner;
public class instruction{
    public int a;
    public int b;

public instruction(){
   
    largest();
}
public void largest(){
    if(a>b){
        System.out.println("a is largest");
    }
    else{
        System.out.println("b is largest");
    }
}
public void getdata(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter a number");
    int a = scanner.nextInt();
    Scanner scannerr = new Scanner(System.in);
    int b =scannerr.nextInt();
    
}
public static void main(String[] args) {
    

}
}