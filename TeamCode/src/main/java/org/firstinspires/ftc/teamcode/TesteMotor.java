package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.packages.BancadaDeTestes;

@TeleOp
@Disabled
public class TesteMotor extends OpMode {

    BancadaDeTestes teste = new BancadaDeTestes();
    @Override
    public void init() {
        teste.init(hardwareMap);
    }

    @Override
    public void loop() {
        double velocidadeMotor = gamepad1.left_stick_y;
        teste.setVelocidadeMotor(velocidadeMotor);
        if (gamepad1.a){
            teste.setMudarModoFreio(DcMotor.ZeroPowerBehavior.BRAKE);
        } else if (gamepad1.b) {
            teste.setMudarModoFreio(DcMotor.ZeroPowerBehavior.FLOAT);
        }
    }
}
