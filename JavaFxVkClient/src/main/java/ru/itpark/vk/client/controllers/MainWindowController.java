package ru.itpark.vk.client.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
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
            int countOfFriends = Integer.parseInt(countFriends.getText());
            pane.getChildren().removeAll(panes);
            List<Friend> friends = vkApi
                    .getUserFriends(176050764, countOfFriends, "photo_200_orig");
            double lastY = 0;
            VBox vBox = new VBox();
            ScrollPane scrollPane = new ScrollPane(vBox);
            for (Friend friend : friends) {
                ImageView imageView = new ImageView(friend.getPhoto());
                TitledPane friendPane = new TitledPane(friend.getFirstName() +
                        " " + friend.getLastName(), imageView);
                friendPane.setLayoutY(lastY);
                lastY = lastY + imageView.getImage().getHeight();
                friendPane.setExpanded(false);
                panes.add(friendPane);
                vBox.getChildren().add(friendPane);
            }
            scrollPane.setFitToHeight(true);
            pane.getChildren().add(scrollPane);
        });
    }
}
