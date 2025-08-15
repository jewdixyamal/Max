package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: pt1  reason: default package */
public final class pt1 extends iv1 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ pt1() {
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1 = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1)).execute(new l40(i, 4, iv1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void b(int i, pv1 pv1) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1 = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1)).execute(new si1((Object) iv1, i, (Object) pv1, 2));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                ((lq1) this.b).b((Object) null);
                ((yw1) this.c).s(this);
                return;
        }
    }

    public void c(int i, dp3 dp3) {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.b).iterator();
                while (it.hasNext()) {
                    iv1 iv1 = (iv1) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.c).get(iv1)).execute(new si1((Object) iv1, i, (Object) dp3, 1));
                    } catch (RejectedExecutionException unused) {
                    }
                }
                return;
            default:
                return;
        }
    }

    public pt1(lq1 lq1, yw1 yw1) {
        this.b = lq1;
        this.c = yw1;
    }
}
