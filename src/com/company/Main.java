package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point3d[] points = {new Point3d(), new Point3d(), new Point3d()};

        //Ввод координат трех точек
        System.out.println("Введите координаты первой точки");
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Введите координаты точки x");
            points[i].setCoordx(in.nextDouble());
            System.out.println("");

            System.out.print("Введите координаты точки y");
            points[i].setCoordy(in.nextDouble());
            System.out.println("");

            System.out.print("Введите координаты точки z");
            points[i].setCoordz(in.nextDouble());
            System.out.println("");
        }

        //Проверка неравенства точек
        if (points[0].equalPoint3d(points[1]) ||
                points[0].equalPoint3d(points[2]) ||
                points[1].equalPoint3d(points[2]))
        {
            System.out.println("Среди точек есть одинаковые!!! Нельзя посчитать площадь!!!");
        }
        else
        {
            System.out.print("Площадь треугольника, образованного точками = ");
            System.out.println(computeArea(points[0], points[1], points[2]));
        }
    }
    //Рассчет площади по теореме Герона
    public static double computeArea(Point3d pointOne, Point3d pointTwo, Point3d pointThree)
    {
        double p = (0.5 * (pointOne.distanceTo(pointTwo) + pointTwo.distanceTo(pointThree) + pointThree.distanceTo(pointOne)));
        return Math.sqrt(p*(p-pointOne.distanceTo(pointTwo))*(p - pointTwo.distanceTo(pointThree))*pointThree.distanceTo(pointOne));
    }
}
