// Generated from /home/gbalduzzi/Code/progetto-linguaggi/Emmet.g4 by ANTLR 4.7

import LanguageObjects.CustomAttribute;
import LanguageObjects.Tag;
import Trees.TreePage;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link EmmetVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class EmmetWorkingVisitor extends AbstractParseTreeVisitor<Void> implements EmmetVisitor<Void> {
    /**
     * Questo oggetto scorre lungo la gerarchia della pagina e consente di creare facilmente i tag
     * In qursto modo possiamo gestire separatamente il popolamento del tag, la gestione della struttura della pagina,
     * le eccezioni e la costruzione della stringa
     * L'utilizzo del visitor è comodo solo in alcuni casi, perciò a volte non ci serviremo del valore string di ritorno
     * L'ultima operazione di visitS materializzerà la pagina e la restituirà al chiamante
     */
    private TreePage globalPointer = null;
    /**
     * Pagina da costruire con il processo di parsing
     */
    private TreePage rootPointer = null;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitS(EmmetParser.SContext ctx) {
        //creazione della struttura e invocazione del parsing

        // il parent sara ovviamente fake all'inizio, poi andrà cancellato,
        // serve solo a creare la struttura della pagina all'inizio
        Tag virtualTag = new Tag();
        virtualTag.setName("Virtualtag");
        rootPointer = new TreePage();
        rootPointer.setTag(virtualTag);

        //copia riferimento
        globalPointer = rootPointer;
        //ora inizia la fase di visita (tutti i metodi dei non-terminali che descrivono campi di tag possono usare il global pointer)
        //(i non-terminali sopra agiscono modificandolo e spostandosi attraverso struttura)

        //inizio del parsing
        if (ctx.tag_list() != null)
            visitTag_list(ctx.tag_list());
        else if (ctx.tag_list2() != null)
            visitTag_list2(ctx.tag_list2());

        //terminazione, a questo punto il chiamante invoca la costruzione della pagina
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitTag_list(EmmetParser.Tag_listContext ctx) {
        //salvataggio del livello
        TreePage copyRef = globalPointer;

        //subito giù di un livello
        TreePage Ttag = new TreePage();
        globalPointer.insertSon(Ttag);
        globalPointer = Ttag;

        //ora inizia la lettura del tag
        if (ctx.tag() != null) {
            //leggo il nome del tag e dò il via alla visita di lettura dei campi
            Tag t = new Tag();
            t.setName(ctx.tag().getText());
            globalPointer.setTag(t);
            //adesso si entra in tag chiamando attr_lst e sfruttando il fatto che il global pointer è fresco
            if (ctx.tag().attr_list() != null)
                visitAttr_list(ctx.tag().attr_list());
            //ok ora ho finito di leggere il tag
        }
        //lettura del multiplier(se c'è)
        if (ctx.mult() != null)
            visitMult(ctx.mult());

        //lettura del tag linker(se c'è) e quindi ricorsione sulla visita di tag list
        //(NB qui ci sarà da gestire delle eccezioni in futuro)
        if (ctx.TAG_LINKER() != null) {
            if (ctx.TAG_LINKER().getText().equals(">")) {
                //figli del global pointer
                if (ctx.tag_list() != null)
                    visitTag_list(ctx.tag_list());
                if (ctx.tag_list2() != null)
                    visitTag_list2(ctx.tag_list2());
            } else {
                //fratelli del global pointer
                //vai dal papa prima
                globalPointer = globalPointer.getParent();
                if (ctx.tag_list() != null)
                    visitTag_list(ctx.tag_list());
                if (ctx.tag_list2() != null)
                    visitTag_list2(ctx.tag_list2());
            }
        }

        //riposizionamento alla posizione corretta
        globalPointer = copyRef;

        return null;
        //in questo caso inutile, percorriamo l'albero in base al caso che ricososciamo
        //(avremmo bisogno di un mix di visitor e listener)
        //return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitTag_list2(EmmetParser.Tag_list2Context ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitMult(EmmetParser.MultContext ctx) {
        globalPointer.getTag().setMultiplier(Integer.parseInt(ctx.DIGIT().toString()));
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitTag(EmmetParser.TagContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitAttr_list(EmmetParser.Attr_listContext ctx) {
        //attenzione che i metodi di inserimento dei campi restituiscono un booleano da sfruttare
        //per la corretta gestione delle eccezioni
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Void visitCustom(EmmetParser.CustomContext ctx) {
        CustomAttribute cat = new CustomAttribute();
        cat.setAname(ctx.ATTRIBUTE().getText());
        cat.setAcontent(ctx.ATTRIBUTE_FREE_TEXT().getText());
        globalPointer.getTag().addCustomAttribute(cat);
        return null;

    }

    /**
     * Metodo per la creazione della pagina
     * @return
     */
    public String buildPage() {
        //costruzione della pagina e ritorno al chiamante
        return TreePage.buildTreeDescription(rootPointer);
    }

}