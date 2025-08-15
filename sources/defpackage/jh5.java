package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: jh5  reason: default package */
public final class jh5 extends pnf {
    public static final /* synthetic */ bc7[] Z;
    public final je7 X;
    public final w4d Y = mqd.D();
    public final kh5 b;
    public final je7 c;
    public final je7 o;

    static {
        oi9 oi9 = new oi9(jh5.class, "downloadJob", "getDownloadJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Z = new bc7[]{oi9};
    }

    public jh5(kh5 kh5) {
        dh5 dh5 = dh5.a;
        khe d = dh5.getAccessor().d(kke.class);
        khe d2 = dh5.getAccessor().d(no4.class);
        khe d3 = dh5.getAccessor().d(k6f.class);
        this.b = kh5;
        this.c = d;
        this.o = d2;
        this.X = d3;
    }

    public final void p() {
        bc7[] bc7Arr = Z;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.Y;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }
}
