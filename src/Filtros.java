import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Filtros {

    public void bandaR(BufferedImage imagem) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for (int y = 0; y < imagem.getHeight(); y++){
            for(int x = 0; x < imagem.getWidth(); x++){
                Color rgbPixel = new Color(imagem.getRGB(x,y));
                int red = rgbPixel.getRed();
                novaImagem.setRGB(x, y, new Color(red, 0, 0).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-bandaR.png"));
    }

    public void bandaG(BufferedImage imagem) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++){
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int green = rgbPixel.getGreen();
                novaImagem.setRGB(x, y, new Color(0, green, 0).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-bandaG.png"));
    }

    public void bandaB(BufferedImage imagem) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++){
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int blue = rgbPixel.getBlue();
                novaImagem.setRGB(x, y, new Color(0, 0 , blue).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-bandaB.png"));
    }

    public void cinzaR(BufferedImage imagem) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int red = rgbPixel.getRed();
                novaImagem.setRGB(x, y, new Color(red,red,red).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-cinzaR.png"));
    }

    public void cinzaG(BufferedImage imagem) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int green = rgbPixel.getGreen();
                novaImagem.setRGB(x, y, new Color(green,green,green).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-cinzaG.png"));
    }

    public void cinzaB(BufferedImage imagem) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int blue = rgbPixel.getBlue();
                novaImagem.setRGB(x, y, new Color(blue,blue,blue).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-cinzaB.png"));
    }

    public void pretoEBranco(BufferedImage imagem) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);
        int media;

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++){
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                media = (rgbPixel.getRed() + rgbPixel.getGreen() + rgbPixel.getBlue()) / 3;
                novaImagem.setRGB(x, y, new Color(media, media, media).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-pretoEBranco.png"));
    }

    public void aumentaTom(BufferedImage imagem, String cor, int valor) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++){
            for (int x = 0; x < imagem.getWidth(); x++){
                Color rgbPixel = new Color(imagem.getRGB(x, y));
                int red = rgbPixel.getRed();
                int green = rgbPixel.getGreen();
                int blue = rgbPixel.getBlue();

                switch (cor){
                    case "red":
                        if(red + valor > 255){
                            novaImagem.setRGB(x, y, new Color(255, green, blue).getRGB());
                        } else {
                            novaImagem.setRGB(x, y, new Color(red + valor, green, blue).getRGB());
                        }
                        break;
                    case "green":
                        if (green + valor > 255){
                            novaImagem.setRGB(x, y, new Color(red, 255, blue).getRGB());
                        } else{
                            novaImagem.setRGB(x, y, new Color(red, green + valor, blue).getRGB());
                        }
                        break;
                    case "blue":
                        if(blue + valor > 255){
                            novaImagem.setRGB(x, y, new Color(red, green, 255).getRGB());
                        } else{
                            novaImagem.setRGB(x, y, new Color(red, green, blue + valor).getRGB());
                        }
                        break;
                    default:
                        System.out.println("Digite um valor válido (red, green, blue)");
                }
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-com-mais-tom.png"));
    }

    public void negativo(BufferedImage imagem) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++) {
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));

                int red = rgbPixel.getRed();
                int green = rgbPixel.getGreen();
                int blue = rgbPixel.getBlue();

                novaImagem.setRGB(x, y, new Color(255 - red, 255 - green, 255 - blue).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-negativas.png"));
    }

    public void limiarizacao(BufferedImage imagem, int valorLimiarizacao) throws IOException {
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);
        int media = 0;
        for(int y = 0; y < imagem.getHeight(); y++) {
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));

                int red = rgbPixel.getRed();
                int green = rgbPixel.getGreen();
                int blue = rgbPixel.getBlue();

                media = (red + green + blue )/3;

                if(media > valorLimiarizacao){
                    novaImagem.setRGB(x, y, new Color(255,255,255).getRGB());
                } else {
                    novaImagem.setRGB(x, y, new Color(0, 0, 0).getRGB());
                }
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-limiarizadas.png"));

    }

    public void addBrilho(BufferedImage imagem, int valor) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++) {
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rgbPixel = new Color(imagem.getRGB(x, y));

                int red = rgbPixel.getRed();
                int green = rgbPixel.getGreen();
                int blue = rgbPixel.getBlue();

                if(red + valor > 255){
                    red = 255;
                } else{
                    red += valor;
                }

                if(green + valor > 255){
                    green = 255;
                }else {
                    green += valor;
                }

                if(blue + valor > 255){
                    blue = 255;
                }else{
                    blue += valor;
                }

                novaImagem.setRGB(x, y, new Color(red, green, blue).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-mais-brilho.png"));
    }

    public void multiBrilho(BufferedImage imagem, double valor) throws IOException{
        BufferedImage novaImagem = new BufferedImage(imagem.getWidth(), imagem.getHeight(), 1);

        for(int y = 0; y < imagem.getHeight(); y++) {
            for (int x = 0; x < imagem.getWidth(); x++) {
                Color rbgPixel = new Color(imagem.getRGB(x, y));

                int red = (int) (rbgPixel.getRed() * valor);
                int green = (int) (rbgPixel.getGreen() * valor);
                int blue = (int) (rbgPixel.getBlue() * valor);

                if(red > 255){
                    red = 255;
                }
                if(green > 255){
                    green = 255;
                }
                if(blue > 255){
                    blue = 255;
                }

                novaImagem.setRGB(x, y, new Color(red,green,blue).getRGB());
            }
        }
        ImageIO.write(novaImagem, "png", new File("C:\\Users\\Marco\\Pictures\\testeImagens\\araras-multi-brilho.png"));
    }

}