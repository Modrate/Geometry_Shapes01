public class Box {

    double width;
    double height;
    double depth;


    double area(){

        double a = (width*height + height*depth + width*depth) * 2;
        return a;
    }

    double volume(){
        double v = width*height*depth;
        return v;
    }





}
