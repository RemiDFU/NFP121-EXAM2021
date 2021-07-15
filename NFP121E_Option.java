package NFP121E;

public class Option {
    private Character access;
    private String description;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Character getAccess() {
        return access;
    }

    public void setAccess(Character access) {
        this.access = access;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Option(Character access, String description, String value) {
        this.access = access;
        this.description = description;
        this.value = value;
    }
    public void action(Configuration configuration) {
        /* Le case n'est pas adéquat pour 2 args mais par rapport au contexte le case peut etre plus pertinent si plusieurs nouveaux arguments utilisés */
        switch (this.access) {
            case 'P':
                configuration.setMode(Mode.PLEINE);
                break;
            case 'K':
                configuration.setIndice(Integer.parseInt(this.value));
                break;
            default:
                /*La saisie est sécurisée côté vue, le throw ne sera théoriquement pas utilisé*/
                throw new IllegalArgumentException("Debugging");
        }
    }
}
