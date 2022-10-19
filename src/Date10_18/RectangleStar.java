package Date10_18;

public class RectangleStar {

    public void printSquare(int n) {
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RectangleStar rectangleStar = new RectangleStar();
        rectangleStar.printSquare(3);

    }
}
