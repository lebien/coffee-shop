package com.coffeeshop.orderservice.common;

public enum OrderStatus {
    PLACED("PLACED"),
    IN_PROGRESS("IN_PROGRESS"),
    COMPLETED("COMPLETED")
    ;

    private final String status;

    /**
     * @param status
     */
    OrderStatus(final String status) {
        this.status = status;
    }
    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return status;
    }
}
