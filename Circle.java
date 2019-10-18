package sk.itsovy.strausz.projectfragment;

public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double calcPerimeter (){
        return 2*Math.PI*this.radius;

    }

    public double calcArea(){

        return Math.PI*radius*radius;

    }
    @Override
    public String toString(){
        return "Radius = " +radius;
    }



}
