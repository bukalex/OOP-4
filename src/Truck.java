public class Truck extends Car implements Competitive{
    public enum LoadCapacity {N1, N2, N3};

    private LoadCapacity loadCapacity;

    public Truck(String brend, String model, float engineVolume, LoadCapacity loadCapacity){
        super(brend, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity(){
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        System.out.println(loadCapacity);
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
        switch (loadCapacity) {
            case N1 : return super.toString() + "\n" + "load capacity: до 3,5 тонн";
            case N2: return super.toString() + "\n" + "load capacity: от 3,5 до 12 тонн";
            case N3: return super.toString() + "\n" + "load capacity: от 12 тонн";
            default: return "";
        }
    }
}
