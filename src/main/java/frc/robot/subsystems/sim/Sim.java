// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.sim;

import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.Logger;

public class Sim extends SubsystemBase {
  /** Creates a new Sim. */
  public Sim() {}

  double intakeAngle = 0;

  @Override
  public void periodic() {
    Pose3d[] poses = {
      new Pose3d(new Translation3d(), new Rotation3d(0, Units.degreesToRadians(intakeAngle), 0))
    };
    Logger.recordOutput("Poses", poses);
    // This method will be called once per scheduler run
  }

  public void setIntakeAngle(double param) {
    intakeAngle = param;
  }
}
