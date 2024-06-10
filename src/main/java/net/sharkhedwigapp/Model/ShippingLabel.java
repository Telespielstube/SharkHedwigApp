package net.sharkhedwigapp.Model;

public record ShippingLabel(String sender, String origin, String latitudeOrigin, String longitudeOrigin, String recipient,
                         String destination, String latitudeDest, String longitudeDest, String weight) {}

