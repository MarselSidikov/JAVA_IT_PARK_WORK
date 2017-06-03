package ru.itpark;

import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class LoadPhotosTask extends Thread {
    public void run() {
        try {
            run0();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void run0() throws Exception {
        VkApi api = ApiBuilder.buildRestTemplateApi();
        List<Friend> friends = api.getUserFriends(176050764, 200, "photo_200_orig");
        int i = 0;
        for (Friend friend : friends) {
            if (!Thread.currentThread().isInterrupted()) {
                URL url = new URL(friend.getPhoto());
                URLConnection conn = url.openConnection();
                InputStream in = conn.getInputStream();
                OutputStream outputStream =
                        new FileOutputStream("photos/" + i + ".jpg");
                byte[] bytes = new byte[1000000000];
                int length = in.read(bytes);
                outputStream.write(bytes, 0, length);
                outputStream.close();
                i++;
            } else {
                return;
            }
        }
    }
}