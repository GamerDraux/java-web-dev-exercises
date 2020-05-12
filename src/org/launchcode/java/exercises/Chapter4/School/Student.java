package org.launchcode.java.exercises.Chapter4.School;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.


public class Student {

//    fields
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;


//    Constructors
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa){
        this.name= name;
        this.studentId= studentId;
        this.numberOfCredits= numberOfCredits;
        this.gpa = gpa;
    }
    public Student (String name, int studentId){
        this(name, studentId, 0,0);
    }
    public Student (String name){
        this(name, nextStudentId);
        nextStudentId++;
    }
    public Student (){
        this("Unknown Student", 0, 0,0);
    }

//    Methods
    public String studentInfo(){
        return (this.name+" has a GPA of: "+this.gpa);
    }

//    setters and getters
    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int aStudentId){
        studentId = aStudentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    public double getGPA(){
        return gpa;
    }


    private void setGPA(double aGPA){
        gpa = aGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}