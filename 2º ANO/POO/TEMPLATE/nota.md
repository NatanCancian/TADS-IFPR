# SETUP 
## npm init -y
## npm i -D typescript tsx(ts-node) @types/node
## npx tsc --init

# PARA COMPILAR 
## npx tsc arquivo

# PARA IGNORAR O TSCONFIG.JSON NA COMPILAÇÃO
## npx tsc --ignoreConfig

# PARA RODAR ISOLADAMENTE
## npx ts-node(tsx) src/pasta/arquivo

# PARA RODAR O PROJETO INTEIRO
## npm run dev(atalho configurado)

# PARA CÓDIGOS SYNC 
## tsx watch src/index.ts

# PARA CÓDIGOS ASYNC
## tsx src/index.ts

# PARA COMPILAR O PROJETO INTEIRO(GERAR OS .js)
## tsc (npm run build)

# PARA RODAR O ARQUIVO DIRETAMENTE SEM USAR O tsc
## npx tsx src/pasta/arquivo

# PARA RODAR O PROJETO INTEIRO TAMBÉM
## node dist/index.js
