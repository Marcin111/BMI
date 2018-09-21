package start.BMI;

public class Data {

    private double weight;
    private double height;
//    private int age;
//    private double param;
//    private String sex;

//    @Override
//    public String toString() {
//        return "Data{" +
//                "weight=" + weight +
//                ", height=" + height +
//                ", age=" + age +
//                ", param=" + param +
//                ", sex='" + sex + '\'' +
//                ", gender='" + gender + '\'' +
//                '}';
//    }

//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    private String gender;


//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public double getParam() {
//        return param;
//    }
//
//    public void setParam(double param) {
//        this.param = param;
//    }

    public Data() {
        //String sex, double weight, double height, int age
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
//
//    public String getBMRM() {
//        return String.format("%.2f%n", (66 + (13.7 * weight) + (5 * height) - (6.76 * age)));
//    }
//
//    public String getBMRK() {
//        return String.format("%.2f%n", (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age)));
//    }
//
//    public String getCalM() {
//        return String.format("%.2f%n", (param * (66 + (13.7 * weight) + (5 * height) - (6.76 * age))));
//    }
//
//    public String getCalK() {
//        return String.format("%.2f%n", (param * (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age))));
//    }

//    public double woman(double weight, double height, int age) {
//
////        Dla kobiet: 655 + [9,6 x masa ciała (kg)] + [1,8 x wzrost (cm)] - [4,7 x wiek (lata)]
//
//        double result = (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age)) * 100;
//
//        return result;
//
//    }
//
//    public double man(double weight, double height, int age) {
//
////        Dla mężczyzn: 66 + [13,7 x masa ciała (kg)] + [5 x wzrost (cm)] – [6,76 x wiek (lata)]
//
//        double result = (66 + (13.7 * weight) + (5 * height) - (6.76 * age)) * 100;
//
//        return result;
//    }
}
