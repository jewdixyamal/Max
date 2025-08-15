package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c83  reason: default package */
public final class c83 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ d83 Y;
    public final /* synthetic */ kz6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c83(d83 d83, kz6 kz6, Continuation continuation) {
        super(2, continuation);
        this.Y = d83;
        this.Z = kz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c83(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        l20 a;
        q10 q10;
        tx3 tx3 = tx3.a;
        int i = this.X;
        y73 y73 = null;
        kz6 kz6 = this.Z;
        d83 d83 = this.Y;
        if (i == 0) {
            od2.a0(obj);
            nx3 b = ((w9a) d83.b).b();
            b83 b83 = new b83(d83, kz6, (Continuation) null);
            this.X = 1;
            obj = j47.t0(b, b83, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        es8 es8 = (es8) obj;
        e5f e5f = e5f.a;
        if (!(es8 == null || (a = es8.a.a(g20.b)) == null || (q10 = a.c) == null)) {
            p10 p10 = q10.a;
            int i2 = p10 == null ? -1 : a83.$EnumSwitchMapping$0[p10.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                y73 = new w73(kz6.b);
            } else if (i2 == 4 || i2 == 5) {
                y73 = new x73(kz6.b);
            }
            if (y73 == null) {
                return e5f;
            }
            d83.a(y73);
        }
        return e5f;
    }
}
