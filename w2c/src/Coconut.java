

public class Coconut extends Ingredient{
    protected int slife;

    public Coconut() {
        this.slife = 5;
    }

    public Coconut(String name) {
        super(name,5);
    }

    @Override
    public String toString() {
        return "Coconut{" +
                "slife=" + slife +
                ", name='" + name + '\'' +
                ", c=" + c +
                ", slife=" + slife +
                '}';
    }
}
