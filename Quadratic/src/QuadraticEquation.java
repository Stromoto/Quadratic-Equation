public class QuadraticEquation {
  private double a;
  private double b;
  private double c;


  
  public QuadraticEquation(double a) {
    this(a, 0, 0);
  }
  public QuadraticEquation(double a, double b) {
    this(a, b, 0);
  }
  public QuadraticEquation(double a, double b, double c) {
    setQuadraticEquation(a, b, c);
  }
  public void setQuadraticEquation(double a, double b, double c) {
    setA(a);
    setB(b);
    setC(c);
  }
  public double setA(double a) {
    if (a != 0) {
      return this.a = a;
    } else {
      return this.a = 1;
    }
  }
  public double setB(double b) {
    return this.b = b;
  }
  public double setC(double c) {
    return this.c = c;
  }
  public double getA(double a) {
    return a;
  }
  public double getB(double b) {
    return b;
  }
  public double getC(double c) {
    return c;
  }

  public double getDiscriminant() {
    return b * b - 4 * a * c ;
  }

  public double getRoot1() {
    if (getDiscriminant() < 0) {
      return 0;
    } else {
      return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }
  }
  public double getRoot2() {
    if (getDiscriminant() < 0) {
      return 0;
    } else {
      return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }
  }
  public boolean equals(QuadraticEquation e) {
    return a / e.a == b / e.b && a / e.a == c / e.c;
  }
  public String toString() {
    return "The equation is" + ((a != 1) ? " " + a :" ") + "x^2" + ((b > 0) ? " + " + b + "x " : (b == 0) ? "" : " " +b + "x ")
    + ((c > 0) ? "+ " + c : (c == 0)? "" : c) + " = 0\n" +((getDiscriminant() < 0) ? "The equation has no real roots." 
    : (getDiscriminant() == 0) ? "The equation has one real root" + getRoot1() : "The equation has two real roots. " +getRoot1() + " " +getRoot2());
  }
}
