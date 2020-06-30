package IntroductionJava.TH.Bai16;

import java.io.*;

public class test {
    public static void main( String[] args ) {
        try{
            FileWriter writer = new FileWriter("Hello.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello!!!");
            bufferedWriter.write("Codegym");
            bufferedWriter.write("C04");
            bufferedWriter.write(System.lineSeparator());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileReader fileReader = new FileReader("Hello.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        String temp ="01,Hai,C420G1,26";
        String [] str = temp.split(",");
        for (String temp1 : str){
            System.out.println(temp1);
        }
    }
}
