package com.lumination.leadmelabs.models.applications;

import java.util.Objects;

public class Application {
    public String type;
    public String name;
    public int id;

    public Application(String type, String name, int id) {
        this.type = type;
        this.name = name;
        this.id = id;
    }

    public static String getImageUrl(String id) { return ""; };

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Application other = (Application) obj;
        return Objects.equals(id, other.id);
    }
}
