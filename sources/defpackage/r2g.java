package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r2g  reason: default package */
public final class r2g extends ffe implements a66 {
    public int X;
    public /* synthetic */ boolean Y;
    public final /* synthetic */ y0g Z;
    public final /* synthetic */ s2g s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r2g(y0g y0g, s2g s2g, Continuation continuation) {
        super(2, continuation);
        this.Z = y0g;
        this.s0 = s2g;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((r2g) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r2g r2g = new r2g(this.Z, this.s0, continuation);
        r2g.Y = ((Boolean) obj).booleanValue();
        return r2g;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        s2g s2g = this.s0;
        if (i == 0) {
            od2.a0(obj);
            b1g b1g = new b1g(this.Z.a, this.Y);
            zt0 zt0 = s2g.d;
            c32 c32 = o2g.o;
            ja7 ja7 = s2g.a;
            ja7.getClass();
            x97 x97 = new x97("WebAppSetupScreenCaptureBehavior", ja7.b(b1g.Companion.serializer(), b1g));
            this.X = 1;
            if (zt0.o(x97, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c32 c322 = o2g.o;
        wsf wsf = s2g.e;
        if (wsf != null) {
            iwf.a((iwf) s2g.b.getValue(), "WebAppSetupScreenCaptureBehavior", wsf.a, wsf.b, true, 0, (Integer) null, (Integer) null, 240);
        }
        return e5f.a;
    }
}
