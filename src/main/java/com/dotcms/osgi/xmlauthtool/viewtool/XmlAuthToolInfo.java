package com.dotcms.osgi.xmlauthtool.viewtool;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class XmlAuthToolInfo extends ServletToolInfo {

    @Override
    public String getKey () {
        return "xmlauthtool";
    }

    @Override
    public String getScope () {
        return ViewContext.APPLICATION;
    }

    @Override
    public String getClassname () {
        return XmlAuthTool.class.getName();
    }

    @Override
    public Object getInstance ( Object initData ) {

    	XmlAuthTool viewTool = new XmlAuthTool();
        viewTool.init( initData );

        return viewTool;
    }

}