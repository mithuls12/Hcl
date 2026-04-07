public class inheritance {
    public static void main(String[] args) {
        car c = new car();
        c.print();
    }
}

class vehicle {
    void print() {
        System.out.println("Vehicle is moving");
    }
}

class car extends vehicle {
    void print() {
        System.out.println("Car is moving");
    }
}
