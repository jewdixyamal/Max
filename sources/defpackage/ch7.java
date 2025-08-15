package defpackage;

import java.util.ArrayList;

/* renamed from: ch7  reason: default package */
public final class ch7 implements ug7 {
    public final /* synthetic */ fm a;
    public final /* synthetic */ dh7 b;
    public final /* synthetic */ gh7 c;

    public ch7(fm fmVar, dh7 dh7, gh7 gh7) {
        this.a = fmVar;
        this.b = dh7;
        this.c = gh7;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        dh7 dh7;
        if (eg7.a().compareTo(fg7.a) <= 0) {
            hm9.G("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", (Throwable) null);
            ArrayList arrayList = this.a.v0;
            if (!(arrayList == null || (dh7 = this.b) == null)) {
                arrayList.remove(dh7);
            }
            this.c.f(this);
        }
    }
}
