package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: w6c  reason: default package */
public final class w6c implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ y6c a;
    public final /* synthetic */ dec b;
    public final /* synthetic */ long c;
    public final /* synthetic */ v6c o;

    public w6c(View view, y6c y6c, dec dec, long j, v6c v6c, boolean z) {
        this.a = y6c;
        this.b = dec;
        this.c = j;
        this.o = v6c;
        this.X = z;
    }

    public final void run() {
        if (!this.a.f(this.b.h())) {
            this.a.f.remove(Long.valueOf(this.c));
            this.a.e.remove(this.o);
            View findViewById = this.b.a.findViewById(this.o.c.a.toString().hashCode());
            Rect c2 = y6c.c(this.a, findViewById);
            if (c2 != null) {
                String str = this.a.d;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    boolean z = this.X;
                    ir6.d(us7, str, "Play pending reaction effect, by place:" + c2 + ", onCreation:" + z, (Throwable) null);
                }
                y6c y6c = this.a;
                v6c v6c = this.o;
                y6c.d(y6c, v6c.b, v6c.a, c2);
                if (this.X) {
                    this.b.a.addOnLayoutChangeListener(new x6c(this.a, findViewById, this.c));
                }
            }
        }
    }
}
