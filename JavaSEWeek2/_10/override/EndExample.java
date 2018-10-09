package _10.override;

public enum EndExample {
    SMALL(10),MEDIUM(15),LARGE(20),XLARGE(25);
    private int limited;


    EndExample(int limited) {
        this.limited=limited;

    }

    public int getLimited() {
        return limited;
    }

    public void setLimited(int limited) {
        this.limited = limited;
    }
}

