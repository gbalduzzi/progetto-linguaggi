package Trees;

import LanguageObjects.Tag;

import java.util.LinkedList;
import java.util.List;

/**
 * Questa classe rappresenta  la struttura della pagina html
 * E' parametrica rispetto a tag
 */
public class TreePage {

    private LanguageObjects.Tag tag;
    private TreePage parent;
    private List<TreePage> sons;

    public TreePage() {
        tag = null;
        parent = null;
        sons = new LinkedList<TreePage>();
    }

    public boolean isRoot() {
        if (parent == null)
            return true;
        return false;
    }

    public boolean isLeaf() {
        if (sons.size() == 0)
            return true;
        return false;
    }

    public LanguageObjects.Tag getTag() {
        return tag;
    }

    public void setTag(LanguageObjects.Tag tag) {
        this.tag = tag;
    }

    public void insertSon(TreePage t) {
        t.setParent(this);
        sons.add(t);
    }

    public List<TreePage> getSons() {
        return sons;
    }

    public void setSons(List<TreePage> sons) {
        this.sons = sons;
    }

    public TreePage getParent() {
        return parent;
    }

    public void setParent(TreePage parent) {
        this.parent = parent;
    }

    /**
     * Stampa dell'intera pagina html
     *
     * @param tree
     * @return
     */
    public static String buildTreeDescription(TreePage tree) {
        String res = "";
        String sonsS = "";
        //discesa
        for (TreePage tson : tree.getSons()
                ) {
            sonsS = sonsS + "\n" + buildTreeDescription(tson);
        }
        //ricosruzione a meno del tag iniziale immaginario
        if (!tree.getTag().getName().equals("Virtualtag")) {
            res = res + tree.getTag().getHead();
            res = res + "\n" + tree.getTag().getContent();
            res = res + "\n" + sonsS;
            res = res + "\n" + tree.getTag().getTail();
            String resMultiplied = "";
            int incr = 1;
            while (!(incr > tree.getTag().getMultiplier())) {
                resMultiplied = resMultiplied + res + "\n";
                incr++;
            }
            return resMultiplied;
        } else
            return sonsS;
    }
}
