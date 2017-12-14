package com.stg


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import java.util.Arrays
import java.util.List

import br.com.stgenerator.util.ModeloCarta


@Secured(['permitAll'])
class ModelController{
    static responseFormats = ['json', 'xml']
    ModelController() {
        
    }

    def index(){
        List<ModeloCarta> modelos = Arrays.asList(ModeloCarta.values())
        respond(modelos)
    }
}
