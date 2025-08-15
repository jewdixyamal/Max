package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cx  reason: default package */
public final class cx extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;
    public final /* synthetic */ ix Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx(je7 je7, ix ixVar, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
        this.Z = ixVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cx) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cx(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ix ixVar = this.Z;
            long j = ixVar.a;
            long l = ((ol6) ixVar.e).l();
            mg4 mg4 = mg4.DELAYED;
            this.X = 1;
            vlc vlc = ((r79) this.Y.getValue()).a;
            Object t0 = j47.t0(((w9a) vlc.c()).b(), new nlc(mg4, vlc, j, l, (Continuation) null), this);
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 != obj2) {
                t0 = obj3;
            }
            if (t0 == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj3;
    }
}
