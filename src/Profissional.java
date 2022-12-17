public class Profissional{
    public String name;
    public double VMD;
    public double HDD;
    public double HMD;

    public int diasUteis = 20;

    public double HMD(){
        return (diasUteis * HDD); //HMD = Horas Mensais Disponíveis
    }

    public double VH() {
        HMD = (diasUteis * HDD);
        return (VMD / HMD);
    }
}