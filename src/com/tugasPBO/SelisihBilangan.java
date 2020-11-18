package com.tugasPBO;

public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        System.out.println("Hasil Selisih "+super.getX()+" - "+super.getY()+" = "+(super.getX()-super.getY()));
    }
}
