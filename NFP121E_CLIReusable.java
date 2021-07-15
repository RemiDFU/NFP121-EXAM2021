package NFP121E;

import java.util.ArrayList;


public class CLIReusable {
    private ArrayList<Option> o;

    public CLIReusable(ArrayList<Option> arguments) {

        this.o = new ArrayList<Option>();
    }


    public void ajouterArgument(Option option) {
        this.o.add(option);
    }

    public static void main(String[] args) {

    }

    public ArrayList<Option> getO() {
        return o;
    }
}
