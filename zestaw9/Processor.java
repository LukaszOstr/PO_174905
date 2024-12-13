package zestaw9;

import java.util.Objects;

public class Processor {
    int frequency;
    int cores;
    String maufacturer;

    public Processor(int frequency, int cores, String maufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.maufacturer = maufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public void setMaufacturer(String maufacturer) {
        this.maufacturer = maufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return getFrequency() == processor.getFrequency() && getCores() == processor.getCores() && Objects.equals(getMaufacturer(), processor.getMaufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrequency(), getCores(), getMaufacturer());
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cores=" + cores +
                ", maufacturer='" + maufacturer + '\'' +
                '}';
    }
}
