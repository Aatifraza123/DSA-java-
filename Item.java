
class Car{
    void BMW(){
        int model_no = 720;
        String Name = "BMW";
        String color = "Red";
        int year_of_manufacture = 2002;

        System.out.println("Name of car: " + Name);
        System.out.println("Model No: " + model_no);
        System.out.println("Color of Car: " + color);
        System.out.println("Year of manufacture: " + year_of_manufacture);
    }
}
class Car_1{
    void Audi(){
        String name = "Audi";
        int model_no = 675;
        String color = "Blue";
        int year = 2005;

        System.out.println("Name of car: " + name);
        System.out.println("Model No: " + model_no);
        System.out.println("Color of Car: " + color);
        System.out.println("Year of manufacture: " + year);
    }
}
public class Item {
    public static void main(String[] args) {
        Car_1 srch = new Car_1();
        srch.Audi();
        System.out.println();
        Car src = new Car();
        src.BMW();

    }
}
