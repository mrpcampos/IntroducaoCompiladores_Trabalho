package recovery;

import static parser.langXConstants.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(INT));
        methoddecl.add(new Integer(STRING));
        methoddecl.add(new Integer(IDENT));

        vardecl.add(new Integer(INT));
        vardecl.add(new Integer(STRING));
        vardecl.add(new Integer(IDENT));

        classlist.add(new Integer(CLASS));

        constructdecl.add(new Integer(CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(IDENT)); // first do atribstat
        statlist.add(new Integer(PRINT));
        statlist.add(new Integer(READ));
        statlist.add(new Integer(RETURN));
        statlist.add(new Integer(SUPER));
        statlist.add(new Integer(IF));
        statlist.add(new Integer(FOR));
        statlist.add(new Integer(LBRACE));
        statlist.add(new Integer(BREAK));
        statlist.add(new Integer(SEMICOLON));
    }
}
