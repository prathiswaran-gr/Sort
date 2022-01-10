import YEAR_1.*;
import YEAR_2.*;
public class Student {
    String name;
    int rollNumber;
    static YearIMarks y1;
    static YearIIMarks y2;
    Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public String getGrade(int m){
        if(m>=50)
            return "Pass";
        else
            return "Fail";
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber + ", Sub1:"+getGrade(y1.sub1mark)+", Sub2:"+getGrade(y1.sub2mark)+", Sub3:"+getGrade(y2.sub3mark)+", Sub4:"+getGrade(y2.sub4mark)+
                '}';
    }
    public static void main(String[] args) {
        Student ob1=new Student("Prathis",111);
        Student ob2=new Student("Santhosh",116);
        y1 =new YearIMarks();
        y1.getMarks1();
        y2 = new YearIIMarks();
        y2.getMarks2();
        System.out.print(ob1);
    }
}
