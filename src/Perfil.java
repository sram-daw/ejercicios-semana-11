public class Perfil {
    private String nombre;
    private int edad;
    private double altura;
    private int tlf;

    public Perfil(String nombre, int edad, double altura, int tlf) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Nuevo perfil{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", tlf=" + tlf +
                '}';
    }
}
