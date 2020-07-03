package controllers;

import models.Room;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class addNewRoom {
    public Room addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------New Room----------");
        //String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent, String freeService

        Pattern patternID = Pattern.compile("^SVRO-[0-9]{4}$");
        Matcher matcherID;
        String tempID;
        do {
            System.out.println("Enter ID: ");
            tempID = sc.nextLine();
            matcherID = patternID.matcher(tempID);
        }while (!matcherID.matches());

        Pattern patternNS = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcherNS;
        String tempNS;
        do {
            System.out.println("Enter Name Serice: ");
            tempNS = sc.nextLine();
            matcherNS = patternNS.matcher(tempNS);
        }while (!matcherNS.matches());


        int tempArea = 0;
        label: do {
            try {
                System.out.println("Enter the Area: ");
                tempArea = Integer.parseInt(sc.nextLine());
            } catch (Exception e){
                continue label;
            }
        }while (tempArea<30);


        int tempPrice =0;
        lablePrice: do {
            try{
                System.out.println("Enter the price: ");
                tempPrice = Integer.parseInt(sc.nextLine());
            } catch (Exception e ){
                continue lablePrice;
            }

        }while (tempPrice<=0);

        int tempNum =0;
        lableNum :do {
            try{
                System.out.println("Enter Number of People: ");
                tempNum = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                continue lableNum;
            }
        }while (tempNum <=0 || tempNum >20);

        Pattern patternType = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcherType;
        String tempType;
        do {
            System.out.println("Enter Type of Rent: ");
            tempType = sc.nextLine();
            matcherType = patternType.matcher(tempType);
        }while (!matcherType.matches());

        System.out.println("Enter Free Service: ");
        String tempFS = sc.nextLine();


        return (new Room(tempID,tempNS,tempArea,tempPrice,tempNum,tempType,tempFS));
    }
}
