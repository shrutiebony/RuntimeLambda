package com.myorg;

import software.amazon.awscdk.App;

public final class CdkDummyApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkDummyStack(app, "CdkDummyStack");

        app.synth();
    }
}
