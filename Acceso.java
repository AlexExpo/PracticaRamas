public class Acceso
{
    
    private String acceso;
    
    private String[] separador;
    
    public Acceso(String horaDeAcceso)
    {
        this.acceso = horaDeAcceso;
        separador = horaDeAcceso.split(" ");
    }
    
    public String getAno() 
    {
        String ano = separador[0];
        return ano;
    }
    
    public String getMes()
    {
        String mes = separador[1];
        return mes;
    }
    
    public String getDia()
    {
        String dia = separador[2];
        return dia;
    }
    
    public String getHora()
    {
        String hora = separador[3];
        return hora;
    }
    
    public String getMinutos()
    {
        String minutos = separador[4];
        return minutos;
    }
}