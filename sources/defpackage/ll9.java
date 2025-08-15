package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ll9  reason: default package */
public final /* synthetic */ class ll9 implements tj3 {
    public final /* synthetic */ long a;

    public /* synthetic */ ll9(long j) {
        this.a = j;
    }

    public final void accept(Object obj) {
        hk9 hk9 = (hk9) obj;
        long j = this.a;
        hk9.s0 = j;
        if (((bq7) hk9.Y).k()) {
            hk9.pause();
        }
        ((nl9) ((kk9) hk9.b)).w0.setText(ay7.l(TimeUnit.MILLISECONDS.toSeconds(j)));
        hk9.Z1();
        hk9.v0.e(Long.valueOf(j));
    }
}
