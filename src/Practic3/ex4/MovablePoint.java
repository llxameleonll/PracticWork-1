package Practic3.ex4;

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){}
    public String toString (){
        return "x = " + x + " y = " + y + " xSpeed = " + xSpeed
                + " ySpeed = " + ySpeed;
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}

}
