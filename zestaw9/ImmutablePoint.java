package zestaw9;

import java.util.Objects;

public class ImmutablePoint {
    private final int x;
    private final int y;
    private final int z;

    public ImmutablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return getX() == that.getX() && getY() == that.getY() && getZ() == that.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    
}
