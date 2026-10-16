package padroesestruturais.decorator;

public abstract class DecoratorMusica implements IMusica {

    protected IMusica musica;

    public DecoratorMusica(IMusica musica) {
        this.musica = musica;
    }
}