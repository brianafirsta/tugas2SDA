package com.Tugas2SDA;

import java.util.LinkedList;

import com.Tugas1SDA.nomor1;

public class Tugas2_Briana {
    
    public static void main(String[] args) {
        
        //membuat linked list
        LinkedList<String> saya = new LinkedList<>();

        //tambahkan elemen
        saya.add("B");
        saya.add("R");
        saya.add("I");
        saya.add("A");
        saya.add("N");
        saya.add("A");
        saya.add(" ");
        saya.add("F");
        saya.add("I");
        saya.add("R");
        saya.add("S");
        saya.add("T");
        saya.add("A");

        System.out.println("Nama : " +saya);
        System.out.println("------------------------------------");

        //perintah 1 = add karakter lain yang diinginkan
        System.out.println("PERINTAH 1 - ADD KARAKTER LAIN");
        saya.addFirst("2111522024");
        saya.addLast("TUGAS2SDA");
        System.out.println("Nama Baru : "+saya);
        System.out.println("------------------------------------");

        //perintah 2 = sisipkan karakter lain yang diinginkan
        System.out.println("PERINTAH 2 - SISIPKAN KARAKTER LAIN");
        saya.set(7, "spasi");
        System.out.println("Nama Baru : "+saya);
        System.out.println("------------------------------------");

        //perintah 3 = hapus beberapa karakter yang diinginkan
        System.out.println("PERINTAH 3 - HAPUS BEBERAPA KARAKTER");
        saya.removeFirst();
        saya.removeLast();
        System.out.println("Nama Baru : "+saya);
        System.out.println("------------------------------------");

        //perintah 4 = fungsi push dan pop
        System.out.println("PERINTAH 4 - FUNGSI PUSH DAN POP");
        System.out.println("PERINTAH PUSH");
        saya.push("i");
        System.out.println("Nama Baru : "+saya);

        System.out.println("PERINTAH POP");
        saya.pop();
        System.out.println("Nama Baru : "+saya);
    

    }
}
