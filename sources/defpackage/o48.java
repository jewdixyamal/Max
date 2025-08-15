package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* renamed from: o48  reason: default package */
public final class o48 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ GradientDrawable Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o48(GradientDrawable gradientDrawable, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = gradientDrawable;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj;
                o48 o48 = new o48(this.Z, (Continuation) obj3, 0);
                o48.Y = (fka) obj2;
                e5f e5f = e5f.a;
                o48.o(e5f);
                return e5f;
            default:
                fq0 fq0 = (fq0) obj;
                o48 o482 = new o48(this.Z, (Continuation) obj3, 1);
                o482.Y = (fka) obj2;
                e5f e5f2 = e5f.a;
                o482.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.b();
                ngg.G(this.Z, -1728053248);
                return e5f.a;
            default:
                od2.a0(obj);
                this.Z.setColors(this.Y.a().s().b.w);
                return e5f.a;
        }
    }
}
