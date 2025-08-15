package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: v2  reason: default package */
public abstract class v2 implements kk9, ed6 {
    public final Object a;
    public final Object b;
    public Object c;

    public v2(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = context;
    }

    public q36 f() {
        ilc ilc = (ilc) this.a;
        ilc.a();
        return ((AtomicBoolean) this.b).compareAndSet(false, true) ? (q36) ((khe) this.c).getValue() : ilc.d(g());
    }

    public abstract String g();

    public void i() {
        synchronized (this.b) {
            try {
                xff xff = (xff) this.c;
                if (xff != null) {
                    ((nx0) this.a).w(xff);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface j() {
        throw new UnsupportedOperationException();
    }

    public abstract int k();

    public void l(ViewGroup viewGroup, int i) {
        this.c = LayoutInflater.from((Context) this.b).inflate(i, viewGroup, false);
        m();
    }

    public abstract void m();

    public void n(tj3 tj3) {
        for (Object accept : (Set) this.a) {
            tj3.accept(accept);
        }
    }

    public void o(Bitmap bitmap, t26 t26, uue uue) {
        throw new UnsupportedOperationException();
    }

    public void p(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void q(t26 t26) {
        throw new UnsupportedOperationException();
    }

    public void r(Object obj) {
        ((Set) this.a).add(obj);
    }

    public abstract void release();

    public void t(q36 q36) {
        if (q36 == ((q36) ((khe) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void u() {
    }

    public void v() {
        ((nx0) this.a).v(new nf4(5, this));
    }

    public void w(t26 t26) {
    }

    public void x(sg9 sg9) {
        throw new UnsupportedOperationException();
    }

    public abstract void y(od4 od4);

    public abstract void z();

    public v2(ilc ilc) {
        this.a = ilc;
        this.b = new AtomicBoolean(false);
        this.c = new khe(new ie(8, (Object) this));
    }

    public v2(nx0 nx0) {
        this.a = nx0;
        this.b = new Object();
    }
}
