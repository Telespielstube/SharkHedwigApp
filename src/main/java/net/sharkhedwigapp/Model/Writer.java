package net.sharkhedwigapp.Model;

import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import net.sharkhedwigapp.Misc.AppConstant;
import net.sharkhedwigapp.Misc.Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
     * Writes shipping label data to file.
     */
    public static void writeCSVData(ShippingLabel shippingLabel) throws IOException {

    }
}
