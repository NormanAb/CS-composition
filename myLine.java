public class myLine {
    private myPoint begin;
    private myPoint end;

    public myLine(int x1, int y1, int x2, int y2) {
    }

    public myLine(myPoint begin, myPoint end) {
    }

    public myPoint getBegin() {
        return begin;
    }

    public myPoint getEnd() {
        return end;
    }

    public void setBegin(myPoint begin) {
        this.begin = begin;
    }

    public void setEnd(myPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setX(x);
        this.begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }
}
