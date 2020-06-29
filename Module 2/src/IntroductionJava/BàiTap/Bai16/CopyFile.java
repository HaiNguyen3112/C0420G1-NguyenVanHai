package IntroductionJava.BàiTap.Bai16;

import java.io.*;

public class CopyFile {
    public static void main( String[] args ) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("D:/source.txt");
            outputStream = new FileOutputStream("D:/destination.txt");

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

        //test lại
        int c;
        File inFile = new File("D:/destination.txt");
        FileReader  fileReader = new FileReader(inFile);
        BufferedReader br = new BufferedReader(fileReader);
        String str ="";
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }

    }

