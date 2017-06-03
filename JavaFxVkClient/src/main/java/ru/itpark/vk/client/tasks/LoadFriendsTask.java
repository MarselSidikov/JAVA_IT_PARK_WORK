package ru.itpark.vk.client.tasks;


import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;

import java.util.List;

public class LoadFriendsTask extends Thread {
    private TextField countFriends;
    private List<TitledPane> panes;
    private VkApi vkApi;
    private Pane pane;

    public LoadFriendsTask(TextField countFriends, List<TitledPane> panes, VkApi vkApi, Pane pane) {
        this.countFriends = countFriends;
        this.panes = panes;
        this.vkApi = vkApi;
        this.pane = pane;
    }

    public void run() {
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
    }
}
