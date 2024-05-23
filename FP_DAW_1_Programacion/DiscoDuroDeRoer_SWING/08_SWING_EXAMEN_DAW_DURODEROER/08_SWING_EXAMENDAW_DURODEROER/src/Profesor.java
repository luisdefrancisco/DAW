
/**
 * @author Luis Martin de Francisco
 */
public class Profesor extends Persona{
    private double salario;
    private boolean fijo;

    public Profesor() {
    }

    public Profesor(double salario, boolean fijo, String dni, String nombre) {
        super(dni, nombre);
        this.salario = salario;
        this.fijo = fijo;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario(double irpf, int antiguedad){
        double salarioNeto = (this.salario)*(100-irpf) + (antiguedad*50);
        return salarioNeto;
    }

    @Override
    public String toString() {
        return super.toString() + " salario=" + salario + ", fijo=" + fijo;
    }
    
    
}
