package com.company;

public class Dz3 {
    public static void main(String[] args) {
        //Задание 1 (1 вариант)
        { double sum = 0, x = 0.5, eps = 1e-10, a=x;
        int num = 1;
        while (Math.abs(a)>eps){
            sum+=a;
            num++;
            a*=-x+(3*num-4)/(3*num);
        }
        double res = 3*Math.pow(1+x,1./3)-3;
        System.out.printf("calc: %f, comp: %f%n",sum,res);}
        // так как 1 вариант мы полностью разобрали на уроке
        // Задание 1 (вариант 3)
        {double sum = 0, x = 0.5, eps = 1e-10, a=x;
            int num=1;
            while (Math.abs(a)>eps){
                sum+=a;
                num++;
                a*=-x+(4*num-3)/(4*num);
            }
            double res = 1-(1/(Math.pow(1+x,1./4)));
            System.out.printf("calc: %f, comp: %f%n",sum,res);}

        // Задание 1 (вариант 5)
        {double sum = 0, x = 0.5, eps = 1e-10, a=x;
            int num=1;
            while (Math.abs(a)>eps){
                sum+=a;
                num++;
                a*=-x+(3*num-2)/(3*num);
            }
            double res = 1-(1/(Math.pow(1+x,1./3)));
            System.out.printf("calc: %f, comp: %f%n",sum,res);}

        // Задание 2 (вариант 1)
        {int[] a={1,2,3,5,7,9};
            int[] b=new int[a.length];
            for (int i=1; i<a.length; i++) {
                boolean flag = true;
                for (int j = 1; j < a.length; j++)
                    if (a[j] <= a[j - 1]) flag = false;
                break;
            }
            /* if (flag){
                System.out.println("являеться возрастающей");
                else {
                    System.out.println("не являеться возростающей");
                } */   // не пойму как правильно вывести ответ в консоль 
            }
        }
    }
}