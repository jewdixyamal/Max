package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ar9  reason: default package */
public final class ar9 extends cr9 {
    public static final /* synthetic */ bc7[] i;
    public final gi9 e = new gi9((Object) null);
    public final ReentrantLock f = new ReentrantLock();
    public final w4d g = mqd.D();
    public long h;

    static {
        oi9 oi9 = new oi9(ar9.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9};
    }

    public ar9(sx3 sx3, je7 je7) {
        super(sx3, je7);
        int i2 = ft4.o;
        this.h = 0;
        a();
        this.c = j47.T(sx3, (lx3) null, (vx3) null, new zq9(this, (Continuation) null), 3);
    }

    public final void d() {
        gi9 gi9 = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int i2 = gi9.d;
                z7d z7d = ((p7b) ((m7b) this.b.getValue())).b;
                z7d.getClass();
                if (i2 >= ((int) z7d.q(PmsKey.f98noncontactmaxchunksize, (long) 10))) {
                    int i3 = ft4.o;
                    long S = z7.S(System.nanoTime(), kt4.NANOSECONDS);
                    if (ft4.c(ft4.g(S, this.h), b()) <= 0) {
                        reentrantLock.unlock();
                        return;
                    }
                    this.h = S;
                    gi9 j = oag.j(gi9);
                    gi9.c();
                    this.g.o1(this, i[0], j47.T(this.a, (lx3) null, vx3.b, new yq9(this, j, (Continuation) null), 1));
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean e() {
        if (ft4.c(b(), 0) > 0) {
            z7d z7d = ((p7b) ((m7b) this.b.getValue())).b;
            z7d.getClass();
            if (((int) z7d.q(PmsKey.f98noncontactmaxchunksize, (long) 10)) > 0) {
                return true;
            }
        }
        return false;
    }
}
