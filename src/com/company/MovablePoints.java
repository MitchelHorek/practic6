package com.company;
public class MovablePoints implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoints(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }
    public void moveDown(){
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x+=xSpeed;
    }

    @Override
    public void moveRight() {
        x-=xSpeed;
    }
}
