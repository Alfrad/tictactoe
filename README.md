<h1 align="center">
    <img height="150"  alt="Tic Tac Toe - Recursivo" src="https://i.imgur.com/CfgMa83.png" />
</h1>

<div align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/Alfrad/tictactoe.svg">

  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/Alfrad/tictactoe.svg">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/Alfrad/tictactoe.svg">

  <a href="https://github.com/Alfrad/tictactoe/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Alfrad/tictactoe.svg">
  </a>

  <a href="https://github.com/Alfrad/tictactoe/issues">
    <img alt="Repository issues" src="https://img.shields.io/github/issues/Alfrad/tictactoe.svg">
  </a>

  <img alt="GitHub" src="https://img.shields.io/github/license/Alfrad/tictactoe">
</div>

<div align="center">
  <a href="#thinking-sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tongue-requisitos">Requesitos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#gear-build">Build</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>
</div>

## :thinking: Sobre

Joga da velha implementado com recursividade. Utilizando também [Magic Square](https://mathworld.wolfram.com/MagicSquare.html) para encontrar o vencedor na matriz.

## :rocket: Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Commons Lang](http://commons.apache.org/proper/commons-lang/)

## :tongue: Requesitos

- [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)

## :gear: Build

```bash
$ mvn clean compile assembly:single 
$ cd target
$ java -jar nameOfJar.jar
```
Ps: Os movimentos devem ser iniciados com (número,número), onde número assume um valor mínimo de 0 e um máximo de 2.
## :memo: License

Este projeto está sob a licença MIT. Consulte [LICENSE](https://github.com/Alfrad/tictactoe/blob/master/LICENSE) para obter mais informações.
