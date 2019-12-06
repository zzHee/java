import java.util.Calendar;

public class Bubble extends Ingredient{
    protected int slife;

    public Bubble() {
        this.slife = 7;
    }

    public Bubble(String name) {
        super(name,7);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "slife=" + slife +
                ", name='" + name + '\'' +
                ", c=" + c +
                ", slife=" + slife +
                '}';
    }
}
