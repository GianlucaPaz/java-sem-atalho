package reconstrucao.poo.abstracao.interfaces;

// INTERFACE: Define apenas a capacidade de ser autenticado no sistema
public interface Autenticavel {
    boolean autenticar(String senha);
}

/* O que faz ser uma Interface?
 *
 *  1. Sem Estado (Atributos de Instância): A interface não guarda variáveis de estado como private String nome ou private double saldo. Ela apenas declara métodos.
 *
 *  2. Sem Construtor: Você não pode usar new Autenticavel(), nem criar construtores dentro dela.
 *
 *  3. Múltipla Implementação: Uma classe pode implementar várias interfaces ao mesmo tempo (class Usuario implements Autenticavel, Notificavel, Imprimivel).
 *
 *  4. Foco no Comportamento: Une classes que não têm relação de parentesco (um Usuario e uma CatracaEletronica), mas que compartilham uma mesma habilidade.
 *
 *  Use Interface se você quer garantir que classes totalmente diferentes cumpram o mesmo papel ou tenham a mesma funcionalidade (ex: Pagavel -> Fatura, Boleto, Funcionario).
 *
 */

