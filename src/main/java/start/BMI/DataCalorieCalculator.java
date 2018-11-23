package start.BMI;

public class DataCalorieCalculator {

    private double weight;
    private double height;
    private int age;
    private int param;
    private String sex;

    public DataCalorieCalculator(String sex, double weight, double height, int age, int param) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double woman(double weight, double height, int age) {

//        Dla kobiet: 655 + [9,6 x masa ciała (kg)] + [1,8 x wzrost (cm)] - [4,7 x wiek (lata)]

        double result = (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age)) * 100;

        return result;

    }

    public double man(double weight, double height, int age) {

//        Dla mężczyzn: 66 + [13,7 x masa ciała (kg)] + [5 x wzrost (cm)] – [6,76 x wiek (lata)]

        double result = (66 + (13.7 * weight) + (5 * height) - (6.76 * age)) * 100;

        return result;
    }
}
