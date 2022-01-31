package com.company.interface_segration_principle;

import com.company.interface_segration_principle.interfaces.CashBackManager;
import com.company.interface_segration_principle.interfaces.UPIPayments;

public class GooglePay implements UPIPayments, CashBackManager {



    @Override
    public void getCashBackAsCreditBalance() {

    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
