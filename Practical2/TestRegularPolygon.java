//Created By 21CE114 Harsh Rana.
package Practical2;

public class TestRegularPolygon {

    public static void main(String[] args) {
        
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(5, 10);
        RegularPolygon p3 = new RegularPolygon(20, 114, 6, 10);
        
        System.out.println("Polygon 1");
        p1.print();
        System.out.println("Polygon 2");
        p2.print();
        System.out.println("Polygon 3");
        p3.print();
        
    }

}
