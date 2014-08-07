grammar cobolTokens;

cobolToken:    TOKEN                ;
MOVE   :      M O V E               ;
ENDCALL:      E N D '-' C A L L     ;
USING  :      U S I N G             ;
CALL   :      C A L L               ;
ADDRESS:      A D D R E S S         ;
OF     :      O F                   ;
IN     :      I N                   ;
LENGTH :      L E N G T H           ;
SET    :      S E T                 ;
TOKEN  :       MOVE
             | ENDCALL
	         | CALL
	         | SET
             | '.'                  ;


INT    :       [0-9]+               ;
TEXT   :       [a-zA-Z0-9*]+        ;
STRING :       '\'' .*? '\''        
             | '"'  .*? '"'         ; 
NEWLINE:       '\r'? '\n'  -> channel(HIDDEN)  ;     
WS     :       [ \t'!']+ -> channel(HIDDEN)    ; 