package latihaninheritance;

public class InheritanceApp {

    public static void main(String[] args) {

        //Output 1
/*        Quadrilateral mySquare = new Quadrilateral("White");
        System.out.println(mySquare.sides);
        System.out.println(mySquare.getDimension());
        System.out.println(mySquare.getParentClassName());*/

        //Output 2
        Quadrilateral mySquare = new Quadrilateral("White");
        System.out.println(mySquare.dimensions);
        System.out.println(mySquare.getClassName());

        //outputSquare
        Shape myShape = new Shape("White");
        Shape.Line myLine = myShape.new Line();
        System.out.println(mySquare.toString());



    }
}
