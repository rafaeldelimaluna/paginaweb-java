/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servico.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Aluno
 */
@WebService(name="Calculadora",
        serviceName = "CalculadoraService")
public class Calculadora {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "somar")
    public int Somar(@WebParam(name = "n1") int n1,@WebParam(name = "n2") int n2) {
        return n1 + n2;
    }
}
