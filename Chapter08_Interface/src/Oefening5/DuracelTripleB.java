package Oefening5;

import Oefening4.Battery;

public class DuracelTripleB implements Battery {
    private String type = "Duracel Double";

    @Override
    public int deliverPower() {
    return 15;    }

    public String getType() {
        return type;
    }
}
