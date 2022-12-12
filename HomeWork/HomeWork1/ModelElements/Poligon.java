package HomeWork.HomeWork1.ModelElements;


import java.util.HashSet;
import java.util.Set;

public class Poligon {
    private final Set<Point3D> points;

    public Poligon(Point3D point) {
        this.points = new HashSet<>();
        this.points.add(point);
    }

    public Set<Point3D> getPoints() {
        return points;
    }

    public boolean addPoint(Point3D point3D) {
        return points.add(point3D);
    }

    public boolean removePoint(Point3D point3D) {
        return points.remove(point3D);
    }
}