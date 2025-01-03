package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private  static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public void setInterpretacion(String interpretacion){this.interpretacion = interpretacion;}
    public void setIdea(String idea){this.idea = idea;}
    public void setArgumentos(String[] argumentos){this.argumentos =argumentos;}
    public void setConclusion(String conclusion){this.conclusion = conclusion;}
    public void setReferencias(String referencias){this.referencias = referencias;}

    public String interpretacion(){return interpretacion;}
    public String[] getArgumentos(){return argumentos;}
    public String getIdea(){return idea;}
    public String getConclusion(){return conclusion;}
    public String getReferencias(){return referencias;}

    public String toString(){
        return super.getOrigen() + "\n"
                + super.getTitulo() + "\n"
                + super.getAutor() + "\n"
                + super.getPaginas() + "\n"
                + this.idea + "\n"
                + argumentos.length + "\n"
                + this.conclusion + "\n"
                + this.referencias;
    }

    public int palabrasTotales(int palabrasPagina){
        return super.getPaginas() * palabrasPagina * 5;
    }
}
