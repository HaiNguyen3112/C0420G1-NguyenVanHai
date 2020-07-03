package models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room( String id, String nameService, int area, int price, int numberOfPeople, String typeOfRent, String freeService ) {
        super(id, nameService, area, price, numberOfPeople, typeOfRent);
        this.freeService = freeService;
    }

    public Room( String freeService ) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService( String freeService ) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+
                "freeService='" + freeService + '\'';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
