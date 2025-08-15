package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: me3  reason: default package */
public final class me3 {
    public final Executor a;
    public final Executor b;
    public final p8g c;
    public final xxc d;
    public final y8 e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARNING: type inference failed for: r0v6, types: [xxc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, p8g] */
    public me3(ho9 ho9) {
        Executor executor = (Executor) ho9.b;
        if (executor == null) {
            this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new je3(false));
        } else {
            this.a = executor;
        }
        Executor executor2 = (Executor) ho9.d;
        if (executor2 == null) {
            this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new je3(true));
        } else {
            this.b = executor2;
        }
        p8g p8g = (p8g) ho9.c;
        if (p8g == null) {
            String str = p8g.a;
            this.c = new Object();
        } else {
            this.c = p8g;
        }
        this.d = new Object();
        this.e = new y8(12);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = ho9.a;
    }
}
