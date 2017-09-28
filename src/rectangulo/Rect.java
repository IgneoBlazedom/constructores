package rectangulo;
/**
 *
 * @author Alumno
 */
public class Rect {
    /**variables de instancia**/
    String color = "";
    int altura = 0;
    int base = 0;
    double area = 0;
    double perimetro = 0;
    
    Rect(String color, int altura, int base){
        this.color = color;
        this.altura = altura;
        this.base = base;
    }
    
    Rect(int altura, int base){
        this.area = base*altura;
    }
    
    Rect(double area, int altura){
       this.perimetro = area/altura;
    }
    
    Rect(double area, double perimetro){
        this.area = area;
        this.perimetro = perimetro;
    }
    
    Rect (String color, double area, int base){
        this.color = color;
        this.area = area;
        this.base = base;
    }
}
