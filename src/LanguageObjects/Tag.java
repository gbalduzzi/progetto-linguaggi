package LanguageObjects;

import java.util.LinkedList;
import java.util.List;


//TODO manca un metodo per il processing delle eccezioni che sarebbe da implementare corredato da una error list
public class Tag {
    private static int counter = 0;

    private int identifier;
    private int multiplier;
    private String name = "";
    private String id = "";
    private String classname = "";
    private String href = "";
    private String text = "";
    private List<CustomAttribute> customAttrs = null;

    public Tag() {
        identifier = counter++;
        multiplier = 1;
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

    public boolean setId(String id) {
        boolean result = true;
        //il tentativo di inserimento fallisce
        if (!id.equals(""))
            return false;
        this.id = id;
        return result;
    }

    public String getClassname() {
        return classname;
    }

    public void addClassname(String classname) {
        //potrebbero esserci piu classi referenziate
        this.classname = this.classname + " " + classname;
    }

    public String getHref() {
        return href;
    }

    public boolean setHref(String href) {
        boolean result = true;
        //il tentativo di inserimento fallisce
        if (!href.equals(""))
            return false;
        this.href = href;
        return result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public void addCustomAttribute(CustomAttribute a) {
        customAttrs.add(a);
    }

    public List<CustomAttribute> getCustomAttrs() {
        return customAttrs;
    }

    //TODO qui bisogna implementare tutti i vari casi tenendo anche conto delle eccezioni

    /**
     * Questo metodo restituisce la testa del tag, senza contenuto
     * In questo modo è possibile assemblare tag innestati senza troppa difficoltà
     *
     * @return
     */
    public String getHead() {
        String res = "";

        return res;
    }

    //TODO

    /**
     * Questo metodo restituisce la coda del tag
     *
     * @return
     */
    public String getTail() {
        String res = "";

        return res;
    }

    /**
     * Il metodo serve per restituire il contenuto del tag
     *
     * @return
     */
    public String getContent() {
        return this.getText();
    }



}
