package controllers;

import data.FileCustomer;
import data.FileHouse;
import data.FileRoom;
import data.FileVilla;
import models.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MainControllers {
    Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) throws IOException {
        MainControllers mc = new MainControllers();
        mc.displayMainMenu();
    }
    public  void displayMainMenu() throws IOException {
        int choose =0;
        do {
            System.out.println("------------Menu-----------");
            System.out.println("1. Add New Services.");
            System.out.println("2. Show Services");
            System.out.println("3. Add New Customer.");
            System.out.println("4. Show Information of Customer.");
            System.out.println("5. Add New Booking(Cinema).");
            System.out.println("6. Show Information of Employee.");
            System.out.println("7. Exit.");
            System.out.printf("Enter your choose: ");
            choose = sc.nextInt();
        } while (choose < 1 || choose > 7);
        switch (choose){
            case 1:{
                addNewService();
                break;
            }
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInformationCustomer();
                break;
            case 5:
                cinemma();
                displayMainMenu();
                break;
            case 6:
                showEmployee();
                break;
            case 7:
                System.exit(1);
        }

    }

    public void addNewService() throws IOException {
        int choose = 0;
        do {
            System.out.println("------------Add New-----------");
            System.out.println("1. Add New Villa.");
            System.out.println("2. Add New House.");
            System.out.println("3. Add New Room.");
            System.out.println("4. Back to Menu.");
            System.out.println("5. Exit.");
            System.out.printf("Enter your choose: ");
            choose = sc.nextInt();
        } while (choose <1 || choose >5);
        switch (choose){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(1);

        }

    }
    public void addNewVilla() throws IOException {

        // Method Input
        addNewVilla villa = new addNewVilla();
        Villa tempVilla = villa.addNew();
        // Write file
        FileVilla fileVilla = new FileVilla();
        fileVilla.writeCSVFile(tempVilla,true);
        addNewService();
    }
    public void addNewHouse() throws IOException {
        //ghi vao house.csv
        addNewHouse house = new addNewHouse();
        House tempHouse = house.addNew() ;

        FileHouse fileHouse = new FileHouse();
        fileHouse.writeCSVFile(tempHouse,true);
        addNewService();
    }
    public void addNewRoom() throws IOException {

        addNewRoom room = new addNewRoom();
        Room tempRoom = room.addNew();

        FileRoom fileRoom = new FileRoom();
        fileRoom.writeCSVFile(tempRoom,true);
        addNewService();
    }

    public void showService() throws IOException {
        int choose = 0;
        do {
            System.out.println("--------Show Services---------");
            System.out.println("1. Show All Villa.");
            System.out.println("2. Show All House.");
            System.out.println("3. Show All Room.");
            System.out.println("4. Show All Name Villa Not Duplicate.");
            System.out.println("5. Show All Name House Not Duplicate.");
            System.out.println("6. Show All Name Room Not Duplicate.");
            System.out.println("7. Back to Menu.");
            System.out.println("8. Exit");
            System.out.printf("Enter your choose: ");
            choose = sc.nextInt();
        } while (choose<1 || choose >7);
        switch (choose){
            case 1:{
                FileVilla fileVilla = new FileVilla();
                List<Villa> villaList = new ArrayList<>();
                villaList = fileVilla.readCSVFile();
                for (Villa villa: villaList){
                    villa.showInfor();
                }
                showService();
                break;
            }
            case 2:{
                FileHouse fileHouse = new FileHouse();
                List<House> houseList = new ArrayList<>();
                houseList = fileHouse.readCSVFile();
                for (House house : houseList){
                    house.showInfor();
                }
                showService();
                break;
            }
            case 3:{
                FileRoom fileRoom = new FileRoom();
                List<Room> roomList = new ArrayList<>();
                roomList = fileRoom.readCSVFile();
                for (Room room: roomList){
                    room.showInfor();
                }
                showService();
                break;
            }
            case 4:
                showVillaNotDuplicate();
                showService();
                break;
            case 5:
                showHouseNotDuplicate();
                showService();
                break;
            case 6:
                showRoomNotDuplicate();
                showService();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(1);
        }
    }
    public void addNewCustomer() throws IOException {
        addNewCustomer tempCustom = new addNewCustomer();
        Customer temp = tempCustom.addNew();

        FileCustomer fileCustomer = new FileCustomer();
        fileCustomer.writeCSVFile(temp,true);
        System.out.println("Done!!!");
        displayMainMenu();
    }
    public void showInformationCustomer() throws IOException {
        FileCustomer fileCustomer = new FileCustomer();
        List<Customer> customerList = new ArrayList<>();
        customerList = fileCustomer.readCSVFile();
        Collections.sort(customerList, new CustomerComparator());
        for (Customer customer : customerList){
            System.out.println(customer);
        }
        displayMainMenu();
    }

    public void showEmployee() throws IOException {
        Map<String, Employee> employeeMap = new HashMap<>();
        try{
            FileReader fileReader = new FileReader("src\\data\\Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Employee employee;
            String [] arrStr;
            while ((line = bufferedReader.readLine())!=null){
                arrStr = line.split(",");
                employee = new Employee(arrStr[1],Integer.parseInt(arrStr[2]),arrStr[3]);
                String tempKey = arrStr[0];
                employeeMap.put(tempKey,employee);
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
       for (String key : employeeMap.keySet()){
           System.out.println("ID: "+key+": "+employeeMap.get(key));
       }

    }




    public void showVillaNotDuplicate(){
        FileVilla fileVilla = new FileVilla();
        List<Villa> villaList = fileVilla.readCSVFile();

        TreeSet<Villa> villaTreeSet = new TreeSet<>();

        for (Villa villa: villaList){
            villaTreeSet.add(villa);
        }

        for (Villa villa : villaTreeSet){
            System.out.println(villa);
        }

    }
    public void showHouseNotDuplicate(){
        FileHouse fileHouse = new FileHouse();
        List<House> houseList = fileHouse.readCSVFile();

        TreeSet<House> houseTreeSet = new TreeSet<>();

        for (House house : houseList){
            houseTreeSet.add(house);
        }

        for (House house: houseTreeSet){
            System.out.println(house);
        }
    }   public void showRoomNotDuplicate(){
        FileRoom fileRoom = new FileRoom();
        List<Room> roomList = fileRoom.readCSVFile();

        TreeSet<Room> roomTreeSet = new TreeSet<>();

        for (Room room : roomList){
            roomTreeSet.add(room);
        }

        for (Room room: roomTreeSet){
            System.out.println(room);
        }
    }
    public void cinemma(){
        FileCustomer fileCustomer = new FileCustomer();
        List<Customer> customerList = fileCustomer.readCSVFile();
        Scanner sc = new Scanner(System.in);

        Queue<Customer> queue = new LinkedList<>();

        int numTicket = customerList.size();

        while (numTicket>0){
            for (int i =0;i<customerList.size() && numTicket >0;i++){
                System.out.println(customerList.get(i).getName()+" want to buy a ticket? Y|N");
                String temp = sc.nextLine();
                if (temp.equals("Y")){
                    queue.add(customerList.get(i));
                    customerList.remove(i);
                    numTicket --;
                }
            }
        }
        for (Customer customer:queue){
            System.out.println(customer);
        }
    }

}
