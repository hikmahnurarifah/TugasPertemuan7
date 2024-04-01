/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan7;

/**
 *
 * @author Hikmah
 */
public class LinearEquation {
    
    private int a, b, c, d, e, f;
    
    LinearEquation()
    {
        a = 1;
        b = 1;
        c = 1;
        d = 1;
        e = 1;
        f = 1;
    }
    
    LinearEquation(int aBaru, int bBaru, int cBaru, int dBaru, int eBaru, int fBaru)
    {
        a = aBaru;
        b = bBaru;
        c = cBaru;
        d = dBaru;
        e = eBaru;
        f = fBaru;
    }
    
    public int getA()
    {
        return a;
    }
    
    public int getB()
    {
        return b;
    }
    
    public int getC()
    {
        return c;
    }
    
    public int getD()
    {
        return d;
    }
    
    public int getE()
    {
        return e;
    }
    
    public int getF()
    {
        return f;
    }
    
    boolean isSolveable()
    {
        return (a * d) - (b * c) != 0;
    }
    
    public double getX() {
        return ((e * d) - (b * f)) / ((double) (a * d) - (b * c));
    }
    
    public double getY() {
        return ((a * f) - (e * c)) / ((double) (a * d) - (b * c));
    }

    public void setA(int aBaru)
    {
        this.a = aBaru;
    }
    
    public void setB(int bBaru)
    {
        this.b = bBaru;
    }
    
    public void setC(int cBaru)
    {
        this.c = cBaru;
    }
    
    public void setD(int dBaru)
    {
        this.d = dBaru;
    }
    
    public void setE(int eBaru)
    {
        this.e = eBaru;
    }
    
    public void setF(int fBaru)
    {
        this.f = fBaru;
    }    
    
}
