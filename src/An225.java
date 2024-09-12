public class An225 extends Plane{
    double cargoWeight = 0;
    void addCargo(double weight){
        cargoWeight += weight;
    }

    public An225(String registration, double length){
        super(registration, length);
        control = new Yoke();
    }
}
