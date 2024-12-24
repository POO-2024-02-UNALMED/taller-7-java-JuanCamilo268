package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}
    public void setEnsenanza(String ensenanzas){this.ensenanzas = ensenanzas;}

    public String interpretacion(){return interpretacion;}
    public String getEnsenanza(){return ensenanzas;}

    public String toString(){
        return super.getOrigen() + "\n"
                + super.getTitulo() + "\n"
                + super.getAutor() + "\n"
                + super.getPaginas() + "\n"
                + this.ensenanzas;
    }
    public int palabrasTotales(int palabrasPagina){
        return super.getPaginas() * palabrasPagina;
    }
}

