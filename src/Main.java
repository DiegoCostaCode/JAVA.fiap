import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    //public static é o método//

    public static void main(String[] args) {System.out.println("========Hello, welcome to the card searcher========");

        var scanner = new Scanner (System.in);
        var novacarta = Cadastrarcard (Scanner scanner);
        var novacarta2= Cadastrarcard (Scanner scanner);

        System.out.println("First, enter the card name: ");
        var carta1= scanner.nextLine();

        System.out.println("Great!!"+"Now, enter the mana cost: " );
        var carta1_mana= scanner.nextLine();

        System.out.println("Now, enter card type: ");
        var carta1_type= scanner.nextLine();

        System.out.println("Ok, enter the rarity: ");
        var carta1_rarity= scanner.nextLine();

        System.out.println("What is its abilities? ");
        var carta1_abilities= scanner.nextLine();

        System.out.println("Enter the flavor: ");
        var carta1_flavor= scanner.nextLine();

        System.out.println("Finally, the card power: ");
        var carta1_power= scanner.nextLine();

        System.out.println("This is the result. Enjoy:\r\n"+
                "1-CARD" + "\r\nname: " + carta1 +
                "\r\nmana" + carta1_mana +
                "\r\nType: " + carta1_type +
                "\r\nRarity:" + carta1_rarity +
                "\r\nAbilities: " + carta1_abilities +
                "\r\nFlavor: " + carta1_flavor +
                "\r\nPower: " + carta1_power);


    }
    public static Card Cadastrarcard (Scanner scanner){
    var novaCarta = new Card();
    System.out.println ("Digite o nome da carta: ");
    var nome = scanner.nextLine();

    System.out.printLn(("Digite o tipo da carta: ");

    novaCarta.nome = nome;
    novaCarta.tipo = tipo;

    return novaCarta;
}