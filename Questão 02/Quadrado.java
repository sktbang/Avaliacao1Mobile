/* (a)
Implemente uma classe `Quadrado`, que possui um atributo 
`lado` de tipo `double`. Implemente um construtor que preenche 
o atributo `lado`. Faça com que essa classe __implemente__ a 
interface `Geometria`.
*/
public abstract class Quadrado implements Geometria{
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
