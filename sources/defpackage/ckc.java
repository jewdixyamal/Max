package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: ckc  reason: default package */
public abstract class ckc implements b37 {
    public SoftReference a;

    public final Object a(v4 v4Var) {
        SoftReference softReference = this.a;
        SoftReference softReference2 = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            obj = b(v4Var);
            if (obj != null) {
                softReference2 = new SoftReference(obj);
            }
            this.a = softReference2;
        }
        return obj;
    }

    public abstract Object b(v4 v4Var);
}
