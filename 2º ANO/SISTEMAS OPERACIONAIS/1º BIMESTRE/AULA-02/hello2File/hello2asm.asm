.intel_syntax noprefix
.section .data
	arquivo: .ascii "saida.txt\0"
	m: .ascii "Hello2 from Natan!\n"
	m_l = .-m

.section .text
.global _start

_start:
	mov rax,2
	lea rdi,[rip+arquivo]
	mov rsi, 0101
	mov rdx, 0664
	syscall
	
	#escrever
	mov r10, rax
	mov rax, 1
	mov rdi, r10
	lea rsi, [rip +m]
	mov rdx, m_l
	syscall
	
	#fechar
	mov rax, 3
	mov rdi, r10
	syscall

	#sair
	mov rax, 60
	mov rdi, 0
	syscall
