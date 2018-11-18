grammar minijava;

program
    : mainClass classDeclList
    ;

mainClass
    : CLASS identifier OPENING_BRACES PUBLIC STATIC VOID MAIN OPENING_PARENTHESIS STRING OPENING_BRACKETS CLOSING_BRACKETS identifier CLOSING_PARENTHESIS statement CLOSING_BRACES
    ;

classDeclList
    : classDecl*
    ;

classDecl
    : (classDeclSimple | classDeclExtends)
    ;

classDeclSimple
    : CLASS identifier OPENING_BRACES varDeclList methodDeclList CLOSING_BRACES
    ;

classDeclExtends
    : CLASS identifier EXTENDS identifier OPENING_BRACES varDeclList methodDeclList CLOSING_BRACES
    ;

methodDeclList
    : (methodDecl)*
    ;

methodDecl
    : PUBLIC type SEP+ identifier OPENING_PARENTHESIS formalList CLOSING_PARENTHESIS OPENING_BRACES varDeclList statementList RETURN exp SEMICOLON CLOSING_BRACES
    ;

varDeclList
    : (varDecl)*
    ;

varDecl
    : type SEP* identifier SEP* SEMICOLON
    ;

formalList
    : (formal (COLON formal)*)?
    ;

formal
    : type SEP+ identifier
    ;

intArrayType
    : integerType OPENING_BRACKETS CLOSING_BRACKETS
    ;

booleanType
    : BOOLEAN
    ;

integerType
    : INT
    ;

identifierType
    : LETTER | ALPHANUMERIC
    ;

identifier
    : LETTER | ALPHANUMERIC
    ;

type
    : integerType | booleanType | intArrayType | identifierType
    ;

statementList
    : (SEP* statement SEP*)*
    ;

statement
    : block
    | print
    | assign
    | arrayAssign
    | if_stm
    | while_stm
    ;

exp
    : and
    | lessThan
    | plus
    | minus
    | times
    | arrayLookup
    | arrayLength
    | call
    | integerLiteral
    | true_stm
    | false_stm
    | not
    | this_stm
    | newArray
    | newObject
    | identifierExp
    ;

block
    : OPENING_BRACES statementList CLOSING_BRACES
    ;

if_stm
    : IF OPENING_PARENTHESIS exp CLOSING_PARENTHESIS statement ELSE statement
    ;

while_stm
    : WHILE OPENING_PARENTHESIS exp CLOSING_PARENTHESIS statement
    ;

print
    : PRINT_STATEMENT OPENING_PARENTHESIS exp CLOSING_PARENTHESIS SEMICOLON
    ;

assign
    : identifier EQUALS exp SEMICOLON
    ;

arrayAssign
    : identifier OPENING_BRACKETS exp CLOSING_BRACKETS EQUALS exp SEMICOLON
    ;

and
    : OPENING_PARENTHESIS exp AND exp CLOSING_PARENTHESIS
    ;

lessThan
    : OPENING_PARENTHESIS exp LESSTHAN exp CLOSING_PARENTHESIS
    ;

plus
    : OPENING_PARENTHESIS exp PLUS exp CLOSING_PARENTHESIS
    ;

minus
    : OPENING_PARENTHESIS exp MINUS exp CLOSING_PARENTHESIS
    ;

times
    : OPENING_PARENTHESIS exp TIMES exp CLOSING_PARENTHESIS
    ;

arrayLookup
    : SEP+ exp OPENING_BRACKETS exp CLOSING_BRACKETS
    ;

arrayLength
    : SEP+ exp DOT LENGTH
    ;

call
    : OPENING_PARENTHESIS exp DOT identifier OPENING_PARENTHESIS expList CLOSING_PARENTHESIS CLOSING_PARENTHESIS
    ;

expList
    : (exp (COLON exp)*)*
    ;

integerLiteral
    : NUMBER+
    ;

true_stm
    : TRUE
    ;

false_stm
    : FALSE
    ;

this_stm
    : THIS
    ;

newArray
    : NEW SEP+ integerType OPENING_BRACKETS exp CLOSING_BRACKETS
    ;

newObject
    : NEW SEP+ identifier OPENING_PARENTHESIS CLOSING_PARENTHESIS
    ;

identifierExp
    : LETTER | ALPHANUMERIC
    ;

not
    : NOT exp
    ;

CLASS
    : SEP* 'class' SEP+
    ;

EXTENDS
    : SEP+ 'extends' SEP+
    ;

PUBLIC
    : 'public' SEP+
    ;

STATIC
    : 'static' SEP+
    ;

VOID
    : 'Void' SEP+
    ;

MAIN
    : 'main'
    ;

STRING
    : 'String'
    ;

RETURN
    : 'return' SEP+
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

WHILE
    : 'while'
    ;

LENGTH
    : 'length'
    ;

NEW
    : 'new'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

THIS
    : 'this'
    ;

BOOLEAN
    : 'boolean'
    ;

INT
    : 'int'
    ;

PRINT_STATEMENT
    : 'System' DOT 'out' DOT 'println'
    ;

AND
    : SEP* '&&' SEP*
    ;

NOT
    : SEP* '!' SEP*
    ;

OPENING_BRACES
    : SEP* '{' SEP*
    ;

CLOSING_BRACES
    : SEP* '}' SEP*
    ;

OPENING_PARENTHESIS
    : SEP* '(' SEP*
    ;

CLOSING_PARENTHESIS
    : SEP* ')' SEP*
    ;

OPENING_BRACKETS
    : SEP* '[' SEP*
    ;

CLOSING_BRACKETS
    : SEP* ']' SEP*
    ;

SEMICOLON
    : SEP* ';' SEP*
    ;

COLON
    : SEP* ',' SEP*
    ;

EQUALS
    : SEP* '=' SEP*
    ;

LESSTHAN
    : SEP* '<' SEP*
    ;

PLUS
    : SEP* '+' SEP*
    ;

MINUS
    : SEP* '-' SEP*
    ;

TIMES
    : SEP* '*' SEP*
    ;

DOT
    : SEP* '.' SEP*
    ;

SEP//ARATION
    : (NEWLINE | SPACE)
    ;

SPACE
    : ' '
    ;

NEWLINE
    : '\r' '\n'
    | '\n'
    | '\r'
    ;

LETTER
   : ('a' .. 'z') | ('A' .. 'Z')
   ;

ALPHANUMERIC
    : LETTER (LETTER | DIGIT)*
    ;

NUMBER
    : '0' | ('1' .. '9') DIGIT*
    ;

DIGIT
    : ('0' .. '9')
    ;