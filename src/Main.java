public class Main {
    public static void useControl(Control c){
        c.movePlane();
    }

    public static void main(String[] args) {

        A320 a320 = new A320("EC-123", 37.6);
        a320.setPassenger("Alberto", 3);
        useControl(a320.control);

        An225 an225 = new An225("UR-82060", 84);
        an225.addCargo(100);
        useControl(an225.control);

        Plane plane = new A320("EC-321", 37.6);
        //plane.setPassenger("Alberto", 3); // No es pot fer!
    }
}