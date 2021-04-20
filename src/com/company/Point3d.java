package com.company;


public class Point3d {

    //Координаты точки x
    private double Coordx;

    //Координаты точки y
    private double Coordy;

    //Координаты точки z
    private double Coordz;

    //Конструктор класса
    public Point3d(double x, double y, double z)
    {
        Coordx = z;
        Coordy = y;
        Coordz = z;
    }

    //Конструктор по умолчанию
    public Point3d()
    {
        this(0,0,0);
    }

    //Возвращение значения x
    public double getCoordx()
    {
        return Coordx;
    }

    //Возвращение значения y
    public double getCoordy()
    {
        return Coordy;
    }

    //Возвращение значения z
    public double getCoordz()
    {
        return Coordz;
    }

    //Установка значения x
    public void setCoordx(double x)
    {
        Coordx = x;
    }

    //Установка значения y
    public void setCoordy(double y)
    {
        Coordx = y;
    }

    //Установка значения z
    public void setCoordz(double z)
    {
        Coordx = z;
    }

    //Сравнение двух точек
    public boolean equalPoint3d(Point3d point)
    {
        if(Coordx == point.getCoordx() &&
                Coordy == point.getCoordy() &&
                Coordz == point.getCoordz())
        {
            return true;
        }
        return false;
    }

    //Расстояние между двумя точками
    public double distanceTo(Point3d point)
    {
        return Math.sqrt((Coordx - point.getCoordx())*(Coordx - point.getCoordx()) +
                (Coordy - point.getCoordy())*(Coordy - point.getCoordy()) +
                (Coordz - point.getCoordz())*(Coordz - point.getCoordz()));
    }
}
