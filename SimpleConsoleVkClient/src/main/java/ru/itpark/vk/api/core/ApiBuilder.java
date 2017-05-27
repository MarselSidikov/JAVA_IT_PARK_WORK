package ru.itpark.vk.api.core;

public class ApiBuilder {
    public static VkApi buildRestTemplateApi() {
        return new VkApiRestTemplateImpl();
    }
}
