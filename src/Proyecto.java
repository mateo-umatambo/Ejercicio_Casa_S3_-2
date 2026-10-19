public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (this.progreso == 100) {
                this.terminado = true;
            }
        }
    }

    public int getProgreso() {
        return progreso;
    }


    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsable() {
        return responsable;
    }


    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public boolean isTerminado() {
        return terminado;
    }


    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                this.progreso = 100;
                this.terminado = true;
            } else {
                this.progreso = nuevoProgreso;
                if (this.progreso == 100) {
                    this.terminado = true;
                }
            }
        }
    }
}
