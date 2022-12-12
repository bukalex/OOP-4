public class PassengerCar extends Car implements Competitive{
    public enum BodyTypes {СЕДАН, ХЕТЧБЕК, КУПЕ, УНИВЕРСАЛ, ВНЕДОРОЖНИК, КРОССОВЕР, ПИКАП, ФУРГОН, МИНИВЭН};

    private BodyTypes bodyType;

    public PassengerCar(String brend, String model, float engineVolume, BodyTypes bodyType){
        super(brend, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyTypes getBodyType(){
        return bodyType;
    }

    public void setBodyType(BodyTypes newBodyType){
        bodyType = newBodyType;
    }

    @Override
    public void printType() {
        System.out.println(bodyType);
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
        return super.toString() + "\n" + "body type: " + bodyType;
    }
}
