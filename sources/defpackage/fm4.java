package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: fm4  reason: default package */
public final class fm4 implements Future {
    public final zl4 a;

    public fm4(zl4 zl4) {
        this.a = zl4;
    }

    public final boolean cancel(boolean z) {
        this.a.g();
        return false;
    }

    public final Object get() {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
