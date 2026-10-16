package padroesestruturais.decorator;

public class VolumeAmplificado extends DecoratorMusica {

    public VolumeAmplificado(IMusica musica) {
        super(musica);
    }

    @Override
    public String reproduzir() {
        return musica.reproduzir() + " com volume amplificado";
    }
}