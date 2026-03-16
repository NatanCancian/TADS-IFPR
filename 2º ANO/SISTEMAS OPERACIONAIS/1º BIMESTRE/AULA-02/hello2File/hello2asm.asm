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
	
	mov r10, rax
	mov rdi, 1
	lea rsi, [rip +m]
	mov rdx, m_l
	syscall
	
	mov rsi, r10
	mov rdi, 60
	mov rdi, 0
	syscall
