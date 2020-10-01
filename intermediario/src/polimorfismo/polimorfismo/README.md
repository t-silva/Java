## Getting Started

# Exercício 1.
- Utilizar polimorfismo criando a seguinte estrutura:
  1) Torcedor: torce genéricamente:
    1.1) Sãopaulino: Extende a classe Torcedor e sobrepõe método para torcer para o São Paulo
    1.2) Corinthiano: Extende a classe Torcedor e sobrepõe método para torcer para o Corinthians
    1.3) Santista: Extende a classe Torcedor e não sobrepõe método, torce genéricamente como Torcedor
  
  2) Narrador: inicia a narração.



# OBS: 
    - Como classe pai, quando instanciado um torcedor, pelo polimorfismo, praticar mudança 
    de comportamento (times) para torcedor.
    - Como classe filha, quando instanciar um torcedor de algum time, tentar aplicar polimorfismo, 
    notar que não é possível, pois 
    o polimorfismo só vai valer para objetos instanciados na classe Pai.
    - Tentar instanciar torcedores como Narradores (e vice-versa): Observar que não é possível pois
     não existe relação de herança.
