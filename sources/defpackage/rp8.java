package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rp8  reason: default package */
public final class rp8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xp8 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rp8(xp8 xp8, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = xp8;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rp8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xp8 xp8 = this.Y;
            j31 j31 = new j31(new m58(xp8.i, 4), xp8.h, new jf1((Object) xp8, (Object) this.Z, (Continuation) null, 4), 4);
            pp8 pp8 = new pp8(xp8, (Continuation) null);
            this.X = 1;
            if (od2.r(j31, pp8, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
