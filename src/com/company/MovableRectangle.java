package com.company;

public class MovableRectangle implements Movable {
    private MovablePoints topLeft;
    private MovablePoints bottomRight;
    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoints(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoints(x2, y2, xSpeed, ySpeed);
        checkSpeed();
    }
    private void checkSpeed(){ //проверка на скорость
        if(topLeft.ySpeed != bottomRight.ySpeed){
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        if(topLeft.xSpeed != bottomRight.xSpeed){
            topLeft.xSpeed = bottomRight.xSpeed;
        }
    }
    @Override
    public String toString() {
        return "Rectangle (" + topLeft.x + ", " + topLeft.y + ", " +
                bottomRight.x + ", " + bottomRight.y + ")";
    }
    @Override
    public void moveUp() {topLeft.moveUp(); bottomRight.moveUp();}
    @Override
    public void moveDown() {topLeft.moveDown(); bottomRight.moveDown();}
    @Override
    public void moveRight() {topLeft.moveRight();
        bottomRight.moveRight();}
    @Override
    public void moveLeft() {topLeft.moveLeft(); bottomRight.moveLeft();}
}
