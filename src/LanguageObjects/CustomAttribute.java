package LanguageObjects;

public class CustomAttribute {
    private String aname = "";
    private String acontent = "";

    public CustomAttribute() {

    }

    public CustomAttribute(String a, String b) {
        aname = a;
        acontent = b;
    }

    @Override
    public String toString() {
        return aname + "=\"" + acontent + "\"";
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontent() {
        return acontent;
    }

    public void setAcontent(String acontent) {
        this.acontent = acontent;
    }
}
