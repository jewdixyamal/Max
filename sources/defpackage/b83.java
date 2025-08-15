package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b83  reason: default package */
public final class b83 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d83 Y;
    public final /* synthetic */ kz6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b83(d83 d83, kz6 kz6, Continuation continuation) {
        super(2, continuation);
        this.Y = d83;
        this.Z = kz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b83 b83 = new b83(this.Y, this.Z, continuation);
        b83.X = obj;
        return b83;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        d83 d83 = this.Y;
        kz6 kz6 = this.Z;
        try {
            tp7 tp7 = (tp7) d83.d.getValue();
            long j = kz6.c;
            tp7.getClass();
            obj2 = (es8) tp7.b(tp7, j, false, 26).e();
        } catch (Throwable th) {
            obj2 = new njc(th);
        }
        if (obj2 instanceof njc) {
            return null;
        }
        return obj2;
    }
}
