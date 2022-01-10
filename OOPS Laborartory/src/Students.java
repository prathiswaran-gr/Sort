import java.util.Scanner;

public class Students extends Sports{
    String name;
    int rollno;
    public Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public String toString(){
        return "Students[Name:"+name+", Rollno:" + rollno + ", m1:"+m1 + " ("+result(m1)+")"+", m2:"+m2+" ("+result(m2)+")"+" ,m3:"+m3+" ("+result(m3)+")"+", Sport point:"+getPoints()+" ,Total:"+getTotalMarks()+"]";
    }

    public static void main(String[] args) {
        Students s = new Students("Prathis",111);
        s.getMarks();
        System.out.println(s);
    }

}
class Result{
    Scanner sc = new Scanner(System.in);
    int m1,m2,m3;
    void getMarks(){
        System.out.print("Enter Marks of m1 m2 and m3:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    int getTotalMarks(){
        int total=m1+m2+m3;
        return total;
    }
    String result(int m){
        if(m>=50)
            return "Pass";
        else
            return "Fail";
    }

}
class Sports extends Result{
    int pts;
    int getPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sport points:");
        pts=sc.nextInt();
        return pts;
    }
}
