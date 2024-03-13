public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Aluno larissa = new Aluno("Larissa", "111.222.333-44", 2921234, "21/09/2023","Feminino");
        larissa.setNome("Lariça");
        Aluno a = new Aluno();
        a.setNome("Eddie");
        System.out.println(a.getNome());
    }
}
