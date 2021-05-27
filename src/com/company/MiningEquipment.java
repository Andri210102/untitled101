package com.company;

public class MiningEquipment {
    public String name;
    public float power; //W
    public int hashRate;//(H/s)
    public double price;   //in CV

    public MiningEquipment(String name, float power, int hashRate, int price) {
        this.name = name;
        this.power = power;
        this.hashRate = hashRate;
        this.price = price;
    }
    // H-hash
// CV-crypto currency
// item-штука
// W-ват
//Kw*H-Киловат*Час
    double THR=677788;// THR total hash rate(H/s)
    double RPB=34;// RPB reward per block(in CV)
    double ATF=43;// ATF avarage transaction fee(in CV)
    double ATC=45;// ATC avarage transaction count(Item)
    double PF=0.1;// PF pool fraction (фракция доля)
    double TBT=34555;// TBT target block time(sec)

    long EC;// EC electr cost(CV/Kw*H)
    double PAYBACK_period;// PAYBACK_period in sec


    public double PAYBACK_period() {
        return PAYBACK_period = price/((hashRate/THR)*(((RPB+(ATF*ATC))/TBT)*(1-PF)-((EC*1000)/power*hashRate*3600)));

    }





}