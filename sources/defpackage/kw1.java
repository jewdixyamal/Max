package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kw1  reason: default package */
public final class kw1 implements tj3 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ tj3 b;
    public final /* synthetic */ lw1 c;

    public kw1(lw1 lw1, Executor executor, cy1 cy1) {
        this.c = lw1;
        this.a = executor;
        this.b = cy1;
    }

    public final void accept(Object obj) {
        xkf xkf = (xkf) obj;
        if (xkf instanceof skf) {
            if (!kq0.t()) {
                this.a.execute(new cu1(3, this));
            } else {
                lw1 lw1 = this.c;
                cdc cdc = (cdc) lw1.h.remove(this);
                if (cdc != null && lw1.g == cdc) {
                    lw1.g = null;
                }
            }
        }
        this.b.accept(xkf);
    }
}
