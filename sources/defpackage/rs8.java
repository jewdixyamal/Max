package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: rs8  reason: default package */
public final class rs8 extends ii0 {
    public final es8 b;
    public final l20 c;
    public boolean d = false;
    public final /* synthetic */ ts8 e;

    public rs8(ts8 ts8, es8 es8, l20 l20) {
        this.e = ts8;
        this.b = es8;
        this.c = l20;
    }

    public final void a(String str, ru6 ru6, Animatable animatable) {
        if (!this.d) {
            boolean z = true;
            this.d = true;
            boolean z2 = ru6 instanceof j43;
            l20 l20 = this.c;
            if (z2) {
                c37.e((j43) ru6, l20);
            }
            if (!s5c.K(l20) && !s5c.N(l20) && !l20.o.c()) {
                d20 d20 = d20.c;
                ts8 ts8 = this.e;
                long j = ts8.y0.a.b;
                es8 es8 = this.b;
                if (j != es8.a.b) {
                    z = false;
                }
                ts8.U(es8, l20, d20, z);
                if (((y8a) ts8.a).n().c.g.getBoolean("app.media.save.to.gallery", false)) {
                    p00 p00 = new p00(this, 5, ru6);
                    hj8 hj8 = new hj8(9);
                    hle q = ((y8a) ts8.a).q();
                    q.getClass();
                    cqc.a(p00, ((jle) q).a(), (f6) null, hj8, (ztc) null);
                }
            }
        }
    }

    public final void d(String str, Throwable th) {
        Drawable drawable = ts8.V0;
        StringBuilder sb = new StringBuilder("Set photo attach failed, messageId ");
        ts8 ts8 = this.e;
        sb.append(ts8.y0.a.b);
        hm9.p("ts8", sb.toString(), th);
        if (!(th instanceof NullPointerException)) {
            d20 d20 = d20.o;
            long j = ts8.y0.a.b;
            es8 es8 = this.b;
            ts8.U(es8, this.c, d20, j == es8.a.b);
        }
    }
}
