public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;

    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name  = "nano";
        c.seats = 5;
        c.type = "suv";

        change(c);
        System.out.println(c.seats);

    }
    public static void change(Car c){
        c.seats = 4;
        //shallow copy kehte hain isko

}   


}

