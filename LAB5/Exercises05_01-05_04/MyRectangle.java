public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle() {

    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }


    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() +
                ",bottomRight=" + bottomRight.toString() + "]";
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public boolean isSquare() {
        return this.getWidth() == this.getHeight();
    }

}
