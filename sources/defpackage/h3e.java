package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h3e  reason: default package */
public final class h3e extends ffe implements a66 {
    public int X;
    public int Y;
    public final /* synthetic */ w3e Z;
    public final /* synthetic */ i3e s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h3e(w3e w3e, i3e i3e, Continuation continuation) {
        super(2, continuation);
        this.Z = w3e;
        this.s0 = i3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h3e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h3e(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        tx3 tx3 = tx3.a;
        int i2 = this.Y;
        i3e i3e = this.s0;
        boolean z = false;
        if (i2 == 0) {
            od2.a0(obj);
            w3e w3e = this.Z;
            int i3 = w3e.Y != 2 ? 1 : 0;
            bc7[] bc7Arr = i3e.H0;
            db3 d = ((sc5) i3e.Z.getValue()).d(w3e.a, w3e.Y != 2);
            this.X = i3;
            this.Y = 1;
            if (s36.e(d, this) == tx3) {
                return tx3;
            }
            i = i3;
        } else if (i2 == 1) {
            i = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s35 s35 = i3e.w0;
        if (i != 0) {
            z = true;
        }
        pnf.o(s35, new qnd(z ? woc.n : woc.w, z ? vga.c : vga.d));
        return e5f.a;
    }
}
