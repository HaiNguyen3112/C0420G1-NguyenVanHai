package controllers;

import models.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class addNewCustomer {
    public Customer addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Add New Customer--------");
        //String name, String birthDay, String sex, int phoneNumber,
        // String email, String typeOfCustomer, String address, Services services
        boolean check = true;
        Customer customer = new Customer();
        String tempName="";
        do {
            try{
                System.out.println("Enter Name: ");
                tempName = sc.nextLine();
                customer.setName(tempName);

            }catch (NameException e){
                System.out.println(e.toString());
                check = false;
                continue;
            }
            check = true;
        }while (!check);


        check = true;
        String tempBD="";
        do {
            try{
                System.out.println("Enter Birthday(dd/mm/yyyy)(1900<yyyy<2002): ");
                tempBD = sc.nextLine();
                customer.setBirthDay(tempBD);
            } catch (BirthdayException e) {
                System.out.println(e.toString());
                check = false;
                continue;
            }
            check = true;
        } while (!check);


        check = true;
        String tempGender ="";
        do{
            try {
                System.out.println("Enter Gender: ");
                tempGender = sc.nextLine();
                customer.setGender(tempGender);
            } catch (GenderException e) {
                System.out.println(e.toString());
                check = false;
                continue;
            }
            check =true;

        }while (!check);



        System.out.println("Enter PhoneNumber: ");
        int tempPhoneNumber = Integer.parseInt(sc.nextLine());


        check = true;
        String tempEmail="";
        do {
            try{
                System.out.println("Enter Email: ");
                tempEmail = sc.nextLine();
                customer.setEmail(tempEmail);
            } catch (EmailException e){
                System.out.println(e.toString());
                check = false;
                continue;
            } catch (Exception e) {
                e.printStackTrace();
            }
            check =true;
        }while (!check);




        System.out.println("Enter Type of Customer: ");
        String tempType = sc.nextLine();


        System.out.println("Enter Address: ");
        String tempAddress = sc.nextLine();


        String tempService;
        do {
            System.out.println("Enter Type of Service(Villa/House/Room): ");
            tempService = sc.nextLine();

        }while (!Pattern.matches("^(Villa)|(House)|(Room)$",tempService));

        Services services = null;
        switch (tempService){
            case "Villa":{
                addNewVilla tempVilla = new addNewVilla();
                services = tempVilla.addNew();
                break;
            }
            case "House":{
                addNewHouse tempHouse = new addNewHouse();
                services = tempHouse.addNew();
                break;
            }
            case "Room":{
                addNewRoom tempRoom = new addNewRoom();
                services = tempRoom.addNew();
                break;
            }
        }
        //String name, String birthDay, String sex, int phoneNumber,
        // String email, String typeOfCustomer, String address, Services services
        return(new Customer(tempName,tempBD,tempGender,tempPhoneNumber,tempEmail,tempType,tempAddress,services));
    }
}
