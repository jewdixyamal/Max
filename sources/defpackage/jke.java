package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: jke  reason: default package */
public final class jke {
    public static volatile jke b;
    public static final CountDownLatch c = new CountDownLatch(1);
    public final je7 a;

    public jke(khe khe) {
        this.a = khe;
    }

    public static jke a() {
        if (c.getCount() == 0) {
            return b;
        }
        throw new IllegalStateException("TamContextAndroid should call `init` before `getInstance`");
    }

    public static fke b() {
        try {
            c.await();
        } catch (InterruptedException e) {
            hm9.q("TamContextAndroid", "TamContext initialization was interrupted: %s", e.getMessage());
        }
        return (fke) a().a.getValue();
    }
}
