package lab2;

public class Point3d {
    public static void main (String[] args){}
    // координата X
    private double xCoord;
    //координата Y
    private double yCoord;
    //координата z
    private double zCoord;
    //задать значения x y z
    public Point3d (double x, double y, double z){
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }
    //задать значения x y z по умолчаниню
    public Point3d(){
        this(0.0, 0.0, 0.0);
    }
    //вернуть x y z
    public double getX(){
        return xCoord;
    }
    public double getY(){
        return yCoord;
    }
    public double getZ(){
        return zCoord;
    }
    //установить x y z
    public void setX(double val){
        xCoord = val;
    }
    public void setY(double val){
        yCoord = val;
    }
    public void setZ(double val){
        zCoord = val;
    }
    //проверка на совпадения точек
    public boolean isEquals(Point3d secondPoint){
        if (this.getX() == secondPoint.getX()){
            if (this.getY() == secondPoint.getY()){
                if (this.getZ() == secondPoint.getZ()){
                    return true;
                }
            }
        }
        return false;
    }
    //расстояние между двумя точками
    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(point.getX() - this.xCoord, 2)+
                Math.pow(point.getY() - this.yCoord, 2)+
                Math.pow(point.getZ() - this.zCoord, 2));
    }
}
