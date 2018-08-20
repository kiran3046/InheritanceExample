public class Vehicle {

    enum  Vehicle_type{
        two_wheeler,three_wheeler,four_wheeler,six_wheeler,eight_wheeler
    }

    enum Gear_type{
        manual,automatic
    }
    enum Gear_number{
        R,N,D,D1,D2,D3
    }

    private String model_number;
    private String name;
    private int manufacture_year;
    private static double speed;
    Vehicle_type vehicleType;
    Gear_type gear_type;
    private Gear_number gear_number;

    Vehicle(){

        model_number="100ABC";
        name="default";
        manufacture_year=1990;
        speed=0.0;
        vehicleType=Vehicle_type.four_wheeler;
        gear_type= Gear_type.automatic;
        gear_number=Gear_number.N;
    }

    public Vehicle(String model_number,String name,int manufacture_year,double speed,Vehicle_type vehicle_type,Gear_type gear_type,Gear_number gear_number){

        this.model_number=model_number;
        this.name=name;
        this.manufacture_year=manufacture_year;
        this.speed=speed;
        this.vehicleType=vehicle_type;
        this.gear_type=gear_type;
        this.gear_number=gear_number;
    }

    public void increase_speed(){
        speed += 10;
        System.out.println("speed increased by 10km/h");

    }
    public void decrease_speed(){
        speed -= 10;
        System.out.println("speed decreased by 10km/h");

    }
    public void change_gears(Gear_number number){
        gear_number=number;
    }

    public void change_gears_increase_speed(){
        if(gear_type==Gear_type.automatic) {
            System.out.println("vehicle gear change is automatic");
        }
        else if(gear_number==Gear_number.N || gear_number==Gear_number.R ){
            gear_number=Gear_number.D;
            System.out.println("changed gear to D");
        }else if(gear_number==Gear_number.D){
            gear_number=Gear_number.D1;
            System.out.println("changed gear to D1");
        }else if(gear_number==Gear_number.D1){
            gear_number=Gear_number.D2;
            System.out.println("changed gear to D2");
        }else if(gear_number==Gear_number.D2){
            gear_number=Gear_number.D3;
            System.out.println("changed gear to D3");
        }else if(gear_number==Gear_number.D3){
            System.out.println("Maximum speed reached .. please slow down");
        }
    }


    public void change_gears_decrease_speed(){
        if(gear_type==Gear_type.automatic)
        {
            System.out.println("vehicle gear change is automatic");
        }
        else if(gear_number==Gear_number.N || gear_number==Gear_number.R ){
            gear_number=Gear_number.D;
            System.out.println("brakes applied , changing to D .. car coming to a stop");
        }else if(gear_number==Gear_number.D3){
            gear_number=Gear_number.D2;
            System.out.println("changed gear to D2");
        }else if(gear_number==Gear_number.D2){
            gear_number=Gear_number.D1;
            System.out.println("changed gear to D1");
        }else if(gear_number==Gear_number.D1){
            gear_number=Gear_number.D;
            System.out.println("changed gear to D");
        }else if(gear_number==Gear_number.D){
            gear_number=Gear_number.N;
            System.out.println("changed gear to N");
            System.out.printf("Brakes applied .. car stopping now");
        }
    }




    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufacture_year() {
        return manufacture_year;
    }

    public void setManufacture_year(int manufacture_year) {
        this.manufacture_year = manufacture_year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Vehicle_type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Gear_type getGear() {
        return gear_type;
    }

    public void setGear(Gear_type gear_type) {
        this.gear_type = gear_type;
    }

    public Gear_number getGearNumber() {
        return gear_number;
    }

    public void setGearNumber(Gear_number gear_number) {
        this.gear_number = gear_number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model_number='" + model_number + '\'' +
                ", name='" + name + '\'' +
                ", manufacture_year=" + manufacture_year +
                ", vehicleType=" + vehicleType +
                ", gear_type=" + gear_type +
                '}';
    }
}
