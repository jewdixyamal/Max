package defpackage;

import android.content.Context;
import java.util.Locale;
import kotlin.coroutines.Continuation;

/* renamed from: rc8  reason: default package */
public final class rc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ yc8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc8(Object obj, Continuation continuation, es8 es8, yc8 yc8) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8;
        this.Z = yc8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rc8(this.X, continuation, this.Y, this.Z);
    }

    public final Object o(Object obj) {
        String obj2;
        od2.a0(obj);
        l20 l20 = (l20) this.X;
        i10 i10 = l20 != null ? l20.e : null;
        if (i10 == null) {
            return null;
        }
        long hashCode = (long) l20.r.hashCode();
        es8 es8 = this.Y;
        boolean z = es8.b.Y;
        yc8 yc8 = this.Z;
        if (z) {
            obj2 = z7.B(yc8.a, oda.T);
        } else {
            u6b u6b = es8.X;
            u6b.c(u6b.a.g());
            obj2 = u6b.h.toString();
        }
        String str = obj2;
        String c = tfg.c(i10.c);
        Context context = yc8.a;
        Locale v = ((hyc) yc8.b).v();
        cu8 cu8 = es8.a;
        return new qm8(hashCode, cu8.b, i10.a, l20.r, i10.b, str, rh4.j(c, " · ", ay7.s(context, v, cu8.o, true)), yc8.a.getString(oda.U), ((z3b) yc8.f.getValue()).e);
    }
}
