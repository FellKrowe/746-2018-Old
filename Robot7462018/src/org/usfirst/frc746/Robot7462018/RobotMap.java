// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc746.Robot7462018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainTalon1;
    public static SpeedController driveTrainTalon2;
    public static RobotDrive driveTrainRobotDrive;
    public static SpeedController armarmMotor;
    public static SpeedController intakeintakeMotor;
    public static SpeedController intakeintakeMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainTalon1 = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Talon1", (Talon) driveTrainTalon1);
        driveTrainTalon1.setInverted(true);
        driveTrainTalon2 = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Talon2", (Talon) driveTrainTalon2);
        driveTrainTalon2.setInverted(true);
        driveTrainRobotDrive = new RobotDrive(driveTrainTalon1, driveTrainTalon2);
        
        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(.8);

        armarmMotor = new Spark(2);
        //LiveWindow.addActuator("Arm", "armMotor", (Spark) armarmMotor);
        armarmMotor.setInverted(false);
        intakeintakeMotor = new Talon(3);
        intakeintakeMotor.setInverted(false);
        intakeintakeMotor2 = new Talon (4);
        intakeintakeMotor2.setInverted(false);
       // LiveWindow.addActuator("Intake", "intakeMotor", (Spark) intakeintakeMotor);
        //intakeintakeMotor.setInverted(false);
        //intakeintakeMotor2.setInverted(false);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
