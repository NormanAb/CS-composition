public class myPoint {
    private int x = 0;
    private int y = 0;

    public myPoint() {
    }

    public myPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY(int x, int y) {
        int[] i = new int[2];
        i[0] = this.x;
        i[1] = this.y;
        return i;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance (int x2, int y2) {
        double dx = x2 - x;
        double dy = y2 - y;
        double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return d;
    }

    public double distance() {
        double dx = x - 0;
        double dy = y - 0;
        double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return d;
    }

    public double distance (myPoint another) {
        double dx = another.x - x;
        double dy = another.y - y;
        double d = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        return d;
    }



}
