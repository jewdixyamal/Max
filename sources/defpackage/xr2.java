package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xr2  reason: default package */
public final class xr2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ cka Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cka cka = (cka) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                xr2 xr2 = new xr2(3, continuation, 0);
                xr2.Y = cka;
                xr2.Z = fka;
                e5f e5f = e5f.a;
                xr2.o(e5f);
                return e5f;
            case 1:
                xr2 xr22 = new xr2(3, continuation, 1);
                xr22.Y = cka;
                xr22.Z = fka;
                e5f e5f2 = e5f.a;
                xr22.o(e5f2);
                return e5f2;
            default:
                xr2 xr23 = new xr2(3, continuation, 2);
                xr23.Y = cka;
                xr23.Z = fka;
                e5f e5f3 = e5f.a;
                xr23.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                return e5f.a;
            case 1:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.onThemeChanged(this.Z);
                return e5f.a;
        }
    }
}
