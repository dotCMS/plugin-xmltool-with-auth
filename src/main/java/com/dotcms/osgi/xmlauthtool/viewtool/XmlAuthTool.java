package com.dotcms.osgi.xmlauthtool.viewtool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.velocity.tools.view.tools.ViewTool;

import com.dotcms.repackage.org.apache.commons.codec.binary.Base64;
import com.dotcms.repackage.org.apache.http.HttpResponse;
import com.dotcms.repackage.org.apache.http.NameValuePair;
import com.dotcms.repackage.org.apache.http.client.HttpClient;
import com.dotcms.repackage.org.apache.http.client.entity.UrlEncodedFormEntity;
import com.dotcms.repackage.org.apache.http.client.methods.HttpGet;
import com.dotcms.repackage.org.apache.http.client.methods.HttpPost;
import com.dotcms.repackage.org.apache.http.impl.client.DefaultHttpClient;
import com.dotcms.repackage.org.apache.http.message.BasicNameValuePair;
import com.dotcms.repackage.org.apache.http.params.BasicHttpParams;
import com.dotcms.repackage.org.apache.http.params.HttpConnectionParams;
import com.dotcms.repackage.org.apache.http.params.HttpParams;
import com.dotmarketing.util.Logger;
import com.dotmarketing.viewtools.XmlTool;

public class XmlAuthTool implements ViewTool {

	public void init(Object obj) {

	}

	/**
	 * This method uses basic http auth and does a post with the provided
	 * key/value map
	 * 
	 * @param url
	 * @param user
	 * @param pass
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public XmlTool read(String url, String user, String pass, Map<String, String> data) throws Exception {
		return read(url, user, pass, data, 15000);
	}

	/**
	 * This method uses basic http auth and does a post with the provided
	 * key/value map
	 * 
	 * @param url
	 * @param user
	 * @param pass
	 * @param data
	 *            key/value map of params
	 * @param timeout
	 *            millis to timeout
	 * @return
	 * @throws Exception
	 */
	public XmlTool read(String url, String user, String pass, Map<String, String> data, int timout) throws Exception {

		String cred = user + ":" + pass;
		cred = Base64.encodeBase64String(cred.getBytes());
		final HttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, timout);

		HttpClient client = new DefaultHttpClient(httpParams);
		HttpPost post = new HttpPost(url);

		post.addHeader("Authorization", "Basic " + cred);
		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

		for (String key : data.keySet()) {
			urlParameters.add(new BasicNameValuePair(key, data.get(key)));
		}
		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse response = client.execute(post);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		XmlTool tool = new XmlTool();

		return tool.parse(result);

	}

	/**
	 * This method uses basic http auth and does a post with the provided
	 * key/value map
	 * 
	 * @param url
	 * @param user
	 * @param pass
	 * @param data
	 *            key/value map of params
	 * @param timeout
	 *            millis to timeout
	 * @return
	 * @throws Exception
	 */
	public XmlTool read(String url, String user, String pass, int timout) throws Exception {

		String cred = user + ":" + pass;
		cred = Base64.encodeBase64String(cred.getBytes());
		final HttpParams httpParams = new BasicHttpParams();
		HttpConnectionParams.setConnectionTimeout(httpParams, timout);

		HttpClient client = new DefaultHttpClient(httpParams);
		HttpGet get = new HttpGet(url);

		get.addHeader("Authorization", "Basic " + cred);

		HttpResponse response = client.execute(get);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		XmlTool tool = new XmlTool();

		return tool.parse(result);

	}

	/**
	 * This method uses basic http auth and does a post with the provided
	 * key/value map
	 * 
	 * @param url
	 * @param user
	 * @param pass
	 * @param data
	 *            key/value map of params
	 * @param timeout
	 *            millis to timeout
	 * @return
	 * @throws Exception
	 */
	public XmlTool read(String url, String user, String pass) throws Exception {

		return read(url, user, pass, 15000);
	}
}
