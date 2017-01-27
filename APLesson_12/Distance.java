import java.util.*;
public class Distance {
    private int x1, y1, x2, y2;
    private double d;
    public Distance() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        d = 0;
    }
    public Distance(int m_x, int m_y, int m_z, int m_xy) {
        x1 = m_x;
        y1 = m_y;
        x2 = m_z;
        y2 = m_xy;
        d = 0;
    }
    public void setValues(int m_x, int m_y, int m_z, int m_xy) {
        x1 = m_x;
        y1 = m_y;
        x2 = m_z;
        y2 = m_xy;
    }
    public double getDistance() {
        return  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

}