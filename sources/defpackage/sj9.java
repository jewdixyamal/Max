package defpackage;

import java.util.Objects;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;

/* renamed from: sj9  reason: default package */
public final class sj9 extends u2 {
    public final av0 X;
    public final ad Y;
    public final k8g Z;
    public final m7b c;
    public final cn7 o;
    public final ztc s0;
    public final ri4 t0;
    public g28 u0;
    public sd7 v0;
    public boolean w0;

    public sj9(xk9 xk9, p7b p7b, p82 p82, cn7 cn7, cy7 cy7, ad adVar, k8g k8g, ztc ztc, ri4 ri4, FrgLiveLocationSettings frgLiveLocationSettings) {
        super(0, (Object) xk9);
        this.c = p7b;
        this.o = cn7;
        this.X = cy7;
        this.Y = adVar;
        this.Z = k8g;
        this.s0 = ztc;
        this.t0 = ri4;
    }

    public final void Z1() {
        cqc.b(this.u0);
        ((p7b) this.c).a.t();
        this.t0.a();
        this.o.getClass();
        vy9 v = new e0a(new q28(m28.a.h(this.s0).f(ce.a()), new jj9(2), 0), new rj9(this, 1), 3).v();
        jj9 jj9 = new jj9(3);
        g28 g28 = new g28(new rj9(this, 2), new rj9(this, 3), new e5(13, this));
        Objects.requireNonNull(g28, "observer is null");
        try {
            v.k(new r28(g28, jj9, 1));
            this.u0 = g28;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @uae
    public void onEvent(ps3 ps3) {
        ((xk9) ((kk9) this.b)).s0.m();
    }
}
