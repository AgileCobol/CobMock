grammar Config;

configRoot: (TEXT '{' (assignment)* '}')*;

assignment: target ':=' source ';';

target: (TEXT)+;
source: (TEXT | INT | STRING);

INT    :       [0-9]+               ;
TEXT   :       [a-zA-Z0-9*-]+        ;
STRING :       '\'' .*? '\''        
             | '"'  .*? '"'         ; 
NEWLINE:       '\r'? '\n'  -> channel(HIDDEN)  ;     
WS     :       [ \t'!']+ -> channel(HIDDEN)    ; 