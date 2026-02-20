package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.packages.Botao;

@TeleOp
@Disabled
public class TesteBotao extends OpMode {
    Botao botao1 = new Botao();

    @Override
    public void init() {
        botao1.init(hardwareMap);
    }

    @Override
    public void loop() {
        String StatusBotao = "NOT Pressed!";
        if (botao1.botaoEstaPressionado()){
            StatusBotao = "Pressed!";
        }
        telemetry.addData("Status Botão", StatusBotao);
    }
}
