package pkg;

public class ShortToUnicodeString extends ArrayInitBaseListener{
	
	// 将  { 翻译成 "
	@Override
	public void enterInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}
	
	// 将  } 翻译成 "
	@Override
	public void exitInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}
	
	// 将整数翻译为对应的十六进制
	@Override
	public void enterValue(ArrayInitParser.ValueContext ctx) {
		int value = Integer.valueOf(ctx.INT().getText());
		System.out.printf("\\u%04x", value);
	}
	

}
