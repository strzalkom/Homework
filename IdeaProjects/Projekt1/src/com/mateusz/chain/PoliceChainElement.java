package com.mateusz.chain;

/**
 * Created by lenovo on 02.06.2017.
 */
public class PoliceChainElement implements ChainElement {
    @Override
    public boolean isMyResponsibility(int phoneNumber) {
        return phoneNumber == 997;
    }

    @Override
    public void doAction() {
        System.out.println("Calling police");
    }
}
