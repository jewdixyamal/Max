package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieFactory;

/* renamed from: m8  reason: default package */
public final /* synthetic */ class m8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                dec dec = (dec) obj;
                return ((RecyclerView) this.c).getRecycledViewPool().getRecycledView(this.b);
            case 1:
                ei eiVar = (ei) obj;
                int i2 = this.b;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url((String) this.c, true, i2, i2, true), false, true, true, false, 18, (z84) null));
            case 2:
                Integer num = (Integer) obj;
                gy4 gy4 = (gy4) this.c;
                return j47.T((sx3) gy4.f.getValue(), (lx3) null, (vx3) null, new fy4(this.b, gy4, (Continuation) null), 3);
            default:
                ((Integer) obj).getClass();
                az4 az4 = (az4) this.c;
                int i3 = 0;
                for (Object next : ((xy4) az4.u0.a.getValue()).b) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        ol7 ol7 = (ol7) next;
                        if ((ol7 instanceof d02) && ((d02) ol7).a == (i = this.b)) {
                            az4.Y.m((Object) null, new yy4(i, i3, 0, 4));
                        }
                        i3 = i4;
                    } else {
                        y53.R();
                        throw null;
                    }
                }
                return e5f.a;
        }
    }
}
