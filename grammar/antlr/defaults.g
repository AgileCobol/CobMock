grammar defaults;

INT    :       [0-9]+               ;
TEXT   :       [a-zA-Z0-9*-]+        ;
STRING :       '\'' .*? '\''        
             | '"'  .*? '"'         ; 
NEWLINE:       '\r'? '\n'  -> channel(HIDDEN)  ;     
WS     :       [ \t'!']+ -> channel(HIDDEN)    ; 