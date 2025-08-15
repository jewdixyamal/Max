package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mqf  reason: default package */
public final class mqf implements zl1 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public boolean v0;

    public mqf(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710) {
        this.a = je710;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        this.Y = je75;
        this.Z = je76;
        this.s0 = je77;
        this.t0 = je78;
        this.u0 = je79;
        ((wr1) ((kr1) je79.getValue())).d(this);
    }

    public final void a() {
        zl4 zl4;
        hm9.m("mqf", "onAppGoesBackground", new Object[0]);
        this.v0 = false;
        if (((f5a) this.b.getValue()).d()) {
            if (((wr1) ((kr1) this.u0.getValue())).q()) {
                hm9.m("mqf", "ignore onAppGoesBackground due to active call", new Object[0]);
                return;
            }
            u0b u0b = (u0b) this.c.getValue();
            u0b.getClass();
            hm9.m("u0b", "stopInteractivePings", new Object[0]);
            ((k4a) ((pk) u0b.a.getValue())).G(false);
            zl4 zl42 = u0b.f;
            if (!(zl42 == null || zl42.h() || (zl4 = u0b.f) == null)) {
                zl4.g();
            }
            w7b w7b = (w7b) this.o.getValue();
            AtomicBoolean atomicBoolean = w7b.v0;
            if (atomicBoolean.get()) {
                w7b.g();
                atomicBoolean.set(false);
            }
            w7b.u0.o1(w7b, w7b.w0[0], (Object) null);
            ((sna) this.Y.getValue()).getClass();
            Iterator it = sna.b.entrySet().iterator();
            while (it.hasNext()) {
                qna qna = (qna) ((Map.Entry) it.next()).getValue();
                if (qna.a.isEmpty()) {
                    zl4 zl43 = qna.b;
                    if (zl43 != null && !zl43.h()) {
                        zl43.g();
                    }
                    it.remove();
                }
            }
            sna.c.clear();
            ((tle) ((mle) this.Z.getValue())).e(false);
            ((ng5) this.s0.getValue()).b.getClass();
        }
    }

    public final void b(boolean z) {
        int ordinal;
        hm9.m("mqf", "onAppGoesForeground forceContactSync = %b", Boolean.valueOf(z));
        je7 je7 = this.a;
        ((yle) je7.getValue()).f(false);
        je7 je72 = this.t0;
        ((gh3) je72.getValue()).invalidate();
        if (this.v0 || !((wr1) ((kr1) this.u0.getValue())).r()) {
            this.v0 = true;
            ((tle) ((mle) this.Z.getValue())).e(true);
            if (!((gh3) je72.getValue()).a() && je7.a()) {
                ((yle) je7.getValue()).i();
            }
            ((yle) je7.getValue()).f(false);
            ((u0b) this.c.getValue()).b();
            if (((f5a) this.b.getValue()).d()) {
                w7b w7b = (w7b) this.o.getValue();
                w7b.v0.set(true);
                if (((f5a) w7b.Y.getValue()).d()) {
                    long f = ((hyc) w7b.e()).f("user.presenceLastSync", 0);
                    k4a k4a = (k4a) ((pk) w7b.Z.getValue());
                    k4a.getClass();
                    if (f < 0 && (ordinal = k4a.x().ordinal()) != 0) {
                        if (ordinal == 1) {
                            hm9.p(k4a.a, "invalid last sync time", new IllegalArgumentException("invalid last sync time"));
                            k4a.v(k4a, new wp3(((p7b) k4a.y()).a.o(), (long[]) null, f));
                        } else if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw new IllegalArgumentException("invalid last sync time");
                        }
                    }
                }
                if (z) {
                    ((jva) ((bva) this.X.getValue())).c();
                    return;
                }
                return;
            }
            return;
        }
        hm9.m("mqf", "ignore onAppGoesForeground due to incoming call.", new Object[0]);
    }

    public final void i() {
        if (!this.v0) {
            a();
            hm9.m("mqf", "Call was ended. Stop ping activity state.", new Object[0]);
        }
    }

    public final void onCallAccepted() {
        if (!this.v0) {
            b(false);
            hm9.m("mqf", "Call was accepted. Start ping activity state.", new Object[0]);
        }
    }
}
