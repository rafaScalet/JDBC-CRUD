# Implementação do JDBC

Este é um projeto acadêmico que fiz para testar a implementação do Connector/J do MySQL usando java e algumas bibliotecas externas

## Estrutura

- **src**: é onde está todo o código fonte da minha aplicação
- **docs**: é onde está toda a documentação para o projeto
- **lib**: é onde estão as bibliotecas externas
- **.vscode**: é onde tem configurações para ajudar usuários desta IDE, como "auto build" ou "intellisense"

```plaintext
├── .vscode
├── docs
├── lib
│   ├── dotenv-java-3.0.2.jar
│   └── mysql-connector-j-9.0.0.jar
├── src
│   ├── config
│   │   └── DatabaseConnection.java
│   ├── dao
│   │   └── ProductDAO.java
│   ├── entity
│   │   └── Product.java
│   ├── main
│   │   └── Main.java
│   └── menu
│       ├── DeleteMenu.java
│       ├── ListMenu.java
│       ├── ProductMenu.java
│       ├── SaveMenu.java
│       └── UpdateMenu.java
├── compose.yml
├── .editorconfig
├── .gitignore
├── init.sh
├── manifest.mf
├── readme.md
├── structure.txt
└── .tool-versions
```

## Usagem
1. suba o container docker usando o seguinte comando:

```bash
docker-compose up -d
```

O parâmetro -d é para não travar o terminal

2. rode o projeto usando o shell script presente na raiz:

```bash
./init.sh
```

ou então rode separadamente os comandos dentro dele:

```bash
javac -d bin -cp "lib/*" src/**/*.java
java -cp "bin:lib/*" main.Main
```

para ver a explicação de cada parâmetro [clique aqui](/docs/ComandoInit.md).

> Para rodar em um Windows, substitua o ":" no segundo comando por ";"

3. Para empacotar (é necessário enviar compactado ao professor) podemos usar 2 comandos, dependendo da extensão de arquivo desejada:

- .tar.gz:

```bash
tar --exclude='bin' --exclude='.git' --exclude='data' --exclude='*.tar.gz' --exclude='*.zip' -czf jdbc-crud.tar.gz .
```

- .zip:
```bash
zip -r jdbc-crud.zip . -x bin/\* -x .git/\* -x data/\* -x \*.zip -x \*.tar.gz
```

para ver a explicação de cada parâmetro [clique aqui](/docs/ComandoEmpacotar.md)

## Diagrama de Classe

![Diagrama de classe](/docs/uml.drawio.png)