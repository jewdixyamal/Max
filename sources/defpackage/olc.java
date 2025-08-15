package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: olc  reason: default package */
public final class olc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vlc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Collection s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public olc(vlc vlc, long j, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = vlc;
        this.Z = j;
        this.s0 = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((olc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new olc(this.Y, this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t19 d = this.Y.d();
            List D0 = x53.D0(this.s0);
            this.X = 1;
            d.getClass();
            if (ote.j(d.a, new rp4((Object) d, (Collection) D0, this.Z, 1), this) == tx3) {
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
