package day13.학생;

// 2. Circle 클래스는 반지름(radius) 필드를 가지고 있으며, getArea()를 오버라이딩하여 원의 넓이(π × r²)를 반환해야 한다.

public class 윤현기_Circle extends 윤현기_Shape {
    double radius;

    public 윤현기_Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("원의 넒이는"+(radius*2)*3.14);
    }

    @Override
    public String toString() {
        return "원의 반지름 : " +radius+" 원 pie " + 3.14 +"원의 넓이 : "+(radius*2)*3.14+"\n";

    }
}
