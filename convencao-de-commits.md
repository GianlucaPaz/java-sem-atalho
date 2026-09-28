# Convenção de Commits — `java-sem-atalho`

Decidido em 30/07/2026. Vale a partir do Dia 4.

**Histórico de revisões**

| Data | O que mudou |
|---|---|
| 30/07/2026 | Convenção adotada. Substitui o formato `Dia N (DD/MM) \| Exercícios: X (resolvidos: Y, travei: Z)`. |
| 07/08/2026 | O escopo `diario` passa a usar data ISO no lugar do dia sequencial (seção 4). |
| 22/09/2026 | Repositório renomeado de `12-semanas-dev` para `java-sem-atalho`. Entram os escopos `plano` e `revisao`, as mensagens dos dias que não são de estudo (seção 7), o repositório próprio da API (seção 8) e a declaração de repositório canônico (seção 5). |

Escopo deste documento: **só mensagem de commit.** Branch e versionamento ficam de fora de propósito neste repositório — ver seções 8 e 9.

---

## 1. Por que convencionar aqui

O argumento clássico a favor de Conventional Commits é automação: changelog, versão e deploy calculados sozinhos. **Nenhum desses existe neste repo**, e é por isso que a seção 9 rejeita SemVer e branch. Dois outros motivos sustentam a adoção:

**Log legível sem abrir arquivo.** O formato anterior era `Dia N (DD/MM) | Exercícios: X (resolvidos: Y, travei: Z)`, uma coluna de contadores que obrigava a abrir o `diario.md` para saber o que tinha sido feito. Com tipo e escopo, o `git log --oneline` basta.

**Métrica não pertence à mensagem de commit.** Contagem de exercícios já vive no `diario.md` e no Sheets. Um terceiro lugar passa a mentir assim que um número for corrigido, porque mensagem publicada não se reescreve sem `--force`.

A mensagem responde uma pergunta só: **o que mudou neste commit.**

---

## 2. A gramática

```
tipo(escopo): descrição no infinitivo

corpo opcional, explicando o porquê
```

- `tipo` — obrigatório, minúsculo, da lista da seção 3.
- `(escopo)` — opcional, da lista da seção 4. Usar sempre que houver um que sirva.
- `descrição` — infinitivo, minúscula inicial, sem ponto final, sem acento, até ~50 caracteres.
- `corpo` — raro. Só quando o porquê não é óbvio. Linha em branco antes.

**Infinitivo, não terceira pessoa nem passado.** O teste é "se aplicado, este commit irá ___":

> "Se aplicado, este commit irá **resolver** 1001."

`resolver` passa. `resolve` e `resolvido` não. Em inglês a especificação pede imperativo porque lá o imperativo é o verbo nu (`add`); em português o equivalente funcional é o infinitivo.

**Sem acento.** Git Bash no Windows às vezes grava em latin1 e o GitHub renderiza `cabeçalho` como `cabeÃ§alho`.

---

## 3. Os seis tipos

Lista fechada.

| Tipo | Significa | Neste repo |
|---|---|---|
| `feat` | funcionalidade nova | exercício resolvido, reconstrução que funcionou |
| `fix` | corrige algo que existia e estava quebrado | exercício com resultado errado que passou a acertar |
| `refactor` | estrutura muda, comportamento não | reescrever a solução sem mudar a saída |
| `test` | testes | Fase 3, JUnit e Mockito na API |
| `docs` | documentação | `diario.md`, `README.md`, `plano.md`, `revisoes/`, este arquivo |
| `chore` | manutenção sem efeito em comportamento | `.gitignore`, criar pasta, mover arquivo, config de IDE |

**`feat` ou `fix`: o verbo decide.** Coisa nova vira `feat`. Coisa que existia e estava errada vira `fix`. Exercício resolvido pela primeira vez é sempre `feat`, mesmo que o enunciado diga "corrija" — o que importa é o que mudou neste repositório, não o texto do problema.

**`feat` ou `chore`.** Criar a pasta vazia é `chore`. Colocar o arquivo rodando dentro dela é `feat`.

---

## 4. Os escopos

| Escopo | Cobre |
|---|---|
| `beecrowd` | `pratica/src/beecrowd/` |
| `exercism` | `pratica/src/exercism/` |
| `javanauta` | `pratica/src/javanauta/` — `reconstrucao/` (exemplo da aula refeito do zero) e `exercicios/` (exercícios do curso resolvidos a mão) |
| `diagnostico` | `pratica/src/diagnostico/` — tarefas dos diagnósticos de fase e seus enunciados |
| `diario` | `diario.md` — descrição usa a data ISO do registro, nunca numeração sequencial |
| `plano` | `plano.md` |
| `revisao` | `revisoes/` |
| *(sem escopo)* | raiz: `.gitignore`, `.gitattributes`, `README.md`, config |

**O escopo acompanha a origem do conteúdo, não a subpasta.** Tudo sob `pratica/src/javanauta/` usa `javanauta`, qualquer que seja o módulo — inclusive as reconstruções de Spring da Fase 2. Um escopo `spring` seria granularidade sem uso: a origem continua sendo o curso.

Sequencial exige contar dias úteis desde 27/07 e dessincroniza na primeira falha; a data é autoevidente e nunca precisa de `--force`. O número do dia vive no Sheets, onde é recalculável.

O escopo é o que impede o `feat:` de virar ruído num repo onde quase todo commit é exercício. Ele também habilita `git log --oneline --grep="beecrowd"`.

Pasta nova entra nesta tabela antes de virar escopo. Escopo inventado na hora do commit é escopo que ninguém encontra depois.

---

## 5. Um exercício, um commit

**Não agrupar dois exercícios numa mensagem só.**

- `git revert` e `git bisect` passam a operar na unidade certa.
- A contagem de commits `feat` vira a métrica, sem contador dentro da mensagem.
- Obriga a commitar durante o bloco, não empilhado no Fechamento.

O limite: atômico é uma unidade de trabalho concluída, não o menor diff possível. Se um exercício exigiu três arquivos, os três vão no mesmo commit.

### Repositório canônico

A contagem de commits só funciona como métrica se os exercícios viverem num lugar só.

> **`java-sem-atalho` é o repositório canônico da prática.** Todo exercício que conta para o plano é commitado aqui.
>
> **`java-fundamentos` é rascunho local.** Serve para experimentar fora do registro — extensões próprias, testes de sintaxe, coisas que não viraram exercício. Nada ali conta para métrica nenhuma, e nada ali precisa seguir esta convenção.

Se um rascunho virar exercício de verdade, ele muda de casa antes de ser commitado. Arquivo que existe nos dois lugares é arquivo contado duas vezes.

---

## 6. O Fechamento de um dia

Código primeiro, registro depois:

```bash
git add pratica/src/beecrowd/Bee1004.java
git commit -m "feat(beecrowd): resolver 1004"

git add pratica/src/beecrowd/Bee1005.java
git commit -m "feat(beecrowd): resolver 1005"

git add diario.md
git commit -m "docs(diario): registrar 2026-09-22"

git push
```

Dia útil sem exercício resolvido tem um commit só, e isso é o dado:

```
docs(diario): registrar 2026-09-22 sem exercicio concluido
```

Commit de estrutura fica separado do commit do dia:

```
chore: adicionar .gitignore
```

### A partir da Fase 2: dois repositórios no mesmo dia

O bloco de projeto próprio commita no repositório da API (seção 8). O registro do dia commita **sempre aqui**, porque é aqui que vive o `diario.md`:

```bash
# no repo da API, durante o bloco de projeto proprio
git commit -m "feat(livros): criar endpoint de cadastro"

# no java-sem-atalho, no Fechamento
git commit -m "docs(diario): registrar 2026-09-22"
```

---

## 7. Dias que não são de estudo

A taxonomia vem do `plano.md`, seção 4, e é a mesma da coluna `Tipo` da planilha. Um bloco de dias consecutivos recebe **um commit só, quando o bloco fecha** — commitar cada dia de pausa separadamente gera ruído sem informação nova.

| Situação | Mensagem |
|---|---|
| Dia útil, com exercício | `docs(diario): registrar 2026-09-22` |
| Dia útil sem exercício concluído | `docs(diario): registrar 2026-09-22 sem exercicio concluido` |
| Pausa declarada, um dia | `docs(diario): registrar pausa em 2026-09-08` |
| Pausa declarada, vários dias | `docs(diario): registrar pausa de 2026-09-09 a 2026-09-11` |
| Indisposição | `docs(diario): registrar indisposicao de 2026-09-09 a 2026-09-11` |
| Processo seletivo | `docs(diario): registrar processo seletivo de 2026-08-31 a 2026-09-04` |
| Feriado | **não commita** |
| Revisão de fase | `docs(revisao): registrar a revisao da fase 1` |
| Mudança no plano | `docs(plano): ajustar o piso da fase 3` |

**Por que o feriado não commita.** Ele não é evento do diário: é ausência de dia útil, já conhecida pelo calendário e já listada na aba `Parâmetros` da planilha. Registrar feriado é registrar que a segunda-feira veio depois do domingo.

**Por que pausa e indisposição commitam.** Porque são decisões — uma escolhida, outra não — e o denominador do plano depende delas. Um dia que sai da conta sem deixar rastro é um dia que ninguém consegue auditar depois.

---

## 8. O repositório da API

A partir da Fase 2 o projeto próprio — a API de controle de leituras — vive em **repositório separado**.

**Por que separado.** Ali existe produto, endpoint público, deploy e compatibilidade que pode quebrar. Aqui existe um caderno de exercícios. São dois artefatos com ciclos de vida diferentes, e juntá-los quebra a métrica da seção 5: cada endpoint viraria um `feat`, e a contagem passaria a somar exercício com funcionalidade de produto.

**O que muda lá:**

| | `java-sem-atalho` | repo da API |
|---|---|---|
| Gramática da mensagem | `tipo(escopo): infinitivo` | **a mesma** |
| Os seis tipos | sim | **os mesmos** |
| Escopos | por origem do conteúdo | por módulo do domínio: `livros`, `autores`, `leituras`, `config` |
| SemVer | não | **sim** — existe release e compatibilidade a quebrar |
| Branches e PR | não | **sim** — `main` protegida, uma branch por funcionalidade |
| Métrica de commits | exercícios resolvidos | nenhuma |

A gramática atravessa porque é boa em qualquer repositório. O que não atravessa é a métrica, que só faz sentido num caderno de exercícios.

---

## 9. O que não se adota aqui

**Semantic Versioning.** `MAJOR.MINOR.PATCH` numera um artefato que alguém consome e cuja compatibilidade pode quebrar. Um caderno de exercícios não tem release, consumidor nem compatibilidade. **Endereço correto: o repositório da API.**

**Estratégia de branch.** Uma `main`, dev solo, sem revisor. Isso já é trunk-based; nomear não muda nada. **Endereço correto: o repositório da API**, onde branch e PR passam a ter função — inclusive como prática para a Fase 3, que pede "commits pequenos, branches, PRs" entre as metas.

---

## 10. Erros a evitar

| Erro | Por quê |
|---|---|
| `ajustes`, `wip`, `update` | não dizem o quê nem por quê |
| `feat(beecrowd): resolver 3 exercicios` | quantos não é o que mudou, quais é |
| `feat(beecrowd): resolver 1001 e 1003` | dois entregáveis independentes são dois commits |
| `feat(beecrowd): resolvido 1007` | passado falha no teste "este commit irá ___" |
| `docs(diario): registrar dia 1 de pausa` | numeração sequencial de novo; a data é autoevidente e nunca precisa de `--force` |
| `Dia 12 (22/09) \| Exercícios: 3` | o formato antigo, abandonado em 30/07 |
| commit de exercício no repositório da API | mistura caderno com produto e quebra a contagem da seção 5 |
| commit de exercício no `java-fundamentos` | rascunho não conta; o exercício muda de casa antes de ser commitado |
| `git add .` no fim do dia | junta exercício, diário e config e destrói a distinção |
| tipo escolhido pelo tamanho do diff | `chore` não é "commit pequeno" nem `feat` é "commit importante" |

---

## 11. Referência rápida

```
feat(escopo): descricao        exercicio resolvido, capacidade nova
fix(escopo): descricao         existia e estava errado
refactor(escopo): descricao    estrutura muda, comportamento nao
test(escopo): descricao        Fase 3, semana 9
docs(escopo): descricao        diario, plano, revisao, README, este arquivo
chore: descricao               config, pasta, arquivo movido

escopos: beecrowd | exercism | javanauta | diagnostico
         diario | plano | revisao | (nenhum, para a raiz)

regras:  infinitivo · minuscula · sem ponto final · sem acento · ~50 chars
         1 exercicio = 1 commit · teste: "este commit ira ___"

dia normal      docs(diario): registrar 2026-09-22
dia sem saida   docs(diario): registrar 2026-09-22 sem exercicio concluido
pausa           docs(diario): registrar pausa de 2026-09-09 a 2026-09-11
indisposicao    docs(diario): registrar indisposicao em 2026-09-09
proc. seletivo  docs(diario): registrar processo seletivo de 2026-08-31 a 2026-09-04
feriado         nao commita
revisao         docs(revisao): registrar a revisao da fase 1

canonico: java-sem-atalho      rascunho: java-fundamentos (nao conta)
API da Fase 2: repo separado, com SemVer e branches
```
