package exercise;

import java.util.Map;

// BEGIN
public abstract class Tag {
    String name;
    Map<String, String> attributes;

    public Tag(String name, Map<String, String> attributes) {
        this.name = name;
        this.attributes = attributes;
    }
    public abstract String tooString();
}
// END
