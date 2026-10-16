package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicaTest {

    @Test
    void deveReproduzirMusicaNormal() {
        IMusica musica = new Musica();

        assertEquals(
                "Reproduzindo música",
                musica.reproduzir()
        );
    }

    @Test
    void deveAdicionarEfeitoAudio() {
        IMusica musica = new EfeitoAudio(new Musica());

        assertEquals(
                "Reproduzindo música com efeito de áudio",
                musica.reproduzir()
        );
    }

    @Test
    void deveAmplificarVolume() {
        IMusica musica = new VolumeAmplificado(new Musica());

        assertEquals(
                "Reproduzindo música com volume amplificado",
                musica.reproduzir()
        );
    }

    @Test
    void deveCombinarDecorators() {
        IMusica musica =
                new VolumeAmplificado(
                        new EfeitoAudio(new Musica())
                );

        assertEquals(
                "Reproduzindo música com efeito de áudio com volume amplificado",
                musica.reproduzir()
        );
    }
}