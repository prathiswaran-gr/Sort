import java.util.Scanner;
public class StudentGrade {

    public void getTotal(int m1, int m2, int m3, int m4, int m5) {
        int total = m1 + m2 + m3 + m4 + m5;
        System.out.println("\nTotal:" + total);
    }

    public void getGrade(int m,int i) {

            if (m > 90 && m <= 100) {
                System.out.println("m" + i + "    O    10");

            } else if (m > 80 && m <= 90) {
                System.out.println("m" + i + "    A+    9");

            } else if (m > 70 && m <= 80) {
                System.out.println("m" + i + "    A     8");

            } else if (m > 60 && m <= 70) {
                System.out.println("m" + i + "    B+    7");

            } else if (m >= 50 && m <= 60) {
                System.out.println("m" + i + "    B     6");

            } else {
                System.out.println("m" + i + "   RA     0");

            }
        }


        public static void main (String[]args){
            StudentGrade ob = new StudentGrade();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter m1 m2 m3 m4 and m5:");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            int m5 = sc.nextInt();

            System.out.println("Sub  Grd  Pts");
            ob.getGrade(m1,1);
            ob.getGrade(m2,2);
            ob.getGrade(m3,3);
            ob.getGrade(m4,4);
            ob.getGrade(m5,5);
            ob.getTotal(m1, m2, m3, m4, m5);
        }
    }

