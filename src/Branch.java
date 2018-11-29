public class Branch {
    private String remark;
    private String name;
    private String version ;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
