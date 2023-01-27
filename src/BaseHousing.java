public class BaseHousing {

    //Ev tiplerinin base sınıfı tüm getter ve setterları burada tanımlıyoruz child sınıflar extend ediyor.

     private double price;
     private int area;
     private int numberOfRoom;
     private int numberOfHall;

    public BaseHousing(double price, int area, int numberOfRoom, int numberOfHall) {
        this.price = price;
        this.area = area;
        this.numberOfRoom = numberOfRoom;
        this.numberOfHall = numberOfHall;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }
}
