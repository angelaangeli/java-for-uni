package Pr4;

public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    Sizes(int euroSize) {
        this.EuroSize = euroSize;;
    }
    public String getDescription() {
        return "Взрослый размер";
    }
    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }
    private int EuroSize;
}
