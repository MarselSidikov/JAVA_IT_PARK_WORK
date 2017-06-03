package ru.itpark.vk.client.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.client.tasks.LoadFriendsTask;
import ru.itpark.vk.models.Friend;

import java.util.ArrayList;
import java.util.List;

public class MainWindowController {

    private VkApi vkApi;

    @FXML
    private AnchorPane pane;

    @FXML
    private Button buttonFriends;

    @FXML
    private TextField countFriends;

    private List<TitledPane> panes = new ArrayList<>();

    @FXML
    public void initialize() {
        vkApi = ApiBuilder.buildRestTemplateApi();

        buttonFriends.setOnAction(event -> {
            LoadFriendsTask task = new LoadFriendsTask(
                    countFriends, panes, vkApi, pane);
            task.start();
        });
    }
}
