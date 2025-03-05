package day13.학생;

import java.util.ArrayList;

public class 윤현기_Main {
    public static void main(String[] args) {
//      리스트자료형
        ArrayList<윤현기_Shape> arrayList = new ArrayList<>();
        //         타입

        윤현기_Rectangle rectangle1 = new 윤현기_Rectangle(5,3);
        윤현기_Rectangle rectangle2 = new 윤현기_Rectangle(10,20);

        윤현기_Circle circle1 = new 윤현기_Circle(3);
        윤현기_Circle circle2 = new 윤현기_Circle(7);

        rectangle1.getArea();
        rectangle2.getArea();

        circle1.getArea();
        circle2.getArea();

        System.out.println("-----------어레이리스트 배열에 담기-------------");

        arrayList.add(rectangle1);
        arrayList.add(rectangle2);

        arrayList.add(circle1);
        arrayList.add(circle2);

        for (윤현기_Shape shape : arrayList) {
            System.out.println(shape.toString());
        }

        // 오름차순으로 정렬하기
        //arrayList.sort(Comparator.naturalOrder());
    }
}
