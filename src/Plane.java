public abstract class Plane {
    private String registration;
    private double length;
    protected Control control;

    protected Plane(String registration, double length){
        this.registration = registration;
        this.length = length;
    }

    public String getRegistration() {
        return registration;
    }

    public double getLength() {
        return length;
    }

    public void movePlane(){
        control.movePlane();
    }
}
