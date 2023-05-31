@echo off
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/helloWorld" --value "Hello World Parameter Store" --type String

aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/spring-boot-localstack_localstack --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/spring-boot-localstack --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secret/application_localstack --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"

@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager update-secret --secret-id /secret/spring-boot-localstack_localstack --secret-string "{\"valor1\":\"Oi Mundo 1\",\"valor2\":\"Hello World\",\"valor3\":\"Hola mundo\"}"
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager update-secret --secret-id /secret/spring-boot-localstack --secret-string "{\"valor1\":\"Oi Mundo 2\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager update-secret --secret-id /secret/application --secret-string "{\"valor1\":\"Oi Mundo 3\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager update-secret --secret-id /secret/application_localstack --secret-string "{\"valor1\":\"Oi Mundo 4\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"

@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager delete-secret --secret-id /secret/spring-boot-localstack_localstack
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager delete-secret --secret-id /secret/spring-boot-localstack
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager delete-secret --secret-id /secret/application
@REM aws --endpoint http://localhost:4566 --profile localstack secretsmanager delete-secret --secret-id /secret/application_localstack

@REM CRIAR BUCKET
aws --endpoint http://localhost:4566 --profile localstack s3 mb s3://helloworld

@REM LISTAR BUCKET
@REM aws --endpoint http://localhost:4566 --profile localstack s3 ls
@REM aws --endpoint http://localhost:4566 --profile localstack s3api list-buckets

@REM DELETAR BUCKET
@REM aws --endpoint http://localhost:4566 --profile localstack s3 rb s3://helloworld
