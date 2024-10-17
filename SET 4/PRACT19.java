
class rectangle{
    int length;
    int breadth;


    rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void rec_peri(){
        System.out.println("Rec - perimeter : " + 2*(length+breadth));
    }
    void  rec_area(){
        System.out.println("Rec - Area " + length*breadth);
    }
}

class square extends rectangle{
    int side;

    square(int side){
        super(side,side);
        this.side = side;
    }
    void sq_peri(){
        System.out.println("Square perimeter : " + 4*side);
    }
    
    void sq_area(){
        System.out.println("Squarev Area : " + side*side);
    }

}

public class PRACT19 {
    public static void main(String[] args) {
        square s = new square(10);
        s.rec_area();
        s.rec_peri();
        s.sq_area();
        s.sq_peri();
    }
}
