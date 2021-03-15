<<<<<<< HEAD
package com.example.android.sqliteweather.data;

public class GenreData {
    private int genreType;
    public GenreData(int t){
        genreType = t;
    }

    public int getGenreType() {
        return genreType;
    }
}
=======
package com.example.android.sqliteweather.data;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.io.Serializable;
import java.lang.reflect.Type;

public class GenreData implements Serializable {
    private int id;
    private String name;

    public GenreData(int i, String n){
        this.id = i;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public static class JsonDeserializer implements com.google.gson.JsonDeserializer<GenreData> {
        @Override
        public GenreData deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            JsonObject listObj = json.getAsJsonObject();

            return new GenreData(
                    listObj.getAsJsonPrimitive("id").getAsInt(),
                    listObj.getAsJsonPrimitive("name").getAsString()
            );
        }
    }
}
>>>>>>> 4c8ffa1464dc7e713857a96de4f562be62788624
