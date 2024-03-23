package exceptionintro;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException, StudentNotFoundException {
//        Student student = new Student();
//        int n = student.doSomething();

//        student.readFile();
//        System.out.println("Recieved this from student: ");
//        System.out.println("Ending my program. Bye bye.");

//        try {
//            student.readFile2();
//        } catch (FileNotFoundException ex) {
//            System.out.println("Calling exception from main");
//        }

//        student.readFile2();

        SampleClass sampleClass = new SampleClass();
//        sampleClass.doSomething2();

        Student student = new Student();
//        student.searchStudent(1);

        student.test();
    }
}
