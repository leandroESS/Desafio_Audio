## Objetivos do projeto

- Criar uma classe `Audio` com os atributos (`titulo`, `totalReproducoes`, `totalCurtidas` e `classificacao`).
- Utilizar encapsulamento, deixando os atributos privados e criando os getters e setters para acessar e modificar os atributos.
- Criar dois métodos sem retorno: `curte()` e `reproduz()`, que irão incrementar as variáveis `totalCurtidas` e `totalReproducoes`, respectivamente.
- Organizar o código em pacotes.
- Criar uma classe `Musica` estendendo de `Audio`, com os atributos adicionais `album`, `cantor` e `genero`.
- Criar uma classe `Podcast` estendendo de `Audio`, com os atributos adicionais `apresentador` e `descricao`.
- Criar uma classe `Principal` e instanciar um objeto do tipo `Musica` e outro do tipo `Podcast`, preenchendo seus atributos.
- Criar um loop para chamar os métodos `curte()` e `reproduz()` a fim de simular um número grande de reproduções e curtidas.
- Fazer uma sobrescrita do método `getClassificacao` na classe `Musica`, definindo que se a mesma tiver mais de 2000 reproduções a classificação será 10 e para valores inferiores a classificação será 8.
- Fazer uma sobrescrita do método `getClassificacao` na classe `Podcast`, definindo que se o mesmo tiver mais de 500 curtidas a classificação será 10 e para valores inferiores, a classificação será 7.
- Criar uma classe chamada `MusicasPreferidas` ou apenas `Preferencias`, com um método sem retorno (`void`) chamado