# 

| ![][image1] | DOCUMENTO DE REQUISITOS DE PROJETO INTEGRADOR 2026 Baseado em Proposta de TCC |
| :---- | :---: |

|  |  |
| ----- | :---- |
|  |  |
|  |  |
|  |  |

**Documento de Requisitos**  
**GESCONP \- Sistema Inteligente de Gestão de Contratos Públicos**  
					

  **Cascavel, 2026**					  
**1\. Introdução**  
A administração pública enfrenta desafios críticos na gestão de contratos, como o controle de prazos, a organização documental e a transparência. Em conformidade com a **Lei nº 14.133/2021**, a eficiência na aplicação de recursos exige mecanismos tecnológicos que substituam processos manuais e fragmentados, evitando a perda de prazos de renovação e a falta de fiscalização adequada. Este projeto propõe uma solução digital para centralizar informações e automatizar o acompanhamento contratual.

## **2\. Objetivo do Documento**

O objetivo deste documento é descrever de forma detalhada os requisitos funcionais e não funcionais que compõem o sistema, servindo como guia para o desenvolvimento, testes e validação da solução proposta. Ele estabelece o que o sistema deve fazer (funcionalidades) e como deve se comportar (qualidades e restrições).

## **3\. Público-alvo**

Este documento destina-se aos seguintes perfis:

* **Membros da Equipe de Desenvolvimento:** Para orientação técnica durante a implementação do backend e frontend.  
* **Orientadores e Avaliadores Acadêmicos:** Para verificação da viabilidade e conformidade do projeto integrador.  
* **Usuários Finais (Gestores e Fiscais Públicos):** Para compreensão das capacidades operacionais da ferramenta.

## **4\. Justificativa**

A modernização da gestão pública é essencial para garantir a legalidade e a economicidade dos atos administrativos. Segundo o Tribunal de Contas da União (TCU, 2020), o uso de sistemas informatizados reduz drasticamente os riscos de má gestão e aprimora a governança. A aplicação proposta justifica-se pela necessidade de oferecer uma interface intuitiva que assegure a integridade dos dados e facilite o cumprimento das exigências legais de transparência e fiscalização.

## **5\. Objetivos**

### **5.1 Objetivo Geral**

Desenvolver um sistema de gestão de contratos públicos acessível, escalável e auditável, capaz de otimizar processos administrativos por meio de uma arquitetura moderna e segura.

### **5.2 Objetivos Específicos**

* Implementar uma **arquitetura API RESTful** utilizando **Spring Boot** e **PostgreSQL** para alta confiabilidade.  
* Criar um módulo de **Inteligência de Análise de Risco** que classifique os contratos em níveis (baixo, médio, alto) em tempo real.  
* Garantir a **segregação de funções** por meio de controle de acesso baseado em perfis (RBAC).  
* Integrar o sistema à **API Eloweb** para sincronização automática de dados externos.

## **6\. Escopo do Projeto**

O sistema contemplará as seguintes macrofuncionalidades:

* **Gestão de Contratos:** Cadastro, listagem, atualização, inativação e filtros avançados.  
* **Controle Financeiro:** Registro de notas de empenho, aditivos e atualização automática de saldo contratual.  
* **Fiscalização e Qualidade:** Registro de ocorrências, avaliações qualitativas e checklists de conformidade legal.  
* **Segurança:** Autenticação via **JWT** e histórico completo de logs para auditoria.  
* **Inteligência e Alertas:** Dashboards de indicadores e notificações automáticas de vencimento e esgotamento de saldo.  
* **Conformidade:** Geração de logs compatíveis com o padrão do **Portal Nacional de Contratações Públicas (PNCP)**.

## **7\. Escopo Não Contemplado**

Para garantir a viabilidade da entrega dentro do cronograma letivo de 2026, os seguintes itens **não** fazem parte do escopo inicial deste projeto:

* **Importação Automática de Arquivos:** O sistema não realizará a leitura/extração de dados via OCR ou processamento de arquivos PDF/CSV para cadastro automático.  
* **Pagamento Direto:** O sistema não executará transações financeiras (pagamentos bancários), limitando-se ao registro e controle de saldos.  
* **Envio Automático ao PNCP:** O sistema não realizará a transmissão direta de dados para os servidores do governo federal, focando apenas na preparação e exportação de dados compatíveis.  
* **Módulo de Licitações:** O foco do projeto é estritamente na fase de *gestão contratual*, não abrangendo as etapas anteriores de certame licitatório.

Este planejamento assegura que a equipe foque nos requisitos classificados como **essenciais** e **importantes**, garantindo uma entrega funcional e inovadora em novembro de 2026\.

**REQUISITOS FUNCIONAIS**

Os requisitos funcionais descrevem as funcionalidades que o sistema deverá oferecer para atender às necessidades da gestão de contratos públicos.

## **RF01 – Cadastro de contratos**

O sistema deverá permitir o cadastro de contratos públicos contendo informações como número do contrato, objeto, empresa contratada, valor, vigência e situação.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF02 – Listagem de contratos**

O sistema deverá exibir uma lista de contratos cadastrados, permitindo visualização organizada e paginada dos registros.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF03 – Consulta e filtros**

O sistema deverá permitir a filtragem de contratos por ano, situação, empresa contratada e tipo de contrato.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## 

## 

## 

## **RF04 – Visualização de detalhes**

O sistema deverá permitir a visualização detalhada de cada contrato, incluindo todos os seus dados associados.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF05 – Atualização de contratos**

O sistema deverá permitir a atualização de informações de contratos já cadastrados.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF06 – Inativação de contratos**

O sistema deverá permitir a inativação ou cancelamento de contratos, mantendo o registro histórico para fins de auditoria, mediante permissão de usuário autorizado.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## **RF07 – Integração e Sincronização de Dados Externos**

O sistema deverá consumir dados da API do portal de transparência (Eloweb), permitindo a importação e a sincronização automática entre os dados externos e o banco de dados interno.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF08 – Autenticação e Gestão de Perfis (RBAC)**

O sistema deverá permitir a autenticação de usuários e a gestão de perfis de acesso (Role-Based Access Control), permitindo que o administrador atribua papéis específicos (ex: Gestor, Fiscal, Auditor) com permissões distintas.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## 

## **RF09 – Dashboard de indicadores**

O sistema deverá apresentar um painel com indicadores como contratos ativos, vencidos e valores totais.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## **RF10 – Módulo de Gestão Documental**

O sistema deverá permitir o cadastro, a vinculação e a consulta de documentos relacionados aos contratos (atas, empenhos, aditivos), mantendo o histórico organizado e rastreável em um repositório centralizado.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## 

## 

## 

## **RF11 – Controle de saldo e execução financeira**

O sistema deverá permitir o controle do saldo financeiro do contrato, atualizando automaticamente os valores conforme o registro de novos empenhos, aditivos ou execuções, indicando valores empenhados, executados e saldo restante.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## 

## **RF12 – Registro de empenhos**

O sistema deverá permitir o cadastro de notas de empenho vinculadas ao contrato, impactando diretamente no saldo disponível.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF13 – Registro de aditivos contratuais**

O sistema deverá permitir o registro de termos aditivos que alterem valor, prazo ou escopo do contrato, incluindo o upload do documento digital e refletindo automaticamente nas informações contratuais e cronogramas.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## 

## 

## 

## **RF14 – Histórico de movimentações e Log de Auditoria**

O sistema deverá manter um histórico completo de todas as alterações financeiras e documentais, registrando quem realizou a ação, o que foi alterado e o carimbo de data/hora (timestamp).

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## **RF15 – Alertas de saldo e vigência**

O sistema deverá gerar alertas automáticos quando o saldo do contrato estiver próximo do esgotamento ou quando o prazo de vigência estiver próximo do vencimento (considerando a antecedência legal para prorrogações).

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## **RF16 – Registro e Avaliação de Fiscalização**

O sistema deverá permitir o registro de fiscalizações e ocorrências, incluindo avaliações qualitativas sobre a execução (qualidade, prazos, conformidade) e checklists de conformidade legal.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## 

## 

## **RF17 – Indicadores de desempenho do contrato**

O sistema deverá calcular e apresentar indicadores de desempenho contratual com base em critérios como atrasos, execução financeira e avaliações de fiscalização.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## **RF18 – Relatórios de acompanhamento**

O sistema deverá gerar relatórios consolidados de execução contratual, incluindo aspectos financeiros e qualitativos.

**Prioridade:**    

| Essencial | Importante | ~~Desejável~~ |
| :---- | :---- | :---- |

## **RF19 – Inteligência de Análise de Risco Contratual**

O sistema deverá calcular, classificar (baixo, médio, alto) e exibir em tempo real um índice de risco para cada contrato, recalculando automaticamente o score sempre que houver atualização de dados financeiros ou de fiscalização.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RF20 – Geração de alertas baseados em risco**

O sistema deverá gerar alertas automáticos quando um contrato atingir nível elevado de risco.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## **RF21 – Integração com o PNCP**

## O sistema deverá prever a capacidade de exportar dados ou gerar logs compatíveis com o padrão do Portal Nacional de Contratações Públicas (PNCP), conforme exigido pela Lei 14.133/2021.

**Prioridade:**   

| Essencial | Importante | ~~Desejável~~ |
| :---- | :---- | :---- |

# **REQUISITOS NÃO FUNCIONAIS**

Os requisitos não funcionais definem as restrições e qualidades do sistema.

## **RNF01 – Desempenho**

O sistema deverá responder às requisições em tempo adequado, garantindo carregamento eficiente mesmo com grande volume de dados.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## **RNF02 – Segurança e Autenticação (JWT)**

O sistema deverá garantir segurança no acesso através do padrão JSON Web Token (JWT) para sessões seguras e sem estado, além de criptografia (ex: BCrypt) para senhas e dados sensíveis.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## 

## 

## **RNF03 – Usabilidade**

A interface deverá ser intuitiva e de fácil utilização, permitindo que usuários com diferentes níveis de conhecimento consigam operar o sistema.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## **RNF04 – Escalabilidade**

O sistema deverá ser capaz de suportar aumento de volume de dados e usuários sem perda significativa de desempenho.

**Prioridade:**    

| Essencial | Importante | ~~Desejável~~ |
| :---- | :---- | :---- |

## **RNF05 – Manutenibilidade**

O sistema deverá ser desenvolvido de forma modular, facilitando a manutenção e futuras melhorias.

**Prioridade:**    

| Essencial | Importante | ~~Desejável~~ |
| :---- | :---- | :---- |

## **RNF06 – Compatibilidade**

O sistema deverá ser compatível com os principais navegadores web modernos.

**Prioridade:**    

| Essencial | Importante | ~~Desejável~~ |
| :---- | :---- | :---- |

## 

## **RNF07 – Confiabilidade e Integridade**

O sistema deverá garantir a integridade dos dados e a consistência entre valores de empenhos, aditivos e saldo contratual, evitando inconsistências entre a API externa e o banco de dados interno.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RNF08 – Disponibilidade**

O sistema deverá estar disponível para acesso sempre que necessário, salvo períodos de manutenção programada.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RNF09 – Rastreabilidade e Auditabilidade**

Todas as ações de fiscalização, alterações financeiras e documentais deverão ser registradas, permitindo auditoria completa e rastreabilidade dos fatores utilizados nos cálculos de risco.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## 

## **RNF10 – Segurança Documental e LGPD**

Os documentos deverão ter controle de acesso restrito e o tratamento de dados (como CPFs de fiscais) deve estar em conformidade com a Lei Geral de Proteção de Dados (LGPD).

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

## **RNF11 – Confiabilidade dos Indicadores e Cálculos**

O sistema deverá garantir que os indicadores de desempenho e o índice de risco sejam calculados de forma consistente, baseada em regras determinísticas e atualizados em tempo quase real.

**Prioridade:**    

| ~~Essencial~~ | Importante | Desejável |
| :---- | :---- | :---- |

## **RNF12 – Transparência das informações**

O sistema deverá permitir a visualização clara e estruturada das informações de execução contratual para fins de controle e análise.

**Prioridade:**    

| Essencial | ~~Importante~~ | Desejável |
| :---- | :---- | :---- |

[image1]: <data:image/png;base64,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>