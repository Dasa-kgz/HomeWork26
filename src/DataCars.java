public class DataCars {
    private int yearsOfManufacture;
    private String model;
    private double price;
    private String colors;

    public DataCars(int yearsOfManufacture, String model, double price, String colors) {
        this.yearsOfManufacture = yearsOfManufacture;
        this.model = model;
        this.price = price;
        this.colors = colors;
    }

    public int getYearsOfManufacture() {
        return yearsOfManufacture;
    }

    public void setYearsOfManufacture(int yearsOfManufacture) {
        this.yearsOfManufacture = yearsOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

}
