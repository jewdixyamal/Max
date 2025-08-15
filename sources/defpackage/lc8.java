package defpackage;

import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* renamed from: lc8  reason: default package */
public final class lc8 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc8(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                lc8 lc8 = new lc8(3, continuation, 0);
                lc8.Y = frameLayout;
                e5f e5f = e5f.a;
                lc8.o(e5f);
                return e5f;
            case 1:
                lc8 lc82 = new lc8(3, continuation, 1);
                lc82.Y = frameLayout;
                e5f e5f2 = e5f.a;
                lc82.o(e5f2);
                return e5f2;
            case 2:
                lc8 lc83 = new lc8(3, continuation, 2);
                lc83.Y = frameLayout;
                e5f e5f3 = e5f.a;
                lc83.o(e5f3);
                return e5f3;
            case 3:
                lc8 lc84 = new lc8(3, continuation, 3);
                lc84.Y = frameLayout;
                e5f e5f4 = e5f.a;
                lc84.o(e5f4);
                return e5f4;
            default:
                lc8 lc85 = new lc8(3, continuation, 4);
                lc85.Y = frameLayout;
                e5f e5f5 = e5f.a;
                lc85.o(e5f5);
                return e5f5;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                frameLayout.setBackgroundColor(qp4.u0.j(frameLayout).b().l);
                return e5f.a;
            case 1:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                frameLayout2.setBackgroundColor(qp4.u0.j(frameLayout2).b().m);
                return e5f.a;
            case 2:
                od2.a0(obj);
                FrameLayout frameLayout3 = this.Y;
                frameLayout3.setBackgroundColor(qp4.u0.j(frameLayout3).a().h().a.d);
                return e5f.a;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout4 = this.Y;
                frameLayout4.setBackgroundColor(qp4.u0.j(frameLayout4).b().k);
                return e5f.a;
            default:
                od2.a0(obj);
                FrameLayout frameLayout5 = this.Y;
                frameLayout5.setBackgroundColor(qp4.u0.j(frameLayout5).b().k);
                return e5f.a;
        }
    }
}
