package br.com.kamezajo.secretsmanager.config;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;

@Configuration
@Profile("localstack")
public class SecretsConfigLocalstack {

    @Bean
    public AWSSecretsManager getSecretV1() {
        return AWSSecretsManagerClientBuilder.standard()
                .withEndpointConfiguration(new EndpointConfiguration("http://localhost:4566", Regions.US_EAST_1.getName()))
                .withCredentials(new DefaultAWSCredentialsProviderChain())
                .build();
    }
}
