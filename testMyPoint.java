public class testMyPoint {
    public static void main(String[] args) {
        myPoint p1 = new myPoint();
        p1.setX(8);
        p1.setY(4);

        myPoint p2= new myPoint();
        p2.setX(4);
        p2.setY(2);

        System.out.println("distance from one point to a random coordinate: "+p1.distance(16, 8));
        System.out.println("distance from one point to another point: " + p1.distance(p2));
        System.out.println("distance from one point to origin: " + p1.distance());

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("");

        myPoint[] points = new myPoint[10];

        for (int i=0; i < points.length; i++) {
            points[i] = new myPoint(i, i);
            System.out.println(points[i]);
        }



    }
}
