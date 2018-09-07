package start.BMI;

public class Data {

    private double weight;
    private double height;
    private int age;
    private double param;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String gender;


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getParam() {
        return param;
    }

    public void setParam(double param) {
        this.param = param;
    }

    public Data(){}

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
        return String.format("%.2f%n",(weight/(height*height))*10000);
    }
    public String getBMRM() {
        return String.format("%.2f%n",(66+(13.7*weight)+(5*height)-(6.76*age)));
    }

    public String getBMRK() {
        return String.format("%.2f%n",(655+(9.6*weight)+(1.8*height)-(4.7*age)));
    }

    public String getCalM() {
        return String.format("%.2f%n",(param*(66+(13.7*weight)+(5*height)-(6.76*age))));
    }

    public String getCalK() {
        return String.format("%.2f%n",(param*(655+(9.6*weight)+(1.8*height)-(4.7*age))));
    }
}
