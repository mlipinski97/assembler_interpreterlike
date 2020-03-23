import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import generated.*;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

    public static final String ERROR_MESSAGE = "Error";
    public static ParaAssemblerInterpreter interpreter;

    public static void main( String[] args )
    {

        String line = new String();
        Scanner inputScanner = new Scanner(System.in);
        interpreter = new ParaAssemblerInterpreter();
        while(true){
            try {
                line = inputScanner.nextLine();
            }
            catch(NoSuchElementException e) {
                break;
            }

            CharStream charStream = CharStreams.fromString(line);
            jfkgrammarLexer jfkGrammarLexer = new jfkgrammarLexer(charStream);
            jfkGrammarLexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokenStream = new CommonTokenStream(jfkGrammarLexer);

            jfkgrammarParser jfkGrammarParser = new jfkgrammarParser(tokenStream);
            jfkGrammarParser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            ParseTree parseTree = jfkGrammarParser.full_line();

            if(jfkGrammarParser.getNumberOfSyntaxErrors() > 0){
                System.out.println(ERROR_MESSAGE);
                continue;
            }

            ParaAssemblerVisitor visitor = new ParaAssemblerVisitor();
            visitor.visit(parseTree);

        }
    }
}



