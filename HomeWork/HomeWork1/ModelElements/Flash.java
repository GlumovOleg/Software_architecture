package HomeWork.HomeWork1.ModelElements;


public class Flash {
    private Point3D location;
    private Angle3D angle;
    private float power;

    public Flash(Point3D location, Angle3D angle,float power) {
        this.location = location;
        this.angle = angle;
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        this.angle.setAngleXAxe(this.angle.getAngleXAxe() + angle.getAngleXAxe());
        this.angle.setAngleYAxe(this.angle.getAngleYAxe() + angle.getAngleYAxe());
        this.angle.setAngleZAxe(this.angle.getAngleZAxe() + angle.getAngleZAxe());
    }

    public void move(Point3D point) {
        this.setLocation(point);
    }

    public Point3D getLocation() {
        return location;
    }

    private void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }
}