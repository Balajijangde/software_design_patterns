package revision.creational.prototype;

/*
To implement copy feature for an object
 */

abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){}

    public Shape(Shape target) {
        if(target != null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;;
        }
    }

    abstract Shape cloneObject();
}

class Circle extends Shape{
    public int radius;

    public Circle(){}

    @Override
    Shape cloneObject() {
        return new Circle(this);
    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;;
        }
    }

}

public class Main {

}
