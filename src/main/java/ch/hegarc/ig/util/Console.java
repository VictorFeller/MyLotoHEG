package ch.hegarc.ig.util;

import ch.hegarc.ig.business.Partie;
import org.apache.commons.cli.*;
import java.util.Scanner;

public class Console {

    final private String CMD_AJOUTER = "add";
    final private String CMD_CONTROLER = "ctrl";
    final private String CMD_SUPPRIMER = "del";
    final private String CMD_EXIT = "exit";
    final private String CMD_TUTO = "tuto";
    final private String CMD_PRINT = "print";

    /**
     * Démarre la commande
     */
    public void executerCommande() {
        //Affichage du tutoriel
        printAppTuto();

        Scanner command = new Scanner(System.in);
        System.out.println("Entrer vos commande: ");

        boolean running = true;
        while (running) {
            String com = command.nextLine();
            String[] arguments = com.split(" ");
            CommandLine cmdLine = parseArguments(arguments);

            try {
                switch (cmdLine.getArgs()[0]) {
                    case CMD_AJOUTER:
                        Partie.getListeNumeros().add(Integer.valueOf(cmdLine.getArgs()[1]));
                        break;
                    case CMD_CONTROLER:
                        Partie.controlerCarte(String.valueOf(cmdLine.getArgs()[1]));
                        break;
                    case CMD_SUPPRIMER:
                        Partie.getListeNumeros().remove(Partie.getListeNumeros().size()-1);
                        break;
                    case CMD_EXIT:
                        System.out.println("Fermeture!");
                        running = false;
                        break;
                    case CMD_TUTO:
                        printAppTuto();
                        break;
                    case CMD_PRINT:
                        System.out.println(Partie.getListeNumeros());
                        break;
                    default:
                        System.out.println("Commande non reconnue!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erreur de saisie");
            }
        }
        command.close();
    }

    /**
     * Parses des arguments
     *
     * @param args application arguments
     * @return <code>CommandLine</code> which represents a list of application
     * arguments.
     */
    private CommandLine parseArguments(String[] args) {

        Options options = getAllOptions();
        CommandLine line = null;
        CommandLineParser parser = new DefaultParser();

        try {
            line = parser.parse(options, args);

        } catch (ParseException ex) {

            System.err.println("Erreur dans la lecture des arguments!");
            System.err.println(ex.toString());
            printAppTuto();
        }

        return line;
    }

    /**
     * Generates application command line options
     *
     * @return application <code>Options</code>
     */
    private Options getAllOptions() {
        Options options = new Options();
        return options;
    }

    /**
     * Prints application help
     */
    private void printAppTuto() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Utilisation de l'application MyLoto :\n");
        sb.append("Ajouter un numéro étant été pioché => add numéroPioché\n");
        sb.append("Contrôler la carte d'un joueur => ctrl idDeLaCarte\n");
        sb.append("Supprimer le dernier numéro inséré => del\n");
        sb.append("Afficher tous les numéros qui ont été pioché => print\n");
        sb.append("Afficher le mode d'emploi de l'application => tuto\n");
        sb.append("Quitter l'application MyLoto => exit\n");
        System.out.println(sb);
    }

}
