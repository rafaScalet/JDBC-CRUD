# Comandos dentro de init.sh

## Comando `javac -d bin -cp "lib/*" src/**/*.java`

Este comando compila arquivos Java em um projeto. Aqui está a explicação de cada parâmetro:

- **`javac`**: Compilador Java que converte arquivos `.java` em arquivos de bytecode `.class`.

- **`-d bin`**: Especifica o diretório de destino (`bin`) para os arquivos compilados. Se o diretório não existir, será criado.

- **`-cp "lib/*"`**: Define o caminho de classe, incluindo todas as bibliotecas (`.jar` ou classes) no diretório `lib`. O asterisco (`*`) representa todos os arquivos dentro do diretório.

- **`src/**/*.java`**: Indica os arquivos de código-fonte a serem compilados. `src/` é o diretório raiz, e `**/*.java` busca recursivamente todos os arquivos `.java` em `src` e seus subdiretórios.

## Resumo
O comando compila todos os arquivos `.java` em `src`, coloca os arquivos compilados em `bin`, e inclui bibliotecas do diretório `lib`.

## Comando `java -cp "bin:lib/*" main.Main`

Este comando executa um programa Java. Aqui está a explicação de cada parâmetro:

- **`java`**: Inicia a Java Virtual Machine (JVM) para executar um programa Java.

- **`-cp "bin:lib/*"`**: Define o caminho de classe para a JVM. Este parâmetro é crucial para localizar as classes e bibliotecas necessárias durante a execução do programa.

  - **`bin`**: Indica o diretório onde estão os arquivos `.class` compilados. A JVM irá procurar as classes principais e qualquer outra classe que o programa precise nesse diretório.
  
  - **`lib/*`**: Inclui todas as bibliotecas (.jar ou classes) dentro do diretório `lib`. O asterisco (`*`) atua como um curinga, permitindo que a JVM acesse todos os arquivos nesse diretório.

  - **Diferenças de Separador de Caminho**:
    - **Linux/Unix**: O separador de caminho é `:`. Assim, você usa `bin:lib/*` para indicar que tanto o diretório `bin` quanto todos os arquivos no diretório `lib` devem ser incluídos no caminho de classe.
    - **Windows**: O separador de caminho é `;`. Portanto, você deve usar `bin;lib/*` para o mesmo propósito. É importante ajustar isso ao executar o comando em um ambiente Windows.

- **`main.Main`**: Especifica a classe principal a ser executada. Neste caso, `Main` é a classe dentro do pacote `main`.

## Resumo
O comando executa a classe `main.Main`, utilizando as classes compiladas em `bin` e as bibliotecas do diretório `lib`, com atenção ao formato do separador de caminho dependendo do sistema operacional:
- **Linux**: `-cp "bin:lib/*"`
- **Windows**: `-cp "bin;lib/*"`
