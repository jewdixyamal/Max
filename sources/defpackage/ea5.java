package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ea5  reason: default package */
public final /* synthetic */ class ea5 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa5 b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ ea5(fa5 fa5, CountDownLatch countDownLatch, int i) {
        this.a = i;
        this.b = fa5;
        this.c = countDownLatch;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C(this.c);
                return;
            default:
                this.b.C(this.c);
                return;
        }
    }
}
