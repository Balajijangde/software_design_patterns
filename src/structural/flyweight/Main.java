package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        PointIconFactory factory = new PointIconFactory();
        PointService pointService = new PointService(factory);
        pointService.addPoint(2, 3, PointType.CAFE);
        pointService.addPoint(6, 1, PointType.HOSPITAL);
        pointService.addPoint(4, 9, PointType.SHOP);

        pointService.draw();
    }
}
