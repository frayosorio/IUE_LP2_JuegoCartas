import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carta {

    private int indice;

    public Carta(Random r) {
        indice = r.nextInt(52) + 1;
    }

    public void mostrar(JPanel pnl, int x, int y) {
        String archivoCarta = "imagenes/CARTA" + indice + ".jpg";
        ImageIcon imgCarta=new ImageIcon(getClass().getResource(archivoCarta));
        JLabel lblCarta=new JLabel();
        lblCarta.setIcon(imgCarta);
        lblCarta.setBounds(x, y, imgCarta.getIconWidth(), imgCarta.getIconHeight());

        pnl.add(lblCarta);
    }

}
