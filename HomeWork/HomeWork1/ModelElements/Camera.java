package HomeWork.HomeWork1.ModelElements;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {
        this.angle.setAngleXAxe(this.angle.getAngleXAxe() + angle.getAngleXAxe());
        this.angle.setAngleYAxe(this.angle.getAngleYAxe() + angle.getAngleYAxe());
        this.angle.setAngleZAxe(this.angle.getAngleZAxe() + angle.getAngleZAxe());
    }

    public void move(Point3D point) {
        this.setLocation(point);
    }

    private void setLocation(Point3D location) {
        this.location = location;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }
}
