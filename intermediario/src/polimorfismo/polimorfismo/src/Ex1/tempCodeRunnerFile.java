public class Polimorfismo {
    public static void main(String[] args){
        Torcedor torcedor = new Torcedor();
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
    }
}
