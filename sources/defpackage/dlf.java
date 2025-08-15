package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: dlf  reason: default package */
public final class dlf {
    public final lff a = new Object();
    public final Context b;
    public final ef7 c;
    public final gh3 d;
    public final jle e;
    public final ztc f;
    public final p7b g;
    public final pk h;
    public final fme i;
    public final ch3 j;
    public final av0 k;
    public final zi5 l;
    public final int m;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lff] */
    public dlf(Context context, gh3 gh3, ef7 ef7, hle hle, p7b p7b, pk pkVar, fme fme, ch3 ch3, av0 av0, zi5 zi5) {
        this.b = context;
        this.d = gh3;
        this.c = ef7;
        jle jle = (jle) hle;
        this.f = jle.a();
        this.e = jle;
        this.g = p7b;
        this.h = pkVar;
        this.i = fme;
        this.j = ch3;
        this.k = av0;
        this.l = zi5;
        this.m = 30;
    }

    public final boolean a(Throwable th) {
        int i2 = th instanceof FetcherException ? ((FetcherException) th).a : 0;
        if (i2 == 1 || i2 == 7 || i2 == 6 || i2 == 9) {
            return true;
        }
        return !this.d.f();
    }

    public final String b(l20 l20) {
        long j2;
        boolean P = s5c.P(l20);
        if (l20.i()) {
            j2 = l20.d.a;
        } else {
            if (P) {
                j2 = 0;
            }
            return null;
        }
        String str = l20.s;
        if (oag.t(str)) {
            return null;
        }
        if (pag.k(new File(str))) {
            return str;
        }
        if (j2 == 0) {
            return null;
        }
        File s = ((kk5) this.l).s(j2);
        if (pag.k(s)) {
            return s.getAbsolutePath();
        }
        return null;
    }

    public final uqd c(l20 l20, long j2, long j3) {
        l20 l202 = l20;
        hm9.m("VideoRipper", "getVideoContent chatServerId=%d, messageServerId=%d", Long.valueOf(j2), Long.valueOf(j3));
        k20 k20 = s5c.P(l20) ? l202.j.d.d : l202.d;
        k28 k28 = new k28(new clf(this, k20, l202));
        k20 k202 = s5c.P(l20) ? l202.j.d.d : l202.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc a2 = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        return new ib3(k28, 1, new rqd(new rqd(new zrd(new uqd(new q1a(1, new xg4(this, l20, j2, j3, k202, 2)), new n2f(24), 0), (long) this.m, timeUnit, a2), new clf(this, l202, k202), 2), new ypc(this, 26, k202), 1)).h(new gte(13, (Object) k20));
    }
}
