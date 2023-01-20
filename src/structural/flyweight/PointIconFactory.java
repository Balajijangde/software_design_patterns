package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private final Map<PointType, PointIcon> points = new HashMap<>();
    public PointIcon getIcon(PointType pointType){
        if(!points.containsKey(pointType)){
            points.put(pointType, new PointIcon(pointType, null));
        }
        return points.get(pointType);
    }
}
