package exceptionintro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class Student {
    public int doSomething() {
        throw new ArithmeticException();
    }

    public void readFile() {

        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);

            System.out.println("Printing from inside try");
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found. Please provide a different file name");
        }

        System.out.println("Printing from outside try");

    }

    public void readFile2() throws FileNotFoundException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
    }

    public void searchStudent(int id) throws StudentNotFoundException {
        if(userNotFound()) {
            throw new StudentNotFoundException();
        }
    }

    private boolean userNotFound() {
        return true;
    }

    // What is the difference between throw and throws


    // ERROR
    public void test() {
        test();
    }

    public int testMethod() {
        try {
            if(false) {
                throw new SQLException();
            }

            return 1;
        } catch (SQLException ex) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException ex1) {

            }

        }  finally {
            return 2;
        }
    }
}
