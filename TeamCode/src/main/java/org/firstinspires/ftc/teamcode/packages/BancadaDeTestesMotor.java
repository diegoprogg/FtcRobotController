package org.firstinspires.ftc.teamcode.packages;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class BancadaDeTestesMotor {
    private DcMotor motor;
    private double ticksPerRev;

    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class, "left_motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setVelocidadeMotor(double velocidade){
        motor.setPower(velocidade);
    }

    public double getVoltasMotor(){
        return motor.getCurrentPosition() / ticksPerRev;
    }



}
