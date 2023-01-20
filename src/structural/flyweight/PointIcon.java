package structural.flyweight;

public class PointIcon {
    public final PointType pointType;
    public final byte[] pointIcon;

    public PointIcon(PointType pointType, byte[] pointIcon) {
        this.pointType = pointType;
        this.pointIcon = pointIcon;
    }
}
