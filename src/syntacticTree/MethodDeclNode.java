package syntacticTree;

import parser.*;

public class MethodDeclNode extends GeneralNode {
    public int dim;
    public Token name;
    public Token accessModifier;
    public Token changeability;
    public MethodBodyNode body;

    public MethodDeclNode(Token t, int k, Token t2, MethodBodyNode b, Token accessModifier, Token changeability) {
        super(t);
        dim = k;
        name = t2;
        body = b;
        this.accessModifier = accessModifier;
        this.changeability = changeability;
    }
}
