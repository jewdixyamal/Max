package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yle  reason: default package */
public final class yle implements fh3, gbd {
    public static final short[] t0 = {1, 5, 6, 89};
    public final je7 X;
    public final AtomicReference Y;
    public final AtomicLong Z = new AtomicLong(0);
    public final kad a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final String s0 = "SessionController";

    static {
        yb9 yb9 = sla.c;
        yb9 yb92 = sla.c;
        yb9 yb93 = sla.c;
        yb9 yb94 = sla.c;
    }

    public yle(kad kad, je7 je7, je7 je72, je7 je73, je7 je74, hbd hbd) {
        this.a = kad;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.Y = atomicReference;
        ((jbd) hbd).a(this);
        ((ch3) je74.getValue()).a().c(this);
        atomicReference.set(g());
    }

    public static x9d d(yle yle, x9d x9d) {
        x9d x9d2;
        se5 se5 = ((p7b) ((m7b) yle.b.getValue())).e;
        se5.getClass();
        if (!se5.n(PmsKey.f94newsessionlogic, false) || x9d == null || x9d.l.get() == Long.MIN_VALUE) {
            return x9d;
        }
        String str = yle.s0;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.Z;
            ir6.d(us7, str, "old_session=" + x9d + " in connect process", (Throwable) null);
        }
        String str2 = x9d.a;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us72 = us7.X;
            ir62.d(us72, str2, "fork, " + x9d, (Throwable) null);
        }
        if (x9d.f.get() != 1 && x9d.m.compareAndSet(false, true)) {
            k33 k33 = x9d.n;
            mbd mbd = x9d.E;
            uxc uxc = x9d.o;
            bs9 bs9 = x9d.u;
            mh3 mh3 = x9d.t;
            e6a e6a = x9d.p;
            o6a o6a = x9d.D;
            int i = x9d.B;
            yk8 yk8 = new yk8(k33, mbd, uxc, bs9, mh3, e6a, o6a);
            yk8.a = i;
            yk8.i = x9d;
            x9d2 = new x9d(yk8);
            x9d.y.a();
            x9d.z.a();
            if (!x9d.j.get()) {
                x9d.r();
            }
        } else {
            String str3 = x9d.a;
            hm9.p(str3, "failed to fork " + x9d + " because is ALREADY in an INACTIVE state", (Throwable) null);
            x9d2 = null;
        }
        if (x9d2 != null) {
            String str4 = yle.s0;
            ir6 ir63 = hm9.m;
            if (ir63 != null && ir63.c()) {
                us7 us73 = us7.X;
                ir63.d(us73, str4, "new_session=" + x9d2 + " was created, old_session=" + x9d, (Throwable) null);
            }
            return x9d2;
        }
        String str5 = yle.s0;
        ir6 ir64 = hm9.m;
        if (ir64 == null || !ir64.c()) {
            return x9d;
        }
        ir64.d(us7.Z, str5, "seems new session creation was already scheduled", (Throwable) null);
        return x9d;
    }

    public final void a() {
        f(false);
    }

    public final void b() {
        x9d x9d;
        hm9.m(this.s0, "onConnectionTypeChange", new Object[0]);
        AtomicReference atomicReference = this.Y;
        x9d x9d2 = (x9d) atomicReference.get();
        if (x9d2 != null) {
            je7 je7 = this.X;
            if (!((ch3) je7.getValue()).a().f()) {
                x9d2.q(false);
                x9d2.h(true, false);
            } else if (((ch3) je7.getValue()).f() && (x9d = (x9d) atomicReference.updateAndGet(new xle(this, 1))) != null) {
                x9d.q(true);
            }
        }
    }

    public final void c(int i) {
        AtomicReference atomicReference = this.Y;
        String str = this.s0;
        if (i == 0) {
            hm9.m0(str, "onNoNet", new Object[0]);
            x9d x9d = (x9d) atomicReference.get();
            if (x9d != null) {
                j(x9d);
            }
        } else if (i == 1) {
            hm9.m(str, "onDisconnected", new Object[0]);
            x9d x9d2 = (x9d) atomicReference.get();
            if (x9d2 == null) {
                hm9.m0(str, "onDisconnected, has NO active session!", new Object[0]);
            } else {
                j(x9d2);
            }
        } else if (i == 2) {
            hm9.m(str, "onConnected", new Object[0]);
        } else if (i == 3) {
            hm9.m(str, "onLoggedIn", new Object[0]);
        } else {
            throw new IllegalStateException(("Unknown session state=" + i).toString());
        }
    }

    public final boolean e(dle dle, dke dke) {
        if (!((f5a) this.c.getValue()).e()) {
            return false;
        }
        short N = dle.N();
        short[] sArr = t0;
        if (Arrays.binarySearch(sArr, 0, sArr.length, N) >= 0) {
            return false;
        }
        dke.g(new pke("session.forbidden.opcode.in.external.auth", "forbidden opcode in external authorization", (String) null));
        return true;
    }

    public final void f(boolean z) {
        if (!z) {
            je7 je7 = this.X;
            if (!((ch3) je7.getValue()).a().f() || !((ch3) je7.getValue()).f()) {
                return;
            }
        }
        x9d x9d = (x9d) this.Y.updateAndGet(new xle(this, 1));
        if (x9d != null) {
            x9d.q(true);
        }
    }

    public final x9d g() {
        kad kad = this.a;
        z7d z7d = ((p7b) ((m7b) this.b.getValue())).b;
        z7d.getClass();
        yk8 yk8 = new yk8((jad) kad.a, (mbd) ((khe) kad.Z).getValue(), (uxc) ((je7) kad.o).getValue(), (bs9) ((je7) kad.c).getValue(), (mh3) ((je7) kad.b).getValue(), (e6a) ((je7) kad.X).getValue(), (o6a) ((je7) kad.Y).getValue());
        yk8.a = (int) z7d.q(PmsKey.f113sendqueuesize, (long) 30);
        yk8.i = null;
        return new x9d(yk8);
    }

    public final void h() {
        int size;
        x9d x9d = (x9d) this.Y.get();
        if (x9d != null) {
            z7d z7d = ((p7b) ((m7b) this.b.getValue())).b;
            z7d.getClass();
            int q = (int) z7d.q(PmsKey.f31disconnecttimeout, (long) HttpStatus.SC_MULTIPLE_CHOICES);
            if (q > 0 && ((f5a) this.c.getValue()).d() && !((ri4) this.o.getValue()).d() && !((ri4) this.o.getValue()).c()) {
                long j = this.Z.get();
                int i = ft4.o;
                ((ri4) this.o.getValue()).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                kt4 kt4 = kt4.MILLISECONDS;
                boolean z = ft4.c(ft4.g(z7.S(elapsedRealtime, kt4), z7.S(j, kt4)), z7.R(q, kt4)) > 0;
                if (j > 0 && z) {
                    synchronized (x9d.x) {
                        size = x9d.w.size();
                    }
                    if (size == 0) {
                        hm9.m(this.s0, "disconnectIfNeeded: timeout expired, disconnect", new Object[0]);
                        x9d.q(false);
                        x9d.h(true, false);
                    }
                }
            }
        }
    }

    public final void i() {
        this.Y.getAndUpdate(new xle(this, 0));
    }

    public final void j(x9d x9d) {
        String str = this.s0;
        hm9.m(str, "updateSession", new Object[0]);
        je7 je7 = this.X;
        if (!((ch3) je7.getValue()).a().f()) {
            hm9.m0(str, "updateSession, seems there is NO net", new Object[0]);
            x9d.q(false);
        } else if (!((ch3) je7.getValue()).f()) {
            hm9.m0(str, "updateSession, connection is NOT permitted", new Object[0]);
            x9d.q(false);
        } else {
            x9d.q(true);
        }
    }
}
