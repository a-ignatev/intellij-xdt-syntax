%%

%public
%class XdtLexer
%implements com.intellij.lexer.FlexLexer
%unicode
%function advance
%type com.intellij.psi.tree.IElementType

%state AFTER_LINE_LENGTH
%state AFTER_IDENTIFIER

%%
<YYINITIAL> {
    ^[0-9]{3} {
        yybegin(AFTER_LINE_LENGTH);
        return com.github.aignatev.intellijxdtsyntax.xdt.XdtTypes.INSTANCE.getLINE_LENGTH();
    }
    \r?\n     { return com.intellij.psi.TokenType.WHITE_SPACE; }
    .         { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

<AFTER_LINE_LENGTH> {
    [0-9]{4} {
        yybegin(AFTER_IDENTIFIER);
        return com.github.aignatev.intellijxdtsyntax.xdt.XdtTypes.INSTANCE.getIDENTIFIER();
    }
    .         { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}

<AFTER_IDENTIFIER> {
    [^\r\n]+ { return com.github.aignatev.intellijxdtsyntax.xdt.XdtTypes.INSTANCE.getDATA(); }
    \r?\n    { yybegin(YYINITIAL); return com.intellij.psi.TokenType.WHITE_SPACE; }
    .        { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
