package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wp7  reason: default package */
public final class wp7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xp7 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp7(xp7 xp7, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = xp7;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wp7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wp7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        String str = this.Z;
        xp7 xp7 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            b86 b86 = (b86) xp7.g.get(str);
            if (b86 == null) {
                return e5f;
            }
            hq7 hq7 = xp7.c;
            this.X = 1;
            if (((fz6) hq7).d(b86, 40, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xp7.a.c(new yp7(str));
        return e5f;
    }
}
