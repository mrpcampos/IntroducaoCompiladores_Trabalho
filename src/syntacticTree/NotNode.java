package syntacticTree;

import parser.*;


public class NotNode extends UnaryNode {

    public NotNode(Token t, ExpreNode expr) {
        super(t, expr);
    }
}
