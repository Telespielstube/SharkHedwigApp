package net.sharkhedwigapp.Bean;

import java.io.Serializable;

public record ShippingLabel(String sender,
                            String origin,
                            String latitudeOrigin,
                            String longitudeOrigin,
                            String recipient,
                            String destination,
                            String latitudeDest,
                            String longitudeDest,
                            String weight)
        implements Serializable {

    @Override
    public String toString() {
        return sender + ", " + origin + ", " + latitudeOrigin + ", ";
    }
}

