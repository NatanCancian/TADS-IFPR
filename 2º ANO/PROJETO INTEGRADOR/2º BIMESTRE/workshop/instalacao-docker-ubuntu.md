🚀 Instalação do Docker no Ubuntu

Siga estes passos para instalar a versão oficial do Docker (Engine) no Ubuntu.

1. Remover versões conflitantes

Garanta que não existam versões antigas instaladas:

bash

```
for pkg in docker.io docker-doc docker-compose docker-compose-v2 podman-docker containerd runc; do sudo apt-get remove $pkg; done
```

Use o código com cuidado.

2. Configurar o Repositório Oficial

Instale os certificados e adicione a chave GPG de segurança:

bash

```
# Atualiza os índices e instala pacotes auxiliares
sudo apt-get updatesudo apt-get install ca-certificates curl gnupg

# Adiciona a chave oficial do Docker
sudo install -m 0755 -d /etc/apt/keyringssudo curl -fsSL https://docker.com -o /etc/apt/keyrings/docker.ascsudo chmod a+r /etc/apt/keyrings/docker.asc

# Adiciona o repositório às fontes do APT
echo \  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://docker.com \  $(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

Use o código com cuidado.

3. Instalar o Docker e Docker Compose

bash

```
sudo apt-get updatesudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin
```

Use o código com cuidado.

4. Habilitar uso sem SUDO

Para rodar comandos `docker` sem precisar de permissão de administrador toda vez:

bash

```
sudo usermod -aG docker $USER
```

Use o código com cuidado.

> **Atenção:** Você deve **reiniciar sua sessão** (logout/login) para que esta mudança tenha efeito.

5. Validar a Instalação

bash

```
docker run hello-world
```
