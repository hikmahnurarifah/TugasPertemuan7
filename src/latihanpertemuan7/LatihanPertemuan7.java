/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpertemuan7;

/**
 *
 * @author Hikmah
 */
public class LatihanPertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinearEquation linearEquation1 = new LinearEquation();
        
        linearEquation1.setA(6);
        linearEquation1.setB(1);
        linearEquation1.setC(8);
        linearEquation1.setD(3);
        linearEquation1.setE(3);
        linearEquation1.setF(2);
        
        System.out.println("Nilai a: " + linearEquation1.getA());
        System.out.println("Nilai b: " + linearEquation1.getB());
        System.out.println("Nilai c: " + linearEquation1.getC());
        System.out.println("Nilai d: " + linearEquation1.getD());
        System.out.println("Nilai e: " + linearEquation1.getE());
        System.out.println("Nilai f: " + linearEquation1.getF());
        
        if(linearEquation1.isSolveable())
        {
            System.out.println("Solusi X adalah: " + linearEquation1.getX());
            System.out.println("Solusi Y adalah: " + linearEquation1.getY());            
        }
        else
        {
            System.out.println("Persamaan tidak memiliki solusi");
        }
        
    }
    
}
