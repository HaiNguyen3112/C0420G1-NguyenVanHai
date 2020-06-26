package IntroductionJava.BàiTap.Bai16;

import java.io.*;

public class CopyFile {
    public static void main( String[] args ) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("D:/source.txt");
            os = new FileOutputStream("D:/destination.txt");

            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            if (is != null) {
                is.close();
            }
            if (os != null) {
                os.close();
            }
        }
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

