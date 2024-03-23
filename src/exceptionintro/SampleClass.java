package exceptionintro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLInput;

public class SampleClass {
    // Always catch specific exceptions instead of generic exceptions
    public void doSomething() {
        try {

            if(true) {
                throw new SQLException();
            }

            File file = new File("asdas.txt");
            FileReader fileReader = new FileReader(file);

        } catch (SQLException ex) { // -> Java forces us to this
            System.out.println("Something wrong with DB");
        } catch (FileNotFoundException ex) { // -> Java forces us to this
            System.out.println("something wrong with file");
        } catch (ArithmeticException ex) { // -> Java does not force us to do this
            System.out.println("Something wrong with the math");
        } catch (Exception ex) {
            System.out.println("Any other exception");
        }
    }

    public void doSomething2() {
        try {
            if(false) {
                throw new SQLException();
            } else {
                return; // finally would still be called
            }

        } catch (SQLException ex) {
            System.out.println("Something went wrong");
        } finally {
            // Used to clean up resources
            // That gets called no matter what (except some conditions)
            System.out.println("Called no matter what");
        }

        // Difference between final, finally, finalize
        // H/W -> google what finalize means
        // finalize -> A method that is called when an object is destroyed

    }
}
