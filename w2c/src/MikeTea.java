public class MikeTea {
    protected String name;
    protected Ingredient i;

    public MikeTea(String name, Ingredient i) {
        this.name = name;
        this.i = i;
    }

    @Override
    public String toString() {
        return "MikeTea{" +
                "name='" + name + '\'' +
                ", i=" + i +
                '}';
    }
}
