public class CircleTest{
    public static void main(String[] args) {
        Circle[] clist = new Circle[3];
        Circle c1 = new Circle("red",3);
        Circle c2 = new Circle("red",6);
        Circle c3 = new Circle("red",9);
        clist[0] = c1;
        clist[1] = c2;
        clist[2] = c3;
        double sum = 0;
        for (int i = 0; i < clist.length; i++) {
            sum += clist[i].getArea();
        }
        System.out.println(sum);
    }
}