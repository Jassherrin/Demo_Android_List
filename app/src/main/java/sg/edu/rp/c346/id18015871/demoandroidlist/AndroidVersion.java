package sg.edu.rp.c346.id18015871.demoandroidlist;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String n, String ver) {
        this.name=n;
        this.version=ver;
    }

    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVersion(String version) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name +':'  + version;
    }
}