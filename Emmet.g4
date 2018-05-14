/**
 * Define a grammar called Emmet
 */
grammar Emmet;

/**
*Apportate modifiche, inseriti diversi ? per consentire la terminazione, così sembrerebbe funzionare
*/

s  : tag_list | tag_list2;               // Lista di tag

tag_list: tag mult? (TAG_LINKER (tag_list | tag_list2) )?;

tag_list2 : '(' tag mult? (TAG_LINKER (tag_list | tag_list2) )? ')' (TAG_LINKER (tag_list | tag_list2) )?;

mult : '*' DIGIT+;

tag : TAG attr_list?;

attr_list : ( (SYMBOL ATTRIBUTE | custom | FREE_TEXT | HREF HREFATTRIBUTE) attr_list? );

custom : '[' ATTRIBUTE '=' ATTRIBUTE_FREE_TEXT ']';   // Attributo custom

TAG : 'head' | 'body' | 'link' | 'p' | 'h' | 'ol' | 'ul' | 'b' | 'i' | 'li' | 'a' | 'div' | 'tit' | 'm';

SYMBOL : '.' | '#';                   // Simboli che aggiungono attributo al tag
HREF : '$';
URL_SYMBOLS : ':' | '/' | '?' | '&' | '.';

TAG_LINKER : '>' | '+';                     // Simboli che connettono due tag

/**
*Da qui in poi ho cambiato l'ordine delle regole, il motivo è che antlr nel dubbio assegna una stringa alla prima regola che matcha
*ho distinto tra testo libero e testo libero da attributo perchè non si poteva fare distinzione tra i due casi con nessun ordine
*l'unico modo per risolvere il problema è stato utilizzare "" e {} per racchiudere il testo
*/
ATTRIBUTE : LETTER (LETTER | DIGIT)*;
HREFATTRIBUTE : '^' (LETTER | DIGIT | URL_SYMBOLS)+ '^';

ATTRIBUTE_FREE_TEXT : '"' (LETTER | DIGIT)+ '"';
FREE_TEXT : '{' (LETTER | DIGIT | ' ')+ '}' ;

LETTER : ('a'..'z'|'A'..'Z')+;
DIGIT : [0-9];

WS : [\t\n\r]+ -> skip ;                    // skip spaces, tabs, newlines

