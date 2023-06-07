package br.com.kamezajo.secretsmanager.service;

import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecretsManagerService {

    private final AWSSecretsManager awsSecretsManager;

    public String findSecret() {
        String secretName = "/secrets/helloWorld";

        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest().withSecretId(secretName);
        GetSecretValueResult getSecretValueResponse = awsSecretsManager.getSecretValue(getSecretValueRequest);

        return getSecretValueResponse.getSecretString();
    }
}
