package net.sharkhedwigapp.Misc;

public enum AppConstant {
    // Path constants for application data
    STORAGE_PATH("hedwigStorage/"),
    CSV_FILE("shippingLabel.csv"),
    ERROR_LOG("hedwigStorage/errorLog"),
    ERROR_FILE("error.txt");

    private String name;

    AppConstant(String name) {
        this.name = name;
    }
}
