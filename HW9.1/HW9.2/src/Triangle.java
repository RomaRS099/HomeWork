public class Triangle {
    int weight;

    public Triangle(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < i; j++) {
                triangle.append("[*]");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}
