import java.util.Arrays;

public class Agenda {
    Perfil[] agenda;

    public Agenda(int espacioAgenda) {
        this.agenda = new Perfil[espacioAgenda];
    }

    @Override
    public String toString() {
        return "Contenido de la agenda:" +
                Arrays.toString(agenda);
    }

    public void addPerfilAgenda(Perfil nuevoPerfil) {
        boolean pararAdd = false;
        for (int i = 0; i < this.agenda.length && !pararAdd; i++) {
            try {
                if (this.agenda[i] == null) {
                    this.agenda[i] = nuevoPerfil;
                    pararAdd = true;
                    System.out.println("Contacto añadido correctamente.");
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                System.out.println("No existen huecos libres en la agenda.");
            }
        }
    }
}
