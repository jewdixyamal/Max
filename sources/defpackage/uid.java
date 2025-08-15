package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uid  reason: default package */
public final class uid extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vid Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uid(vid vid, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = vid;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uid) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uid(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = vid.w0;
            vid vid = this.Y;
            ((jp) vid.o.getValue()).k(this.Z, "app.media.caching.time");
            this.X = 1;
            if (vid.r(vid, this) == tx3) {
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
