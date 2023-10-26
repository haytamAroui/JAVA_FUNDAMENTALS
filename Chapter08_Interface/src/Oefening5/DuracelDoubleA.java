package Oefening5;

import Oefening4.Battery;

public class DuracelDoubleA implements Battery{
    private String type = "Duracel Double";


    @Override
    public int deliverPower() {
        return 10;    }

}
