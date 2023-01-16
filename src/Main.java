import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(new File("Users/denissmeyan/Yandex/Java/input.txt"));
            FileWriter output = new FileWriter("Users/denissmeyan/Yandex/Java/output.txt")) {
            String[] strIn = input.nextLine().split(" ");
            int[] intIn = new int[strIn.length];

            for(int i = 0; i < strIn.length; i++)
                intIn[i] = Integer.parseInt(strIn[i]);

            int maxA, maxB;
            int avgA, avgB;
            int minA, minB;

            //maxA
            if (intIn[0] > intIn[1] && intIn[0] > intIn[2]) {
                maxA = intIn[0];
                avgA = Math.max(intIn[1], intIn[2]);
                minA = Math.min(intIn[1], intIn[2]);
            } else if (intIn[1] > intIn[0] && intIn[1] > intIn[2]) {
                maxA = intIn[1];
                avgA = Math.max(intIn[0], intIn[2]);
            } else {
                maxA = intIn[2];
                avgA = Math.max(intIn[1], intIn[0]);
            }

            //maxB
            if (intIn[3] > intIn[4] && intIn[3] > intIn[5]) {
                maxB = intIn[3];
                avgB = Math.max(intIn[1], intIn[2]);
            } else if (intIn[4] > intIn[3] && intIn[4] > intIn[5]) {
                maxB = intIn[4];
                avgB = Math.max(intIn[1], intIn[2]);
            } else {
                maxB = intIn[5];
                avgB = Math.max(intIn[1], intIn[2]);
            }

            int maxResult = maxA * maxB;


        } catch (IOException e) {
            System.out.println("Error - " + e);
        }
    }
}