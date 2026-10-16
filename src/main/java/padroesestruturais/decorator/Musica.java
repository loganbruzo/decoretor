package padroesestruturais.decorator;

public class Musica implements IMusica {

    @Override
    public String reproduzir() {
        return "Reproduzindo música";
    }
}