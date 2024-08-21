public class somaimposto {
    public static double somaimposto(double taxaimposto,double custo){
        return custo +(custo * taxaimposto / 100);
    }
public static void main(String[] args) {
    double taxaimposto = 10;
    double custo = 100;
    double custocomimposto = somaimposto(taxaimposto, custo);
    
System.out.println("O custo do item com imposto é : " + custocomimposto);    
}

}
