package data;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCustomer {
    public static final String FILE_PATH = "src\\data\\Customer.csv";
    public static final String COMMA = ",";

    public List<Customer> readCSVFile() {
        BufferedReader bufferedReader = null;
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            Customer customer;
            String[] arrStr;
            while ((line = bufferedReader.readLine()) != null) {
                arrStr = line.split(",");
                //String name, String birthDay, String gender, int phoneNumber, String email,
                // String typeOfCustomer, String address, Services services
                String temp = arrStr[8];
                switch (temp){
                    case "Villa":{
                        Villa tempVilla = new Villa(arrStr[7],arrStr[8],Integer.parseInt(arrStr[9]),Integer.parseInt(arrStr[10]),Integer.parseInt(arrStr[11]),arrStr[12]
                        ,arrStr[13],arrStr[14],Double.parseDouble(arrStr[15]),Integer.parseInt(arrStr[16]));
                        customer = new Customer(arrStr[0],arrStr[1],arrStr[2],Integer.parseInt(arrStr[3]),arrStr[4],arrStr[5],
                                arrStr[6],tempVilla);
                        customerList.add(customer);
                        break;
                    }
                    case "House":{
                        House tempHouse = new House(arrStr[7],arrStr[8],Integer.parseInt(arrStr[9]),Integer.parseInt(arrStr[10]),Integer.parseInt(arrStr[11]),arrStr[12]
                                ,arrStr[13],arrStr[14],Integer.parseInt(arrStr[15]));
                        customer = new Customer(arrStr[0],arrStr[1],arrStr[2],Integer.parseInt(arrStr[3]),arrStr[4],arrStr[5],
                                arrStr[6],tempHouse);
                        customerList.add(customer);
                        break;
                    }
                    case "Room":
                        Room tempRoom = new Room(arrStr[7],arrStr[8],Integer.parseInt(arrStr[9]),
                                Integer.parseInt(arrStr[10]),Integer.parseInt(arrStr[11]),arrStr[12],arrStr[13]);
                        customer = new Customer(arrStr[0],arrStr[1],arrStr[2],Integer.parseInt(arrStr[3]),arrStr[4],arrStr[5],
                                arrStr[6],tempRoom);
                        customerList.add(customer);
                        break;
                }


                //Services{id='Vip', nameService='Villa', area=120, price=2000000, numberOfPeople=6,
                // typeOfRent='day',tieuChuanPhong='***', tiengNghiKhac='Massage', numOfFloor=3},
//                customer = new Customer(arrStr[0], arrStr[1],arrStr[2], Integer.parseInt(arrStr[3]),
//                        arrStr[4],arrStr[5],arrStr[6],(Services) arrStr[7]);
//                customerList.add(customer);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public  void writeCSVFile( Customer customer, boolean append){
        if(customer == null) return;

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            //String name, String birthDay, String sex, int phoneNumber,
            // String email, String typeOfCustomer, String address, Services services
            StringBuffer buffer = new StringBuffer();
            buffer.append(customer.getName()).append(",");
            buffer.append(customer.getBirthDay()).append(",");
            buffer.append(customer.getGender()).append(",");
            buffer.append(customer.getPhoneNumber()).append(",");
            buffer.append(customer.getEmail()).append(",");
            buffer.append(customer.getTypeOfCustomer()).append(",");
            buffer.append(customer.getAddress()).append(",");


            String temp = customer.getServices().getNameService();
            switch (temp){
                case "Villa":{
                    //String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent,
                    // String tieuChuanPhong, String tiengNghiKhac, double areaOfPool, int numOfFloor
                    buffer.append(customer.getServices().getId()).append(",");
                    buffer.append(customer.getServices().getNameService()).append(",");
                    buffer.append(customer.getServices().getArea()).append(",");
                    buffer.append(customer.getServices().getPrice()).append(",");
                    buffer.append(customer.getServices().getNumberOfPeople()).append(",");
                    buffer.append(customer.getServices().getTypeOfRent()).append(",");
                    buffer.append(((Villa)customer.getServices()).getTieuChuanPhong()).append(",");
                    buffer.append(((Villa)customer.getServices()).getTiengNghiKhac()).append(",");
                    buffer.append(((Villa)customer.getServices()).getAreaOfPool()).append(",");
                    buffer.append(((Villa)customer.getServices()).getNumOfFloor()).append(",");
                    break;
                }
                case "House":{
                    buffer.append(customer.getServices().getId()).append(",");
                    buffer.append(customer.getServices().getNameService()).append(",");
                    buffer.append(customer.getServices().getArea()).append(",");
                    buffer.append(customer.getServices().getPrice()).append(",");
                    buffer.append(customer.getServices().getNumberOfPeople()).append(",");
                    buffer.append(customer.getServices().getTypeOfRent()).append(",");
                    buffer.append(((House)customer.getServices()).getTieuChuanPhong()).append(",");
                    buffer.append(((House)customer.getServices()).getTiengNghiKhac()).append(",");
                    buffer.append(((House)customer.getServices()).getNumOfFloor()).append(",");
                    break;
                }
                case "Room":{
                    buffer.append(customer.getServices().getId()).append(",");
                    buffer.append(customer.getServices().getNameService()).append(",");
                    buffer.append(customer.getServices().getArea()).append(",");
                    buffer.append(customer.getServices().getPrice()).append(",");
                    buffer.append(customer.getServices().getNumberOfPeople()).append(",");
                    buffer.append(customer.getServices().getTypeOfRent()).append(",");
                    buffer.append(((Room)customer.getServices()).getFreeService()).append(",");
                    break;
                }
            }


            bufferedWriter.write(buffer.toString());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
