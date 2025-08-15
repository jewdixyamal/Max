package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: msf  reason: default package */
public final class msf implements zl4, am4 {
    public final hc3 a = new Object();
    public final HashSet b = new HashSet();

    /* JADX WARNING: type inference failed for: r0v0, types: [zl4, java.lang.Object, java.lang.ref.WeakReference] */
    public final synchronized boolean a(zl4 zl4) {
        boolean a2;
        ? weakReference = new WeakReference(zl4);
        a2 = this.a.a(weakReference);
        if (a2) {
            this.b.add(weakReference);
        }
        return a2;
    }

    public final synchronized boolean b(zl4 zl4) {
        boolean z;
        z = false;
        try {
            hc3 hc3 = this.a;
            Objects.requireNonNull(hc3);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nsf nsf = (nsf) it.next();
                if (((zl4) nsf.get()) == zl4) {
                    it.remove();
                    z = hc3.b(nsf);
                    break;
                }
            }
        } catch (Throwable th) {
            hm9.p("msf", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized boolean c(zl4 zl4) {
        boolean z;
        z = false;
        try {
            hc3 hc3 = this.a;
            Objects.requireNonNull(hc3);
            Iterator it = this.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                nsf nsf = (nsf) it.next();
                if (((zl4) nsf.get()) == zl4) {
                    it.remove();
                    z = hc3.c(nsf);
                    break;
                }
            }
        } catch (Throwable th) {
            hm9.p("msf", "delete: failed", th);
            return false;
        }
        return z;
    }

    public final synchronized void d() {
        this.a.d();
        this.b.clear();
    }

    public final synchronized void g() {
        this.a.g();
        this.b.clear();
    }

    public final boolean h() {
        return this.a.b;
    }
}
