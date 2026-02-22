package org.firstinspires.ftc.teamcode.packages;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class BancadaDeTestes {
    private DigitalChannel statusBotao;
    private double ticksPerRev;
    private DcMotor motor;
    public void init(HardwareMap hwMap){
        // Botão
        statusBotao = hwMap.get(DigitalChannel.class, "button" );
        statusBotao.setMode(DigitalChannel.Mode.INPUT);

        // Motor
        motor = hwMap.get(DcMotor.class, "left_motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }
    // ------------- Botão ----------------
    public void setStatusBotao(DigitalChannel statusBotao) {
        this.statusBotao = statusBotao;
    }

    public boolean botaoEstaPressionado() {
        return !statusBotao.getState();
    }

    public boolean botaoNaoEstaPressionado(){
        return statusBotao.getState();
    }

    // ------------ Motor ------------------
    public void setVelocidadeMotor(double velocidade){
        motor.setPower(velocidade);
    }

    public double getVoltasMotor(){
        return motor.getCurrentPosition() / ticksPerRev;
    }

    public void setMudarModoFreio(DcMotor.ZeroPowerBehavior modoFreio){
        motor.setZeroPowerBehavior(modoFreio);
    }

}
