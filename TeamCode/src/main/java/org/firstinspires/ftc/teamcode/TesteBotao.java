package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.packages.BancadaDeTestes;

@TeleOp
@Disabled
public class TesteBotao extends OpMode {
    BancadaDeTestes bancadaDeTestes = new BancadaDeTestes();

    @Override
    public void init() {
        bancadaDeTestes.init(hardwareMap);
    }

    @Override
    public void loop() {
        String StatusBotao = "NOT Pressed!";
        if (bancadaDeTestes.botaoEstaPressionado()){
            StatusBotao = "Pressed!";
        }
        telemetry.addData("Status Botão", StatusBotao);
    }
}
