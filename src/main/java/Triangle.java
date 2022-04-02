public class Triangle {
    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(String a, String b, String c) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        this.c = Integer.parseInt(c);
    }

    public boolean isTriangle(){
        if (a+b>c&&a+c>b&&c+b>a){
            return true;
        }else return false;
    }
    public boolean isEquilateral(){
        if (a==b&&b==c&&isTriangle()){
            return true;
        }else return false;
    }
    public boolean isIsosceles(){
        if (((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a))&&isTriangle()){
            return true;
        }else return false;
    }
    public boolean isScalene(){
        if(isTriangle()&&!isEquilateral()&&!isIsosceles()){
            return true;
        }else return false;
    }
    public String answer(){
       if(isTriangle()){
           if (isEquilateral()) return "Этот треугольник равносторонний";
           else if(isIsosceles()) return "Этот треугольник равнобедренный";
           else return "Этот треугольник разносторонний";
       }else return "Значения сторон не подходят для построения сторон";
    }
}
