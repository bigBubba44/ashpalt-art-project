import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    MuralPainter background = new MuralPainter();
    background.paintBackground("Black",12);
//setting the pixel painter to have a set amount of paint
    PixelPainter painter = new PixelPainter();
    painter.setPaint(1000);
   // painter paints mercedes star logo symbol
    painter.paintSymbol();
   
  }
}
