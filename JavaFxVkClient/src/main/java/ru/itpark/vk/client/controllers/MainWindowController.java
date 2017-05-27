package ru.itpark.vk.client.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;

import java.util.List;

public class MainWindowController {

    private VkApi vkApi;

    @FXML
    private ImageView imageAvatar;

    @FXML
    private AnchorPane pane;

    @FXML
    public void initialize() {
        vkApi = ApiBuilder.buildRestTemplateApi();
        List<Friend> friends = vkApi
                .getUserFriends(176050764, 3, "photo_200_orig");
        double lastY = 0;
        for (Friend friend : friends) {
            ImageView friendAvatar = new ImageView(friend.getPhoto());
            friendAvatar.setY(lastY);
            lastY = lastY + friendAvatar.getImage().getHeight();

            pane.getChildren().add(friendAvatar);
        }
        int i = 0;
    }
}
