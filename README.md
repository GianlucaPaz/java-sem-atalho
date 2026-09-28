# Java Sem Atalho

![Status](https://img.shields.io/badge/Status-Em%20andamento-yellow)
![Fase](https://img.shields.io/badge/Fase%202-Construir-blue)
![Linguagem](https://img.shields.io/badge/Linguagem-Java-orange)
![Regra](https://img.shields.io/badge/IA-Fechada%20nos%20blocos%20de%20pr%C3%A1tica-red)

Registro de prática deliberada em Java, escrita do zero e sem assistência de IA, como preparação técnica para a primeira vaga de desenvolvedor.

O nome é o método: **sem atalho** é escrever o código antes de perguntar a resposta.

## 📌 O que é este repositório — e o que não é

**Não é um portfólio de projetos.** É um caderno de prática: exercícios, reconstruções de aula e um diário do que foi tentado, do que saiu e de onde travei.

Os projetos ficam em outro lugar:

- **RecycleApp** — aplicativo Android com TensorFlow Lite embarcado, desenvolvido como TCC em equipe
- **API da Fase 2** — repositório separado, criado no início da Fase 2, com SemVer, branches e deploy real

O núcleo do processo é uma regra só:

> ### 🔒 Regra do Arquivo em Branco
> Os blocos de prática são escritos a partir de um arquivo vazio, **com IA fechada** — sem Claude, sem Copilot, sem ChatGPT, sem autocomplete de IA na IDE, sem Stack Overflow.
> Permitido: documentação oficial (Oracle Java Docs, Spring Docs) e livro ou apostila.

Todo exercício registrado aqui foi **escrito** assim. Nem todos foram resolvidos — o `diario.md` registra a tentativa, não o sucesso, e é essa a informação que interessa.

O plano completo, com fases, metas e portões, está em [`plano.md`](plano.md).

## ⏱️ Os blocos por fase

| Fase | 🔒 Piso — arquivo em branco | Outros blocos sem IA | Total/dia |
|---|---|---|---|
| 0 | 90 min | período de adaptação ao cronograma | ~150 min |
| 1 | 90 min | reconstrução 60 min | 150 min |
| 2 | **60 min** | reconstrução 45 min + projeto próprio 90 min | 195 min |
| 3 | **60 min** | testes sem IA na semana 9 | ~150 min |

**O piso não é substituível.** Nem por reconstrução, nem por projeto próprio, nem por aula, nem por leitura de documentação. Esses são outros blocos, com outra função — a reconstrução refaz um exemplo cuja forma já é conhecida; o arquivo em branco encara um problema cuja forma ainda não é.

Quando não há aula para reconstruir, o tempo da reconstrução vai para o arquivo em branco ou para o projeto próprio. Nunca vira folga.

## 📏 Como o progresso é medido

Duas réguas, medidas em colunas separadas que nunca se somam:

| Régua | O que conta | Para que serve |
|---|---|---|
| **Regra do Arquivo em Branco** | dias em que o bloco de arquivo em branco atingiu o piso da fase | é o critério |
| **Código sem IA** | dias com o piso atingido somando todos os blocos de código | é contexto |

A distância entre as duas é o indicador que interessa: prática que aconteceu, mas fora do bloco difícil.

**Nota de método.** Até setembro de 2026 a planilha de acompanhamento somava os minutos dos dois blocos e comparava o total contra o limiar de um bloco só. Com isso, dias sem um único minuto de arquivo em branco contavam como cumpridos. O erro foi encontrado na virada da Fase 1 para a Fase 2 e a medição foi separada nas duas colunas acima; o percentual da Fase 1 caiu de 88% para 68%. O raciocínio completo está na nota metodológica de [`revisoes/revisao-fase-1.md`](revisoes/revisao-fase-1.md).

Piso de execução: **abaixo de 70% o problema não é o plano, é execução.**

## 📁 Estrutura

```
java-sem-atalho/
├── pratica/
│   └── src/
│       ├── beecrowd/                soluções por número de problema
│       ├── exercism/                exercícios da trilha Java
│       ├── javanauta/
│       │   ├── exercicios/          exercícios propostos pelo curso, resolvidos a mão
│       │   └── reconstrucao/        exemplo da aula refeito do zero, vídeo e IDE fechados
│       │       ├── logica/          módulo de Lógica de Programação
│       │       │   ├── condicionais/
│       │       │   ├── repetitivas/
│       │       │   └── sequenciais/
│       │       └── poo/             módulo de Programação Orientada a Objetos
│       │           ├── abstracao/
│       │           │   ├── interfaces/
│       │           │   └── superclasse/
│       │           ├── associacao/
│       │           │   ├── agregacao/
│       │           │   └── composicao/
│       │           ├── encapsulamento/
│       │           ├── heranca/
│       │           └── polimorfismo/
│       └── diagnostico/             tarefas dos diagnósticos de fase e seus enunciados
│           ├── fase0/
│           └── fase1/
├── revisoes/                        revisão obrigatória ao fim de cada fase
│   └── revisao-fase-1.md
├── .gitattributes
├── .gitignore
├── convencao-de-commits.md
├── diario.md                        registro diário: minutos por bloco, exercícios, onde travei
├── plano.md                         fonte da verdade do projeto
└── README.md
```

Cada pasta direta de `pratica/src/` é um **Sources Root** independente no IntelliJ, o que mantém os pacotes das quatro origens isolados entre si.

Dentro de `javanauta/`, a separação entre `exercicios/` e `reconstrucao/` é proposital: o primeiro guarda o que o curso pediu; o segundo guarda o que eu reescrevi do zero depois de fechar o vídeo. O segundo é o que mede fluência. Abaixo de `reconstrucao/`, a hierarquia espelha os módulos do curso, de modo que a pasta responde sozinha *de qual aula veio cada arquivo*.

Em `diagnostico/`, os enunciados ficam ao lado das tarefas de propósito: o enunciado é a especificação do código que está na pasta vizinha, e separá-los obrigaria a navegar entre dois lugares para fazer um exercício.

Nomes de package seguem a convenção Java: minúsculo puro, sem camelCase e sem underscore. Por isso `logica` e não `logicaDeProgramacao` — o nome legível já está no caminho completo.

## 📆 Como ler o `diario.md`

Cada dia de estudo segue o padrão:

```
### 📆 AAAA-MM-DD · 🏷️ <tipo do dia>
⌛ **Arquivo em branco:** X min · **Código sem IA (total):** Y min · 🔢 **Exercícios:** N

- 📝 <exercício> (<linguagem>) | 🧱 <bloco> | 📍 <caminho ou link> | 👀 Travei: <Sim (motivo) / Não> | <✅/☑️/✖️/❌> Resolvi sozinho: <Sim / A maioria / A minoria / Não>
```

**Tipo do dia:** `útil` · `pausa` · `indisposição` · `processo seletivo` · `feriado` · `fim de semana`. Feriado e fim de semana não ganham entrada; aparecem como lacuna entre datas. Pausa tem teto de 2 dias por fase — o terceiro volta para o denominador como dia não cumprido.

**Bloco:** `arquivo em branco` · `reconstrução` · `projeto próprio`. Diz de qual bloco o exercício saiu, o que torna as duas réguas recalculáveis a partir do diário sozinho. O campo vale a partir de **2026-09-22**; as entradas anteriores registravam os minutos por bloco no cabeçalho, mas não a origem de cada exercício.

Caminhos de arquivo são relativos à raiz do repositório. Quando a estrutura de pastas muda, as entradas antigas são atualizadas junto e a mudança fica registrada em **Decisões do repositório**, no topo do arquivo — o histórico de estudo continua navegável, e a decisão de reorganizar fica datada.

## 🔀 Como ler os commits

Convenção adotada em 30/07/2026, válida a partir do Dia 4. Commits anteriores seguem o formato antigo (`Dia N (DD/MM) | Exercícios: ...`) e não foram reescritos de propósito.

```
tipo(escopo): descricao no infinitivo
```

| Tipo | Significa |
|---|---|
| `feat` | capacidade nova — exercício resolvido pela primeira vez, reconstrução que passou a funcionar |
| `fix` | existia e estava errado |
| `refactor` | estrutura muda, comportamento não |
| `test` | testes (Fase 3, semana 9) |
| `docs` | `diario.md`, `plano.md`, `revisoes/`, `README.md` |
| `chore` | config, pasta, arquivo movido |

Escopos: `beecrowd` · `exercism` · `javanauta` · `diagnostico` · `diario` · `plano` · `revisao` · sem escopo para a raiz.

O escopo acompanha a **origem** do conteúdo, não a subpasta: tudo sob `pratica/src/javanauta/` usa `javanauta`, independente do módulo — inclusive as reconstruções de Spring da Fase 2.

Regras: infinitivo, minúscula inicial, sem ponto final, sem acento, até ~50 caracteres. Teste: se a palavra não encaixa depois de *"este commit irá ___"*, está errada.

**Um exercício resolvido = um commit.** A contagem não vai na mensagem: quantos está no `diario.md`, e o log já responde *quais*.

Dias que não são de estudo também são commitados, porque o denominador do plano depende deles. Um bloco de dias consecutivos recebe um commit só:

```bash
docs(diario): registrar 2026-09-22
docs(diario): registrar pausa de 2026-09-09 a 2026-09-11
docs(revisao): registrar a revisao da fase 1

git log --oneline --grep="beecrowd"   # todos os exercícios do Beecrowd
git log --oneline --grep="^feat"      # capacidades novas, na ordem
```

### Dois repositórios, dois papéis

**`java-sem-atalho` é canônico.** Todo exercício que conta para o plano é commitado aqui. O `java-fundamentos` é rascunho local para experimentar fora do registro e não conta para métrica nenhuma — arquivo que existe nos dois lugares é arquivo contado duas vezes.

**A API da Fase 2 vive em repositório separado**, com SemVer, branches e PRs. Ali existe produto com release, endpoint público e compatibilidade a quebrar; aqui existe um caderno de exercícios. Juntar os dois quebraria a contagem de commits como métrica de exercícios, porque cada endpoint viraria um `feat`.

O raciocínio completo, com os casos de fronteira e o que foi deliberadamente não adotado, está em [`convencao-de-commits.md`](convencao-de-commits.md).

## 🤖 Sobre o uso de IA

Uso IA de forma deliberada, mas nunca antes de existir uma versão minha funcionando. Primeiro escrevo sozinho; só depois abro a ferramenta para revisão e crítica, e refatoro eu mesmo com base nela — não colo o código sugerido.

A inversão é o ponto: em vez de a IA escrever e eu aceitar, eu escrevo e a IA critica.

| ❌ O padrão antigo | ✅ O padrão novo |
|---|---|
| IA escreve → eu leio e aceito | Eu escrevo → IA revisa e critica |
| "Faz um CRUD pra mim" | "Aqui está meu CRUD. Aponte 5 problemas e me explique por quê." |
| Pergunto a resposta | Pergunto o conceito, depois aplico sozinho |

Isso não é abandonar IA — o mercado quer desenvolvedores que a usem bem. É inverter a ordem. O detalhamento está na seção 2 do [`plano.md`](plano.md).

## 📊 Progresso

| Fase | Período | Foco | Regra | Código | Status |
|---|---|---|---|---|---|
| 0 · Diagnóstico | 27/07 – 02/08 | diagnóstico e adaptação | 100% | 100% | ✅ concluída |
| 1 · Fluência | 03/08 – 18/09 | sintaxe, POO, algoritmos | **68%** | **84%** | ✅ portão aprovado |
| 2 · Construir | 21/09 – 25/10 | API própria com Spring Boot | — | — | 🔄 em andamento |
| 3 · Empregabilidade | 26/10 – 29/11 | testes, Docker, deploy real | — | — | ⏳ não iniciada |

A Fase 1 fechou **abaixo do piso de 70%** na Regra do Arquivo em Branco e com 53 dos 60 exercícios previstos. O portão de avanço — exercício CSV completo do zero em menos de 2h e áudio dos 3 conceitos — foi cumprido, e por isso a Fase 2 abriu. Metas e portão são critérios diferentes, e a revisão explica a distinção.

Revisões obrigatórias ao fim de cada fase: **18/09 ✅** · **23/10** · **27/11**. Não se avança de fase sem o portão da fase anterior cumprido.