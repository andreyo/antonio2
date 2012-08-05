package com.ao.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 04.08.12
 * Time: 17:52
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class PatientBean {

    private String name;
    private Date dateOfBirth;

    public PatientBean() {
    }

    public PatientBean(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @XmlElement(name = "user-name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute// goes to userBean tag
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}