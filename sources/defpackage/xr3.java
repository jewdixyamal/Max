package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: xr3  reason: default package */
public final class xr3 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                xr3 xr3 = new xr3(3, continuation, 0);
                xr3.Y = view;
                e5f e5f = e5f.a;
                xr3.o(e5f);
                return e5f;
            case 1:
                xr3 xr32 = new xr3(3, continuation, 1);
                xr32.Y = view;
                e5f e5f2 = e5f.a;
                xr32.o(e5f2);
                return e5f2;
            default:
                xr3 xr33 = new xr3(3, continuation, 2);
                xr33.Y = view;
                e5f e5f3 = e5f.a;
                xr33.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                View view = this.Y;
                view.setBackgroundColor(qp4.u0.j(view).b().k);
                return e5f.a;
            case 1:
                od2.a0(obj);
                View view2 = this.Y;
                view2.setBackgroundColor(qp4.u0.j(view2).i().b.c);
                return e5f.a;
            default:
                od2.a0(obj);
                View view3 = this.Y;
                Drawable background = view3.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(qp4.u0.j(view3).getText().b);
                }
                return e5f.a;
        }
    }
}
