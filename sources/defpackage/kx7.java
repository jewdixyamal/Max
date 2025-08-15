package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* renamed from: kx7  reason: default package */
public final class kx7 extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MainScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx7(MainScreen mainScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = mainScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((kx7) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kx7 kx7 = new kx7(this.Y, continuation);
        kx7.X = ((Boolean) obj).booleanValue();
        return kx7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        huc huc = MainScreen.Z;
        u6a o0 = this.Y.o0();
        int i = wca.c;
        o0.getClass();
        int i2 = 0;
        while (true) {
            if (!(i2 < o0.getChildCount())) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = o0.getChildAt(i2);
            if (childAt != null) {
                Object v = tpa.v(childAt, vxb.tag_tab_item);
                t6a t6a = v instanceof t6a ? (t6a) v : null;
                if (t6a != null && t6a.c == i) {
                    if ((childAt.getVisibility() == 0) == z) {
                        break;
                    }
                    childAt.setVisibility(z ? 0 : 8);
                    float weightSum = o0.getWeightSum();
                    float f = (float) 1;
                    o0.setWeightSum(z ? weightSum + f : weightSum - f);
                }
                i2 = i3;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return e5f.a;
    }
}
