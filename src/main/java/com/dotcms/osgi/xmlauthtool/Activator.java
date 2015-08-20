package com.dotcms.osgi.xmlauthtool;

import com.dotcms.osgi.xmlauthtool.viewtool.XmlAuthToolInfo;
import com.dotcms.repackage.org.osgi.framework.BundleContext;
import com.dotmarketing.osgi.GenericBundleActivator;
import com.dotmarketing.util.Logger;

public class Activator extends GenericBundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		// Initializing services...
		initializeServices(bundleContext);

		// Registering the ViewTool service
		registerViewToolService(bundleContext, new XmlAuthToolInfo());

		Logger.info(this.getClass(), "Starting XmlAuthTool");

	}

	public void stop(BundleContext context) throws Exception {

		unregisterViewToolServices();
		Logger.info(this.getClass(), "Stopping XmlAuthTool");

	}

}