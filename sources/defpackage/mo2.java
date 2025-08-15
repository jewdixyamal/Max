package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mo2  reason: default package */
public final class mo2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ w12 Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w12 w12 = (w12) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                mo2 mo2 = new mo2(3, continuation, 0);
                mo2.Y = w12;
                mo2.Z = fka;
                e5f e5f = e5f.a;
                mo2.o(e5f);
                return e5f;
            default:
                mo2 mo22 = new mo2(3, continuation, 1);
                mo22.Y = w12;
                mo22.Z = fka;
                e5f e5f2 = e5f.a;
                mo22.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().m().a.a.d);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().g);
                return e5f.a;
        }
    }
}
