package controllers;

import data.FileCustomer;
import models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Cinema {

    public static void main( String[] args ) {

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
