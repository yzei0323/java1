package day13.학생;

// 3. Rectangle 클래스는 가로(width), 세로(height) 필드를 가지고 있으며, getArea()를 오버라이딩하여 사각형 넓이(가로 × 세로)를 반환해야 한다.

public class 윤현기_Rectangle extends 윤현기_Shape{
    int width;
    int height;

    public 윤현기_Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("사각형의 넓이는 : "+(width*height));
    }

    @Override
    public String toString() {
        return "사각형 가로 : " +width+ " 사각형 세로 : "+height+" 사각형의 넒이 : "+(width*height)+"\n";

    }
}
