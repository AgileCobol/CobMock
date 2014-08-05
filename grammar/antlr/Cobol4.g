grammar Cobol4;

compilationUnit: (.*? (mockMeta cobolToken))*;
mockMeta:      COMMENT MOCKUP callStatement;
callStatement: CALL (TEXT | STRING ) (usingClause)?;
usingClause:   USING (dataIdentifier)+;
dataIdentifier: (addressOfClause | lengthOfClause)? dataName;
addressOfClause: ADDRESS OF;
lengthOfClause: LENGTH OF;
dataName: TEXT ('(' INT ')')?;



cobolToken:    TOKEN                ;



MOVE   :      M O V E               ;
MOCKUP :      '@' U P '-' C A L L   ;
ENDCALL:      E N D '-' C A L L     ;
USING  :      U S I N G             ;
CALL   :      C A L L               ;
ADDRESS:      A D D R E S S         ;
OF     :      O F                   ;
IN     :      I N                   ;
LENGTH :      L E N G T H           ;
TOKEN  :       MOVE
             | ENDCALL
	     | CALL
             | '.'                  ;
COMMENT:       '*'                  ;

INT    :       [0-9]+               ;
TEXT   :       [a-zA-Z0-9*]+        ;
STRING :       '\'' .*? '\''        
             | '"'  .*? '"'         ; 
NEWLINE:       '\r'? '\n'  -> skip  ;     
WS     :       [ \t]+ -> skip       ; 


fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');
