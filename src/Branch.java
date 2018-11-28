public class Branch {

    public String version ;

    public String getVersion() {
        System.out.println("comflict");
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        System.out.println("comflict");
        return "Branch{" +
                "version='" + version + '\'' +
                '}';
    }
}
