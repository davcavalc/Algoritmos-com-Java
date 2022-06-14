# Para concatenar vários elementos em um mesmo comando de escrita

Regra geral para `printf`:

`"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2;`
| tipo | descrição
|  %f  | ponto flutuante
|  %d  | inteiro
|  %s  | texto
|  %n  | quebra de linha

```java
public static void main(String[] args) {
    DadosImpressos();
}
public static void DadosImpressos() {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }

// Maria tem 31 anos e ganha R$ 4000.00 reais.
```
<!-- TODO parei na aula "Saída de dados" -->