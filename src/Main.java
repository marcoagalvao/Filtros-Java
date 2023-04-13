import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File imagemAraras = new File("C:\\Users\\Marco\\Pictures\\testeImagens\\tulips.png");

        BufferedImage araras = null;

        araras = ImageIO.read(imagemAraras);

        Filtros filtro = new Filtros();

        filtro.bandaR(araras);
        filtro.bandaG(araras);
        filtro.bandaB(araras);
        filtro.cinzaR(araras);
        filtro.cinzaG(araras);
        filtro.cinzaB(araras);
        filtro.pretoEBranco(araras);
        filtro.aumentaTom(araras, "blue", 40);
        filtro.negativo(araras);
        filtro.limiarizacao(araras, 100);
        filtro.addBrilho(araras, 100);
        filtro.multiBrilho(araras, 1.5);
    }
}