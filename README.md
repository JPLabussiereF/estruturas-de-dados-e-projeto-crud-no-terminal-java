# 📚 Java com Estruturas de Dados e Projeto CRUD no Terminal

## 🎯 Objetivo
Entender coleções e como manipular dados em Java, desenvolvendo um projeto CRUD completo no terminal.

---

## 📋 Sumário
- [Arrays e ArrayList](#-arrays-e-arraylist)
- [HashMap e Outras Coleções](#-hashmap-e-outras-coleções)
- [Manipulação de Strings e Datas](#-manipulação-de-strings-e-datas)
- [Tratamento de Erros (try-catch)](#-tratamento-de-erros-try-catch)
- [Projetos Práticos](#-projetos-práticos)

---

## 🔢 Arrays e ArrayList

### Conceitos Fundamentais

**Arrays:**
- Estrutura de dados estática com tamanho fixo
- Armazena elementos do mesmo tipo
- Acesso rápido por índice
- Sintaxe: `tipo[] nomeArray = new tipo[tamanho]`

**ArrayList:**
- Implementação da interface List
- Tamanho dinâmico (cresce conforme necessário)
- Permite apenas objetos (não tipos primitivos)
- Sintaxe: `ArrayList<Tipo> lista = new ArrayList<>()`

### Principais Métodos
- `add(elemento)` - adiciona elemento
- `get(index)` - obtém elemento por índice
- `set(index, elemento)` - substitui elemento
- `remove(index)` - remove por índice
- `size()` - retorna tamanho
- `contains(elemento)` - verifica se contém elemento

### 🧪 Exercícios

#### Exercício 1 (Simples)
Crie um programa que:
- Declare um array de 5 números inteiros
- Preencha com valores digitados pelo usuário
- Exiba todos os valores e a soma total

#### Exercício 2 (Intermediário)
Desenvolva um sistema que:
- Use ArrayList para armazenar nomes de alunos
- Permita adicionar, remover e listar alunos
- Implemente busca por nome (ignorando case)
- Exiba a quantidade total de alunos

#### Exercício 3 (Intermediário)
Construa um programa que:
- Gerencie notas de uma turma usando ArrayList
- Calcule média geral da turma
- Identifique maior e menor nota
- Liste alunos acima da média

---

## 🗺️ HashMap e Outras Coleções

### HashMap
- Armazena pares chave-valor
- Não permite chaves duplicadas
- Acesso rápido por chave
- Sintaxe: `HashMap<TipoChave, TipoValor> mapa = new HashMap<>()`

### Outras Coleções Importantes

**LinkedList:**
- Lista duplamente ligada
- Inserção/remoção eficiente no início/meio
- Acesso sequencial mais lento

**HashSet:**
- Não permite elementos duplicados
- Baseado em HashMap internamente
- Útil para verificar unicidade

**TreeMap:**
- Mapa ordenado por chave
- Implementa navegação ordenada

### Principais Métodos HashMap
- `put(chave, valor)` - adiciona/atualiza
- `get(chave)` - obtém valor por chave
- `remove(chave)` - remove entrada
- `containsKey(chave)` - verifica existência da chave
- `keySet()` - retorna conjunto de chaves
- `values()` - retorna coleção de valores

### 🧪 Exercícios

#### Exercício 1 (Simples)
Desenvolva um programa que:
- Use HashMap para armazenar nome e idade de pessoas
- Permita consultar idade por nome
- Exiba todos os registros

#### Exercício 2 (Intermediário)
Crie um sistema de estoque que:
- Use HashMap com produto (String) e quantidade (Integer)
- Implemente adição, remoção e atualização de estoque
- Calcule valor total do estoque (com preços em outro HashMap)
- Liste produtos em falta (quantidade = 0)

#### Exercício 3 (Intermediário)
Construa um contador de palavras que:
- Leia um texto do usuário
- Use HashMap para contar frequência de cada palavra
- Ignore maiúsculas/minúsculas
- Exiba palavras ordenadas por frequência (use TreeMap)

---

## 📝 Manipulação de Strings e Datas

### Manipulação de Strings

**Principais Métodos:**
- `length()` - tamanho da string
- `charAt(index)` - caractere na posição
- `substring(inicio, fim)` - extrai substring
- `indexOf(texto)` - posição da primeira ocorrência
- `toLowerCase()/toUpperCase()` - converte case
- `trim()` - remove espaços das bordas
- `split(separador)` - divide em array
- `replace(antigo, novo)` - substitui texto

**StringBuilder:**
- Mais eficiente para concatenações múltiplas
- Métodos: `append()`, `insert()`, `delete()`

### Manipulação de Datas

**LocalDate, LocalTime, LocalDateTime:**
```java
import java.time.*;
import java.time.format.DateTimeFormatter;

// Criação
LocalDate hoje = LocalDate.now();
LocalTime agora = LocalTime.now();
LocalDateTime dataHora = LocalDateTime.now();

// Formatação
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String dataFormatada = hoje.format(formato);
```

### 🧪 Exercícios

#### Exercício 1 (Simples)
Crie um programa que:
- Receba nome completo do usuário
- Extraia primeiro e último nome
- Converta para formato "SOBRENOME, Nome"
- Conte quantas letras tem o nome (sem espaços)

#### Exercício 2 (Intermediário)
Desenvolva um validador que:
- Verifique se email tem formato válido (@, domínio)
- Valide CPF (formato xxx.xxx.xxx-xx)
- Use expressões regulares básicas
- Formate automaticamente números de telefone

#### Exercício 3 (Intermediário)
Construa um sistema de agendamento que:
- Gerencie compromissos com data/hora
- Formate datas em português (ex: "15 de Janeiro de 2024")
- Calcule diferença entre datas
- Liste compromissos da próxima semana

---

## ⚠️ Tratamento de Erros (try-catch)

### Conceitos Fundamentais

**Tipos de Exceções:**
- **Checked:** Devem ser tratadas (IOException, SQLException)
- **Unchecked:** Runtime exceptions (NullPointerException, ArrayIndexOutOfBoundsException)

**Estrutura try-catch:**
```java
try {
    // código que pode gerar exceção
} catch (TipoExcecao e) {
    // tratamento da exceção
} finally {
    // código que sempre executa
}
```

### Boas Práticas
- Capturar exceções específicas primeiro
- Usar finally para limpeza de recursos
- Não ignorar exceções silenciosamente
- Registrar erros adequadamente

### 🧪 Exercícios

#### Exercício 1 (Simples)
Desenvolva um programa que:
- Solicite dois números ao usuário
- Realize divisão com tratamento de divisão por zero
- Trate entrada inválida (não numérica)
- Exiba mensagens de erro amigáveis

#### Exercício 2 (Intermediário)
Crie um leitor de arquivo que:
- Leia dados de um arquivo texto
- Trate FileNotFoundException
- Trate IOException durante leitura
- Use try-with-resources para fechar arquivo automaticamente

#### Exercício 3 (Intermediário)
Construa um sistema bancário que:
- Simule operações de saque/depósito
- Crie exceção customizada para saldo insuficiente
- Trate valores inválidos (negativos)
- Mantenha log de todas as transações e erros

---

## 🚀 Projetos Práticos

### 📞 Projeto 1: Agenda de Contatos com ArrayList

**Objetivos:**
- Implementar CRUD completo de contatos
- Usar ArrayList para armazenamento
- Aplicar conceitos de POO

**Funcionalidades Requeridas:**
1. Adicionar novo contato (nome, telefone, email)
2. Listar todos os contatos
3. Buscar contato por nome
4. Editar contato existente
5. Remover contato
6. Menu interativo no terminal

**Estrutura Sugerida:**
```java
public class Contato {
    private String nome;
    private String telefone;
    private String email;
    // getters, setters, toString, equals
}

public class AgendaContatos {
    private ArrayList<Contato> contatos;
    // métodos CRUD
}
```

**Desafios Extras:**
- Implementar validação de email e telefone
- Permitir múltiplos telefones por contato
- Adicionar funcionalidade de backup/restore
- Ordenar contatos alfabeticamente

---

### 🛒 Projeto 2: Sistema CRUD de Produtos no Terminal

**Objetivos:**
- Desenvolver sistema completo de gestão
- Integrar todas as estruturas estudadas
- Implementar tratamento robusto de erros

**Funcionalidades Requeridas:**
1. **Create:** Cadastrar produtos (código, nome, preço, quantidade)
2. **Read:** Listar produtos, buscar por código/nome, relatórios
3. **Update:** Editar informações, atualizar estoque
4. **Delete:** Remover produtos (com confirmação)
5. Menu principal navegável
6. Persistência de dados em arquivo

**Estrutura Sugerida:**
```java
public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private LocalDateTime dataCadastro;
    // métodos necessários
}

public class GestorProdutos {
    private HashMap<String, Produto> produtos;
    // métodos CRUD e utilidades
}
```

**Funcionalidades Avançadas:**
- Relatório de produtos em falta
- Cálculo de valor total do estoque
- Histórico de movimentações
- Backup automático dos dados
- Validação de dados de entrada
- Menu com navegação por números/letras

**Tratamento de Erros:**
- Validação de entrada do usuário
- Tratamento de arquivo não encontrado
- Verificação de código duplicado
- Confirmação antes de exclusões

---

## 📚 Recursos de Estudo

### Documentação Oficial
- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)

### Dicas para Prática
1. Comece sempre pelos exercícios simples
2. Teste cada funcionalidade separadamente
3. Use nomes descritivos para variáveis e métodos
4. Comente código complexo
5. Refatore código duplicado

### Próximos Passos
- Estudo de Collections avançadas (Queue, Deque)
- Introdução a Stream API
- Persistência com banco de dados
- Frameworks como Spring Boot

---

## 📝 Notas de Implementação

**Lembre-se:**
- Sempre validar entrada do usuário
- Implementar tratamento de exceções adequado
- Manter código limpo e bem comentado
- Testar todas as funcionalidades
- Seguir convenções de nomenclatura Java

**Boas Práticas:**
- Use constantes para valores fixos
- Implemente equals() e hashCode() quando necessário
- Prefira interfaces sobre classes concretas
- Mantenha métodos pequenos e focados
- Documente APIs públicas

---

*Este guia foi desenvolvido para auxiliar no aprendizado prático de Java com foco em estruturas de dados e desenvolvimento de aplicações CRUD no terminal.*