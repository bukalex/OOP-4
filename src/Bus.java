public class Bus extends Car implements Competitive{
    public enum PassengerCapacity {VERY_SMALL, SMALL, MEDIUM, BIG, VERY_BIG};

    private PassengerCapacity passengerCapacity;

    public Bus(String brend, String model, float engineVolume, PassengerCapacity passengerCapacity){
        super(brend, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void printType() {
        System.out.println(passengerCapacity);
    }

    @Override
    public void startMovement() {
        System.out.println("Начал движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Ушел на пит-стоп");
    }

    @Override
    public void theBestTime() {
        System.out.println("Лучшее время неизвестно");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость неизвестна");
    }

    @Override
    public String toString() {
        switch (passengerCapacity) {
            case VERY_SMALL: return super.toString() + "\n" + "passenger capacity: до 10 мест";
            case SMALL: return super.toString() + "\n" + "passenger capacity: до 25 мест";
            case MEDIUM: return super.toString() + "\n" + "passenger capacity: от 40 до 50 мест";
            case BIG: return super.toString() + "\n" + "passenger capacity: от 60 до 80 мест";
            case VERY_BIG: return super.toString() + "\n" + "passenger capacity: от 100 до 120 мест";
            default: return "";
        }
    }
}
