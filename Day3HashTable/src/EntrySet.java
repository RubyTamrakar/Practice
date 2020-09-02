public class EntrySet {
    private String key;
    private String value;

    public EntrySet(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "EntrySet{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
