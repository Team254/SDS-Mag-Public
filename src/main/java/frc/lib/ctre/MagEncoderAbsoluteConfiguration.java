package frc.lib.ctre;

public class MagEncoderAbsoluteConfiguration {
    private final int id;
    private final double offset;

    public MagEncoderAbsoluteConfiguration(int id, double offset) {
        this.id = id;
        this.offset = offset;
    }

    public int getId() {
        return id;
    }

    public double getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "MagEncoderConf{id=" + this.id + ", offset=" + this.offset + "}"; 
    }
}
