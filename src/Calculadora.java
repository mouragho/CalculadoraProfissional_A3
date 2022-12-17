import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in);
        Profissional profissional = new Profissional();
        System.out.println("Digite o seu primeiro nome: ");
        profissional.name = enterScanner.next();
        System.out.println("Digite o salário mensal pretendido: ");
        profissional.VMD = enterScanner.nextDouble();
        System.out.println("Digite a quantidade de horas diarias: ");
        profissional.HDD = enterScanner.nextDouble();
        System.out.println("Nome: " + profissional.name);
        System.out.println("Salario mensal pretendido: " + profissional.VMD);
        System.out.println("Horas mês: " + profissional.HMD());
        System.out.println("Valor/Hora: " + profissional.VH());

        System.out.println("______________________________________________________");
        double referencia;
        System.out.println("Iniciar um novo projeto? 1 = sim / 0 = não");
        referencia = enterScanner.nextDouble();

        if (referencia != 1){
            System.out.println("Obrigado por utilizar a calculadora!");
        }
        
        else{   
            double TESD;
            TelasEsd telasesd = new TelasEsd();
            System.out.println("Digite as quantidades");
            System.out.println("Quantas telas com entradas e saídas de dados (Dificuldade 1):");
            telasesd.TESD1 = enterScanner.nextDouble();
            System.out.println("Quantas telas com entradas e saídas de dados (Dificuldade 2):");
            telasesd.TESD2 = enterScanner.nextDouble();
            System.out.println("Quantas telas com entradas e saídas de dados (Dificuldade 3):");
            telasesd.TESD3 = enterScanner.nextDouble();

            TESD = telasesd.TESD();

            double TCID;
            TelasCID telascid = new TelasCID();
            System.out.println("Quantas telas de consultas com informação de dados (Dificuldade 1):");
            telascid.TCID1 = enterScanner.nextDouble();
            System.out.println("Quantas telas de consultas com informação de dados (Dificuldade 2):");
            telascid.TCID2 = enterScanner.nextDouble();
            System.out.println("Quantas telas de consultas com informação de dados (Dificuldade 3):");
            telascid.TCID3 = enterScanner.nextDouble();

            TCID = telascid.TCID();

            
            double GD;
            GravDados gdados = new GravDados();
            System.out.println("Quantas gravação de dados (Dificuldade 1):");
            gdados.GD1 = enterScanner.nextDouble();
            System.out.println("Quantas gravação de dados (Dificuldade 2):");
            gdados.GD2 = enterScanner.nextDouble();
            System.out.println("Quantas gravação de dados (Dificuldade 3):");
            gdados.GD3 = enterScanner.nextDouble();
            System.out.println("______________________________________________________");
            System.out.println("");
            GD = gdados.GD();

            enterScanner.close();


            double HorasFinais = (TESD + TCID + GD);
            double ValorFinal = ((((TESD + TCID + GD)*profissional.VH())*130)/100);
            System.out.println("Serão necessárias " + HorasFinais + " horas para conclusão do projeto");
            System.out.println("O valor arredondado do projeto considerando 30% de gastos extras é de: R$" + Math.ceil(ValorFinal));
            System.out.println("Obrigado por utilizar a calculadora!");
        }
        
    
        
    }
}