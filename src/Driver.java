public abstract class Driver {
    protected String SNP;
    protected String category;
    protected int experiece;

    public Driver(String SNP, String category, int experiece){
        this.SNP = SNP;
        this.category = category;
        this.experiece = experiece;
    }

    public void startMovement(){

    }

    public void stop(){

    }

    public void refuel(){

    }

    @Override
    public String toString() {
        return "Driver{" +
                "SNP='" + SNP + '\'' +
                ", category='" + category + '\'' +
                ", experiece=" + experiece +
                '}';
    }
}
