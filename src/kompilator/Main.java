package kompilator;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        PythonLexer lexer = new PythonLexer(new ANTLRFileStream("E:\\workspace\\kompilator\\src\\kompilator\\input2.txt"));
        PythonParser parser = new PythonParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        ExecVisitor visitor = new ExecVisitor();
        visitor.visit(tree);
    }
}