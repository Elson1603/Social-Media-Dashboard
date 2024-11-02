import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;

public class SocialMediaDashboardUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the WebView and WebEngine
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load the HTML file into the WebView
        // Replace 'path/to/UI.html' with the actual path to your HTML file
        File file = new File("path/to/UI.html");
        webEngine.load(file.toURI().toString());

        // Create the scene and show it
        BorderPane root = new BorderPane();
        root.setCenter(webView);

        Scene scene = new Scene(root, 1024, 768);
        primaryStage.setTitle("Social Media Dashboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
