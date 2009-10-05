/*
 * This file is part of the source of
 * 
 * Office-o-tron - a web-based office document validator for Java(tm)
 * 
 * Copyright (c) 2009 Griffin Brown Digital Publishing Ltd.
 * 
 * All rights reserved world-wide.
 * 
 * The contents of this file are subject to the Mozilla Public License Version 1.1 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at http://www.mozilla.org/MPL/MPL-1.1.html
 * 
 * Software distributed under the License is distributed on an "AS IS" basis, WITHOUT WARRANTY
 * OF ANY KIND, either express or implied. See the License for the specific language governing
 * rights and limitations under the License.
 * 
 */
package org.probatron.officeotron;

import org.xml.sax.helpers.AttributesImpl;

public class XMLSniffData
{
    private AttributesImpl atts;
    private String rootNs;
    private String rootElementName;


    /**
     * @return the atts
     */
    public AttributesImpl getAtts()
    {
        return atts;
    }


    /**
     * @param atts the atts to set
     */
    public void setAtts( AttributesImpl atts )
    {
        this.atts = atts;
    }


    /**
     * @return the rootNs
     */
    public String getRootNs()
    {
        return rootNs;
    }


    /**
     * @param rootNs the rootNs to set
     */
    public void setRootNs( String rootNs )
    {
        this.rootNs = rootNs;
    }


    /**
     * @return the rootElementName
     */
    public String getRootElementName()
    {
        return rootElementName;
    }


    /**
     * @param rootElementName the rootElementName to set
     */
    public void setRootElementName( String rootElementName )
    {
        this.rootElementName = rootElementName;
    }

}
