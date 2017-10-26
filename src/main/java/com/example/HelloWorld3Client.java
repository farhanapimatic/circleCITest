/*
 * HelloWorld3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example;

import com.example.controllers.*;
import com.example.http.client.HttpClient;

public class HelloWorld3Client {
    /**
     * Singleton access to Helloworld controller
     * @return	Returns the HelloworldController instance 
     */
    public HelloworldController getHelloworld() {
        return HelloworldController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public HelloWorld3Client() {
    }

}