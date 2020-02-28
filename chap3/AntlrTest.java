import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class AntlrTest {
	
	public static void main(String[] args) throws Exception{
		// 新建一个CharStream，从标准输入读取数据
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		
		// 新建一个词法分析器，处理输入的CharStrem
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		
		// 新建一个词法符号缓冲区，存储词法分析器生成的词法符号
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// 新建一个语法分析器，处理词法符号缓冲区的内容
		ArrayInitParser parser = new ArrayInitParser(tokens);
		
		ParseTree tree = parser.init(); //针对init规则开始语法分析
		System.out.println(tree.toStringTree(parser));  //用LISP风格打印生成的树
	}
}
