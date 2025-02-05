public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound();
    public String getName() {
        return name;
    }
}
