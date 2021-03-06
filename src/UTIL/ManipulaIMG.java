package UTIL;
    import java.awt.Graphics2D;
    import java.awt.image.BufferedImage;
    import java.io.ByteArrayInputStream;
    import java.io.ByteArrayOutputStream;
    import java.io.File;
    import java.io.IOException;
    import java.io.InputStream;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.imageio.ImageIO;
    import javax.swing.ImageIcon;

public class ManipulaIMG {
    public static BufferedImage setImagemDimensao(String caminhoImg, Integer imgLargura, Integer imgAltura){
        Double novaImgLargura = null;
        Double novaImgAltura = null;
        Double imgProporcao = null;
        Graphics2D g2d = null;
        BufferedImage imagem = null, novaImagem = null;
        
        try{
            //---Obtém a imagem a ser redimensionada---//
            imagem = ImageIO.read(new File(caminhoImg));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(ManipulaIMG.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //---Obtém a largura da imagem---//
        novaImgLargura = (double) imagem.getWidth();
        //---Obtém a altura da imagem---//
        novaImgAltura = (double) imagem.getHeight();
        
        //---Verifica se a altura ou largura da imagem receida é maior do que os---//
        //---parâmetros de altura e largura recebidos para o redimensionamento---//
        if(novaImgLargura >= imgLargura){
            imgProporcao = (novaImgAltura / novaImgLargura);//Calcula proporção
            novaImgLargura = (double) imgLargura;
            
            //---Altura deve <= ao parâmetro imgAltura e proporcional a largura---//
            novaImgAltura = (novaImgLargura * imgProporcao);
            
            //---Se altura for maior do que o parâmetro imgLargura, diminui-se a altura de---//
            //---forma que a altura seja igual ao parâmetro imgAltura e proporcional a largura---//
            while(novaImgAltura > imgAltura){
                novaImgLargura = (double) (--imgLargura);
                novaImgAltura = (novaImgLargura * imgProporcao);
            }
        }else if(novaImgAltura > imgAltura){
            imgProporcao = (novaImgLargura / novaImgAltura);//Calcula a proporção
            novaImgAltura = (double) imgAltura;
            
            //---Se largura for maior do que o parâmetro imgLargura, diminui-se a altura de---//
            //---forma que a largura seja igual ai parâmetro imgLargura e proporcional a altura---//
            while(novaImgLargura > imgLargura){
                novaImgAltura = (double) (--imgAltura);
                novaImgLargura = (novaImgAltura * imgProporcao);
            }
        }
        
        novaImagem = new BufferedImage(novaImgLargura.intValue(), novaImgAltura.intValue(), BufferedImage.TYPE_INT_RGB);
        g2d = novaImagem.createGraphics();
        g2d.drawImage(imagem, 0, 0, novaImgLargura.intValue(), novaImgAltura.intValue(), null);
        
        return novaImagem;
    }
    
    public static byte[] getImgBytes(BufferedImage image){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            ImageIO.write(image, "JPEG",baos);
        }catch(IOException ex){
            //handle it here.... not implemented yet...
        }
        
        InputStream is = new ByteArrayInputStream(baos.toByteArray());
        return baos.toByteArray();
    }
    
    //Recebe o label que queremos exibir E a imagem com a arrey de bytes no banco
    public static void exibirImagemLabel(byte[] minhaimagem, javax.swing.JLabel label){
        //primeiro verifica se tem a imagem
        //se tem convert para inputstream que é o formato reconhecido pelo ImageIO
        
        if(minhaimagem!=null){
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try{
                BufferedImage imagem = ImageIO.read(input);
                label.setIcon(new ImageIcon(imagem));
            }catch(IOException ex){
                
            }
            
        }else{
            label.setIcon(null);
        }
    }
}
