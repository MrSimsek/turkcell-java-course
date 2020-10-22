package com.denizsimsek.classes;

public class StorageUtils {
    public static boolean save(String key, String value) {
        System.out.println("Storing data...");
        System.out.println("Saved " + value + " with key " + key);
        return true;
    }

    public static boolean get(String key) {
        System.out.println("Getting data...");
        System.out.println("Received the text with key: " + key);
        return true;
    }

    public static boolean delete(String key) {
        System.out.println("Deleting data...");
        System.out.println("Deleted the text with key: " + key);
        return true;
    }
}
