package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: qhc  reason: default package */
public final class qhc implements ThreadFactory {
    public String a;
    public int b;

    public final Thread newThread(Runnable runnable) {
        return new phc(runnable, this.a, this.b);
    }
}
