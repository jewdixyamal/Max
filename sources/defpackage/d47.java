package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: d47  reason: default package */
public final class d47 extends pk0 {
    public final ch3 a;
    public final fme b;
    public final hle c;
    public final av0 d;
    public final pk e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public volatile long j;
    public final rx k = new rx();
    public final AtomicBoolean l = new AtomicBoolean(false);

    public d47(ch3 ch3, fme fme, hle hle, av0 av0, pk pkVar, long j2, long j3, long j4, String str) {
        this.a = ch3;
        this.b = fme;
        this.c = hle;
        this.d = av0;
        this.e = pkVar;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = str;
    }

    public final iqd a() {
        rx rxVar = this.k;
        Object obj = rxVar.a.get();
        Object obj2 = rx.X;
        if (obj != obj2 || rxVar.c == null) {
            rx rxVar2 = this.k;
            re6 re6 = new re6(17, (Object) this);
            rxVar2.getClass();
            oz9 oz9 = new oz9(rxVar2, new sy4(16, (Object) re6), new ey1(16, re6), new v66(re6));
            fme fme = this.b;
            fme.getClass();
            q1a q1a = new q1a(0, new e0a(oz9, new dme(fme, 1, 2), 6));
            if (this.l.get()) {
                return q1a;
            }
            if (!this.a.e()) {
                return iqd.f(new FetcherException(2, "No internet connection"));
            }
            this.d.d(this);
            this.l.compareAndSet(false, true);
            this.j = ((k4a) this.e).L(false, this.f, this.g, this.h, 0, "", false, true, this.i);
            return q1a;
        }
        rx rxVar3 = this.k;
        return iqd.g(rxVar3.a.get() == obj2 ? rxVar3.c : null);
    }

    @uae
    public final void onEvent(akf akf) {
        if (akf.a == this.j) {
            rx rxVar = this.k;
            if (rxVar.a.get() != rx.X || rxVar.b != null) {
                ((jle) this.c).a().b(new vs5(akf, 8, this));
            }
        }
    }

    @uae
    public final void onEvent(oi0 oi0) {
        if (oi0.a == this.j) {
            rx rxVar = this.k;
            if (rxVar.a.get() != rx.X || rxVar.b != null) {
                ((jle) this.c).a().b(new vs5(oi0, 7, this));
            }
        }
    }
}
