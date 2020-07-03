package data;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHouse {
    public static final String FILE_PATH = "src\\data\\House.csv";
    public static final String COMMA = ",";

    public  List<House> readCSVFile() {
        BufferedReader bufferedReader = null;
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            House house;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                //String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent,
                // String tieuChuanPhong, String tiengNghiKhac, double areaOfPool, int numOfFloor
                house = new House(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]),arrStr[5],arrStr[6],arrStr[7],Integer.parseInt(arrStr[8]));
                houseList.add(house);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public  void writeCSVFile( House house, boolean append){
        if(house == null) return;

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(house.getId()).append(",");
            buffer.append(house.getNameService()).append(",");
            buffer.append(house.getArea()).append(",");
            buffer.append(house.getPrice()).append(",");
            buffer.append(house.getNumberOfPeople()).append(",");
            buffer.append(house.getTypeOfRent()).append(",");
            buffer.append(house.getTiengNghiKhac()).append(",");
            buffer.append(house.getTieuChuanPhong()).append(",");
            buffer.append(house.getNumOfFloor()).append(",");

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}