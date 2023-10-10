package be.intecbrussel.les1.Opdracht4;

    public class Circle {
        private int x;
        private int y;
        private int radius;

        public Circle() {
            this.radius = 0;
            this.x = 0;
            this.y = 0;
        }

        public Circle(int radius) {
            this.radius = radius;
            this.x = 0;
            this.y = 0;
        }

        public Circle(int radius, int x, int y) {
            this.radius = radius;
            this.x = x;
            this.y = y;
        }

        public Circle(Circle c) {
            this.radius = c.radius;
            this.x = c.x;
            this.y = c.y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public double getArea() {
            return 3.14 * (this.radius * this.radius);
        }

        public double getPerimeter() {
            return 2 * 3.14 * this.radius;
        }

        public void grow(int d) {
            this.radius += d;
        }
    }

