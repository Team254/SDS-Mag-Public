package frc.lib.ctre;

import edu.wpi.first.wpilibj.DutyCycle;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class OffsetMagEncoder extends DutyCycleEncoder {
    private double offset;

    public OffsetMagEncoder(DutyCycle cycle, double offset) {
        super(cycle);
        this.offset = offset;
    }

    @Override
    public double getDistance() {
        return super.getDistance() + Math.toDegrees(this.offset);
    }
}
