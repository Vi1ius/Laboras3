package com.company;

public class Main {

    public static void main(String[] args) {
        int[] masyvas = {2, 4, 16, -16, 8, 10, -2, -4, -6, -81};
        System.out.println("Pradinis Masyvas: ");
        spausdinimas(masyvas);
        lyginiuSkaiciuVidurkis(masyvas);
        keitimas(masyvas, min(masyvas), max(masyvas));
        System.out.println("Kiekis: " + kiekis(masyvas));
        System.out.println("Suma: " + suma(masyvas));
        System.out.println("Minimalus neigiamas: " + minimalusNeigiamas(masyvas));
        System.out.println("Masyvas po keitimo: " );
        spausdinimas(masyvas);

    }

    /**
     * skaiciuoja tik lyginiu skaiciu vidurki
     *
     * @param masyvas
     */
    public static void lyginiuSkaiciuVidurkis(int[] masyvas) {
        double vid;

        vid = suma(masyvas) / kiekis(masyvas);
        ;
        System.out.println("Lygyniu skaiciu vidurkis:  " + vid);
    }

    /**
     * masyvo suma
     *
     * @param masyvas
     * @return
     */
    public static int suma(int[] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0)
                suma += masyvas[i];
            suma++;
        }
        return suma;
    }

    /**
     * funkcija grazina masyvo kieki ir ilgi
     *
     * @param masyvas
     * @return
     */
    public static int kiekis(int[] masyvas) {
        int kiek = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0)
                kiek++;
        }
        return kiek;
    }

    /**
     * grazina i minimalu index'a
     *
     * @param masyvas
     * @return
     */
    public static int min(int[] masyvas) {
        int minimalusSkaicius = 999999;
        int minIndex = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < minimalusSkaicius) {
                minimalusSkaicius = masyvas[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * grazina maksimalu index'a
     *
     * @param masyvas
     * @return
     */
    public static int max(int[] masyvas) {
        int maximalusSkaicius = -9999999;
        int maxIndex = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > maximalusSkaicius) {
                maximalusSkaicius = masyvas[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * sukeicia minimalu su maksimaliu skaiciumi
     *
     * @param masyvas
     * @param min
     * @param max
     * @return
     */
    public static int[] keitimas(int[] masyvas, int min, int max) {

        int elementas = masyvas[min];
        masyvas[min] = masyvas[max];
        masyvas[max] = elementas;
        return masyvas;
    }

    /**
     * Spausdina skaicius
     *
     * @param masyvas
     */
    public static void spausdinimas(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++)
            System.out.print(masyvas[i] + " ");
        System.out.println();
    }

    public static int minimalusNeigiamas(int[] masyvas) {
        int minimalusNeigiamas = Integer.MAX_VALUE;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0) {
                if (masyvas[i] < minimalusNeigiamas) {
                    minimalusNeigiamas = masyvas[i];
                }
            }
        }
        return minimalusNeigiamas;
    }
}