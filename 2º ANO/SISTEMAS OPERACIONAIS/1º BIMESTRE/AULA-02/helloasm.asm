.intel_syntax noprefix
.section .data
	msg: .ascii "Hello Natan\n"
	msg_l = .-msg 
	# . no assembly quer dizer o endereço aqui, onde está sendo executado
	
.section .text
.global _start

_start: 
	mov rax, 1 
	# instrução de escrita
	mov rdi, 1
	# instrução de endereço ponteiro 
	lea rsi, [rip+msg]
	# vai calcular a distância do endereço do ponteiro da instrução(rip) até o endereço do msg  
	mov rdx, msg_l
	syscall
	# pc -> rp
	# rdi, rsi, rdx
	# 1 é a saída, o outro o ponteiro com o endereço e o 3o é o tanto de bits que vai imprimir
	
	mov rax, 60
	# codigo de saida do exit 
	mov rdi, 07
	syscall
	
