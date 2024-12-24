package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;
    public Alfabeto (String origen, String[] letras, String interpretacion){
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }
    public void setLetras(String[] letras){this.letras = letras;}
    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}

    public String[] getLetras(){return letras;}
    public String interpretacion(){return interpretacion;}

    public String toString() {
        String retorno = "";
        for (int i = 0; i < letras.length; i++) {
            if (i == letras.length - 1) {
                retorno += letras[i];
            } else {
                retorno += letras[i] + ", ";
            }
        }
        return retorno;
    }
}
