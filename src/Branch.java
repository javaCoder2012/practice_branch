public class Branch {
    private String name;
    private String version ;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
