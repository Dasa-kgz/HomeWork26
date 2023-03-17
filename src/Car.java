public class Car {
    private int id;
    private int nuber;


    public Car(int id, int nuber) {
        this.id = id;
        this.nuber = nuber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNuber() {
        return nuber;
    }

    public void setNuber(int nuber) {
        this.nuber = nuber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nuber=" + nuber +
                '}';
    }
}
