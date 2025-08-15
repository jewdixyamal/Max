package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CancellationException;

/* renamed from: sb3  reason: default package */
public final /* synthetic */ class sb3 implements ug7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sb3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        switch (this.a) {
            case 0:
                if (eg7 == eg7.ON_CREATE) {
                    OnBackInvokedDispatcher a2 = tb3.a.a((yb3) this.c);
                    i3a i3a = (i3a) this.b;
                    i3a.e = a2;
                    i3a.e(i3a.g);
                    return;
                }
                return;
            default:
                fg7 fg7 = eh7.Q().d;
                fg7 fg72 = fg7.a;
                kg7 kg7 = (kg7) this.b;
                if (fg7 == fg72) {
                    ((x77) this.c).cancel((CancellationException) null);
                    kg7.a();
                    return;
                }
                int compareTo = eh7.Q().d.compareTo(kg7.b);
                jl4 jl4 = kg7.c;
                if (compareTo < 0) {
                    jl4.a = true;
                    return;
                } else if (jl4.a) {
                    if (!jl4.b) {
                        jl4.a = false;
                        jl4.a();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                } else {
                    return;
                }
        }
    }
}
