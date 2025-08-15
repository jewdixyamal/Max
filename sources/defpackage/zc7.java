package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: zc7  reason: default package */
public final class zc7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ KeyboardStickersWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zc7(KeyboardStickersWidget keyboardStickersWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = keyboardStickersWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zc7) n((k7e) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zc7 zc7 = new zc7(this.Y, continuation);
        zc7.X = obj;
        return zc7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        k7e k7e = (k7e) this.X;
        bc7[] bc7Arr = KeyboardStickersWidget.t0;
        KeyboardStickersWidget keyboardStickersWidget = this.Y;
        EndlessRecyclerView2 m0 = keyboardStickersWidget.m0();
        int i = k7e.b;
        if (i >= 0) {
            m0.E0();
            GridLayoutManager q = z7.q(m0);
            if (q != null) {
                q.n1(i, 0);
            }
        }
        RecyclerView n0 = keyboardStickersWidget.n0();
        int i2 = k7e.c;
        if (i2 >= 0) {
            n0.E0();
            n0.x0(i2);
        }
        return e5f.a;
    }
}
