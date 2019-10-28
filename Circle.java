public class Circle{
    private double radius;
    private String color;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(String c,double r){
        this.radius = r;
        this.color = c;
    }
    public double getradius(){
        return radius;
    }
    public String getcolor(){
        return color;
    }
    public void setradius(double r){
        this.radius = r;
    }
    public void setcolor(String c){
        this.color = c;
    }
    public Circle(){
        this.color = "red";
        this.radius = 1.0;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}