package models;

public abstract class Services {
    private String id;
    private String nameService;
    private int area;
    private int price;
    private int numberOfPeople;
    private String typeOfRent;



    public Services(String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent ) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.typeOfRent = typeOfRent;
    }

    public Services() {

    }

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService( String nameService ) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea( int area ) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople( int numberOfPeople ) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent( String typeOfRent ) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", numberOfPeople=" + numberOfPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                ',';
    }

    public abstract void showInfor();


}
