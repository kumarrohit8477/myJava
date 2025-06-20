public class Car2 {
    int numberOfWheels;
    int noOfDoors;
    int noOfSeats;
    String color;
    String Brand;
    float maxSpeed;
    int price;

    public Car2 start(){
        System.out.println("The car is starting.");
    } 
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        System.out.println(myCar);
    }


}
