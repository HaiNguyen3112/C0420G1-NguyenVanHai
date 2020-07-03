package models;

import java.util.ArrayList;
import java.util.List;

public class Villa extends Services {
    private String tieuChuanPhong;
    private String tiengNghiKhac;
    private double areaOfPool;
    private int numOfFloor;


    public Villa() {
    }

    public Villa( String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent ) {
        super(id, nameService, area, price, numberOfPeople, typeOfRent);
    }

    public Villa( String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent, String tieuChuanPhong, String tiengNghiKhac, double areaOfPool, int numOfFloor ) {
        super(id, nameService, area, price, numberOfPeople, typeOfRent);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tiengNghiKhac = tiengNghiKhac;
        this.areaOfPool = areaOfPool;
        this.numOfFloor = numOfFloor;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong( String tieuChuanPhong ) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTiengNghiKhac() {
        return tiengNghiKhac;
    }

    public void setTiengNghiKhac( String tiengNghiKhac ) {
        this.tiengNghiKhac = tiengNghiKhac;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool( double areaOfPool ) {
        this.areaOfPool = areaOfPool;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor( int numOfFloor ) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return super.toString() + "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tiengNghiKhac='" + tiengNghiKhac + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", numOfFloor=" + numOfFloor +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }

    public static void main( String[] args ) {
        Villa a = new Villa("Vip","Villa",120,2000000,6,"day","***","Massage",120,3);
        Villa b = new Villa("Vip1","Villa1",150,2200000,6,"day","***","Massage",120,3);
        Villa c = new Villa("Vip2","Villa2",110,1900000,6,"day","***","Massage",120,3);
        Villa d = new Villa("Vip3","Villa3",180,2500000,10,"day","***","Massage",120,3);
//        a.showInfor();
        List<Villa> villaList = new ArrayList<>();
        villaList.add(a);
        villaList.add(b);
        villaList.add(c);
        villaList.add(d);
        for (int i =0;i<villaList.size();i++){
            villaList.get(i).showInfor();
        }
    }
}
