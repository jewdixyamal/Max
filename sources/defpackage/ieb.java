package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ieb  reason: default package */
public final class ieb extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ cla Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ieb(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cla cla = (cla) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ieb ieb = new ieb(3, continuation, 0);
                ieb.Y = cla;
                ieb.Z = fka;
                e5f e5f = e5f.a;
                ieb.o(e5f);
                return e5f;
            default:
                ieb ieb2 = new ieb(3, continuation, 1);
                ieb2.Y = cla;
                ieb2.Z = fka;
                e5f e5f2 = e5f.a;
                ieb2.o(e5f2);
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
                this.Y.setBackgroundColor(this.Z.b().k);
                return e5f.a;
        }
    }
}
