grammar jfkgrammar;
/*
TODO check space grammar and space skipping
*/

//PARSER RULES
full_line: command_push ' ' operation | command_int0x80 | command_mov ' ' operation ', ' REGISTER | command_xor ' ' operation ', ' REGISTER;
command_push: PUSH;
command_int0x80: INT;
command_xor: XOR;
command_mov: MOV;
sipmle_operation: WHITE_SPACE? REGISTER WHITE_SPACE? | WHITE_SPACE? NUMBER WHITE_SPACE?;
operation: term | operation ('+' | '-') term;
factor: sipmle_operation | '(' operation ')';
term: factor | term ( '*' | '/' ) factor;


//LEXER RULES
INT:'int 0x80';
PUSH:'push';
MOV:'mov';
XOR:'xor';
NUMBER:[0-9]+;
REGISTER: ('%eax' | '%ebx' | '%ecx' | '%edx');
WHITE_SPACE: ' ';
IDENTIFIER : [a-zA-Z0-9]+;