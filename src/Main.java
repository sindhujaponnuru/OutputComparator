import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter expected output");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
        String line="";
        String expectedOutput="";
        do
        {
            line = bufferedReader.readLine();
            expectedOutput = expectedOutput + line + "\n";
        }while(!line.equals("exit"));
        String [] expected= (expectedOutput.split("\n"));
        System.out.println(expected);
        System.out.println("Enter your output");
        line="";
        String output="";
        do
        {
            line = bufferedReader.readLine();
            output = output + line + "\n";
        }while(!line.equals("exit"));
        System.out.println(output);
        String [] out= (output.split("\n"));
        // Checking both strings
        for(int i = 0; i < expected.length; i++)
        {
            String expectedLine=expected[i];
            String yourLine=out[i];
            if(!expectedLine.equals(yourLine))
            {
                System.out.println("Found difference at Line : " + (i+1));
                System.out.println(" Expected output is : "+ expectedLine);
                System.out.println(" Your output is : "+yourLine);
            }
        }
    }
}
