package NFP121E;

public class CLIOutils {
 private CLIClassique cli;

    public static CLIClassique fromClass(String configuration) {
        return new CLIClassique() ;
    }
    /*
    Question 6.2 :
    Pour traiter les actions associées aux options au moment de la création,
    il faudrait ajouter un constructeur à la classe CLIClassique avec en paramètres les options, qui fera appel à la méthode CLICassique.configuration()
    SI la question implique de pouvoir traiter les actions à d'autres moments qu'a la création de la classe CLIClassique,
    il suffit d'appeler la méthode CLICassique.configuration()
    */

    public CLIClassique getCli() {
        return cli;
    }

    public void setCli(CLIClassique cli) {
        this.cli = cli;
    }
}
