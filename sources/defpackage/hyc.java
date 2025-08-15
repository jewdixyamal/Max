package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* renamed from: hyc  reason: default package */
public abstract class hyc extends e3 implements q33 {
    public final kld h = lld.a(1, 0, 1);
    public volatile g03 i;
    public cj4 j;
    public Locale k;

    public hyc(Context context, mi5 mi5) {
        super(context, "user.prefs", mi5);
    }

    public final void A(long j2) {
        l("app.reset.at.time", Long.valueOf(j2));
    }

    public final void B(long j2) {
        l("server.timeDelta", Long.valueOf(j2));
    }

    public final void C(Long l) {
        l("user.Id", l);
        this.h.g(l);
    }

    public synchronized void c() {
        super.c();
        this.i = null;
        this.h.g(Long.valueOf(t()));
    }

    public final long n() {
        return f("server.timeDelta", 0) + System.currentTimeMillis();
    }

    public final synchronized long o() {
        g03 g03;
        try {
            if (this.i == null) {
                this.i = new g03(new gyc(this, 1), new bqc(2, this));
            }
            g03 = this.i;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return g03.b + ((long) ((AtomicInteger) g03.c).getAndIncrement());
    }

    public final long p() {
        return f("user.chatsLastSync", 0);
    }

    public final String q() {
        return this.g.getString("user.deviceAvatarPath", (String) null);
    }

    public final String r() {
        return g("user.lang", "ru");
    }

    public final long s() {
        return this.g.getLong("user.stickersLastSync", 0);
    }

    public final long t() {
        return f("user.Id", -1);
    }

    public final zn5 u() {
        return new zn5(this.h, new vq5(new gyc(this, 0), (Continuation) null));
    }

    public final Locale v() {
        if (this.k == null) {
            this.k = new Locale(r());
        }
        return this.k;
    }

    public final void w(long j2) {
        if (j2 > p()) {
            hm9.m(this.e, "setChatsLastSync %d", Long.valueOf(j2));
            l("user.chatsLastSync", Long.valueOf(j2));
        }
    }

    public final void x(long j2) {
        l("app.first.login.time", Long.valueOf(j2));
    }

    public final void y(boolean z) {
        j("app.forceConnection", z);
    }

    public final void z(long j2) {
        l("app.last.login.time", Long.valueOf(j2));
    }
}
