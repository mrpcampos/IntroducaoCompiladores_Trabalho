package syntacticTree;

import parser.*;


public class VarDeclNode extends StatementNode {
    public Token accessModifier;
    public Token changeability;
    public ListNode vars;

    public VarDeclNode(Token t, ListNode p, Token accessModifier, Token changeability) {
        super(t);
        vars = p;
        this.accessModifier = accessModifier;
        this.changeability = changeability;
    }
}
