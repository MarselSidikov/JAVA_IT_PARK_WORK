package ru.itpark.vk.api.core;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.itpark.vk.models.Friend;
import ru.itpark.vk.models.Friends;

import java.util.Arrays;
import java.util.List;

public class VkApiRestTemplateImpl implements VkApi {

    private final String FRIENDS_GET_URL = "https://api.vk.com/method/friends.get";

    private RestTemplate restTemplate;

    public VkApiRestTemplateImpl() {
        this.restTemplate = new RestTemplate();
    }

    public List<Friend> getUserFriends(int userId, int count, String ... fields) {

        StringBuilder fieldsAsString = new StringBuilder();
        for (String field : fields) {
            fieldsAsString.append(field).append(",");
        }
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(FRIENDS_GET_URL)
                .queryParam("user_id", userId)
                .queryParam("count", count)
                .queryParam("fields", fieldsAsString);

        String expandUrl = builder.toUriString();

        Friends friends = restTemplate.getForObject(expandUrl, Friends.class);

        return friends.getResponse();
    }
}
