package org.firstinspires.ftc.teamcode.packages;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
public class Botao {
    private DigitalChannel statusBotao;
    public void init(HardwareMap hwMap){
        statusBotao = hwMap.get(DigitalChannel.class, "button" );
        statusBotao.setMode(DigitalChannel.Mode.INPUT);
    }

    public void setStatusBotao(DigitalChannel statusBotao) {
        this.statusBotao = statusBotao;
    }

    public boolean botaoEstaPressionado() {
        return !statusBotao.getState();
    }

    public boolean botaoNaoEstaPressionado(){
        return statusBotao.getState();
    }
}
