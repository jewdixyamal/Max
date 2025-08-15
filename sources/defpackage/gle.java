package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: gle  reason: default package */
public abstract class gle extends zje {
    public static final fle b = new gle();

    public gle() {
    }

    public void b(gy8 gy8, String str) {
    }

    public gle(gy8 gy8) {
        try {
            long nanoTime = System.nanoTime();
            if (gy8.m()) {
                int x0 = gy8.x0();
                for (int i = 0; i < x0; i++) {
                    b(gy8, gy8.z0());
                }
            }
            this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - nanoTime));
        } catch (Exception e) {
            hm9.p("gle", "failed to parse unpacker response: ", e);
            throw new RuntimeException(e);
        }
    }
}
