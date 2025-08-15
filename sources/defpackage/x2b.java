package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: x2b  reason: default package */
public final class x2b extends d3 {
    public final long i(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public final long j(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    public final Random k() {
        return ThreadLocalRandom.current();
    }
}
