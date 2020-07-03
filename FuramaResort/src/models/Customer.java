package models;

import controllers.addNewHouse;
import controllers.addNewRoom;
import controllers.addNewVilla;
import data.FileCustomer;
import data.FileHouse;
import data.FileRoom;
import data.FileVilla;

import java.io.FileWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer implements Comparator<Customer> {
    private String name;
    private String birthDay;
    private String gender;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services services;

    public Customer() {
    }

    public Customer( String name, String birthDay, String gender, int phoneNumber, String email, String typeOfCustomer, String address, Services services ) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;

    }

    public String getName() {
        return name;
    }

    public void setName( String name ) throws NameException {
        if (!Pattern.matches("^(([A-Z][a-z]*)+(\\s*))+$",name)){
            throw new NameException("Viet hoa chu cai dau!!!");
        }
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay( String birthDay ) throws BirthdayException {
        if (!Pattern.matches("^(0[1-9]|[12][0-9]|3[01])" +
                                    "[-/.](0[1-9]|1[012])" +
                                    "[-/.]((19[0-9][0-9])|(200[012]))$",birthDay)){
            throw new BirthdayException("dd/mm/yyyy. 1900<yyyy<2002");
        }
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender( String gender ) throws GenderException {
        if (!Pattern.matches("^(Male)|(Female)|(Unknown)$",gender)){
            throw new GenderException("Sai dinh dang. Male/Female/Unknown");
        }
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber( int phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) throws Exception {
        //[\S]+@[\S]+.[\S]+([.][\S]+)?
        if (!Pattern.matches("^[\\S]+@[a-z]{3,}.[a-z]{3,}([.][a-z]+)?$",email)){
            throw new EmailException("abc@abc.abc");
        }
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer( String typeOfCustomer ) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices( Services services ) {
        if (services instanceof Villa){
            Villa tempVilla = new Villa(services.getId(),services.getNameService(),services.getArea(),services.getPrice(),
                    services.getNumberOfPeople(),services.getTypeOfRent(),((Villa) services).getTieuChuanPhong(),((Villa) services).getTiengNghiKhac(),
                    ((Villa) services).getAreaOfPool(),((Villa) services).getNumOfFloor());
            this.services = tempVilla;
        }
        if (services instanceof House){
            House tempHouse = new House(services.getId(),services.getNameService(),services.getArea(),services.getPrice(),services.getNumberOfPeople(),services.getTypeOfRent(),
                    ((House) services).getTieuChuanPhong(),((House) services).getTiengNghiKhac(),((House) services).getNumOfFloor());
            this.services = tempHouse;
        }
        if (services instanceof Room){
            Room tempRoom = new Room(services.getId(),services.getNameService(),services.getArea(),services.getPrice(),services.getNumberOfPeople(),
                    services.getTypeOfRent(),((Room) services).getFreeService());
            this.services = tempRoom;
        }
    }

    public void showInfor(){
        System.out.println(toString());
    }

    public void addNewCustomer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Add New Customer---------");
        //String name, String birthDay, String sex, int phoneNumber,
        // String email, String typeOfCustomer, String address, Services services
        System.out.println("Enter Name: ");
        String tempName = sc.nextLine();
        sc.next();
        System.out.println("Enter Birthday: ");
        String tempBirthday = sc.nextLine();
        sc.next();
        System.out.println("Enter Gender: ");
        String tempGender = sc.nextLine();
        sc.next();
        System.out.println("Enter PhoneNumber: ");
        int tempPhone = sc.nextInt();
        sc.next();
        System.out.println("Enter Email: ");
        String tempEmail = sc.nextLine();
        sc.next();
        System.out.println("Enter Type of Customer: ");
        String tempType = sc.nextLine();
        sc.next();
        System.out.println("Enter Address: ");
        String tempAdd = sc.nextLine();
        sc.next();
        System.out.println("Enter Type of Service(Villa/House/Room): ");
        String tempService = sc.nextLine();
        sc.next();
        switch (tempService){
            case "Villa": {
                addNewVilla temp = new addNewVilla();
                Villa tempVilla = temp.addNew();

                FileVilla fileVilla = new FileVilla();
                fileVilla.writeCSVFile(tempVilla,true);
                break;
            }
            case "House":{
                addNewHouse temp = new addNewHouse();
                House tempHouse = temp.addNew();

                FileHouse fileHouse = new FileHouse();
                fileHouse.writeCSVFile(tempHouse,true);
                break;
            }
            case "Room":{
                addNewRoom temp = new addNewRoom();
                Room tempRoom = temp.addNew();

                FileRoom fileRoom = new FileRoom();
                fileRoom.writeCSVFile(tempRoom,true);
                break;
            }
        }
    }
    @Override
    public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", birthDay='" + birthDay + '\'' +
                    ", gender='" + gender + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", email='" + email + '\'' +
                    ", typeOfCustomer='" + typeOfCustomer + '\'' +
                    ", address:{'" + address + '\'' +"}"+
                    ", services="+ services.toString()+
                    '}';


    }

    public static void main( String[] args ) {
        //String name, String birthDay, String sex, int phoneNumber,
        // String email, String typeOfCustomer, String address, Services services

        Services a = new Villa("Vip","Villa",120,2000000,6,"day","***","Massage",45,3);
        Customer customer = new Customer("Hai","31/12/1994","Male",123456,"nguyenhai@gmail.com","Diamond","Tieu La",a);
//        customer.setServices(a);
//        System.out.println(customer.getServices());
        FileCustomer fileCustomer = new FileCustomer();
        fileCustomer.writeCSVFile(customer,true);
    }



    @Override
    public int compare( Customer o1, Customer o2 ) {
        if (o1.getName() == o2.getName()){
            return o1.getBirthDay().substring(5,9).compareTo(o2.getBirthDay().substring(5,9));
        }
        return Integer.parseInt(o1.getName()) - Integer.parseInt(o2.getName());
    }
}
