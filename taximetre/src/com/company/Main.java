package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double km, tutar, toplam, acilis, perkm;
    acilis=10;
    perkm=2.20;
    Scanner scanner = new Scanner(System.in);
    System.out.println("taksi ile kaç km yol aldığınızı yazınız : ");
    km= scanner.nextDouble();

    tutar = km*perkm;
    toplam= tutar+acilis;

    toplam = (toplam<20)?20:toplam;
    System.out.println("toplam ödeme : "+toplam);

    }

}
