package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ep9  reason: default package */
public final class ep9 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fm Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep9(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fm fmVar = (fm) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ep9 ep9 = new ep9(3, continuation, 0);
                ep9.Y = fmVar;
                ep9.Z = fka;
                e5f e5f = e5f.a;
                ep9.o(e5f);
                return e5f;
            default:
                ep9 ep92 = new ep9(3, continuation, 1);
                ep92.Y = fmVar;
                ep92.Z = fka;
                e5f e5f2 = e5f.a;
                ep92.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                return e5f.a;
        }
    }
}
