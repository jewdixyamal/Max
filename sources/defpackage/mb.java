package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: mb  reason: default package */
public final class mb implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx3 b;
    public final /* synthetic */ lx3 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ mb(ContextScope contextScope, lx3 lx3, Object obj, int i) {
        this.a = i;
        this.b = contextScope;
        this.c = lx3;
        this.o = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lb lbVar = new lb(obj, (Continuation) null, (pb) this.o);
                return j47.g(this.b, this.c, vx3.a, lbVar);
            default:
                sp8 sp8 = new sp8(obj, (Continuation) null, (tya) this.o);
                return j47.g(this.b, this.c, vx3.a, sp8);
        }
    }
}
