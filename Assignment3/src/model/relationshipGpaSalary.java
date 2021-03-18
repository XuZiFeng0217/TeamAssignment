/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 甄雨桐
 */
public class relationshipGpaSalary {
    /** sum of x */  
    private double sumX;  
  
    /** sum of y */  
    private double sumY;  
  
    /** sum of x*x */  
    private double sumXX;  
  
    /** sum of x*y */  
    private double sumXY;  
  
    /** sum of y*y */  
    private double sumYY;  
  
    /** sum of yi-y */  
    private double sumDeltaY;  
  
    /** sum of sumDeltaY^2 */  
    private double sumDeltaY2;  
  
    /** 误差 */  
    private double sse;  
  
    private double sst;  
  
    private double E;  
  
    private String[] xy;  
  
    private ArrayList listX;  
  
    private ArrayList listY;  
  
    private Double XMin=0.0, XMax=0.0, YMin=0.0, YMax=0.0;  
  
    /** line coefficient a0 */  
    private float a0;  
  
    /** line coefficient a1 */  
    private float a1;  
  
    /** number of data points */  
    private int pn;  
  
    /** true if coefficients valid */  
    private boolean coefsValid;

    public double getSumX() {
        return sumX;
    }

    public double getSumY() {
        return sumY;
    }

    public double getSumXX() {
        return sumXX;
    }

    public double getSumXY() {
        return sumXY;
    }

    public double getSumYY() {
        return sumYY;
    }

    public double getSumDeltaY() {
        return sumDeltaY;
    }

    public double getSumDeltaY2() {
        return sumDeltaY2;
    }

    public double getSse() {
        return sse;
    }

    public double getSst() {
        return sst;
    }

    public double getE() {
        return E;
    }

    public String[] getXy() {
        return xy;
    }

    public ArrayList getListX() {
        return listX;
    }

    public ArrayList getListY() {
        return listY;
    }

    public Double getXMin() {
        return XMin;
    }

    public Double getXMax() {
        return XMax;
    }

    public Double getYMin() {
        return YMin;
    }

    public Double getYMax() {
        return YMax;
    }

    public float getA0() {
        return a0;
    }

    public float getA1() {
        return a1;
    }

    public int getPn() {
        return pn;
    }

    public boolean isCoefsValid() {
        return coefsValid;
    }
    
    
    
    public relationshipGpaSalary(List<Student> students) {  
        pn = 0;  
        xy = new String[2];  
        listX = new ArrayList();  
        listY = new ArrayList();  
        for (Student student : students) {  
            sumX += student.getTotalGpa();  
            sumY += student.getStartSalary();  
            sumXX += student.getTotalGpa() * student.getTotalGpa();  
            sumXY += student.getTotalGpa() * student.getStartSalary();  
            sumYY += student.getStartSalary() * student.getStartSalary();  
            
            if (student.getTotalGpa() > XMax) {  
                XMax = student.getTotalGpa();  
        }  
            if (student.getStartSalary() > YMax) {  
                YMax = student.getStartSalary();  
        }
            
            
            // 把每个点的具体坐标存入ArrayList中，备用  
  
            xy[0] = student.getTotalGpa() + "";  
            xy[1] = student.getStartSalary() + "";  
            
            
            if (student.getTotalGpa() != 0 && student.getStartSalary() != 0) {  
                //System.out.print(xy[0] + ",");  
                //System.out.println(xy[1]);  

                try {  
                    // System.out.println("n:"+n);  
                    listX.add(pn, xy[0]);  
                    listY.add(pn, xy[1]);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
                /* 
                 * System.out.println("N:" + n); System.out.println("ArrayList 
                 * listX:"+ listX.get(n)); System.out.println("ArrayList listY:"+ 
                 * listY.get(n)); 
                 */  
            }  
            ++pn;  
            coefsValid = false;  
            }
    }
    
        /** 
     * Return the value of the regression line function at x. (Implementation of 
     * Evaluatable.) 
     *  
     * @param x 
     *            the value of x 
     * @return the value of the function at x 
     */  
    public float at(int x) {  
        if (pn < 2)  
            return Float.NaN;  
  
        validateCoefficients();  
        return a0 + a1 * x;  
    }  
  
    /** 
     * Reset. 
     */  
    public void reset() {  
        pn = 0;  
        sumX = sumY = sumXX = sumXY = 0;  
        coefsValid = false;  
    }  
  
    /** 
     * Validate the coefficients. 计算方程系数 y=ax+b 中的a 
     */  
    public void validateCoefficients() {  
        if (coefsValid)  
            return;  
  
        if (pn >= 2) {  
            float xBar = (float) sumX / pn;  
            float yBar = (float) sumY / pn;  
  
            a1 = (float) ((pn * sumXY - sumX * sumY) / (pn * sumXX - sumX  
                    * sumX));  
            a0 = (float) (yBar - a1 * xBar);  
        } else {  
            a0 = a1 = Float.NaN;  
        }  
  
        coefsValid = true;  
    }  
  
    /** 
     * 返回误差 
     */  
    public double getR() {  
        // 遍历这个list并计算分母  
        for (int i = 0; i < pn - 1; i++) {  
            float Yi = (float) Double.parseDouble(listY.get(i).toString());  
            float Y = (float) Double.parseDouble(listX.get(i).toString()); 
            float deltaY = Yi - Y;  
            float deltaY2 = deltaY * deltaY;  
            /* 
             * System.out.println("Yi:" + Yi); System.out.println("Y:" + Y); 
             * System.out.println("deltaY:" + deltaY); 
             * System.out.println("deltaY2:" + deltaY2); 
             */  
  
            sumDeltaY2 += deltaY2;  
            // System.out.println("sumDeltaY2:" + sumDeltaY2);  
  
        }  
  
        sst = sumYY - (sumY * sumY) / pn;  
        // System.out.println("sst:" + sst);  
        E = 1 - sumDeltaY2 / sst;  
  
        return round(E, 4);  
    }  
  
    // 用于实现精确的四舍五入  
    public double round(double v, int scale) {  
  
        if (scale < 0) {  
            throw new IllegalArgumentException(  
                    "The scale must be a positive integer or zero");  
        }  
  
        BigDecimal b = new BigDecimal(Double.toString(v));  
        BigDecimal one = new BigDecimal("1");  
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();  
  
    }  
  
    public float round(float v, int scale) {  
  
        if (scale < 0) {  
            throw new IllegalArgumentException(  
                    "The scale must be a positive integer or zero");  
        }  
  
        BigDecimal b = new BigDecimal(Double.toString(v));  
        BigDecimal one = new BigDecimal("1");  
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).floatValue();  
  
    }  
    
    
    
}
