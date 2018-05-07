/**
 * Define a grammar called Emmet
 */
grammar Emmet;

//options{
//language=Java;
//}
//
//@lexer::header{
//package myCompiler;
//}
//
//@lexer::members{
//}

s  : tag_list;                                 /**rimossa non nullità**/   // Lista di tag

tag_list : (tag mult? (TAG_LINKER tag_list)?)?;  /**rimossa non nullità**/

mult : '*' DIGIT+;

tag : TAG attr_list?;

attr_list : ((SYMBOL FREE_TEXT |  custom  | '{' FREE_TEXT '}' ) attr_list? ) ;

custom : '[' ATTRIBUTE '=' FREE_TEXT ']'; // Attributo custom

TAG : 'head' | 'body' | 'p' | 'h' | 'ol' | 'ul' | 'b' | 'i' | 'li' | 'a' | 'div' | 'tit' | 'm';
SYMBOL : '.' | '#' | '$';                   // Simboli che aggiungono attributo al tag
TAG_LINKER : '>' | '+';                     // Simboli che connettono due tag

FREE_TEXT : (LETTER | DIGIT)+;
ATTRIBUTE : LETTER (LETTER | DIGIT)*;

LETTER : ('a'..'z'|'A'..'Z')+;              /**rimossa non nullità, ci deve essere almeno una lettera**/
DIGIT : [0-9];

WS : [\t\r\n]+ -> skip ;                    // skip spaces, tabs, newlines

