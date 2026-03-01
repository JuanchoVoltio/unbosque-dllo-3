package edu.unbosque;

import java.util.List;

public class AreaCalculator implements ICalculator{
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    @Override
    public double divide(int a, int b) {
        return 0;
    }

    public double calculateArea(String figure, List<Integer> data){

        double result = 0;

        if("Circle".equals(figure)){
            result = this.calculateCircleArea(data.get(0));
        } else if ("Rectangle".equals(figure)){
            result = data.get(0) * data.get(1);
        }

        return result;
    }

    private double calculateCircleArea(Integer radius){
        if(radius >= 0) {
            return Math.PI * Math.pow(radius, 2);
        }else {
            return  -1;
        }
    }

    public double calculateArea(Figure f){

        double result = 0;

        if(f instanceof Circle){
            Circle c = (Circle) f;
            result = Math.PI * Math.pow(c.getRadius(), 2);
        }

        return 0;
    }
}
