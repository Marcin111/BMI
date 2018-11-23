package start.BMI;

public class Data {

    private double weight;
    private double height;

    public Data() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getScoreBMI() {
        return String.format("%.2f%n", (weight / (height * height)) * 10000);
    }
}
