package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: hx  reason: default package */
public final class hx extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ix Y;
    public final /* synthetic */ Collection Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hx(ix ixVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = ixVar;
        this.Z = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hx) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hx(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        Object obj3 = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ix ixVar = this.Y;
            this.X = 1;
            vlc vlc = ((r79) ((je7) ixVar.k).getValue()).a;
            Object t0 = j47.t0(((w9a) vlc.c()).b(), new olc(vlc, ixVar.a, this.Z, (Continuation) null), this);
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
