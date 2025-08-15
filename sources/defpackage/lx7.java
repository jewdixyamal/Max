package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: lx7  reason: default package */
public final class lx7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MainScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lx7) n((hy3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lx7 lx7 = new lx7(this.Y, continuation);
        lx7.X = obj;
        return lx7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        huc huc = MainScreen.Z;
        u6a o0 = this.Y.o0();
        int i = wca.e;
        int i2 = ((hy3) this.X).a;
        o0.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < o0.getChildCount())) {
                return e5f.a;
            }
            int i4 = i3 + 1;
            View childAt = o0.getChildAt(i3);
            if (childAt != null) {
                Object v = tpa.v(childAt, vxb.tag_tab_item);
                t6a t6a = v instanceof t6a ? (t6a) v : null;
                if (t6a != null && t6a.c == i) {
                    ((wq0) childAt).setCounter(i2);
                }
                i3 = i4;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }
}
