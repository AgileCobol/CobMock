grammar Config;

configRoot: (mockCall)*;

mockCall: callId '{' (assignment)* '}';


assignment: target ':=' source ';';


callId: TEXT;
target: (TEXT)+;
source: (TEXT | INT | STRING);

INT    :       [0-9]+               ;
TEXT   :       [a-zA-Z0-9*-]+        ;
STRING :       '\'' .*? '\''        
             | '"'  .*? '"'         ; 
NEWLINE:       '\r'? '\n'  -> skip  ;     
WS     :       [ \t'!']+ -> skip    ; 