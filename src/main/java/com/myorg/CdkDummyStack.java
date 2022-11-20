package com.myorg;

import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
import software.amazon.awscdk.Duration;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.sns.Topic;
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscription;
import software.amazon.awscdk.services.sqs.Queue;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CdkDummyStack extends Stack {
    public CdkDummyStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public CdkDummyStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);
        Function.Builder.create(this,"Runtime-Lambda")
                .runtime(Runtime.JAVA_8)
                .handler("org.springframework.cloud.function.adapter.aws.FunctionInvoker")
                .timeout(Duration.seconds(900))
                .memorySize(1536)
                .functionName("Lambda-At-Runtime-Jar-Lcl")
                .code(Code.fromAsset("C:\\Users\\614511855\\Downloads\\dynamoSpring\\dynamoSpring\\target\\dynamoSpring-0.0.1-SNAPSHOT-aws.jar"))
                .build();



    }
}
