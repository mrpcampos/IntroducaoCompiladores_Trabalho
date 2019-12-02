package syntacticTree;

import parser.*;


public class ClassDeclNode extends GeneralNode {
    public Token accessModifier;
    public Token name;
    public Token supername;
    public ClassBodyNode body;

    public ClassDeclNode(Token t1, Token t2, Token t3, ClassBodyNode c, Token accessModifier) {
        super(t1); // passa token de referência para construtor da superclasse
        name = t2;
        supername = t3;
        body = c;
        this.accessModifier = accessModifier;
    }
}
