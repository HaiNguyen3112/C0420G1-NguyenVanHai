package IntroductionJava.TH.Bai16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {
    public static void main( String[] args ) {
        try{
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!!!");
            writer.write("Codegym");
            writer.write("C04");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
