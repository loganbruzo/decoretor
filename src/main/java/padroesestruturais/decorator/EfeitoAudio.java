package padroesestruturais.decorator;

public class EfeitoAudio extends DecoratorMusica {

    public EfeitoAudio(IMusica musica) {
        super(musica);
    }

    @Override
    public String reproduzir() {
        return musica.reproduzir() + " com efeito de áudio";
    }
}