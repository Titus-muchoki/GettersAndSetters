package org.example.models;

public class Rectangle {
    public int getLength;

    public boolean isSquare;
    public boolean allSideEqual;
    String name;
public Rectangle( String tito){
    this.name = tito;

}
private int height;
private    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public int getGetLength() {
        return this.height;
    }



    public int getLength() {
        return this.width;
    }

    public int isRectangle() {
        return this.height;
    }

    public boolean isSquare() {
        return height == width;
    }

    public boolean isAllSideEqual() {
        return width == height;
    }
}
