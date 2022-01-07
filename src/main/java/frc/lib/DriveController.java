package frc.lib;

public interface DriveController {
    void setReferenceVoltage(double voltage);

    double getStateVelocity();
}
