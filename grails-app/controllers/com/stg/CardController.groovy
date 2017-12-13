package com.stg

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class CardController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CardController() {
        super(Card)
    }

    def index(){
        Card c = new Card()
        c.setTitulo("Hello World")
        respond(c)
    }
}
