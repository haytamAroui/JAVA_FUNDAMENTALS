package Les1.Oefening3;

public class Shape {
        private int height;
        private int width;
        private int xPos;
        private int yPos;

    public Shape() {
    }
    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public Shape(int height, int width, int xPos, int yPos) {
        this.height = height;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getArea(){
        return height * width;
    }
    public int getPerimeter(){
        return (width + height)*2;
    }


}
