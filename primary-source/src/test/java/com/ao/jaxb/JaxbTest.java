package com.ao.jaxb;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 05.08.12
 * Time: 12:50
 * To change this template use File | Settings | File Templates.
 */
public class JaxbTest {

    @Test
    public void testName() throws Exception {
        PatientBean userBean = new PatientBean("Jagr", new Date());
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(PatientBean.class);
        Marshaller m = context.createMarshaller();
        m.marshal(userBean, writer);
        System.out.println(writer.toString());
    }
}
