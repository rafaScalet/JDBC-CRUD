# Comandos para empacotar

## Comando `tar --exclude='bin' --exclude='.git' --exclude='data' --exclude='./**/*.tar.gz' -czvf jdbc-crud.tar.gz .`

Este comando empacota arquivos em um arquivo `.tar.gz`. Aqui está a explicação de cada parâmetro:

- **`tar`**: Utilitário de linha de comando para criar e manipular arquivos tar.

- **`--exclude='bin'`**: Exclui o diretório `bin` do arquivo compactado. Isso é útil para não incluir arquivos temporários ou de compilação.

- **`--exclude='.git'`**: Exclui o diretório `.git`, evitando a inclusão de dados de controle de versão.

- **`--exclude='data'`**: Exclui o diretório `data`, que pode conter informações que não precisam ser empacotadas.

- **`--exclude='./**/*.tar.gz'`**: Exclui quaisquer arquivos `.tar.gz` já existentes no diretório ou em subdiretórios, evitando duplicação.

- **`-czvf jdbc-crud.tar.gz`**:
  - **`-c`**: Cria um novo arquivo tar.
  - **`-z`**: Compacta o arquivo usando gzip.
  - **`-v`**: Habilita o modo verbose, mostrando os arquivos sendo processados.
  - **`-f jdbc-crud.tar.gz`**: Especifica o nome do arquivo de saída, que neste caso é `jdbc-crud.tar.gz`.

- **`.`**: Indica que todos os arquivos e diretórios do diretório atual devem ser incluídos, exceto os que foram excluídos.

---

## Comando `zip -r jdbc-crud.zip . -x bin/\* -x .git/\* -x data/\* -x \*.zip`

Este comando empacota arquivos em um arquivo `.zip`. Aqui está a explicação de cada parâmetro:

- **`zip`**: Utilitário de linha de comando para criar arquivos zip.

- **`-r`**: Indica que a operação deve ser feita de forma recursiva, incluindo todos os arquivos e subdiretórios.

- **`jdbc-crud.zip`**: Especifica o nome do arquivo de saída, que neste caso é `jdbc-crud.zip`.

- **`.`**: Indica que todos os arquivos e diretórios do diretório atual devem ser incluídos, exceto os que foram excluídos.

- **`-x bin/\*`**: Exclui todos os arquivos dentro do diretório `bin`.

- **`-x .git/\*`**: Exclui todos os arquivos dentro do diretório `.git`.

- **`-x data/\*`**: Exclui todos os arquivos dentro do diretório `data`.

- **`-x \*.zip`**: Exclui todos os arquivos que já estão no formato `.zip`, evitando duplicação.

## Resumo
Os comandos empacotam arquivos em formatos diferentes, excluindo diretórios e arquivos específicos:
- O primeiro comando cria um arquivo `.tar.gz` usando `tar`, enquanto o segundo cria um arquivo `.zip` usando `zip`.
