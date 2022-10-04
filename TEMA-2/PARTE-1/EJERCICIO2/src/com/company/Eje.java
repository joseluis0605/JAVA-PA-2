package com.company;

public class Eje {

    private int x;
    private int y;

    public Eje(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void desplazar(int movimiento){
        this.x= this.x+movimiento;
        this.y= this.y+movimiento;
    }

    public String toString(){
        return x+" "+y;
    }

    public static void main(String[] args) {

    }
}
