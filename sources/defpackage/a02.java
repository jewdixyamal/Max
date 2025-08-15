package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: a02  reason: default package */
public final class a02 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatImageView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a02(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                a02 a02 = new a02(3, continuation, 0);
                a02.Y = appCompatImageView;
                e5f e5f = e5f.a;
                a02.o(e5f);
                return e5f;
            case 1:
                a02 a022 = new a02(3, continuation, 1);
                a022.Y = appCompatImageView;
                e5f e5f2 = e5f.a;
                a022.o(e5f2);
                return e5f2;
            case 2:
                a02 a023 = new a02(3, continuation, 2);
                a023.Y = appCompatImageView;
                e5f e5f3 = e5f.a;
                a023.o(e5f3);
                return e5f3;
            default:
                a02 a024 = new a02(3, continuation, 3);
                a024.Y = appCompatImageView;
                e5f e5f4 = e5f.a;
                a024.o(e5f4);
                return e5f4;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                AppCompatImageView appCompatImageView = this.Y;
                pq9 pq9 = qp4.u0;
                int i = pq9.j(appCompatImageView).d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                appCompatImageView.setImageResource(woc.o0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).getIcon().j));
                return e5f.a;
            case 1:
                od2.a0(obj);
                AppCompatImageView appCompatImageView2 = this.Y;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(qp4.u0.j(appCompatImageView2).getIcon().i));
                appCompatImageView2.setImageResource(yfa.x);
                return e5f.a;
            case 2:
                od2.a0(obj);
                AppCompatImageView appCompatImageView3 = this.Y;
                pq9 pq92 = qp4.u0;
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(pq92.j(appCompatImageView3).getIcon().i));
                appCompatImageView3.setImageResource(yfa.a);
                int i2 = pq92.j(appCompatImageView3).d().a.a.h;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView3.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                return e5f.a;
            default:
                od2.a0(obj);
                AppCompatImageView appCompatImageView4 = this.Y;
                pq9 pq93 = qp4.u0;
                appCompatImageView4.setImageTintList(ColorStateList.valueOf(pq93.j(appCompatImageView4).getIcon().i));
                appCompatImageView4.setImageResource(ica.i);
                int i3 = pq93.j(appCompatImageView4).d().a.a.h;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                appCompatImageView4.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable3));
                return e5f.a;
        }
    }
}
