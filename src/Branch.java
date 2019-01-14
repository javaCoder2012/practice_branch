public class Branch {

    private String name;
    private String version ;

    private String dev_w_j_l ;

    private String master_no_merge ;

    private String dev_k_y ;

    private String dev_y ;

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
