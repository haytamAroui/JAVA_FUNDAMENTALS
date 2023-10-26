abstract class AbstractCustomer {
    protected String name;
    private boolean isNil;

    public AbstractCustomer() {
        this.isNil=false;
    }
    public AbstractCustomer(boolean isNil) {
        this.isNil = isNil;
    }
    public boolean isNil() {
        return isNil;
    }

    public String getName() {
        return name;
    }
}
