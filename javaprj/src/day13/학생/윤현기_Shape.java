package day13.학생;
// 문제 1: 도형 계산기 (추상 클래스 & 다형성)
// 추상 클래스 Shape를 만들고, 이를 상속받아 Circle(원)과 Rectangle(사각형) 클래스를 구현해야 한다.
// 추가적으로, 여러 개의 도형을 리스트(ArrayList)에 저장하고 넓이를 비교하는 기능도 구현해야 한다.

//요구 사항
// 1. Shape 추상 클래스에는 넓이를 계산하는 getArea() 추상 메서드를 포함해야 한다. ✅

// 2. Circle 클래스는 반지름(radius) 필드를 가지고 있으며, getArea()를 오버라이딩하여 원의 넓이(π × r²)를 반환해야 한다. ✅

// 3. Rectangle 클래스는 가로(width), 세로(height) 필드를 가지고 있으며, getArea()를 오버라이딩하여 사각형 넓이(가로 × 세로)를 반환해야 한다.✅

// 4. 여러 개의 도형을 ArrayList<Shape>에 저장하고, 넓이 기준으로 오름차순 정렬하여 출력하라. ✅

public abstract class 윤현기_Shape {

    // 추상메서드
    public abstract void getArea();


    public String toString(){
        return "도형의 클래스";
    }
}
