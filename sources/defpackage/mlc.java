package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mlc  reason: default package */
public final /* synthetic */ class mlc implements Callable {
    public final /* synthetic */ vlc a;
    public final /* synthetic */ long b;
    public final /* synthetic */ fs8 c;
    public final /* synthetic */ long o;

    public /* synthetic */ mlc(vlc vlc, long j, fs8 fs8, long j2) {
        this.a = vlc;
        this.b = j;
        this.c = fs8;
        this.o = j2;
    }

    public final Object call() {
        return Long.valueOf(this.a.f(this.b, this.o, this.c, false));
    }
}
