package com.base.Republic.config;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.base.Republic.wsclient.ListApServiceClient;


@Configuration
// klasa sluzi za setovanje sertifikata i inicijalizaciju servisa

public class WebServiceConfig {

	@Value("${cert.keyStore}")
	private String keyStore;

	@Value("${cert.keyStorePassword}")
	private String keyStorePassword;

	private void setKeyStore(String keyStore, String keyStorePassword) {

		if (this.keyStorePassword != null && this.keyStore != null) {
			System.setProperty("https.protocols", "SSLv3,TLSv1");
			Properties systemProps = System.getProperties();
			systemProps.put("javax.net.ssl.keyStore", keyStore.trim());
			systemProps.put("javax.net.ssl.keyStorePassword", keyStorePassword.trim());
			System.setProperties(systemProps);
			System.out.println("Certificates: TRUE");
		} else {
			System.out.println("Problem occured. Keystore or keypassword are missing.");
		}
	}



	// https://gsb.test-uzda.gov.rs/Proxies/APR_PLProxyService/ListaAp.svc?wsdl
	@Bean
	public ListApServiceClient initializeListApServiceClient()
			throws IOException, KeyManagementException, GeneralSecurityException {

		this.setKeyStore(keyStore, keyStorePassword);
		ListApServiceClient service = new ListApServiceClient();

		return service;
	}



	@Bean
	public ThreadPoolTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
		pool.setCorePoolSize(5);
		pool.setMaxPoolSize(5);
		pool.setWaitForTasksToCompleteOnShutdown(true);
		return pool;
	}

}
