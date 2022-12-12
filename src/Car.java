public abstract class Car{
    protected String brend;
    protected String model;
    protected float engineVolume;

    public Car(String brend, String model, float engineVolume){
        this.brend = brend;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMovement();
    public abstract void finishMovement();
    public abstract void printType();

    @Override
    public String toString() {
        return "brend: '" + brend + "\n" +
                "model: '" + model + "\n" +
                "engine volume: " + engineVolume;
    }
}
