package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ol8  reason: default package */
public final class ol8 {
    public final ml8 a;
    public final String b = getClass().getName();
    public final /* synthetic */ int c;
    public final /* synthetic */ pl8 d;
    public final /* synthetic */ Object e;

    public ol8(ml8 ml8, pl8 pl8, Object obj, int i) {
        this.c = i;
        this.d = pl8;
        this.e = obj;
        this.a = ml8;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                String str = (String) this.d.b;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, str, "executeWithDetachableLooper.done, quit loop ...", (Throwable) null);
                }
                ((bi4) this.e).b.quitSafely();
                return;
            default:
                String str2 = (String) this.d.b;
                ir6 ir62 = hm9.m;
                if (ir62 != null && ir62.c()) {
                    ir62.d(us7.X, str2, "executeWithMainLooper.done", (Throwable) null);
                }
                ((CountDownLatch) this.e).countDown();
                return;
        }
    }
}
