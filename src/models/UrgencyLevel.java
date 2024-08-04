package models;

public enum UrgencyLevel {
    HIGH(0),
    MID(1),
    LOW(2);

    int order;

    UrgencyLevel(int order) {
        this.order = order;
    }
}
