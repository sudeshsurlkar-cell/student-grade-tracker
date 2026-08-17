package model;
import java.util.Scanner;

public class input {
//main method call the object
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int s = 1; s <= 60; s++) {

            System.out.println("enter the student ID");
            int studentID = sc.nextInt();
            sc.nextLine();

            System.out.println("enter the student name");
            String Name = sc.nextLine();


            String[] subject = {"java", "python", "Account", "Html"};
            int[] mark = new int[4];
            for (int i = 0; i < mark.length; i++) {

                System.out.println("enter the mark=  " + subject[i]);
                mark[i] = sc.nextInt();
            }
            //object student class

            student student = new student(studentID, Name, mark);

            // object student1 class
            student1 student2 = new student1();
            //method
            student2.addStudent(student);
            student2.findStudentById(studentID);

            //object of the opration class
            Opration o = new Opration();
            int total = o.calculateTotal(mark);
            int maxMark = o.calculateMaxMark(mark);
            int minMark = o.calculateMinMark(mark);
            double average = o.calculateAverage(total);

            //object of the grade class
            Grade grade = new Grade();
            String stringValue = grade.calculateGrade(average);
            System.out.println("Grade=" + stringValue);

        //object of report class
            Report r = new Report(total, minMark, maxMark, average);
            r.report(total, maxMark, minMark, average);


        }


    }

}




