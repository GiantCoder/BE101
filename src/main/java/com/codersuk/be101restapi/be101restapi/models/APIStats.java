package com.codersuk.be101restapi.be101restapi.models;

import java.util.concurrent.atomic.AtomicLong;

public class APIStats {
    public static AtomicLong numRequests = new AtomicLong();

    public static AtomicLong incrementRequestCount() {
        numRequests.addAndGet(1);
        return numRequests;
    }
}
