package LanguageObjects;

import java.util.LinkedList;
import java.util.List;

public class Tag {
    private static int counter = 0;

    private int identifier;
    private String name = "";
    private String id = "";
    private String classname = "";
    private String href = "";
    private String text = "";
    private List<CustomAttribute> customAttrs = null;

    public Tag() {
        identifier = counter++;
        customAttrs = new LinkedList<CustomAttribute>();
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addCustomAttribute(CustomAttribute a){
        customAttrs.add(a);
    }

    public List<CustomAttribute> getCustomAttrs() {
        return customAttrs;
    }
}
