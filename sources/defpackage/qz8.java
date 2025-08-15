package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qz8  reason: default package */
public final class qz8 extends ffe implements a66 {
    public final /* synthetic */ xz8 X;
    public final /* synthetic */ CharSequence Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz8(xz8 xz8, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.X = xz8;
        this.Y = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qz8) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qz8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        xz8 xz8 = this.X;
        e52 e52 = (e52) xz8.b.getValue();
        Long l = e52 != null ? new Long(e52.b.a) : null;
        CharSequence charSequence = this.Y;
        if (!(charSequence == null || charSequence.length() == 0 || l == null)) {
            sna sna = (sna) xz8.x0.getValue();
            long longValue = l.longValue();
            if (longValue == 0) {
                sna.getClass();
            } else {
                sna.f(longValue, (b10) null, 0);
            }
        }
        return e5f.a;
    }
}
