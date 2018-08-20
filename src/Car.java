public class Car extends Vehicle {

   private String colour;
    private double mileage;


    public Car(String colour,Double mileage,String model_number,String name,int manufacture_year,double speed,Vehicle_type vehicle_type,Gear_type gear_type,Gear_number gear_number){
       super(model_number,name,manufacture_year,speed,vehicle_type,gear_type,gear_number);
        this.colour=colour;
       this.mileage=mileage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public void increase_speed(){
        super.increase_speed();
        change_gears_increase_speed();
    }

    @Override
    public void decrease_speed(){
        super.decrease_speed();
        change_gears_decrease_speed();
    }



}
