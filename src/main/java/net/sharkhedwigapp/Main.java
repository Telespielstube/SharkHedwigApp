package net.sharkhedwigapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import net.sharkhedwigapp.Misc.AppConstant;
import net.sharkhedwigapp.Misc.Utilities;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Main extends javafx.application.Application {
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1240, 900);
        stage.setTitle("SharkHedwigApp");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void changeScene(String fxmlView) {
        try {
            Pane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlView)));
            stg.getScene().setRoot(pane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            setupErrorStream();
        } catch (IOException e) {
            System.err.println(Utilities.formattedTimestamp() + "Caught an Exception while launching the SharkHedwigApp: " + e.getMessage());
            throw new RuntimeException(e);
        }
        launch();
    }

    /**
     * To make the occurring error messages persistent. Every occuring error is redirected to a file on the device.
     */
    public static void setupErrorStream() throws IOException {
        try {
            Files.createDirectories(Paths.get(AppConstant.ERROR_LOG.toString()));
            System.setErr(new PrintStream(Files.newOutputStream(Paths.get(AppConstant.ERROR_LOG + "/"
                    + AppConstant.ERROR_FILE), CREATE, APPEND)));
        } catch (IOException e) {
            System.err.println(Utilities.formattedTimestamp() + "Caught an Exception while creating the log folders: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}