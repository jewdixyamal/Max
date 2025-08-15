package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: y6c  reason: default package */
public final class y6c extends tdc {
    public final RecyclerView a;
    public final h6c b;
    public final k56 c;
    public final String d = y6c.class.getName();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedList f = new LinkedList();
    public boolean g;

    public y6c(EndlessRecyclerView2 endlessRecyclerView2, h6c h6c, zj7 zj7) {
        this.a = endlessRecyclerView2;
        this.b = h6c;
        this.c = zj7;
    }

    public static final Rect c(y6c y6c, View view) {
        View view2 = (View) y6c.c.invoke();
        if (view2 == null || view == null) {
            return null;
        }
        return mpf.c(view, view2);
    }

    public static final void d(y6c y6c, String str, long j, Rect rect) {
        y6c y6c2 = y6c;
        long j2 = j;
        String str2 = y6c2.d;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str2, ey8.h(j2, "Play message "), (Throwable) null);
        }
        RLottieFactory rLottieFactory = RLottieFactory.INSTANCE;
        RLottieDrawable createByUrl$default = RLottieFactory.createByUrl$default(str, tu0.G(((float) q6c.b.getWidth()) * fk4.d().getDisplayMetrics().density), tu0.G(((float) q6c.b.getHeight()) * fk4.d().getDisplayMetrics().density), false, false, true, false, true, false, 72, (Object) null);
        createByUrl$default.setAutoRepeat(0);
        y6c2.b.a(j2, createByUrl$default, rect);
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.b.setScrollOffset(-i2);
        if (this.g) {
            this.g = false;
            pla.a(recyclerView, new q57(19, recyclerView, this));
            return;
        }
        g(false);
    }

    public final void e(long j, v5c v5c, String str) {
        String str2 = this.d;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str2, "Add reaction effect, reaction:" + v5c + ", " + j, (Throwable) null);
        }
        this.e.add(new v6c(j, v5c, str));
    }

    public final boolean f(int i) {
        RecyclerView recyclerView = this.a;
        LinearLayoutManager t = z7.t(recyclerView);
        int W0 = t != null ? t.W0() : -1;
        LinearLayoutManager t2 = z7.t(recyclerView);
        return i == -1 || W0 > i || i > (t2 != null ? t2.Y0() : -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r6 = r1.longValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(boolean r11) {
        /*
            r10 = this;
            java.util.LinkedList r0 = r10.f
            java.lang.Object r1 = r0.peek()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0049
            long r6 = r1.longValue()
            androidx.recyclerview.widget.RecyclerView r2 = r10.a
            dec r5 = r2.N(r6)
            if (r5 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.LinkedHashSet r2 = r10.e
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            r4 = r3
            v6c r4 = (defpackage.v6c) r4
            long r8 = r4.a
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            goto L_0x0032
        L_0x0031:
            r3 = 0
        L_0x0032:
            r8 = r3
            v6c r8 = (defpackage.v6c) r8
            if (r8 != 0) goto L_0x003b
            r0.remove(r1)
            return
        L_0x003b:
            w6c r0 = new w6c
            androidx.recyclerview.widget.RecyclerView r1 = r10.a
            r2 = r0
            r3 = r1
            r4 = r10
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r8, r9)
            defpackage.pla.a(r1, r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6c.g(boolean):void");
    }
}
