package defpackage;

/* renamed from: r25  reason: default package */
public abstract class r25 extends v2 {
    public abstract void A(q36 q36, Object obj);

    public final void B(Iterable iterable) {
        q36 f = f();
        try {
            for (Object A : iterable) {
                A(f, A);
                f.m();
            }
        } finally {
            t(f);
        }
    }

    public final void C(Object obj) {
        q36 f = f();
        try {
            A(f, obj);
            f.m();
        } finally {
            t(f);
        }
    }

    public final long D(Object obj) {
        q36 f = f();
        try {
            A(f, obj);
            return f.m();
        } finally {
            t(f);
        }
    }
}
