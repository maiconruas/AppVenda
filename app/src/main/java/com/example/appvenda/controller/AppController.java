package com.example.appvenda.controller;


import com.example.appvenda.model.AppModel;

public class AppController {

    public double calcular(AppModel appModel) {
        return appModel.getValorUnidade() * appModel.getQuantidade();
    }

    public double desconto(AppModel appModel) {
        return (appModel.getDesconto() / 100) * calcular(appModel);
    }

    public double valor(AppModel appModel) {
        return calcular(appModel) - desconto(appModel);
    }

}
