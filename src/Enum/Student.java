package Enum;

public class Student {
    String name;
    int grade;
    int entranceYear;
    public static void main(String[] args){
        Student student = new Student();
        student.name = "보영";

        Grade grade = Grade.SE_G;
        student.grade = grade.getGrade();
        student.entranceYear = grade.getEntranceYear();

        System.out.println(student.name+" 의 학년은 " +student.grade+" 이며"
                                                    +"입학년도는 = " + student.entranceYear
        );

    }
}
