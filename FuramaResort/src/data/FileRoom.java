package data;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRoom {
    public static final String FILE_PATH = "src\\data\\Room.csv";
    public static final String COMMA = ",";

    public List<Room> readCSVFile() {
        BufferedReader bufferedReader = null;
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Room room;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
            //String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent, String freeService
                room = new Room(arrStr[0], arrStr[1], Integer.parseInt(arrStr[2]), Integer.parseInt(arrStr[3]),
                        Integer.parseInt(arrStr[4]),arrStr[5],arrStr[6]);
                roomList.add(room);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public  void writeCSVFile( Room room, boolean append){
        if(room == null) return;

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,append);
            bufferedWriter = new BufferedWriter(fileWriter);

            StringBuffer buffer = new StringBuffer();
            buffer.append(room.getId()).append(",");
            buffer.append(room.getNameService()).append(",");
            buffer.append(room.getArea()).append(",");
            buffer.append(room.getPrice()).append(",");
            buffer.append(room.getNumberOfPeople()).append(",");
            buffer.append(room.getTypeOfRent()).append(",");
            buffer.append(room.getFreeService()).append(",");

            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
