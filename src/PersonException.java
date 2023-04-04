public class PersonException extends Exception{
    private String name;
    private String diretorio;

    public PersonException(String name, String diretorio) {
        super("O arquivo " + name + "não foi encontrado no diretorio " + diretorio);
        this.name = name;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "PersonException{" +
                "name='" + name + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
