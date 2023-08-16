import java.util.Scanner;
class excection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("enter a number");
        a=scan.nextInt();
        int b;
        System.out.println("enter a number");
        b=scan.nextInt();
        try {
            System.out.println(a/b);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("enter another number");
            int c;
            b=scan.nextInt();
            System.out.println(a/b);
        }

    }
    
}
