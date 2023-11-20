package Lab3;

public class Mostenire {
    public static void main(String[] args) {

        Transport transport = new Transport();
        Car car = new Car();
        Plane plane = new Plane();
        transport.moving();
        transport.power();
        car.running();
        plane.fly();

    }
}

class Transport{

    public void moving(){
        System.out.println("Transport it's moving");
    }

    public void power(){
        System.out.println("Transport is powered");
    }

}

// Mostenire simpla si ierarhica

class Car extends Transport{

    public void running(){
        System.out.println("The car is running");
    }

}

class Plane extends Transport{

    public void fly(){
        System.out.println("The plane is flying");
    }

}
