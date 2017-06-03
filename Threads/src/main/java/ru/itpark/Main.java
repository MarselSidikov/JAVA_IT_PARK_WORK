package ru.itpark;


import javafx.scene.image.ImageView;
import ru.itpark.vk.api.core.ApiBuilder;
import ru.itpark.vk.api.core.VkApi;
import ru.itpark.vk.models.Friend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoadPhotosTask task = null;
        while (true) {
            System.out.println("Hello!");
            System.out.println("Menu:");
            System.out.println("1. Show Friends");
            System.out.println("2. Exit");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            if (command == 1) {
                task = new LoadPhotosTask();
                task.start();
            } else {
                task.interrupt();
                return;
            }
        }
    }
}
