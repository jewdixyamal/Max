package defpackage;

import android.os.Handler;

/* renamed from: z94  reason: default package */
public final class z94 implements rr4 {
    public final lr4 a;
    public fr4 b;
    public boolean c;
    public final /* synthetic */ ba4 o;

    public z94(ba4 ba4, lr4 lr4) {
        this.o = ba4;
        this.a = lr4;
    }

    public final void release() {
        Handler handler = this.o.u;
        handler.getClass();
        oaf.W(handler, new cu1(27, this));
    }
}
