package com.dfjx.frontier.config;

import feign.Client;
import feign.Contract;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * FeightClientConfig
 *
 * @author hualong
 */
@Import(FeignClientsConfiguration.class)
@Configuration
public class FeignClientConfiguration {

    private Decoder decoder;
    private Encoder encoder;
    private Client client;
    private Contract contract;

    public FeignClientConfiguration(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.decoder = decoder;
        this.encoder = encoder;
        this.client = client;
        this.contract = contract;
    }




}
