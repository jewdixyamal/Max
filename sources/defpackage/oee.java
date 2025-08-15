package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oee  reason: default package */
public final /* synthetic */ class oee implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ String c;

    public /* synthetic */ oee(AtomicReference atomicReference, String str, int i) {
        this.a = i;
        this.b = atomicReference;
        this.c = str;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                this.b.set(lq1);
                return zr6.l(new StringBuilder(), this.c, "-cancellation");
            case 1:
                this.b.set(lq1);
                return zr6.l(new StringBuilder(), this.c, "-status");
            default:
                this.b.set(lq1);
                return zr6.l(new StringBuilder(), this.c, "-Surface");
        }
    }
}
