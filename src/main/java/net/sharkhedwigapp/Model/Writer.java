package net.sharkhedwigapp.Model;

import net.sharkhedwigapp.Bean.ShippingLabel;
import net.sharkhedwigapp.Misc.AppConstant;
import net.sharkhedwigapp.Misc.Utilities;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * This class writes the shipping label data to a hidden .csv files on disk. The used library is the
 */
public class Writer {

    public static void createCSVFile() {
        try {
            Files.createDirectories(Paths.get(AppConstant.STORAGE_PATH.toString()) );
        } catch (IOException e) {
            System.err.println(Utilities.formattedTimestamp() + "Caught an Exception while setting up the app related folders: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * Opens a stream to write the ShippingLabel object as String to the log file. The methode makes use of the Java.nio.file
     */
    public static boolean writeCSVData(ShippingLabel shippingLabel) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(AppConstant.CSV_FILE.toString()), StandardCharsets.UTF_8, StandardOpenOption.CREATE_NEW)) {
            writer.write(shippingLabel.toString());
        } catch (IOException e) {
            System.err.println(Utilities.formattedTimestamp() + " Caught an exception while writing the shipping label data as csv file: " + e.getMessage());
            throw new RuntimeException(e);
        }
        return true;
    }
}
