# Diário — Java Sem Atalho

Registro diário da prática. Uma entrada por dia, escrita no bloco de Fechamento.

**Índice:** [Fase 0](#fase-0--diagnóstico--2707-a-0208) · [Fase 1](#fase-1--fluência--0308-a-1809) · [Fase 2](#fase-2--construir--2109-a-2510) · [Decisões do repositório](#-decisões-do-repositório)

Os números de cada fase — % da Regra, exercícios, dias no denominador — vivem em [`revisoes/`](revisoes/) e na planilha de acompanhamento. Não são repetidos aqui: quatro lugares guardando a mesma contagem é um lugar a mais para mentir quando um número for corrigido.

---

## 📐 Como registrar

```
### 📆 AAAA-MM-DD · 🏷️ <tipo do dia>
⌛ **Arquivo em branco:** X min · **Código sem IA (total):** Y min · 🔢 **Exercícios:** N

- 📝 <exercício> (<linguagem>) | 🧱 <bloco> | 📍 <caminho ou link> | 👀 Travei: <Sim (motivo) / Não> | <✅/☑️/✖️/❌> Resolvi sozinho: <Sim / A maioria / A minoria / Não>

#### 🔎 Extensão própria: <estudo fora da aula>
#### ❓ Em aberto: <pergunta que ficou>
#### 🎯 Pauta de amanhã: <o que atacar primeiro>
```

**Tipo do dia** — os mesmos seis da planilha e do [`plano.md`](plano.md): `útil` · `pausa` · `indisposição` · `processo seletivo` · `feriado` · `fim de semana`. Feriado e fim de semana não ganham entrada; aparecem como lacuna entre datas.

**Os dois números são medidas diferentes e nunca se somam.** `Arquivo em branco` é o piso da fase e é o critério da Regra. `Código sem IA (total)` soma todos os blocos de código escritos do zero e serve de contexto.

**Bloco** — `arquivo em branco` · `reconstrução` · `projeto próprio`. Diz de qual bloco o exercício saiu. É o que torna as duas réguas recalculáveis a partir deste arquivo sozinho.

> ⚠️ O campo `🧱 Bloco` vale a partir de **2026-09-22**. As entradas anteriores registravam os minutos por bloco no cabeçalho, mas não diziam qual exercício saiu de qual bloco — e preencher isso agora seria invenção, não registro.

Caminhos de arquivo são relativos à raiz do repositório. Quando a estrutura de pastas muda, as entradas antigas são atualizadas junto e a mudança fica registrada em **Decisões do repositório** — o histórico continua navegável e a decisão de reorganizar fica datada.

---

## 🔧 Decisões do repositório

- **2026-07-30** — Convenção de commits adotada: `tipo(escopo): descricao` no infinitivo, um exercício por commit. Documento: [`convencao-de-commits.md`](convencao-de-commits.md). Os commits dos dias 1 a 3 foram reescritos com `git rebase -i` para o novo padrão — a *author date* foi preservada, a *committer date* não. Antes disso o formato era `Dia N (DD/MM) | Exercícios: X (resolvidos: Y, travei: Z)`.
- **2026-07-30** — Repositório movido do OneDrive para `C:\Users\PC\dev\estudos\` (file lock quebrava operações do Git). Exercícios passam a viver em `pratica/src/` separados por origem.
- **2026-08-05** — `javanauta/` reorganizado em packages. `reconstrucao/` passa a espelhar os módulos do curso (`logica/condicionais/`, `logica/sequenciais/`), `exercicios/` segue plano. Nomes de package em minúsculo puro, conforme a convenção Java. Os caminhos das entradas anteriores foram atualizados neste arquivo; o escopo de commit continua sendo `javanauta`, sem subdivisão.
- **2026-09-22** — Repositório renomeado de `12-semanas-dev` para **`java-sem-atalho`**. Caminho local: `C:\Users\PC\dev\estudos\java-sem-atalho`. O plano deixou de ter 12 semanas e o nome deixou de descrever o projeto; o novo nomeia o método, não o cronograma.
- **2026-09-22** — **`java-sem-atalho` declarado canônico.** `java-fundamentos` passa a ser rascunho local: serve para experimentar fora do registro e não conta para métrica nenhuma. Exercício que existe nos dois lugares é exercício contado duas vezes. Ver `convencao-de-commits.md`, seção 5.
- **2026-09-22** — A API da Fase 2 vai para **repositório separado**, com SemVer, branches e PRs. Ali existe produto com release e compatibilidade a quebrar; aqui existe um caderno de exercícios. Juntar os dois quebraria a contagem de commits como métrica de exercícios.
- **2026-09-22** — Documentos de revisão de fase passam a viver em [`revisoes/`](revisoes/). `plano.md` entra na raiz como fonte da verdade do projeto. Escopos de commit novos: `diagnostico`, `plano`, `revisao`.
- **2026-09-22** — A medição da Regra do Arquivo em Branco foi separada em duas colunas: minutos do bloco de arquivo em branco e minutos totais de código sem IA. Até aqui a planilha somava os dois e comparava contra o limiar de um bloco só. Ver a nota metodológica em [`revisoes/revisao-fase-1.md`](revisoes/revisao-fase-1.md).

---

## Fase 0 — Diagnóstico · 27/07 a 02/08

### 📆 2026-07-27 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 1

- 📝 Tarefa 1 Semana 0 (C) | 📍 plano-12-semanas.pdf | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Tarefa 2 Semana 0 (C) | 📍 plano-12-semanas.pdf | 👀 Travei: Sim (laço para repetir leitura 5 vezes → revisar estrutura for) | ❌ Resolvi sozinho: Não
- 📝 Beecrowd 1003 (C) | 📍 https://judge.beecrowd.com/pt/problems/view/1003 | 👀 Travei: Sim | ❌ Resolvi sozinho: Não

---

### 📆 2026-07-28 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 2

- 📝 Tarefa 1 Semana 0 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Tarefa 2 Semana 0 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Sim (laço para repetir leitura 5 vezes → revisar estrutura for) | ❌ Resolvi sozinho: Não
- 📝 Beecrowd 1000 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1000 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1003 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1003 | 👀 Travei: Sim | ❌ Resolvi sozinho: Não

---

### 📆 2026-07-29 · 🏷️ útil
⌛ **Arquivo em branco:** 180 min · **Código sem IA (total):** 180 min · 🔢 **Exercícios:** 2

- 📝 Tarefa 2 Semana 0 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Sim (laço para repetir leitura 5 vezes → revisar estrutura for) | ❌ Resolvi sozinho: Não
- 📝 Beecrowd 1001 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1001 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1003 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1003 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-07-30 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 4

- 📝 Beecrowd 1002 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1002 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1004 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1004 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1005 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1005 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1006 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1006 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Conversão de tipos — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/sequenciais/ConversaoDeTipos.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🔎 Extensão própria: `String.valueOf` e `"" + numero`, pesquisadas fora da aula (só no rascunho local)
#### ❓ Em aberto: o que distingue as três conversões quando a referência é `null`
#### 🎯 Pauta de amanhã: testar as três conversões com `Integer x = null`

---

### 📆 2026-07-31 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 105 min · 🔢 **Exercícios:** 10

- 📝 Beecrowd 1007 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1007 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1008 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1008 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1009 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1009 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1010 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1010 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Quiz de Estruturas Sequenciais — 6 exercícios (Java) | 📍 pratica/src/javanauta/exercicios/QuizEstruturasSequenciais.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

## Fase 1 — Fluência · 03/08 a 18/09

### 📆 2026-08-03 · 🏷️ útil
⌛ **Arquivo em branco:** 30 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 1

- 📝 Beecrowd 1011 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1011 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Expressões comparativas — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/condicionais/ExpressoesComparativas.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Operadores lógicos — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/condicionais/OperadoresLogicos.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Estrutura if e else — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/condicionais/EstruturaIfElse.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Operador ternário — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/condicionais/OperadorTernario.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-04 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 0 min · 🔢 **Exercícios:** 0

- 📉 Dia em branco.

---

### 📆 2026-08-05 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 12

- 📝 Beecrowd 1012 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1012 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1013 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1013 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1014 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1014 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1015 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1015 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1016 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1016 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1017 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1017 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1018 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1018 | 👀 Travei: Sim | ❌ Resolvi sozinho: Não
- 📝 Javanauta Quiz de Estruturas Condicionais — 6 exercícios (Java) | 📍 pratica/src/javanauta/exercicios/QuizEstruturasCondicionais.java | 👀 Travei: Sim (em apenas um, por falta de entendimento sobre a expressão ternária) | ☑️ Resolvi sozinho: A maioria

---

### 📆 2026-08-06 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 1

- 📝 Tarefa 2 Semana 0 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Tarefa 3 Semana 0 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Sim (conteúdo ainda não aprendido) | ❌ Resolvi sozinho: Não
- 📝 Javanauta Reconstrução da aula (While e Do-While — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/repetitivas/While.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (For — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/repetitivas/For.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Arrays — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/repetitivas/Arrays.java | 👀 Travei: Sim (nas várias formas de inicialização e no for-each) | ☑️ Resolvi sozinho: A maioria

---

### 📆 2026-08-07 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 270 min · 🔢 **Exercícios:** 3

- 📝 Beecrowd 1018 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1018 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1019 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1019 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1020 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1020 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Collections ArrayList — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/repetitivas/CollectionsArrayList.java | 👀 Travei: Sim (no uso de alguns métodos e do forEach) | ☑️ Resolvi sozinho: A maioria

---

### 📆 2026-08-10 · 🏷️ útil
⌛ **Arquivo em branco:** 150 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 1

- 📝 Beecrowd 1021 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1021 | 👀 Travei: Sim (erro ao utilizar `double` para cálculos monetários) | ☑️ Resolvi sozinho: A maioria
- 📝 Beecrowd 1021 Refatorado (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1021 | 👀 Travei: Sim (faltou conhecimento sobre a abordagem de cálculo monetário e uso do for-each) | ✖️ Resolvi sozinho: A minoria

#### 🔎 Extensão própria: produzido o material `ponto-flutuante-e-valores-monetarios` a partir das dúvidas do Beecrowd 1021

---

### 📆 2026-08-11 · 🏷️ útil
⌛ **Arquivo em branco:** 60 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 8

- 📝 Beecrowd 1035 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1035 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Beecrowd 1036 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1036 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (HashMap e TreeMap — Java) | 📍 pratica/src/javanauta/reconstrucao/logica/repetitivas/HashMapTreeMap.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Quiz de Estruturas Repetitivas — 6 exercícios (Java) | 📍 pratica/src/javanauta/exercicios/QuizEstruturasRepetitivas.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-12 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 2

- 📝 Javanauta Revisão de Lógica — Exercício 1 (Java) | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio1.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Revisão de Lógica — Exercício 2 (Java) | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio2.java | 👀 Travei: Sim (revisar manipulação de String e métodos de String) | ❌ Resolvi sozinho: Não
- 📝 Javanauta Revisão de Lógica — Exercício 3 (Java) | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio3.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-13 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 2

- 📝 Javanauta Revisão de Lógica — Exercício 4 (Java) | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio4.java | 👀 Travei: Sim (revisar operador ternário — ver onde é melhor aplicado) | ☑️ Resolvi sozinho: A maioria
- 📝 Javanauta Revisão de Lógica — Exercício 5 (Java) | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio5.java | 👀 Travei: Sim (revisar Switch-Case e manipulação de entradas com String + int, long, double) | ☑️ Resolvi sozinho: A maioria
- 📝 Javanauta Reconstrução da aula (Objetos — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/AulaObjetos.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Métodos — modificadores de acesso, tipos de retorno e nomenclatura — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/Metodos.java | 👀 Travei: Sim (esqueci do uso do `return` dentro do método) | ☑️ Resolvi sozinho: A maioria

---

### 📆 2026-08-14 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 0 min · 🔢 **Exercícios:** 0

- 📉 Dia em branco.

---

### 📆 2026-08-17 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 1

- 📝 Beecrowd 1037 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1037 | 👀 Travei: Sim (detalhe bobo: esqueci que não podia passar de 100 e não detectei o erro) | ☑️ Resolvi sozinho: A maioria
- 📝 Beecrowd 1038 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1038 | 👀 Travei: Sim (tenho ideia clara do que fazer, mas preciso revisar HashMap e TreeMap) | ❌ Resolvi sozinho: Não

---

### 📆 2026-08-18 · 🏷️ útil
⌛ **Arquivo em branco:** 120 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 1

- 📝 Javanauta Revisão de Lógica — Exercício 1 (Java) — melhorado | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio1.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🔎 Extensão própria: iniciado material de resumo sobre Lógica de Programação (não finalizado)

---

### 📆 2026-08-19 · 🏷️ útil
⌛ **Arquivo em branco:** 120 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 1

- 📝 Javanauta Revisão de Lógica — Exercício 3 (Java) — melhorado | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio3.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-20 · 🏷️ útil
⌛ **Arquivo em branco:** 120 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 1

- 📝 Javanauta Revisão de Lógica — Exercício 4 (Java) — melhorado | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio4.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🔎 Extensão própria: continuação e melhoria do material de resumo sobre Lógica de Programação

---

### 📆 2026-08-21 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 0 min · 🔢 **Exercícios:** 0

- 📉 Dia em branco.

---

### 📆 2026-08-24 · 🏷️ útil
⌛ **Arquivo em branco:** 120 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 1

- 📝 Javanauta Revisão de Lógica — Exercício 6 (Java) — melhorado | 📍 pratica/src/javanauta/exercicios/RevisaoLogicaExercicio6.java | 👀 Travei: Sim (na parte de otimizar o código) | ☑️ Resolvi sozinho: A maioria

#### 🔎 Extensão própria: continuação e melhoria do material de resumo sobre Lógica de Programação

---

### 📆 2026-08-25 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 0

- 📝 Javanauta Reconstrução da aula (Métodos — parâmetros, métodos de instância e métodos estáticos — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/Metodos.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Métodos de instância e métodos estáticos — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/MetodoEstatico.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-26 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 1

- 📝 Beecrowd 1038 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1038 | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Classes, Pacotes e Interfaces — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/ClassesInterfacesPacotes.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Classes, Pacotes e Interfaces — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/InterfaceMatematica.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-27 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 2

- 📝 Beecrowd 1040 (Java) | 📍 https://judge.beecrowd.com/pt/problems/view/1040 | 👀 Travei: Sim (falta acertar o cálculo com `long` e `double`) | ❌ Resolvi sozinho: Não
- 📝 Tarefa 3 Semana 0 / Semana 1 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Tarefa 4 Semana 0 / Semana 1 (Java) | 📍 plano-12-semanas.pdf | 👀 Travei: Sim (esqueci partes da estrutura de ArrayList e for-each) | ☑️ Resolvi sozinho: A maioria
- 📝 Javanauta Reconstrução da aula (Encapsulamento — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/encapsulamento/ContaBancaria.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Encapsulamento — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/encapsulamento/AgenciaBancaria.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-28 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 150 min · 🔢 **Exercícios:** 0

- 📝 Javanauta Reconstrução da aula (Herança — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/heranca/Principal.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Herança — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/heranca/Animal.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Herança — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/heranca/Gato.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Herança — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/heranca/Cavalo.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Polimorfismo — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/polimorfismo/Principal.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Polimorfismo — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/polimorfismo/Calculadora.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Polimorfismo — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/polimorfismo/Veiculo.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Polimorfismo — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/polimorfismo/Aviao.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-08-31 a 2026-09-04 · 🏷️ processo seletivo

- 🎯 Preparação para a prova do trainee Itaú 2027 — raciocínio lógico e abstrato, sequências, lógica dedutiva, conjuntos, quantitativo, probabilidade e contagem (permutação, arranjo, combinação, anagramas), PA e PG, tabelas e gráficos, raciocínio verbal, atenção e precisão.
- 📋 **04/09** — prova do Itaú realizada.

*5 dias úteis fora do denominador.*

---

### 📆 2026-09-08 · 🏷️ pausa

- 😴 Pausa declarada — descanso mental pós-processo seletivo. *1ª de 2 da Fase 1.*

*1 dia útil fora do denominador. 07/09 foi feriado da Independência.*

---

### 📆 2026-09-09 a 2026-09-11 · 🏷️ indisposição

- 🤕 Sem condições de estudo.

*3 dias úteis fora do denominador.*

---

### 📆 2026-09-14 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 4

- 📝 Diagnóstico CSV (Java) — Tarefa 1 | 📍 pratica/src/diagnostico/fase1/tarefa1/Tarefa1.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Diagnóstico CSV (Java) — Tarefa 2 | 📍 pratica/src/diagnostico/fase1/tarefa2/Tarefa2.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Diagnóstico CSV (Java) — Tarefa 3 | 📍 pratica/src/diagnostico/fase1/tarefa3/Item.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Diagnóstico CSV (Java) — Tarefa 3 | 📍 pratica/src/diagnostico/fase1/tarefa3/Principal.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Diagnóstico CSV (Java) — Tarefa 4 | 📍 pratica/src/diagnostico/fase1/tarefa4/Tarefa4.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Diagnóstico CSV (Java) — Tarefa 5 | 📍 pratica/src/diagnostico/fase1/tarefa5/Tarefa5.java | 👀 Travei: Sim (decomposição — algoritmo correto em português; travamento na tradução para Java: comparação de String, constante única para a categoria e papel das variáveis) | ❌ Resolvi sozinho: Não

#### 🎯 Pauta de amanhã: tarefas 1 a 4 saíram em 1h08; a 5 travou 22 min

---

### 📆 2026-09-15 · 🏷️ útil
⌛ **Arquivo em branco:** 0 min · **Código sem IA (total):** 0 min · 🔢 **Exercícios:** 3

> ⚠️ Dia produtivo sem código: 180 min de aula, gravação e anotações. O bloco de arquivo em branco não aconteceu.

- 📝 POO — aulas do módulo (restam 3 aulas) | 📍 — | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Áudio explicativo dos 3 conceitos (herança, polimorfismo e interface) — gravado e ouvido | 📍 externo ao repositório | 👀 Travei: Não, mas cabe melhorar o ritmo da explicação, que ficou muito lento | ✅ Resolvi sozinho: Sim
- 📝 Anotações das hesitações do áudio | 📍 externo ao repositório | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-09-16 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 1

- 📝 Diagnóstico CSV (Java) — Tarefa 5 | 📍 pratica/src/diagnostico/fase1/tarefa5/Tarefa5.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🔎 Extensão própria: estudo das perguntas de entrevista — 1) por que a variável que acumula a soma precisa existir antes do laço? 2) por que `double` não serve para valor monetário?

---

### 📆 2026-09-17 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 90 min · 🔢 **Exercícios:** 1

- 📝 Diagnóstico CSV (Java) — Tarefa 6 | 📍 pratica/src/diagnostico/fase1/tarefa6/Tarefa6.java | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🔎 Extensão própria: estudo das perguntas de entrevista — 3) por que se declara a variável como `List` e se cria como `ArrayList`? 4) por que `==` não compara texto em Java?

---

### 📆 2026-09-18 · 🏷️ útil
⌛ **Arquivo em branco:** 120 min · **Código sem IA (total):** 120 min · 🔢 **Exercícios:** 6

- 📝 Diagnóstico CSV final (Java) — Tarefas 1 a 6 concluídas em 69 min | 📍 pratica/src/diagnostico/fase1/ | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

#### 🎯 Portão da Fase 1 cumprido. Revisão em [`revisoes/revisao-fase-1.md`](revisoes/revisao-fase-1.md).

---

## Fase 2 — Construir · 21/09 a 25/10

### 📆 2026-09-21 · 🏷️ pausa

- 😴 Pausa declarada — descanso mental e preparação para fase 2. *1ª de 2 da Fase 2.*
- 📝 Documento de revisão da Fase 1 | 📍 pratica/revisoes/revisao-fase-1.md | 👀 Travei: Não | ✅ Resolvi sozinho: Sim

---

### 📆 2026-09-22 · 🏷️ útil
⌛ **Arquivo em branco:** 90 min · **Código sem IA (total):** 255 min · 🔢 **Exercícios:** 2 resolvidos e 1 não resolvido

- 📝 Beecrowd 1040 (Java) | 🧱 Arquivo em branco | 📍 https://judge.beecrowd.com/pt/problems/view/1040 | 👀 Travei: Sim (recorrência na falta de fixação do entendimento do cálculo com `long` e `double` e uso de BigDecimal) | ❌ Resolvi sozinho: Não
- 📝 Exercism - Hello World (Java) | 🧱 Arquivo em branco | 📍 https://exercism.org/tracks/java/exercises/hello-world | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Exercism - Cook Your Lasagna (Java) | 🧱 Arquivo em branco | 📍 https://exercism.org/tracks/java/exercises/lasagna | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 POO — aulas do módulo (restam 2 aulas) | 📍 — | 👀 Travei: Não | ✅ Resolvi sozinho: Sim
- 📝 Javanauta Reconstrução da aula (Composição e Agregação  — Java) | 📍 pratica/src/javanauta/reconstrucao/poo/associacao | 👀 Travei: Sim (dificuldade de etendimento do método to String() e dificuldade de entendimento e prática dos conceitos associativos) | ☑️ Resolvi sozinho: A maioria

---

### 📆 2026-09-23 · 🏷️ pausa

- 😴 Pausa declarada — organização final dos documentos da fase 2. *2ª de 2 da Fase 2.*

---