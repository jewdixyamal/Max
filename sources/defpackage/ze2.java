package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: ze2  reason: default package */
public final class ze2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ ImageView Y;
    public /* synthetic */ fka Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ze2 ze2 = new ze2(3, continuation, 0);
                ze2.Y = imageView;
                ze2.Z = fka;
                e5f e5f = e5f.a;
                ze2.o(e5f);
                return e5f;
            case 1:
                ze2 ze22 = new ze2(3, continuation, 1);
                ze22.Y = imageView;
                ze22.Z = fka;
                e5f e5f2 = e5f.a;
                ze22.o(e5f2);
                return e5f2;
            case 2:
                ze2 ze23 = new ze2(3, continuation, 2);
                ze23.Y = imageView;
                ze23.Z = fka;
                e5f e5f3 = e5f.a;
                ze23.o(e5f3);
                return e5f3;
            case 3:
                ze2 ze24 = new ze2(3, continuation, 3);
                ze24.Y = imageView;
                ze24.Z = fka;
                e5f e5f4 = e5f.a;
                ze24.o(e5f4);
                return e5f4;
            case 4:
                ze2 ze25 = new ze2(3, continuation, 4);
                ze25.Y = imageView;
                ze25.Z = fka;
                e5f e5f5 = e5f.a;
                ze25.o(e5f5);
                return e5f5;
            case 5:
                ze2 ze26 = new ze2(3, continuation, 5);
                ze26.Y = imageView;
                ze26.Z = fka;
                e5f e5f6 = e5f.a;
                ze26.o(e5f6);
                return e5f6;
            case 6:
                ze2 ze27 = new ze2(3, continuation, 6);
                ze27.Y = imageView;
                ze27.Z = fka;
                e5f e5f7 = e5f.a;
                ze27.o(e5f7);
                return e5f7;
            case 7:
                ze2 ze28 = new ze2(3, continuation, 7);
                ze28.Y = imageView;
                ze28.Z = fka;
                e5f e5f8 = e5f.a;
                ze28.o(e5f8);
                return e5f8;
            case 8:
                ze2 ze29 = new ze2(3, continuation, 8);
                ze29.Y = imageView;
                ze29.Z = fka;
                e5f e5f9 = e5f.a;
                ze29.o(e5f9);
                return e5f9;
            case 9:
                ze2 ze210 = new ze2(3, continuation, 9);
                ze210.Y = imageView;
                ze210.Z = fka;
                e5f e5f10 = e5f.a;
                ze210.o(e5f10);
                return e5f10;
            default:
                ze2 ze211 = new ze2(3, continuation, 10);
                ze211.Y = imageView;
                ze211.Z = fka;
                e5f e5f11 = e5f.a;
                ze211.o(e5f11);
                return e5f11;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.getIcon().j));
                return e5f.a;
            case 1:
                od2.a0(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.a().h().b.b));
                return e5f.a;
            case 2:
                od2.a0(obj);
                ImageView imageView = this.Y;
                this.Z.getIcon();
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                return e5f.a;
            case 3:
                od2.a0(obj);
                ImageView imageView2 = this.Y;
                this.Z.getIcon();
                imageView2.setImageTintList(ColorStateList.valueOf(-1));
                return e5f.a;
            case 4:
                od2.a0(obj);
                ImageView imageView3 = this.Y;
                fka fka = this.Z;
                Drawable drawable = imageView3.getDrawable();
                EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
                if (enhancedVectorDrawable != null) {
                    int i = fka.i().b.b;
                    VectorPath findPath = enhancedVectorDrawable.findPath("stroke");
                    if (findPath != null) {
                        findPath.setStrokeColor(i);
                        enhancedVectorDrawable.invalidatePath();
                    }
                }
                return e5f.a;
            case 5:
                od2.a0(obj);
                ImageView imageView4 = this.Y;
                fka fka2 = this.Z;
                Drawable background = imageView4.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(fka2.b().k);
                }
                ngg.G(imageView4.getDrawable(), fka2.getIcon().k);
                return e5f.a;
            case 6:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.getIcon().k);
                return e5f.a;
            case 7:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.getIcon().k);
                return e5f.a;
            case 8:
                od2.a0(obj);
                ngg.G(this.Y.getDrawable(), this.Z.f().a);
                return e5f.a;
            case 9:
                od2.a0(obj);
                ImageView imageView5 = this.Y;
                fka fka3 = this.Z;
                int i2 = fka3.d().a.a.d;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(fka3.b().a.h);
                imageView5.setBackground(new RippleDrawable(ColorStateList.valueOf(i2), shapeDrawable, (Drawable) null));
                imageView5.setImageTintList(ColorStateList.valueOf(-1));
                return e5f.a;
            default:
                od2.a0(obj);
                ImageView imageView6 = this.Y;
                fka fka4 = this.Z;
                imageView6.setImageTintList(ColorStateList.valueOf(fka4.getIcon().i));
                Drawable background2 = imageView6.getBackground();
                if (background2 != null) {
                    background2.setTint(fka4.b().a.g);
                }
                return e5f.a;
        }
    }
}
