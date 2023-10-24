package encapsulation;

import encapsulation.geometry.Sphere;
import encapsulation.geometry.Torus;

public class EncapsulationApp {
    public static void main(String[] args) {
        Person him = new Person();
        him.setName("John");
        System.out.println(him.getName());



/*        encapsulation.geometry.Sphere mySphere = new encapsulation.geometry.Sphere();
        encapsulation.geometry.Torus myTorus = new encapsulation.geometry.Torus();*/
        Sphere mySphere = new Sphere();
        System.out.println(mySphere.dimensions);
        Torus myTorus = new Torus();
        myTorus.setPI(3.14f); // Pi has protected access
        System.out.println(myTorus.getPI());


    }

}
