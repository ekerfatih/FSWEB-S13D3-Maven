package org.example;

public class Wall {
    double _width;
    double _height;

    public Wall(double width, double height){
        _width = width;
        _height = height;
    }

    public double getWidth(){
        return _width;
    }

    public double getHeight() {
        return _height;
    }

    public void setWidth(double newWidth){
        if(newWidth < 0) newWidth = 0;
        _width = newWidth;
    }

    public void setHeight(double newHeight){
        if(newHeight < 0) newHeight = 0;
        _height = newHeight;
    }

    public double getArea(){
        return _width * _height;
    }
}
