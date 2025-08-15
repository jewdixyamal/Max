package defpackage;

import java.util.ArrayList;

/* renamed from: g1a  reason: default package */
public final class g1a extends ArrayList implements c1a {
    public volatile int a;

    public final void a() {
        add(hv9.a);
        this.a++;
    }

    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    public final void c(a1a a1a) {
        if (a1a.getAndIncrement() == 0) {
            f2a f2a = a1a.b;
            int i = 1;
            while (!a1a.o) {
                int i2 = this.a;
                Integer num = (Integer) a1a.c;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i2) {
                    if (!hv9.a(f2a, get(intValue)) && !a1a.o) {
                        intValue++;
                    } else {
                        return;
                    }
                }
                a1a.c = Integer.valueOf(intValue);
                i = a1a.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void d(Throwable th) {
        add(new fv9(th));
        this.a++;
    }
}
