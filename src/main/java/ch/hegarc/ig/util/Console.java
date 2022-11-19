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
    public void runCommand() {
        //Affichage du tutoriel
        printAppTuto();

        Scanner command = new Scanner(System.in);
        System.out.println("Entrer vos commande: ");

        boolean running = true;
        while (running) {
            String com = command.nextLine();
            String[] arguments = com.split(" ");
            CommandLine cmdLine = parseArguments(arguments);

            switch (cmdLine.getArgs()[0]) {

                case CMD_AJOUTER:
                    Partie.listeNumeros.add(Integer.valueOf(cmdLine.getArgs()[1]));
                    break;

                case CMD_CONTROLER:
                    Partie.controlCarte(String.valueOf(cmdLine.getArgs()[1]));
                    break;
                case CMD_SUPPRIMER:
                    Partie.listeNumeros.remove(Partie.listeNumeros.size()-1);
                    break;
                case CMD_EXIT:
                    System.out.println("Fermeture!");
                    running = false;
                    break;
                case CMD_TUTO:
                    printAppTuto();
                    break;
                case CMD_PRINT:
                    System.out.println(Partie.listeNumeros);
                    break;
                default:
                    System.out.println("Commande non reconnue!");
                    break;
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
//        options.addOption(OPT_FICHIER).addOption(OPT_COMP);
        return options;
    }

    /**
     * Prints application help
     */
    private void printAppTuto() {
//        HelpFormatter formatter = new HelpFormatter();
//        formatter.printHelp(CMD_IMPORT, new Options().addOption(OPT_FICHIER), true);
//        formatter.printHelp(CMD_EXPORT, new Options().addOption(OPT_FICHIER).addOption(OPT_COMP), true);
//        formatter.printHelp(CMD_STATS, new Options().addOption(OPT_COMP), true);
//        formatter.printHelp(CMD_EXIT, new Options());

        //TODO tutoriel text
    }
}
