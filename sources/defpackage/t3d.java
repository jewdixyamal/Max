package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: t3d  reason: default package */
public final class t3d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SelectAlbumWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t3d(Continuation continuation, SelectAlbumWidget selectAlbumWidget) {
        super(2, continuation);
        this.Y = selectAlbumWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((t3d) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t3d t3d = new t3d(continuation, this.Y);
        t3d.X = obj;
        return t3d;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        d3d d3d = (d3d) this.X;
        if (d3d instanceof d3d) {
            bc7[] bc7Arr = SelectAlbumWidget.Y;
            this.Y.n0().j(d3d.a);
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
