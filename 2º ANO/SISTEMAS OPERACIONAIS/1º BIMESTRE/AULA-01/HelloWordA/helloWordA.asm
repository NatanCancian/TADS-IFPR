.intel_syntax noprefix

.section .data
	m: .ascii "Hello from Natan!\n"
	m_l = .-m
	
.section .text
.global _start

_start:
	mov rax, 1
	mov rdi, 1
	lea rsi, [rip +m]
	mov rdx, m_l
	syscall
	
	mov rax, 60
	mov rdi, 42
	syscall
