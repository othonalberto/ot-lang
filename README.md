# OT Lang

Disciplina: Compiladores

Aluno: Othon Alberto da Silva Briganó

Professor: Clayton Kossoski

---

*ESTE É UM PROJETO DESENVOLVIDO PARA UMA DISCIPLINA. AINDA CONTÉM MUITOS PONTOS A MELHORAR*.


Linguagem simples para aprendizado de Compiladores. Características:

* Não tipada;
* Apenas um loop;
* if-else;
* Internamente, lida apenas com números de ponto-flutuante. Porém, não há a necessidade de declarar um número inteiro com casa decimal;
* Compila para Python3.

## Declaração e atribuição de variável

	var x;
	x = 10;
	
	var y = 5;

	
## For loop
	
	i loop 1 10 2
	
* i: variável indexadora;
* loop: palavra reservada que mostra para a linguagem que isso é um loop;
* 1: valor inicial da variável indexadora;
* 10: valor final da variável indexadora;
* 2: "salto" da varíavel indexadora.


## If-else

If-else igual linguagem C.

	if (x == 2) {
		...
	} else {
		...
	}
	
## Print

	var x;
	x = 5;
	
	print x;
	
## Comparações

As seguintes expressões são válidas:
	
* x == y 
	
* x != y 
		
* x and y ( equivalente, em C, a x && y ) 
		
* x or y (equivalemente, em C, a x || y)
		
* x > y 
	
* x < y 
	
* x >= y 
	
* x <= y

Porém, apenas uma comparação por if é válida. Por exemplo, `` if ( (x > y) and (x > 5) )`` ainda não é suportado.

Obrigatoriamente, o lado esquerdo da comparação é uma variável.
