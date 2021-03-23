package exemplos.exemplo01;

public class app {
    public static void main(String[] args) {
       // Funcionario f2 = new Funcionario();
        Funcionario f = new Funcionario("Adalberto B", 25000.00);
        Gerente g = new Gerente("Adalberto", 25000.00, 10);

        
        //g.nome = "Fernando";
        f.calculaNovoSalario(10.0);
        System.out.println(f.exibir());
        System.out.println(g.exibir());

        System.out.println(f.toString());
        System.out.println(g.toString());
            
    }
}
