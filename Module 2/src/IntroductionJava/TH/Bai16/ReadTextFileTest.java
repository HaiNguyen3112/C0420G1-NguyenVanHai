package IntroductionJava.TH.Bai16;

import java.io.*;

public class ReadTextFileTest {
    public static void main( String[] args ) {
        try {
            File inFile = new File("Hello.txt");
            FileReader fileReader = new FileReader(inFile);
            // Đọc theo bộ nhớ đệm.
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            // Đọc bình thường.
//            Reader reader = new FileReader(inFile);
//            int c;
//            while ((c = reader.read()) != -1){
//                System.out.printf(""+(char) c);
//        }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
