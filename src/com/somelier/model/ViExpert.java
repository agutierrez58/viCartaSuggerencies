package com.somelier.model;


import java.util.ArrayList;
import java.util.List;

import org.apache.el.lang.ELSupport;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;


public class ViExpert
{
    public List getBrands(String color)
    {
        List<String> brands = new ArrayList<String>();
        if ( color.equals("negre") )
        {
            brands.add("Prothos");
            brands.add("Fargas fargas");
            brands.add("Tres pasos");
            brands.add("Domanis Lupier");            
        }
        else if ( color.equals("blanc") ) {
			 brands.add("Flor d'Albera");
			 brands.add("Perro verde");
			 brands.add("Martín pescador");
		}  else {
            brands.add("Logos II");
            brands.add("Inurrieta 400");
        }
        return (brands);
    }
}


