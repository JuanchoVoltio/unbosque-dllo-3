package edu.unbosque;

import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) {
//        System.out.println(testCalculateCircleArea());
//        System.out.println(testCalculateCircleAreaWithNegativeRadius());
        System.out.println(testCalculateRectangleArea());;
    }

    public static boolean testCalculateCircleArea(){
        //GIVEN - ARRANGE
        AreaCalculator testSubject = new AreaCalculator();
        String figure = "Circle";
        List<Integer> data = List.of(10);
        double expectedResult = Math.PI * Math.pow(10, 2);

        //WHEN - ACT
        double result = testSubject.calculateArea(figure, data);

        //THEN - ASSERT
        return result == expectedResult;
    }

    public static boolean testCalculateRectangleArea(){
        //GIVEN - ARRANGE
        AreaCalculator testSubject = new AreaCalculator();
        String figure = "Rectangle";
        List<Integer> data = List.of(5, 4);
        double expectedResult = 20;

        //WHEN - ACT
        double result = testSubject.calculateArea(figure, data);

        //THEN - ASSERT
        return result == expectedResult;
    }

    public static boolean testCalculateCircleAreaWithNegativeRadius(){
        //GIVEN - ARRANGE
        AreaCalculator testSubject = new AreaCalculator();
        String figure = "Circle";
        List<Integer> data = List.of(-10);
        double expectedResult = -1;

        //WHEN - ACT
        double result = testSubject.calculateArea(figure, data);

        //THEN - ASSERT
        return result == expectedResult;
    }
}
