public class A320 extends Plane{
    private String[] passengers = new String[180];
    public void setPassenger(String passenger, int index){
        this.passengers[index] = passenger;
    }
    public String[] getPassengers(){
        return passengers;
    }

    public A320(String registration, double length){
        super(registration, length);
        control = new Joystick();
    }
}
