grammar MockCobol;

import fragments, cobolTokens, defaults;

compilationUnit: (.*? (mockMeta cobolToken))*;
mockMeta:      MOCKBEGIN mockIdentifier callStatement;
mockIdentifier: MOCKUP ('id=' STRING)?;


callStatement: CALL (TEXT | STRING ) (usingClause)?;

usingClause:   USING (dataIdentifier)+;

dataIdentifier: (addressOfClause | lengthOfClause)? dataName;

dataName: TEXT ('(' INT ')')? (dataQualifier)?;

dataQualifier: IN dataName;


addressOfClause: ADDRESS OF;
lengthOfClause: LENGTH OF;
MOCKUP :      '@' U P '-' C A L L   ;
MOCKBEGIN:       '@'                  ;