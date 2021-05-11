package com.edusystem.util;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

public class DistanceUtil {


    public static double getDistance(double lng1, double lat1, double lng2,double lat2) {
        GlobalCoordinates source = new GlobalCoordinates(lat1, lng1);
        GlobalCoordinates target = new GlobalCoordinates(lat2, lng2);
        double meter1 = getDistanceMeter(source, target, Ellipsoid.Sphere);
        System.out.println("Sphere坐标系计算结果："+meter1 + "米");
        return meter1;
    }

    public static double getDistanceMeter(GlobalCoordinates gpsFrom, GlobalCoordinates gpsTo, Ellipsoid ellipsoid){
        //创建GeodeticCalculator，调用计算方法，传入坐标系、经纬度用于计算距离
        GeodeticCurve geoCurve = new GeodeticCalculator().calculateGeodeticCurve(ellipsoid, gpsFrom, gpsTo);
        return geoCurve.getEllipsoidalDistance();
    }
}

