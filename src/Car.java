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

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
