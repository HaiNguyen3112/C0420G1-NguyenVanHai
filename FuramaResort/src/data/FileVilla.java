package data;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileVilla {
    public static final String FILE_PATH = "src\\data\\Villa.csv";
    public static final String COMMA = ",";

    public  List<Villa> readCSVFile() {
        BufferedReader bufferedReader = null;
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Villa villa;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                //String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent,
                // String tieuChuanPhong, String tiengNghiKhac, double areaOfPool, int numOfFloor
                villa = new Villa(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]),arrStr[5],arrStr[6],arrStr[7],Double.parseDouble(arrStr[8]),Integer.parseInt(arrStr[9]));
                villaList.add(villa);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    public  void writeCSVFile( Villa villa, boolean append){
        if(villa == null) return;

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(villa.getId()).append(",");
            buffer.append(villa.getNameService()).append(",");
            buffer.append(villa.getArea()).append(",");
            buffer.append(villa.getPrice()).append(",");
            buffer.append(villa.getNumberOfPeople()).append(",");
            buffer.append(villa.getTypeOfRent()).append(",");
            buffer.append(villa.getTiengNghiKhac()).append(",");
            buffer.append(villa.getTieuChuanPhong()).append(",");
            buffer.append(villa.getAreaOfPool()).append(",");
            buffer.append(villa.getNumOfFloor()).append(",");

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}