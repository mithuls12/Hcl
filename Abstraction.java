public class Abstraction {
    public static void main(String[] args) {
        dog d = new dog();
        d.walk();
        cat c = new cat();
        c.walk();

    }
}

abstract class animal {
    abstract void walk();
}

class dog extends animal {
    void walk() {
        System.out.println("Dog is walking");
    }
}

class cat extends animal {
    void walk() {
        System.out.println("Cat is walking");
    }
}