package com.stg

class Card {    

    String titulo

    Integer views

    Date dataCriacao = new Date()

    boolean publico

    boolean aprovado

    String securityHash

    String uri

    byte[] imagem

    byte[] thumb    

    static constraints = {

    }

    static transients = ['uri']
}
