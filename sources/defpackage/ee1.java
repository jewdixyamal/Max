package defpackage;

import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: ee1  reason: default package */
public final class ee1 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ LinearLayout Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ee1 ee1 = new ee1(3, continuation, 0);
                ee1.Y = linearLayout;
                e5f e5f = e5f.a;
                ee1.o(e5f);
                return e5f;
            case 1:
                ee1 ee12 = new ee1(3, continuation, 1);
                ee12.Y = linearLayout;
                e5f e5f2 = e5f.a;
                ee12.o(e5f2);
                return e5f2;
            default:
                ee1 ee13 = new ee1(3, continuation, 2);
                ee13.Y = linearLayout;
                e5f e5f3 = e5f.a;
                ee13.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                LinearLayout linearLayout = this.Y;
                linearLayout.setBackgroundColor(qp4.u0.p(linearLayout).c.b().g);
                return e5f.a;
            case 1:
                od2.a0(obj);
                LinearLayout linearLayout2 = this.Y;
                linearLayout2.setBackgroundColor(qp4.u0.j(linearLayout2).b().m);
                return e5f.a;
            default:
                od2.a0(obj);
                LinearLayout linearLayout3 = this.Y;
                linearLayout3.setBackgroundColor(qp4.u0.j(linearLayout3).b().j);
                return e5f.a;
        }
    }
}
