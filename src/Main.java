//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Proyecto p1 = new Proyecto();

    p1.setNombre("Sistema de Tránsito");
    p1.setResponsable("Gabriel");
    p1.setProgreso(40);
    p1.avanzar(30);

    System.out.println("Nombre del proyecto: " + p1.getNombre());
    System.out.println("Responsable a cargo: " + p1.getResponsable());
    System.out.println("Progreso actual (%): " + p1.getProgreso() + "%");
    System.out.println("¿Proyecto terminado?: " + p1.isTerminado());
}
