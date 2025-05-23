
package com.servico.calculadora;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somar", propOrder = {
    "n1",
    "n2"
})
public class Somar {

    protected int n1;
    protected int n2;

    /**
     * Obtém o valor da propriedade n1.
     * 
     */
    public int getN1() {
        return n1;
    }

    /**
     * Define o valor da propriedade n1.
     * 
     */
    public void setN1(int value) {
        this.n1 = value;
    }

    /**
     * Obtém o valor da propriedade n2.
     * 
     */
    public int getN2() {
        return n2;
    }

    /**
     * Define o valor da propriedade n2.
     * 
     */
    public void setN2(int value) {
        this.n2 = value;
    }

}
