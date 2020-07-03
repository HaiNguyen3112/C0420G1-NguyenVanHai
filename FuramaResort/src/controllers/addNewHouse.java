package controllers;

import models.House;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class addNewHouse {
    public House addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------New House----------");
        //String id, String nameService, int area, int price, int numberOfPeople,
        // String typeOfRent, String tieuChuanPhong, String tiengNghiKhac, int numOfFloor
//        System.out.println("Enter ID: ");
//        String tempID = sc.nextLine();
//        System.out.println("Enter Name Serice: ");
//        String tempNS = sc.nextLine();
//        System.out.println("Enter the Area: ");
//        int tempArea = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter the price: ");
//        int tempPrice = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter Number of People: ");
//        int tempNum = Integer.parseInt(sc.nextLine());
//        System.out.println("Enter Type of Rent: ");
//        String tempType = sc.nextLine();
//        System.out.println("Enter Tieu Chuan Phong: ");
//        String tempTC = sc.nextLine();
//        System.out.println("Enter Tien Nghi #: ");
//        String tempTN = sc.nextLine();
//        System.out.println("Enter Number of Floor: ");
//        int tempNumOF = Integer.parseInt(sc.nextLine());

        Pattern patternID = Pattern.compile("^SVHO-[0-9]{4}$");
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


        Pattern patternTC = Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcherTC;
        String tempTC;
        do {
            System.out.println("Enter Tieu Chuan Phong: ");
            tempTC = sc.nextLine();
            matcherTC = patternTC.matcher(tempTC);
        }while (!matcherTC.matches());

        Pattern patternTN = Pattern.compile("^(Massage)|(Karaoke)|(Food)|(Drink)|(Car)?$");
        Matcher matcherTN;
        String tempTN;
        do {
            System.out.println("Enter Tien Nghi #: ");
            tempTN = sc.nextLine();
            matcherTN = patternTN.matcher(tempTN);
        }while (!matcherTN.matches());

        int tempNumOF=0;
        lableNumOF: do {
            try{
                System.out.println("Enter Number of Floor: ");
                tempNumOF = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                continue lableNumOF;
            }
        }while (tempNumOF <=0);


        return(new House(tempID,tempNS,tempArea,tempPrice,tempNum,tempType,tempTC,tempTN,tempNumOF)) ;
    }
}
