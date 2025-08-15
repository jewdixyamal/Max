package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: z36  reason: default package */
public final /* synthetic */ class z36 implements ide {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ z36(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final Object get() {
        return Boolean.valueOf(this.a.get());
    }
}
