package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: a3  reason: default package */
public final class a3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a3 a3Var = new a3(3, continuation, 0);
                a3Var.Y = view;
                a3Var.Z = fka;
                e5f e5f = e5f.a;
                a3Var.o(e5f);
                return e5f;
            case 1:
                a3 a3Var2 = new a3(3, continuation, 1);
                a3Var2.Y = view;
                a3Var2.Z = fka;
                e5f e5f2 = e5f.a;
                a3Var2.o(e5f2);
                return e5f2;
            default:
                a3 a3Var3 = new a3(3, continuation, 2);
                a3Var3.Y = view;
                a3Var3.Z = fka;
                e5f e5f3 = e5f.a;
                a3Var3.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.i().b.b);
                return e5f.a;
            case 1:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.i().b.c);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                return e5f.a;
        }
    }
}
