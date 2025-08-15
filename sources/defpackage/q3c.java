package defpackage;

import one.me.rlottie.RLottieDrawable;

/* renamed from: q3c  reason: default package */
public final /* synthetic */ class q3c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ q3c(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                RLottieDrawable.a(this.b, this.c);
                return;
            default:
                RLottieDrawable.b(this.b, this.c);
                return;
        }
    }
}
