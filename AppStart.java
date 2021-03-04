
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public void main() {
        Size size = Size.MEDIUM;
        System.out.println("Name        :            " + size.name());
        System.out.println("toString()  :            " + size.toString().trim());
        System.out.println("Ordem       :            " + size.ordinal());
        System.out.println("Valor mínimo:            " + size.getMinValue());
        System.out.println("Valor máximo:            " + size.getMaxValue());
        System.out.println("Código      :            " + size.getCode());
    }
}
