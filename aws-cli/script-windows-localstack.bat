aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/helloWorld" --value "Hello World Parameter Store" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/sqsQueueName" --value "sqsHelloWorld" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/snsNotificationName" --value "snsHelloWorld" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/s3BucketName" --value "helloworld" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/DB_URL" --value "localhost" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/DB_USERNAME" --value "postgres" --type String
aws --endpoint http://localhost:4566 --profile localstack ssm put-parameter --name "/config/spring-boot-localstack_localstack/DB_PASSWORD" --value "postgres123" --type String

aws --endpoint http://localhost:4566 --profile localstack secretsmanager create-secret --name /secrets/helloWorld --description "Exemplo de Secrets Manager" --secret-string "{\"valor1\":\"Oi Mundo\",\"valor2\":\"Hello World\",\"valor3\":\"Hola Mundo\"}"

aws --endpoint http://localhost:4566 --profile localstack s3 mb s3://helloworld

aws --endpoint http://localhost:4566 --profile localstack sqs create-queue --queue-name sqsHelloWorld

aws --endpoint http://localhost:4566 --profile localstack sns create-topic --name snsHelloWorld
aws --endpoint http://localhost:4566 --profile localstack sns subscribe --topic-arn arn:aws:sns:us-east-1:000000000000:snsHelloWorld --protocol sqs --notification-endpoint arn:aws:sqs:us-east-1:000000000000:sqsHelloWorld
