public class Arrays {
    public static void main(String[] args){
        int[] num = {4, 4, 8, 10};
        int[] den = {4, 4, 0, 2, 10};

        for (int i = 0; i < den.length; i++){
            try {
                if(num[i] %2 !=0)
                    throw new NumberException("Divisão não exata", num[i], den[i]);

                int result = num[i]/den[i];
                System.out.println(result);
            }catch (NumberException | ArrayIndexOutOfBoundsException | ArithmeticException e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Continua..");
    }
}
