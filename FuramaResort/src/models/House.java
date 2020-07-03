package models;

public class House extends Services {
    private String tieuChuanPhong;
    private String tiengNghiKhac;
    private int numOfFloor;

    public House() {
    }

    public House( String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent, String tieuChuanPhong, String tiengNghiKhac, int numOfFloor ) {
        super(id, nameService, area, price, numberOfPeople, typeOfRent);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tiengNghiKhac = tiengNghiKhac;
        this.numOfFloor = numOfFloor;
    }

    public House( String tieuChuanPhong, String tiengNghiKhac, int numOfFloor ) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.tiengNghiKhac = tiengNghiKhac;
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

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor( int numOfFloor ) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public String toString() {
        return
                super.toString()+"tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tiengNghiKhac='" + tiengNghiKhac + '\'' +
                ", numOfFloor=" + numOfFloor +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
