package maquina;

import java.util.Scanner;

public class MaquinaCafe {
    private final Scanner scan;
    private int agua;
    private int leite;
    private int graos;
    private int dinheiro;
    private int coposDes;

    enum Cafe {
        EXPRESSO(250, 0, 16, 4),
        LONGO(350, 75, 20, 7),
        CAPPUCCINO(200, 100, 12, 6);

        private final int agua;
        private final int leite;
        private final int graos;
        private final int dinheiro;

        Cafe(int agua, int leite, int graos, int dinheiro) {
            this.agua = agua;
            this.leite = leite;
            this.graos = graos;
            this.dinheiro = dinheiro;
        }

        public int getAgua() {
            return this.agua;
        }

        public int getLeite() {
            return this.leite;
        }

        public int getGraos() {
            return this.graos;
        }

        public int getDinheiro() {
            return this.dinheiro;
        }
    }

    private MaquinaCafe() {
        this.scan = new Scanner(System.in);
        this.agua = 400;
        this.leite = 540;
        this.graos = 120;
        this.coposDes = 9;
        this.dinheiro = 20;
    }

    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        String acao = maquinaCafe.checarAcao();

        while (!acao.equals("sair")) {
            acao = maquinaCafe.checarAcao();
        }
    }

    private String checarAcao() {
        String acao;
        System.out.println("Escolha a ação (comprar, recarregar, saldo, estado, sair):");
        acao = scan.next();
        System.out.println();

        switch (acao) {
            case "comprar": {
                comprarCafe();
                break;
            }
            case "recarregar": {
                encherMaquina();
                break;
            }
            case "saldo": {
                receberDinheiro();
                break;
            }
            case "estado": {
                printEstado();
                break;
            }
        }
        return acao;
    }

    private void printEstado() {
        System.out.println("A máquina de café têm:");
        System.out.printf("%d de agua\n", this.agua);
        System.out.printf("%d de leite\n", this.leite);
        System.out.printf("%d de grãos de café\n", this.graos);
        System.out.printf("%d de copos descartáveis\n", this.coposDes);
        System.out.printf("%d de dinheiro\n", this.dinheiro);
        System.out.println();
    }

    private void comprarCafe() {
        System.out.println("Qual café você deseja? 1 - expresso, 2 - longo, 3 - cappuccino, voltar - para o menu principal: ");
        String cafe = this.scan.next();

        switch (cafe) {
            case "voltar": {
                break;
            }
            case "1": {
                this.checarDisponibilidade(Cafe.EXPRESSO);
                break;
            }
            case "2": {
                this.checarDisponibilidade(Cafe.LONGO);
                break;
            }
            case "3": {
                this.checarDisponibilidade(Cafe.CAPPUCCINO);
                break;
            }
        }
    }

    private void encherMaquina() {
        System.out.println("Digite a quantidade(ml) de agua que deseja adicionar: ");
        int addAgua = this.scan.nextInt();
        System.out.println("Digite a quantidade(ml) de leite que deseja adicionar: ");
        int addLeite = this.scan.nextInt();
        System.out.println("Digite a quantidade(gr) de grãos que deseja adicionar: ");
        int addGraos = this.scan.nextInt();
        System.out.println("Digite a quantidade de copos que deseja adicionar: ");
        int addCopDes = this.scan.nextInt();
        this.agua += addAgua;
        this.leite += addLeite;
        this.graos += addGraos;
        this.coposDes += addCopDes;
    }

    private void receberDinheiro() {
        System.out.printf("Seu dinheiro: R$%d\n", this.dinheiro);
        this.dinheiro = 0;
    }

    private void checarDisponibilidade(Cafe cafe) {
        if (cafe.getAgua() > this.agua) {
            System.out.println("Desculpe, não há agua suficiente!");
        } else if (cafe.getLeite() > this.leite) {
            System.out.println("Desculpe, não há leite suficiente!");
        } else if (cafe.getGraos() > this.graos) {
            System.out.println("Desculpe, não há grão de café suficientes!");
        } else if (this.coposDes < 1) {
            System.out.println("Desculpe, não há copos descartáveis!");
        } else if (cafe.getDinheiro() > this.dinheiro) {
            System.out.println("Desculpe, não há dinheiro suficiente!");
        } else {
            this.agua -= cafe.getAgua();
            this.graos -= cafe.getGraos();
            this.leite -= cafe.getLeite();
            this.coposDes -= 1;
            this.dinheiro += cafe.getDinheiro();
            System.out.println("Possui tudo disponível, fazendo seu café!");
        }
        System.out.println();
    }
}
