public class StarTriangle {
    int weight;

    public StarTriangle(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder triangle = new StringBuilder();
        for (int i = 1; i <= weight; i++) {
            for (int j = 1; j <= i; j++) {
                triangle.append("[*]");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}
