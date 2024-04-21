# Iniciando o caminho pelo Java
Implementação de Cadastro de Clientes em Java com Persistência em Arquivos

- Campus: 202301037751 - POLO CENTRO - PORTO REAL - RJ
- Curso: Desenvolvimento Full Stack
- Disciplina: Nível 1: Iniciando o Caminho Pelo Java
- Turma: 9001
- Semestre letivo: 3º Semestre
- Nome do estudante: Leonardo Naves de Lima Araujo

Missão Prática | Nível 1 | Mundo 3

RPG0014 - Iniciando o caminho pelo Java
1º Procedimento | Criação das Entidades e Sistema de Persistência

Implementação de Cadastro de Clientes em Java com Persistência em Arquivos

# Objetivos da prática
1. Utilizar herança e polimorfismo na definição de entidades.
2. Utilizar persistência de objetos em arquivos binários.
3. Implementar uma interface cadastral em modo texto.
4. Utilizar o controle de exceções da plataforma Java.
5. No final do projeto, o aluno terá implementado um sistema cadastral em Java,
6. utilizando os recursos da programação orientada a objetos e a persistência em
7. arquivos binários

# Materiais necessários para a prática
JDK e IDE NetBeans.
Equipamentos: Computador com JDK e NetBeans instalados.

# Resultados da Execução
![Screenshot 2024-04-21 184840](https://github.com/Navesz/Iniciando-o-caminho-pelo-Java/assets/58537948/f2a0323a-aa27-4dcb-b168-6b2d57bfe7c7)

run:
Dados de Pessoa Fisica Armazenados.
Dados de Pessoa Fisica Recuperados.
Id: 1
Nome: Ana
CPF: 11111111111
Idade: 25
Id: 2
Nome: Carlos
CPF: 22222222222
Idade: 52
Dados de Pessoa Juridica Armazenados.
Dados de Pessoa Juridica Recuperados.
Id: 3
Nome: XPTO Sales
CNPJ: 33333333333333
Id: 4
Nome: XPTO Solutions
CNPJ: 44444444444444
BUILD SUCCESSFUL (total time: 0 seconds)

# Análise e Conclusão
● Vantagens e Desvantagens do Uso de Herança: A herança facilita a reutilização
de código e melhora a organização do mesmo ao estabelecer uma hierarquia clara
de classes. Contudo, pode levar a uma estrutura rígida e frágil, dificultando
alterações futuras e a compreensão do fluxo de execução em sistemas complexos.
● Interface Serializable: Esta interface é necessária para a persistência em arquivos
binários, pois habilita a capacidade de um objeto ser transformado em uma
sequência de bytes e ser posteriormente reconstruído sem perder as informações de
estado.
● Paradigma Funcional na API Stream: O paradigma funcional é utilizado na API
Stream do Java para permitir operações de processamento de coleções de forma
concisa e expressiva, apoiando-se em expressões lambda, operações de alto nível e
processamento paralelo.
● Padrão de Desenvolvimento em Persistência de Dados: Na comunidade Java é
comum o uso da serialização como meio de armazenamento de dados para
recuperação futura, o que envolve a conversão de objetos em um formato que possa
ser facilmente gerenciado e recuperado quando necessário, possibilitando assim o
armazenamento até mesmo de estruturas de dados complexas.
