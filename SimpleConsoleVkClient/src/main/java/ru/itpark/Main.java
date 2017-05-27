package ru.itpark;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;
import ru.itpark.vk.models.Friends;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VkApi api = ApiBuilder.buildRestTemplateApi();

        List<Friend> friends = api.getUserFriends(176050764, 30, "sex","country", "domain", "city", "photo_200_orig");
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }
}
