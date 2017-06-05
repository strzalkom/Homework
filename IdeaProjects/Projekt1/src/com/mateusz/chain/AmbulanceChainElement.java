package com.mateusz.chain;

/**
 * Created by lenovo on 02.06.2017.
 */
public class AmbulanceChainElement implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 999;
    }

    @Override
    public void doAction() {
        System.out.println("Calling Ambulance");
    }
}
