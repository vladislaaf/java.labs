package lab2;

public class lab1 {
    public static void main (String[] args){
        Point3d tochki = new Point3d(1,2,2);
        Point3d tochki2 = new Point3d(2,2,2);
        Point3d tochki3 = new Point3d(7, 8, 9);
        computeArea(tochki,tochki2,tochki3);

    }
    //вычисление площади треугольника
    public static void computeArea(Point3d tochki, Point3d tochki2, Point3d tochki3){
        //полупериметр
        double p = (tochki.distanceTo(tochki2) +
                tochki2.distanceTo(tochki3) +
                tochki.distanceTo(tochki3))/2;
        double res = 0;
        if (tochki.isEquals(tochki2) || tochki2.isEquals(tochki3) || tochki.isEquals(tochki3)) {
            System.out.println("невозможно вычислить площадь");
        }
        else{
            res = Math.sqrt(p * (p - tochki.distanceTo(tochki2)) *
                    (p - tochki2.distanceTo(tochki3)) *
                    (p - tochki.distanceTo(tochki3)));
            System.out.println(res);
            }
    }
}
