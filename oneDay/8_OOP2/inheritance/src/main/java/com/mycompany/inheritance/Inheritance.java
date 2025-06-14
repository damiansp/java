package com.mycompany.inheritance;


public class Inheritance {
    public static void main(String[] args) {
        Member[] clubMembers = new Member[6];
        clubMembers[0] = new NormalMember("Norm", 1, 2010);
        clubMembers[1] = new NormalMember("Norma", 2, 2011);
        clubMembers[2] = new NormalMember("Norman", 3, 2011);
        clubMembers[3] = new VIPMember("Vick", 4, 2012);
        clubMembers[4] = new VIPMember("Vicky", 5, 2012);
        clubMembers[5] = new VIPMember("Victor", 6, 2013);
        
        for (Member m: clubMembers) {
            m.calculateAnnualFee();
            m.print();
        }
    }
}
