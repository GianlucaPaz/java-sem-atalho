# Java Sem Atalho — Plano de 16 Semanas

**Período:** 27/07/2026 a 27/11/2026 · **Revisões obrigatórias:** fim de cada fase

> **16 semanas de plano em 18 semanas corridas.** As duas semanas de 31/08 a 13/09 foram consumidas por processo seletivo e pausa. Elas aconteceram e não somem do calendário. O plano conta 16 semanas de trabalho; o calendário conta 18.

---

## 1. A regra que faz o plano funcionar

Tudo aqui depende de uma única regra. Seguir o cronograma e ignorar a regra produz o resultado idêntico aos últimos 4 anos: aprovação sem competência.

> ### 🔒 Regra do Arquivo em Branco
> Escrever código a partir de um arquivo vazio, **com IA fechada**, todo dia útil, pelo tempo mínimo da fase.
>
> **Fechada** significa: sem Claude, sem Copilot, sem ChatGPT, sem autocomplete de IA na IDE, sem Stack Overflow.
> **Permitido:** documentação oficial (Oracle Java Docs, Spring Docs) e livro ou apostila.

### O piso é inegociável

| Fase | Piso diário de arquivo em branco |
|---|---|
| 1 — Fluência | 90 min |
| 2 — Construir | 60 min |
| 3 — Empregabilidade | 60 min |

O piso **não é substituível** por reconstrução, por projeto próprio, por aula, nem por leitura de documentação. Esses são outros blocos, com outra função.

### Os blocos condicionais

A **reconstrução** só existe se houve aula naquele dia. Sem aula para reconstruir, o tempo dela vai para o arquivo em branco ou para o projeto próprio — nunca vira folga.

O **projeto próprio** (a partir da Fase 2) é código sem IA, mas com problema conhecido e arquitetura já decidida. Não substitui o arquivo em branco pelo mesmo motivo que a reconstrução não substitui.

### Por que a separação importa

Reconstrução e arquivo em branco são exercícios diferentes. Na reconstrução você viu a resposta dez minutos antes e está reproduzindo uma forma conhecida. No arquivo em branco você não sabe a forma da resposta — e é exatamente aí que o diagnóstico da Fase 0 localizou a lacuna: decomposição, não sintaxe.

Deixar um bloco substituir o outro empurra a prática para o lado fácil. Isso já aconteceu, está medido, e a seção 3 explica como.

### O que é medido

Duas colunas separadas, todo dia:

| Coluna | Função |
|---|---|
| `min. arquivo em branco` | calcula o % da Regra. É o critério. |
| `min. código sem IA (total)` | soma dos blocos de código. É contexto. |

Nunca se comparam entre si e nunca se somam para efeito de critério. Um dia de 180 min de aula e áudio aparece como o que é: dia produtivo, dia sem prática.

**Piso de execução:** abaixo de 70% de dias úteis com a Regra cumprida, o problema não é o plano — é execução, e nenhum ajuste de plano resolve isso.

---

## 2. Como a IA volta a entrar (porque ela deve voltar)

Não se trata de abandonar IA — o mercado quer devs que a usem bem. Trata-se de **inverter a ordem**.

| ❌ O padrão antigo | ✅ O padrão novo |
|---|---|
| IA escreve → você lê e aceita | Você escreve → IA revisa e critica |
| "Faz um CRUD pra mim" | "Aqui está meu CRUD. Aponte 5 problemas e me explique por quê." |
| Pergunta a resposta | Pergunta o conceito, depois aplica sozinho |

**Regra prática:** a IA só é aberta depois que existe uma versão *sua* funcionando. Nunca antes. E a refatoração é feita por você, com base na crítica — não colando o código sugerido.

Em 2026 "como você usa IA no seu trabalho?" **é perguntado em entrevista**. A resposta boa é sobre revisão e critério. Esta seção é a sua resposta.

---

## 3. O que a Fase 1 ensinou sobre medir

A planilha da Fase 1 somava todos os minutos marcados "sem IA" e comparava contra o limiar de **um bloco só**. Resultado: dias sem nenhum minuto de arquivo em branco contavam como cumpridos, e um dia inteiro de aulas e gravação de áudio — zero linha de código — também.

Recontando a Fase 1 com réguas coerentes:

| Régua | Fase 1 |
|---|---|
| Regra do Arquivo em Branco (só o bloco, ≥ piso) | **68%** — 17 de 25 dias úteis |
| Código do zero sem IA (arquivo em branco + reconstrução, ≥90 min) | **84%** — 21 de 25 |
| O que a planilha reportava | 88% — errado |

**A diferença entre 84% e 68% são quatro dias** (03/08, 11/08, 25/08, 28/08) em que houve código de verdade, do zero, sem IA — só não no bloco difícil. Esse intervalo é a medida exata do padrão de risco: o tempo migra para o trabalho onde a forma da resposta já é conhecida.

É por isso que a seção 1 separa os blocos e mede os dois. O número não depende mais de qual bloco recebeu qual nome.

---

## 4. Tipos de dia e política de pausa

Doze semanas sem nenhum dia livre é o desenho clássico de quem abandona na semana 5. A pausa é parte do plano. O que a pausa não pode ser é válvula de escape.

| Tipo | Sai do denominador? | Teto |
|---|---|---|
| **útil** | não | — |
| **fim de semana** | não entra no cálculo | — |
| **feriado** | sim, automático | — |
| **processo seletivo** | sim | sem teto, exige registro do que foi feito |
| **pausa** (declarada, escolhida) | sim | **2 por fase** |
| **indisposição** (não escolhida) | sim | sem teto |

**Ao estourar o teto:** o terceiro dia de pausa da fase entra no denominador como dia não cumprido. Sem essa consequência o teto é decorativo.

**Três dias seguidos de indisposição** disparam uma revisão do plano, não mais exclusões. Se o corpo não está permitindo estudar por uma semana, o problema deixou de ser cronograma.

A distinção entre `pausa` e `indisposição` é proposital: uma é escolhida, a outra não. Só a escolhida tem teto.

**Fim de semana continua opcional e conta à parte.** Repor dia útil no sábado fecha o total e não constrói o hábito. É dívida, não crédito.

---

## 5. A semana de consolidação

Cada fase termina com uma semana extra, depois das quatro semanas de conteúdo. Ela serve para:

- fechar metas em aberto da fase
- sanar lacunas que apareceram no caminho
- **fazer o teste do portão** e responder às 4 perguntas da revisão

A rotina diária continua igual nessa semana — o piso da Regra não cai.

> ### A regra que saiu da Fase 1: **o teste vem antes da consolidação, não depois.**
>
> Na Fase 1 o áudio foi adiado por "minha explicação seria rasa" e as candidaturas por "ainda não estou pronto". Nas semanas 3 e 4 a produção caiu de 19 para 4 exercícios por semana sem queda de minutos — o tempo migrou para refatorar exercício já resolvido e escrever material de resumo.
>
> O mecanismo é sempre o mesmo: adiar o teste para consolidar mais um pouco. Na semana de consolidação, o teste do portão é feito **na segunda-feira**, não na sexta. O resto da semana corrige o que o teste apontou.

---

## 6. Calendário das 16 semanas

| Bloco | Período | Dias úteis | Marco |
|---|---|---|---|
| Semana 0 · Fase 0 | 27/07 – 02/08 | 5 | ✅ diagnóstico concluído |
| Semanas 1–4 · Fase 1 | 03/08 – 30/08 | 20 | ✅ |
| *Interrupção* | *31/08 – 13/09* | — | *processo seletivo + pausa* |
| Consolidação Fase 1 | 14/09 – 18/09 | 5 | ✅ portão aprovado em 18/09 |
| Semanas 5–8 · Fase 2 | 21/09 – 18/10 | 19 | feriado 12/10 |
| Consolidação Fase 2 | 19/10 – 25/10 | 5 | **revisão fecha 23/10** |
| Semanas 9–12 · Fase 3 | 26/10 – 22/11 | 18 | feriados 02/11 e 20/11 |
| Consolidação Fase 3 | 23/11 – 29/11 | 5 | **revisão fecha 27/11** |

**Feriados em dia útil no período restante:** 12/10 (segunda, N. Sra. Aparecida), 02/11 (segunda, Finados), 20/11 (sexta, Consciência Negra). 15/11 cai num domingo este ano.

Fase 2 tem **24 dias úteis**. Fase 3 tem **23**.

---

## 7. Fase 0 — Diagnóstico ✅

**27/07 a 02/08 · concluída**

O diagnóstico foi fatiado em 6 tarefas, sem IA e sem prazo, para localizar onde a execução parava:

| # | Tarefa |
|---|---|
| 1 | Imprimir `Olá` na tela |
| 2 | Ler 5 números e imprimir a soma |
| 3 | Classe `Item` com `nome`, `categoria`, `valor`, construtor e getters |
| 4 | `List<Item>` com 5 itens, imprimir todos |
| 5 | Somar o `valor` de uma categoria fixa percorrendo a lista |
| 6 | Trocar a categoria fixa por `HashMap<String, Double>` acumulando todas |

**Resultado: travou nas tarefas 5 e 6.** A lacuna é **decomposição de problema**, não sintaxe e não ausência de conceito. As peças eram conhecidas; a montagem não. É a mais rápida de corrigir das três lacunas possíveis, e se corrige com volume de exercícios pequenos.

Também nesta fase: JDK 21 + IntelliJ instalados, contas Beecrowd e Exercism criadas, currículo e LinkedIn atualizados, assinaturas concorrentes canceladas.

---

## 8. Fase 1 — Fluência ✅

**03/08 a 18/09 (incluindo a interrupção e a consolidação) · concluída**

**Objetivo:** escrever código simples de cabeça, sem travar no arquivo vazio.

### Rotina que vigorou

| Bloco | Duração |
|---|---|
| 🔒 Arquivo em branco | 90 min |
| Curso — Javanauta, Lógica e POO | 90 min |
| 🔒 Reconstrução | 60 min |
| RecycleApp — arguição | 45 min |
| Candidaturas | 20 min |

### Resultado contra as metas

| Meta | Alvo | Real | |
|---|---|---|---|
| Exercícios resolvidos sem IA | 60 | 53 | ❌ |
| Exercício CSV completo em < 2h, sem IA | 1 | **1h09** em 18/09 | ✅ |
| Áudio dos 3 conceitos gravado e ouvido | 1 | 15/09 | ✅ |
| Candidaturas trainee | 100% das janelas elegíveis | 2 em processo | ✅ |
| Regra do Arquivo em Branco | ≥ 70% | **68%** | ❌ |

### Portão

O critério de continuidade era **CSV em menos de 2h, sem IA, e áudio dos 3 conceitos gravado e ouvido**. Os dois foram cumpridos, com folga no primeiro. **Avanço aprovado em 18/09.**

A evidência objetiva do ganho está no teste cronometrado: em 14/09, tarefas 1 a 4 em 68 min e travamento de 22 min na tarefa 5. Em 18/09, as seis tarefas em 69 min.

Revisão completa em [`revisoes/fase-1.md`](revisoes/fase-1.md).

---

## 9. Fase 2 — Construir

**21/09 a 25/10 · 24 dias úteis**

**Objetivo:** uma API REST que você escreveu e entende.

### Rotina diária

| Horário | Bloco | Duração |
|---|---|---|
| 09:20 | Abertura — ler o "onde travei" de ontem | 10 min |
| 09:30 | 🔒 **Arquivo em branco** | **60 min** |
| 10:30 | Pausa, de pé, sem tela | 15 min |
| 10:45 | Curso — Web/REST, Spring Boot, Spring Data JPA, Bancos de Dados | 120 min |
| 12:45 | Almoço | 60 min |
| 13:45 | 🔒 Reconstrução | 45 min |
| 14:30 | 🔒 Projeto próprio | 90 min |
| 16:00 | Candidaturas | 20 min |
| 16:20 | Fechamento — diário, Sheets, commit e push | 15 min |

**195 min sem IA por dia.** Total de presença: ~7h.

### O projeto próprio (não o do curso)

Faça o projeto do curso **e depois** um seu, com domínio diferente. O do curso te ensina; o seu prova.

> **API de controle de leituras** — CRUD de livros, autores e progresso de leitura.
> - Spring Boot + Spring Data JPA + PostgreSQL
> - Validação de entrada, tratamento de erro com `@ControllerAdvice`
> - Documentação Swagger
> - README explicando *por que* cada decisão foi tomada

Escopo pequeno de propósito. Escreva a **primeira versão inteira sem IA**, mesmo feia e lenta. Só depois abra o Claude para revisão, e refatore você mesmo.

É neste projeto que SemVer e estratégia de branch passam a ter função — ali existe produto, endpoint e deploy. No repositório de exercícios não existem, e por isso não são adotados (ver `convencao-de-commits.md`, seção 7).

### Metas verificáveis

- [ ] API própria rodando localmente com pelo menos **4 endpoints**
- [ ] Explicar, sem consultar, o que faz `@RestController`, `@Service`, `@Repository`, `@Entity` e **por que são separados**
- [ ] Desenhar no papel o caminho de uma requisição HTTP até o banco e de volta
- [ ] **40 exercícios** resolvidos sem IA
- [ ] Regra do Arquivo em Branco ≥ 70% dos dias úteis
- [ ] **38 candidaturas júnior** (curva na seção 11) + 100% das janelas de trainee elegíveis

A meta de exercícios caiu de 60 para 40 porque o bloco de arquivo em branco encolheu de 90 para 60 min e o projeto próprio passou a consumir teclado. Passar de 40 é bônus, não expectativa.

### Portão de saída

Feito na **segunda-feira da semana de consolidação (19/10)**, não na sexta.

1. **Subir um recurso CRUD novo do zero, sem IA, em menos de 2h** — entidade, repository, service, controller e tratamento de erro. É o equivalente Fase 2 do exercício CSV.
2. **Gravar áudio** explicando o caminho de uma requisição, com exemplo do próprio código.

Falhando qualquer um dos dois, **a Fase 2 repete por 3 semanas em vez de avançar.** Avançar sem a base é como você chegou aqui.

---

## 10. Fase 3 — Empregabilidade

**26/10 a 29/11 · 23 dias úteis**

**Objetivo:** deixar de parecer estudante e passar a parecer candidato.

### Rotina diária

| Bloco | Duração |
|---|---|
| 🔒 Arquivo em branco | 60 min |
| Testes, Docker, deploy | 120 min |
| Projeto próprio / entrevistas simuladas | 90 min |
| Candidaturas | 40 min |

### Foco técnico

- **Testes unitários** (JUnit + Mockito) cobrindo a sua API. É o maior diferencial de júnior no Brasil e a maioria dos candidatos não tem.
- **Docker** — `Dockerfile` + `docker-compose` com a API e o Postgres
- **Deploy real** — Railway, Render ou Fly.io. Um link que abre vale mais que dez repositórios.
- **Git decente** — commits pequenos, branches, PRs no próprio repositório

### Foco de processo

- Candidaturas para **15 a 20 por semana**
- **2 entrevistas simuladas por semana** — peça ao Claude para arguir por voz ou texto, sem entregar respostas
- Ensaiar em voz alta: apresentação de 2 minutos, explicação do RecycleApp, explicação da API própria
- Preparar a resposta honesta para "como você usa IA no seu trabalho?" — a resposta boa é a seção 2 deste documento

### Metas verificáveis

- [ ] API com testes, dockerizada e no ar com URL pública
- [ ] GitHub com 2 projetos limpos e README bem escrito
- [ ] Pelo menos 3 entrevistas técnicas reais feitas (aprovado ou não)
- [ ] Regra do Arquivo em Branco ≥ 70% dos dias úteis

### Portão de saída

Feito na segunda-feira da consolidação (23/11): **a API no ar, com URL pública que abre, testes rodando e uma entrevista simulada completa gravada.**

---

## 11. Estratégia de candidatura

Duas trilhas que não se somam nem se compensam.

### Trilha trainee — por janela, não por cota

Quase todos os programas exigem formatura há no máximo 1 ou 2 anos. Colação em 02/2026 é o melhor momento possível, e a temporada brasileira concentra-se em agosto e setembro.

**Meta: 100% das janelas abertas e elegíveis.** Não há cota semanal — há prazo, e prazo perdido não tem segunda chance no ano. A conferência é toda segunda-feira, na aba `Trainee — Prazos`.

Em andamento:

| Programa | Etapa | Próximo marco |
|---|---|---|
| Itaú 2027 | prova realizada em 04/09 | retorno até 29/09 |
| Nestlé 2027 | trilha online concluída em 09/09 | aguardando próximas etapas |

### Trilha júnior — curva crescente

Candidatura em volume com competência baixa produz rejeição em volume, que desmotiva e não ensina. A curva sobe conforme a competência sobe.

| Semana | Candidaturas júnior |
|---|---|
| 5 | 4 |
| 6 | 6 |
| 7 | 8 |
| 8 | 10 |
| Consolidação | 10 |

**38 na Fase 2.** Na Fase 3 sobe para 15–20 por semana.

O teto real é o bloco de 20 min por dia: ~10 candidaturas bem escolhidas por semana. Passar disso significa candidatura mal escolhida.

### Onde procurar

LinkedIn · Gupy · Programathor · Coodesh · Trampos.co · Vagas.com · grupos de Discord e Telegram de dev no Rio

### Lacuna aberta

**Inglês** foi sinalizado como requisito em vários programas de trainee e ainda não tem plano de remediação. Precisa de decisão até o fim da Fase 2.

---

## 12. RecycleApp

Objetivo: **conseguir defender o projeto em entrevista.** Não é reescrever tudo.

1. **Mapa** — descrever a arquitetura: quais camadas existem, quem chama quem, onde o TensorFlow Lite entra no fluxo.
2. **Currículo derivado do próprio código** — listar todo conceito de Android/Kotlin necessário para ter escrito aquilo sem assistência, agrupado por tema e ordenado por frequência. A lista vira roteiro de estudo mobile.
3. **Arguição** — 10 perguntas de entrevista sobre o código, uma por vez, sem receber a resposta. Aqui se mede o buraco.
4. **Reconstrução parcial** — escolher **uma tela** e reescrever do zero com a IA fechada.

### O texto que precisa sair de cor, em ~60 segundos

> Que problema o app resolve, que decisões técnicas foram tomadas, o que eu faria diferente hoje e por quê.

Sobre uso de IA: **não minta.** "Usei IA extensivamente e depois voltei para entender o que tinha sido feito" é uma resposta madura e verdadeira. "Fiz tudo sozinho" desmorona na primeira pergunta de acompanhamento.

---

## 13. Horizonte honesto

| Cenário | Contratação |
|---|---|
| Otimista (trainee + sorte) | novembro/2026 a janeiro/2027 |
| **Realista** | **dezembro/2026 a março/2027** |
| Pessimista | maio a julho/2027 |

Referências: o mercado brasileiro registra queda de ~40% nas vagas júnior desde 2022 e tempo médio de 6 a 12 meses até a primeira vaga. O roadmap da Javanauta marca "a maioria consegue a primeira vaga" no sétimo mês.

O prazo original de 1 mês era autoimposto. Trocá-lo por 6 meses **com um método que funciona** é uma troca boa, não uma derrota. Um mês de esforço sem método produz zero; seis meses com método produzem um profissional.

---

## 14. Revisões obrigatórias

Ao fim de cada fase, parar um dia e responder por escrito, em `revisoes/fase-N.md`:

1. **Cumpri a Regra do Arquivo em Branco em quantos dos dias úteis?** (a coluna `min. arquivo em branco`, não o total)
2. **As metas verificáveis da fase foram atingidas? Quais não?**
3. **O que eu consigo fazer hoje que não conseguia no início da fase?** Resposta concreta, com exemplo de código ou problema. "Entendo melhor POO" não é resposta.
4. **Repito a fase ou avanço?**

| Revisão | Data |
|---|---|
| Fase 1 | ✅ 18/09/2026 |
| Fase 2 | 23/10/2026 |
| Fase 3 | 27/11/2026 |

Se a resposta de 1 for abaixo de 70%, o problema não é o plano — é execução, e nenhum ajuste de plano resolve isso.

---

## 15. Pendências herdadas da Fase 1

Itens que atravessaram e precisam fechar durante a Fase 2:

- [X] ~~3 aulas restantes do módulo de POO~~
- [X] ~~Beecrowd 1040~~
- [ ] As 5 perguntas de entrevista em aberto na seção 6 de `revisoes/fase-1.md`:
  - Por que se declara a variável como `List` e se cria como `ArrayList`?
  - Por que `double` não serve para valor monetário? (com exemplo concreto de cálculo que falha)
  - Por que `==` não compara texto em Java, e o que ele compara de fato?
  - Qual a diferença entre não ter setter e marcar o campo como `final`?
  - Como forçar ponto decimal na saída, independentemente do locale da máquina?
