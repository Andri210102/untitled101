package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random randomGenerator = new Random();

        while (true) {
            MiningEquipment myVideocard = new MiningEquipment( "RX470/570" ,120,50, 30000000);
            double a = randomGenerator.nextInt();
            myVideocard.price = a;

            MiningEquipment myVideocard2 = new MiningEquipment( "RX480/580",130, 50, 50000000);
            double b = randomGenerator.nextInt(10);
            myVideocard2.price = b;

            MiningEquipment myVideocard3 = new MiningEquipment("RX590", 120, 50,23424);
            double c = randomGenerator.nextInt(10);
            myVideocard3.price = c;

            List<MiningEquipment> list = new ArrayList<>();
            list.add(myVideocard);
            list.add(myVideocard2);
            list.add(myVideocard3);

            list= list.stream().sorted(
                    Comparator.comparingDouble(MiningEquipment::PAYBACK_period)).collect(Collectors.toList());
            System.out.println("Оптимальний вибір");


            for (MiningEquipment me: list) {

                System.out.println();
                System.out.println("Device name:" + me.name + " Device pay off period  " + me.PAYBACK_period());

            }
            Thread.sleep(10000);
        }


    }

}