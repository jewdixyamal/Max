package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gm4  reason: default package */
public final class gm4 extends k87 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ gm4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                ((cm4) this.c).dispose();
                return;
            case 1:
                ((m56) this.c).invoke(th);
                return;
            default:
                ((Continuation) this.c).resumeWith(e5f.a);
                return;
        }
    }
}
