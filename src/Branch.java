public class Branch {

    private String name;
    private String version ;

    public String getVersion() {
        System.out.println("comflict");
        System.out.println("comflict2");
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        System.out.println("comflict");
        System.out.println("comflict2");
        return "Branch{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
