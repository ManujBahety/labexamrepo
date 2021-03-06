package com.github.TeamRocketBalleBalle.Ricktionary.Resources.Comms;

import java.io.Serializable;

public class Order<T extends Serializable> extends CommData<T> {

    /**
     *
     * @param value the value to store in the Order
     */
    public Order(T value) {
        super(value);
    }

    @Override
    public int hashCode() {
        if (hashCode == 0) {
            int result = 104 * super.hashCode();
            hashCode = result;
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Order)) {
            return false;
        } else {
            Order<?> that = (Order<?>) obj;
            return this.getValue().equals(that.getValue());
        }
    }
}
