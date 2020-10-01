public class Polimorfismo {
    public static void main(String[] args){
        Torcedor torcedor = new Torcedor();
        Narrador narrador = new Narrador();
        SaoPaulino saopaulino = new SaoPaulino();
        narrador.narrar();

        torcedor.torcer();

        //Polimorfismo
        torcedor = new Corinthiano(); 

        /* Agora torcedor pode se comportar como Corinthiano, pois essa classe é 
        filha de Torcedor (herança) e, pela sobreposição do método Torcer(), definido em Corinthiano.java 
        permite o polimorfismo (Dinamica no comportamento dos métodos )*/

        torcedor.torcer();

        torcedor = new SaoPaulino();
        torcedor.torcer();

        torcedor = new Santista();

        /* Como Santista.java não sobrepõe o método torcer(), se comporta como a classe pai (Torcedor) */
        torcedor.torcer();

        /* Eu não consigo aplicar o polimorfismo de torcedor em narrador, pois este, não herda Torcedor */
         // torcedor = new Narrador(); // error: incompatible types: Narrador cannot be converted to Torcedor


        /* Não é possível aplicar o polimorfismo em saopaulino, pois Corinthiano, não herda Saopaulino */
        //saopaulino = new Corinthiano(); // error: incompatible types: Corinthiano cannot be converted to SaoPaulino
    }
}
