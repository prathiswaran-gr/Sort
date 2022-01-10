package YEAR_1;
import java.util.Scanner;
public class YearIMarks {
    public int sub1mark,sub2mark;
    public  void getMarks1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sub1mark:");
        sub1mark = sc.nextInt();
        System.out.print("Enter sub2mark:");
        sub2mark = sc.nextInt();
    }
}
