package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* renamed from: ro2  reason: default package */
public final class ro2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ro2 ro2 = new ro2(3, continuation, 0);
                ro2.Y = frameLayout;
                ro2.Z = fka;
                e5f e5f = e5f.a;
                ro2.o(e5f);
                return e5f;
            case 1:
                ro2 ro22 = new ro2(3, continuation, 1);
                ro22.Y = frameLayout;
                ro22.Z = fka;
                e5f e5f2 = e5f.a;
                ro22.o(e5f2);
                return e5f2;
            case 2:
                ro2 ro23 = new ro2(3, continuation, 2);
                ro23.Y = frameLayout;
                ro23.Z = fka;
                e5f e5f3 = e5f.a;
                ro23.o(e5f3);
                return e5f3;
            case 3:
                ro2 ro24 = new ro2(3, continuation, 3);
                ro24.Y = frameLayout;
                ro24.Z = fka;
                e5f e5f4 = e5f.a;
                ro24.o(e5f4);
                return e5f4;
            case 4:
                ro2 ro25 = new ro2(3, continuation, 4);
                ro25.Y = frameLayout;
                ro25.Z = fka;
                e5f e5f5 = e5f.a;
                ro25.o(e5f5);
                return e5f5;
            case 5:
                ro2 ro26 = new ro2(3, continuation, 5);
                ro26.Y = frameLayout;
                ro26.Z = fka;
                e5f e5f6 = e5f.a;
                ro26.o(e5f6);
                return e5f6;
            default:
                ro2 ro27 = new ro2(3, continuation, 6);
                ro27.Y = frameLayout;
                ro27.Z = fka;
                e5f e5f7 = e5f.a;
                ro27.o(e5f7);
                return e5f7;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().m().a.a.d);
                return e5f.a;
            case 1:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.a().h().a.d);
                return e5f.a;
            case 2:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                fka fka = this.Z;
                qp4.u0.b(frameLayout.getContext()).getClass();
                qp4.c(frameLayout, fka);
                return e5f.a;
            case 3:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                fka fka2 = this.Z;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(fka2.e().c.a);
                }
                return e5f.a;
            case 4:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().k);
                return e5f.a;
            case 5:
                od2.a0(obj);
                this.Y.setBackgroundColor(this.Z.b().j);
                return e5f.a;
            default:
                od2.a0(obj);
                FrameLayout frameLayout3 = this.Y;
                fka fka3 = this.Z;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 16.0f);
                gradientDrawable2.setTint(fka3.b().g);
                frameLayout3.setBackground(gradientDrawable2);
                frameLayout3.setForeground(new RippleDrawable(ColorStateList.valueOf(fka3.d().a.a.h), (Drawable) null, s3e.K0));
                return e5f.a;
        }
    }
}
