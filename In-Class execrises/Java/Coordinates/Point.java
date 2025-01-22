public class Point {
    public int x, y, z;

    public Point(int cx, int cy, int cz) {
        x = cx;
        y = cy;
        z = cz;
    }

    public double distance(Point p) {
        return (Main.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z)));
    }
}