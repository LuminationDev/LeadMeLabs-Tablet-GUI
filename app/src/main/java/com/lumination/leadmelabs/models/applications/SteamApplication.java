package com.lumination.leadmelabs.models.applications;

public class SteamApplication extends Application {
    public SteamApplication(String type, String name, int id) {
        super(type, name, id);
    }

    public static String getImageUrl(int id) {
        return "https://cdn.cloudflare.steamstatic.com/steam/apps/" + id + "/header.jpg";
    }
}
