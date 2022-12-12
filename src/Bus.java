public class Bus extends Car implements Competitive{
    public Bus(String brend, String model, float engineVolume){
        super(brend, model, engineVolume);
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

    }

    @Override
    public void maxSpeed() {

    }
}
