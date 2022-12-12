public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("KIA", "RIO", 2, PassengerCar.BodyTypes.ВНЕДОРОЖНИК);
        Truck truck = new Truck("KAMAZ", "unknown", 10, Truck.LoadCapacity.N3);
        Bus bus = new Bus("Газель", "unknown", 10, Bus.PassengerCapacity.MEDIUM);

        CategoryB<PassengerCar> categoryB = new CategoryB<>("Андрей", "B", 1);
        CategoryC<Truck> categoryC = new CategoryC<>("Сергей", "C", 1);
        CategoryD<Bus> categoryD = new CategoryD<>("Максим", "D", 1);

        System.out.println("Водитель " + categoryB + " управляет " + passengerCar);
        System.out.println("Водитель " + categoryC + " управляет " + truck);
        System.out.println("Водитель " + categoryD + " управляет " + bus);
    }
}