/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/

public class Truco {
    Jogador player1;
    Jogador player2;
    Baralho deck;
    Carta cartaFlipada;

    public Truco() {
        player1 = new Jogador();
        player2 = new Jogador();
        deck = new Baralho();
        cartaFlipada = new Carta(null, null);
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }

    private void embaralhaCartas(){
        deck.embaralhar();
    }

    private void distribuiMaos(){
        player1.recebeCarta(deck.distribuir());
        player2.recebeCarta(deck.distribuir());
    }

    private void inicializaManilha(){
        cartaFlipada = deck.distribuir();
    }


}
