class Shape {
    
    Shape() {
        System.out.println("This is shape class");
    }
}

class Rectangle extends Shape {

    void rectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
  
    void circle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
   
    void square() {
        System.out.println("Square is a rectangle");
    }
}

public class PRACT20 {
    public static void main(String[] args) {
        Square sq = new Square(); 
        sq.rectangle();           
        sq.square();              
}
}
