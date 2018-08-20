public class Main {


    public static void main(String[] args) {
        Car car=new Car("pink",12.65,"HYUN123","X edition", 2018,
                0, Vehicle.Vehicle_type.four_wheeler, Vehicle.Gear_type.manual, Vehicle.Gear_number.N);

        car.increase_speed();
        car.increase_speed();
        car.increase_speed();
        car.increase_speed();
        car.increase_speed();
        car.decrease_speed();
        String x=car.toString();
        System.out.println(x);
    }
}
