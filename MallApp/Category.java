package MallApp;

public class Category {
    private double gstRate;
    private String name;

    public Category(double gstRate, String name) {
        this.gstRate = gstRate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGstRate() {
        return gstRate;
    }

    public void setGstRate(double gstRate) {
        this.gstRate = gstRate;
    }
}
