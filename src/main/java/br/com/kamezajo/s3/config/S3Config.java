//package br.com.kamezajo.s3.config;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
//import com.amazonaws.client.builder.AwsClientBuilder;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@Data
//public class S3Config {
//
//    @Value("${config.aws.region}")
//    private String region;
//    @Value("${config.aws.s3.url}")
//    private String s3EndpointUrl;
//
//    @Bean
//    public AmazonS3 amazonS3() {
//        return AmazonS3ClientBuilder.standard()
//                .withCredentials(getCredentialsProvider())
//                .withEndpointConfiguration(getEndpointConfiguration(s3EndpointUrl))
//                .build();
//    }
//
//    private AWSStaticCredentialsProvider getCredentialsProvider() {
//        return new AWSStaticCredentialsProvider(DefaultAWSCredentialsProviderChain.getInstance().getCredentials());
//    }
//
//    private AwsClientBuilder.EndpointConfiguration getEndpointConfiguration(String url) {
//        return new AwsClientBuilder.EndpointConfiguration(url, region);
//    }
//}
