package LocalInnerClass;

public class Hotel {

    private String name;
    private int TOtalRooms;
    private int reservedRoom;

    public Hotel(String name, int TOtalRooms, int reservedRoom) {
        this.name = name;
        this.TOtalRooms = TOtalRooms;
        this.reservedRoom = reservedRoom;
    }
    public void reserveRoom(String name,int rooms){
        class Reservation{
            boolean validate(){
                        if(name==null||name.isBlank()){
                            System.out.println("Name should be present");
                            return false;
                        }

                        if(rooms<0){
                            System.out.println("rooms should be greater then zero");
                            return false;
                        }
                        if(rooms+reservedRoom>TOtalRooms){
                            System.out.println("not enough rooms");
                            return false;
                        }
                        return true;
            }
        }
        Reservation reservation = new Reservation();

        if(reservation.validate()){
            reservedRoom+=rooms;
            System.out.println("reservation conformed for"+ name+" "+"for this no of rooms "+rooms);
        }
        else {
            System.out.println("reservation failed");
        }


    }

}
