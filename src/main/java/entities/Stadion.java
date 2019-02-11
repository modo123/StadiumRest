/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "stadion")
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "stadion")
public class Stadion implements Serializable 
{

    @XmlAttribute(name = "id")
    private Integer id;

    @XmlAttribute(name = "tytul")
    private String tytul;
       
    public Stadion() 
    {
    }

    public Stadion (Integer id, String tytul)
    {
        this.id = id;
        this.tytul = tytul;
    }
    
    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public String getTytul() 
    {
        return tytul;
    }

    public void setTytul(String tytul) 
    {
        this.tytul = tytul;
    }

}

