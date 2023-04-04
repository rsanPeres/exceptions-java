import java.io.*;

public class FileExceptions {
    public static void main(String[] args){
        String fileName = "testes.txt";
        try {
            printFile(fileName);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo não existente " + e.getCause());
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro inesperado");
        }finally {
            System.out.println("Finally");
        }

        System.out.println("Programa continua..");
    }
    public static void printFile(String nameFile) throws IOException {
        File file = new File(nameFile);

        BufferedReader bReader = null;
        try {
            bReader = fileReader(nameFile);
            String line = bReader.readLine();

            BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bWriter.write(line);
                bWriter.newLine();
                line = bReader.readLine();
            }while (line != null);
            bWriter.flush();
            bReader.close();
        } catch (PersonException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("Erro não esperado");
            e.printStackTrace();
        }

    }

    public static BufferedReader fileReader(String name) throws PersonException {
        File file = new File(name);
        try {
            return new BufferedReader(new FileReader(name));
        } catch (FileNotFoundException e) {
            throw new PersonException(file.getName(), file.getPath());
        }
    }
}
