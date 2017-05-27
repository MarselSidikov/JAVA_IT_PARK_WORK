package ru.itpark.vk.client.app;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // объявляем загружатель fxml-файлов
        FXMLLoader loader = new FXMLLoader();
        // загружаем файл
        loader.setLocation(getClass().getResource("/windows/mainWindow.fxml"));
        // создаем родительское окно
        Parent root = loader.load();
        // создаем стейдж
        primaryStage.setTitle("Hello");
        // кладем сцену с окном
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("/css/list-view-style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
