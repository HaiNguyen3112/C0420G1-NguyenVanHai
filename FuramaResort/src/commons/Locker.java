package commons;

import models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class Locker {
    private String ID;
    private Employee employee;

    public Locker() {
    }

    public Locker( String ID, Employee employee ) {
        this.ID = ID;
        this.employee = employee;
    }

    public String getID() {
        return ID;
    }

    public void setID( String ID ) {
        this.ID = ID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee( Employee employee ) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Locker{" +
                "ID='" + ID + '\'' +
                ", " + employee +
                '}';
    }

    public int find(String id, Stack<Locker> lockerStack){
        for (int i =0;i<lockerStack.size();i++){
            if (lockerStack.get(i).ID.equals(id)){
                return i;
            }
        }
        return -1;
    }

    public static void main( String[] args ) {
        Stack<Locker> lockerStack = new Stack<>();
        try{
            FileReader fileReader = new FileReader("src\\data\\Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Employee employee;
            String [] arrStr;
            while ((line = bufferedReader.readLine())!=null){
                arrStr = line.split(",");
                employee = new Employee(arrStr[1],Integer.parseInt(arrStr[2]),arrStr[3]);
                String tempID = arrStr[0];
                lockerStack.add(new Locker(tempID,employee));
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int i =0;i<lockerStack.size();i++){
            System.out.println(lockerStack.get(i).toString());;
        }

        System.out.println("Enter ID Employee to find:");
        Scanner sc = new Scanner(System.in);
        String tempID = sc.nextLine();
        Locker a = new Locker();
        int check = a.find(tempID,lockerStack);
        if (check == -1){
            System.out.println("Not found!!!!");
        } else {
            System.out.println("Found it!!!");
            System.out.println(lockerStack.get(check).toString());
        }
    }
}
