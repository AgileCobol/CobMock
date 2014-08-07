grammar Cobol4;

import fragments, cobolTokens;

compilationUnit: (.*? (mockMeta cobolToken))*;
mockMeta:      MOCKBEGIN mockIdentifier callStatement;
mockIdentifier: MOCKUP ('id=' STRING)?;


callStatement: CALL (TEXT | STRING ) (usingClause)?;
usingClause:   USING (dataIdentifier)+;
dataIdentifier: (addressOfClause | lengthOfClause)? dataName;
addressOfClause: ADDRESS OF;
lengthOfClause: LENGTH OF;
dataName: TEXT ('(' INT ')')?;

MOCKUP :      '@' U P '-' C A L L   ;
MOCKBEGIN:       '@'                  ;