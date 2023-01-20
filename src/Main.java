import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(new File("resources/input.txt"));
            FileWriter output = new FileWriter("resources/output.txt")) {
            String[] strIn = input.nextLine().split(" ");
            int[] intIn = new int[strIn.length];

            for(int i = 0; i < strIn.length; i++)
                intIn[i] = Integer.parseInt(strIn[i]);

            //sort

            for(int i = 0; i < intIn.length; i++) {
                for(int j = 0; j < 2 - i; j++) {
                    if(intIn[j + 1] > intIn[j]) {
                        int swap = intIn[j];
                        intIn[j] = intIn[j + 1];
                        intIn[j + 1] = swap;
                    }
                }
                for(int j = 3; j < 5 - i; j++) {
                    if(intIn[j + 1] > intIn[j]) {
                        int swap = intIn[j];
                        intIn[j] = intIn[j + 1];
                        intIn[j + 1] = swap;
                    }
                }
            }

            int result = intIn[0] * intIn[3] +
                    intIn[1] * intIn[4] +
                    intIn[2] * intIn[5];

            output.write(result + "");

        } catch (IOException e) {
            System.out.println("Error - " + e);
        }
    }
}