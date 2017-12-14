package com.stg

import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

import java.util.*

import br.com.stgenerator.util.ModeloCarta

@Secured(['permitAll'])
class ModelController{
    static responseFormats = ['json']
    ModelController() {
        
    }

    def index(){
        List<ModeloCarta> modelos = Arrays.asList(ModeloCarta.values())
        List<ModelUtil> modelosUtil = new ArrayList<ModelUtil>()
        modelos.each{ modelo ->
            ModelUtil modeloUtil = new ModelUtil()
            modeloUtil.nomeModelo = modelo.toString()
            modelosUtil.add(modeloUtil)
        }
        respond(modelosUtil,status: 200)
    }
}
