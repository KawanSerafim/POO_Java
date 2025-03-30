import exercicio05.*;
import java.util.Scanner;
public class exercicio06 {
    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.print("Deseja modificar qual tipo objeto?\n\n" +
            "0 - Nenhum\n" +
            "1 - Borracha\n" +
            "2 - Lapis\n" +
            "3 - Caderno\n\n" +
            "R: ");
            opc = scan.nextInt();

            switch (opc) {
                case 0:
                    break;
                case 1:
                    modificarBorracha(scan, opc);
                    break;
                case 2:
                    modificarLapis(scan, opc);
                    break;
                case 3:
                    modificarCaderno(scan, opc);
                    break;
                default:
                    System.out.println("O indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Obrigado :)\n\n");
                    break;
            }
        } while(opc != 0);
    }
    public static void modificarBorracha(Scanner scan, int opc){
        Borracha borracha1 = new Borracha();
        Borracha borracha2 = new Borracha();
        do{
            System.out.print("\nDeseja modificar o que na borracha?\n\n" +
            "0 - Nada mais\n" +
            "1 - Tamanho\n" +
            "2 - Formato\n" +
            "3 - Cor\n" +
            "4 - Modelo\n" +
            "5 - Se tem capinha ou nao\n\n" +
            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 0:
                    break;
                case 1:
                    int opc1 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Borracha1\n" +
                        "2 - Borracha2\n\n" +
                        "R: ");
                    opc1 = scan.nextInt();

                    switch(opc1) {
                        case 1:
                            System.out.print("\nDigite o tamanho:\n\n" +
                                "R: ");
                            borracha1.setTamanho(scan.nextInt());
                            break;
                        case 2:
                            System.out.print("\nDigite o tamanho:\n\n" +
                                "R: ");
                            borracha2.setTamanho(scan.nextInt());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 2:
                    int opc2 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Borracha1\n" +
                        "2 - Borracha2\n\n" +
                        "R: ");
                    opc2 = scan.nextInt();

                    switch (opc2) {
                        case 1:
                            System.out.print("\nDigite o formato:\n\n" +
                                "R: ");
                            borracha1.setFormato(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite o formato:\n\n" +
                                "R: ");
                            borracha2.setFormato(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 3:
                    int opc3 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Borracha1\n" +
                        "2 - Borracha2\n\n" +
                        "R: ");
                    opc3 = scan.nextInt();

                    switch (opc3) {
                        case 1:
                            System.out.print("\nDigite a Cor:\n\n" +
                                "R: ");
                            borracha1.setCor(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite a Cor:\n\n" +
                                "R: ");
                            borracha2.setCor(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 4:
                    int opc4 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Borracha1\n" +
                        "2 - Borracha2\n\n" +
                        "R: ");
                    opc4 = scan.nextInt();

                    switch (opc4) {
                        case 1:
                            System.out.print("\nDigite o Modelo:\n\n" +
                                "R: ");
                            borracha1.setModelo(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite o Modelo:\n\n" +
                                "R: ");
                            borracha2.setModelo(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 5:
                    int opc5 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Borracha1\n" +
                        "2 - Borracha2\n\n" +
                        "R: ");
                    opc5 = scan.nextInt();

                    switch (opc5) {
                        case 1:
                            System.out.print("\nTrue se tiver capinha, False se nao tiver:\n\n" +
                                "R: ");
                            borracha1.setComCapinha(scan.nextBoolean());
                            break;
                        case 2:
                            System.out.print("\nTrue se tiver capinha, False se nao tiver:\n\n" +
                                "R: ");
                            borracha2.setComCapinha(scan.nextBoolean());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("O indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Obrigado :)\n\n");
                    break;
            }
        } while(opc != 0);

        System.out.println("\n[Borracha1]\n\n" +
            "- Tamanho: " + borracha1.getTamanho() + 
            "\n- Formato: " + borracha1.getFormato() +
            "\n- Cor: " + borracha1.getCor() +
            "\n- Modelo: " + borracha1.getModelo() +
            "\n- Tem capinha: " + borracha1.getComCapinha() + "\n\n");
            
        System.out.println("[Borracha2]\n\n" +
            "- Tamanho: " + borracha2.getTamanho() + 
            "\n- Formato: " + borracha2.getFormato() +
            "\n- Cor: " + borracha2.getCor() +
            "\n- Modelo: " + borracha2.getModelo() +
            "\n- Tem capinha: " + borracha2.getComCapinha() + "\n\n");
    }
    public static void modificarLapis(Scanner scan, int opc){
        Lapis lapis1 = new Lapis();
        Lapis lapis2 = new Lapis();
        do{
            System.out.print("\nDeseja modificar o que no lapis?\n\n" +
            "0 - Nada mais\n" +
            "1 - Ponta\n" +
            "2 - Tamanho\n" +
            "3 - Cor\n" +
            "4 - Modelo\n" +
            "5 - Material\n\n" +
            "R: ");
            opc = scan.nextInt();

            switch(opc) {
                case 0:
                    break;
                case 1:
                    int opc1 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Lapis1\n" +
                        "2 - Lapis2\n\n" +
                        "R: ");
                    opc1 = scan.nextInt();

                    switch(opc1) {
                        case 1:
                            System.out.print("\nDigite o valor da ponta:\n\n" +
                            "R: ");
                            lapis1.setPonta(scan.nextFloat());
                            break;
                        case 2:
                            System.out.print("\nDigite o valor da ponta:\n\n" +
                            "R: ");
                            lapis2.setPonta(scan.nextFloat());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 2:
                    int opc2 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Lapis1\n" +
                        "2 - Lapis2\n\n" +
                        "R: ");
                    opc2 = scan.nextInt();

                    switch(opc2) {
                        case 1:
                            System.out.print("\nDigite o valor do tamanho:\n\n" +
                            "R: ");
                            lapis1.setTamanho(scan.nextFloat());
                            break;
                        case 2:
                            System.out.print("\nDigite o valor do tamanho:\n\n" +
                            "R: ");
                            lapis2.setTamanho(scan.nextFloat());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 3:
                    int opc3 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Lapis1\n" +
                        "2 - Lapis2\n\n" +
                        "R: ");
                    opc3 = scan.nextInt();

                    switch(opc3) {
                        case 1:
                            System.out.print("\nDigite a Cor:\n\n" +
                            "R: ");
                            lapis1.setCor(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite a Cor:\n\n" +
                            "R: ");
                            lapis2.setCor(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 4:
                    int opc4 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Lapis1\n" +
                        "2 - Lapis2\n\n" +
                        "R: ");
                    opc4 = scan.nextInt();

                    switch(opc4) {
                        case 1:
                            System.out.print("\nDigite o Modelo:\n\n" +
                            "R: ");
                            lapis1.setModelo(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite o Modelo:\n\n" +
                            "R: ");
                            lapis2.setModelo(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 5:
                    int opc5 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Lapis1\n" +
                        "2 - Lapis2\n\n" +
                        "R: ");
                    opc5 = scan.nextInt();

                    switch(opc5) {
                        case 1:
                            System.out.print("\nDigite o Material:\n\n" +
                            "R: ");
                            lapis1.setMaterial(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite o Material:\n\n" +
                            "R: ");
                            lapis2.setMaterial(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("O indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Obrigado :)\n\n");
                    break;
            }
        } while(opc != 0);

        System.out.println("\n[Lapis1]\n\n" +
            "- Ponta: " + lapis1.getPonta() + 
            "\n- Tamanho: " + lapis1.getTamanho() +
            "\n- Cor: " + lapis1.getCor() +
            "\n- Modelo: " + lapis1.getModelo() +
            "\n- Material: " + lapis1.getMaterial() + "\n\n");
            
        System.out.println("[Lapis2]\n\n" +
            "- Ponta: " + lapis2.getPonta() + 
            "\n- Tamanho: " + lapis2.getTamanho() +
            "\n- Cor: " + lapis2.getCor() +
            "\n- Modelo: " + lapis2.getModelo() +
            "\n- Material: " + lapis2.getMaterial() + "\n\n");
    }
    public static void modificarCaderno(Scanner scan, int opc){
        Caderno caderno1 = new Caderno();
        Caderno caderno2 = new Caderno();
        do{
            System.out.print("\nDeseja modificar o que no caderno?\n\n" +
            "0 - Nada mais\n" +
            "1 - Quantidade de Folhas\n" +
            "2 - Quantidade de Materias\n" +
            "3 - Cor das Folhas\n" +
            "4 - Cor da Capa\n" +
            "5 - Modelo\n\n" +
            "R: ");
            opc = scan.nextInt();

            switch (opc) {
                case 0:
                    break;
                case 1:
                    int opc1 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Caderno1\n" +
                        "2 - Caderno2\n\n" +
                        "R: ");
                    opc1 = scan.nextInt();

                    switch(opc1) {
                        case 1:
                            System.out.print("\nDigite a quantidade de folhas:\n\n" +
                            "R: ");
                            caderno1.setQtdFolhas(scan.nextInt());
                            break;
                        case 2:
                            System.out.print("\nDigite a quantidade de folhas:\n\n" +
                            "R: ");
                            caderno2.setQtdFolhas(scan.nextInt());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 2:
                    int opc2 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Caderno1\n" +
                        "2 - Caderno2\n\n" +
                        "R: ");
                    opc2 = scan.nextInt();

                    switch(opc2) {
                        case 1:
                            System.out.print("\nDigite a quantidade de Materias:\n\n" +
                            "R: ");
                            caderno1.setQtdMaterias(scan.nextInt());
                            break;
                        case 2:
                            System.out.print("\nDigite a quantidade de Materias:\n\n" +
                            "R: ");
                            caderno2.setQtdMaterias(scan.nextInt());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 3:
                    int opc3 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Caderno1\n" +
                        "2 - Caderno2\n\n" +
                        "R: ");
                    opc3 = scan.nextInt();

                    switch(opc3) {
                        case 1:
                            System.out.print("\nDigite a Cor das Folhas:\n\n" +
                            "R: ");
                            caderno1.setCorFolhas(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite a Cor das Folhas:\n\n" +
                            "R: ");
                            caderno2.setCorFolhas(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 4:
                    int opc4 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Caderno1\n" +
                        "2 - Caderno2\n\n" +
                        "R: ");
                    opc4 = scan.nextInt();

                    switch(opc4) {
                        case 1:
                            System.out.print("\nDigite a Cor da Capa:\n\n" +
                            "R: ");
                            caderno1.setCorCapa(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite a Cor da Capa:\n\n" +
                            "R: ");
                            caderno2.setCorCapa(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                case 5:
                    int opc5 = 0;
                    System.out.print("\nEscolha qual objeto usar:\n\n" +
                        "1 - Caderno1\n" +
                        "2 - Caderno2\n\n" +
                        "R: ");
                    opc5 = scan.nextInt();

                    switch(opc5) {
                        case 1:
                            System.out.print("\nDigite o Modelo:\n\n" +
                            "R: ");
                            caderno1.setModelo(scan.next());
                            break;
                        case 2:
                            System.out.print("\nDigite o Modelo:\n\n" +
                            "R: ");
                            caderno2.setModelo(scan.next());
                            break;
                        default:
                            System.out.println("\nO indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Pra aprender, volte para ca manualmente q-q\n");
                            break;
                    }
                    break;
                default:
                    System.out.println("O indice nao foi reconhecido. Por favor, digite apenas os numeros indicados para as opcoes. Obrigado :)\n\n");
                    break;
            }
        } while(opc != 0);

        System.out.println("\n[Caderno1]\n\n" +
            "- Quantidade de Folhas: " + caderno1.getQtdFolhas() + 
            "\n- Quantidade de Materias: " + caderno1.getQtdMaterias() +
            "\n- Cor das Folhas: " + caderno1.getCorFolhas() +
            "\n- Cor da Capa: " + caderno1.getCorCapa() +
            "\n- Modelo: " + caderno1.getModelo() + "\n\n");
            
        System.out.println("[Caderno2]\n\n" +
            "- Quantidade de Folhas: " + caderno2.getQtdFolhas() + 
            "\n- Quantidade de Materias: " + caderno2.getQtdMaterias() +
            "\n- Cor das Folhas: " + caderno2.getCorFolhas() +
            "\n- Cor da Capa: " + caderno2.getCorCapa() +
            "\n- Modelo: " + caderno2.getModelo() + "\n\n");
    }
}