import java.util.Scanner;


public class Complex {
    int a,b,c,d;

    public void addition(int a,int b,int c,int d){
        System.out.println("Addition:"+(a+c)+"+"+(b+d)+"i");
    }
    public void subtraction(int a ,int b,int c,int d){
        System.out.println("Subtraction:"+(a-c)+"+"+(b-d)+"i");
    }
    public void multiplication(int a ,int b,int c,int d){
        System.out.println("Multiplication:"+(a*c-b*d)+"+"+ (a*d + b*c)+"i");
    }
    public void division(int a , int b,int c ,int d){
        System.out.println("Division:"+(a*c+b*d)+"+"+ (-(a*d) + b*c)+"i/"+(c*c - d*d));
    }

    public static void main(String[] args) {
        Complex ob=new Complex();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the complex no. of a(real) and b(imaginary):");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter the complex no. of c(real) and d(imaginary):");
        int c=sc.nextInt();
        int d=sc.nextInt();
        ob.addition(a,b,c,d);
        ob.subtraction(a,b,c,d);
        ob.multiplication(a,b,c,d);
        ob.division(a,b,c,d);
    }
}
