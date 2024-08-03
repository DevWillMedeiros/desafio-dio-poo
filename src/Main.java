import com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("POO");
        curso.setCargaHoraria(30);
        curso.exibir();

    }
}
