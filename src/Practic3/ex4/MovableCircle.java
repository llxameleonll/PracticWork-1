package Practic3.ex4;

class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString (){
        return "Radius = " + radius + " Center = " + center;
    }

    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};

}
