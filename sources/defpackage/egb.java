package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.coroutines.Continuation;

/* renamed from: egb  reason: default package */
public final class egb extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ CoordinatorLayout Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                egb egb = new egb(3, continuation, 0);
                egb.Y = coordinatorLayout;
                egb.Z = fka;
                e5f e5f = e5f.a;
                egb.o(e5f);
                return e5f;
            default:
                egb egb2 = new egb(3, continuation, 1);
                egb2.Y = coordinatorLayout;
                egb2.Z = fka;
                e5f e5f2 = e5f.a;
                egb2.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                return e5f.a;
        }
    }
}
