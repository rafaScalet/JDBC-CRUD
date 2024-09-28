# Implementação do JDBC

Este é um projeto acadêmico que fiz para testar a implementação do Connector/J do MySQL usando java e algumas bibliotecas externas

## Estrutura

- **src**: é onde está todo o código fonte da minha aplicação
- **docs**: é onde está toda a documentação para o projeto
- **lib**: é onde estão as bibliotecas externas
- **.vscode**: é onde tem configurações para ajudar usuários desta IDE, como "auto build" ou "intellisense"

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
tar --exclude='bin' --exclude='.git' --exclude='data' --exclude='./**/*.tar.gz' -czf jdbc-crud.tar.gz .
```

- .zip:
```bash
zip -r jdbc-crud.zip . -x bin/\* -x .git/\* -x data/\* -x \*.zip
```

para ver a explicação de cada parâmetro [clique aqui](/docs/ComandoEmpacotar.md)

## Diagrama de Classe

![Diagrama de classe](/docs/uml.drawio.png)