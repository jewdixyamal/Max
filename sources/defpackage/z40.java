package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z40  reason: default package */
public final class z40 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ c50 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z40(je7 je7, c50 c50, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
        this.Z = c50;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z40) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z40(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            je7 je7 = this.Y;
            w7c w7c = ((uh9) ((ch9) je7.getValue())).H;
            c50 c50 = this.Z;
            xw xwVar = new xw(1, (Object) c50);
            this.X = 1;
            Object d = w7c.a.d(new y40((Object) xwVar, (Object) c50, (Object) je7, 0), this);
            if (d != tx3) {
                d = e5f;
            }
            if (d == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
