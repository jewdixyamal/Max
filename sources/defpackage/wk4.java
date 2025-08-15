package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wk4  reason: default package */
public final class wk4 extends pj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wk4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.b).set(true);
                return;
            default:
                r6b r6b = (r6b) this.b;
                if (r6b.n()) {
                    r6b.b.c();
                    return;
                }
                return;
        }
    }
}
