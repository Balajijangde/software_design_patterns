package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final PointIconFactory factory;
    private final List<Point> points = new ArrayList<>();

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public void addPoint(int x, int y, PointType type){
        points.add(new Point(x, y, factory.getIcon(type)));
    }

    public void draw(){
        for(Point point : points){
            point.draw();
        }
    }
}
