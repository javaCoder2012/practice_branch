public class Branch {

    public String version ;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "version='" + version + '\'' +
                '}';
    }
}
