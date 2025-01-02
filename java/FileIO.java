import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bfw = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            while ((line = bfr.readLine()) != null) {
                bfw.write(line);
                bfw.newLine();
            }
            bfw.flush();

            String s = "10";
            int i = (Integer.parseInt(s))*2;
            System.out.println("i is:" + i);

        } catch (IOException e) {
            System.out.print(e);
        }
    }
}