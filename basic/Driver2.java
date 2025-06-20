public class Driver2 {
    int numOfwheels;
    int numOfDoors;
    int numOfSeats;
    String color;
    String brand;
    float maxSpeed;
    float currentFuelInLiters = 1;
    int price;

    public static void main(String[] args) {
        Driver2 car = new Driver2();
    //  numOfwheels =4;    // this is not allowed
        car.numOfwheels = 4;  // this is allowed because we are using the object reference 'car'

    }
}
