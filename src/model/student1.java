package model;

public class student1 {

    //add student and find student method

    int  studentCount=0;

    student[] students=new student[60];

    public void addStudent(student student) {
        if (studentCount < 60) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("sorry array of index bound");
        }
    }


    public student findStudentById(int studentID){

        for (int i = 0; i <studentCount ; i++) {
            if(students[i].studentID==studentID)
                return students[i];
        }
        return null;
    }



}
