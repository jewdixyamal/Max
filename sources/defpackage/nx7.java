package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: nx7  reason: default package */
public final /* synthetic */ class nx7 implements c66 {
    public final /* synthetic */ int a;

    public /* synthetic */ nx7(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.a) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                fka fka = (fka) obj3;
                Drawable drawable = imageView.getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = drawable instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable : null;
                if (enhancedAnimatedVectorDrawable != null) {
                    c54.Z(enhancedAnimatedVectorDrawable, "left_dot", fka.b().i);
                    c54.Z(enhancedAnimatedVectorDrawable, "middle_dot", fka.b().i);
                    c54.Z(enhancedAnimatedVectorDrawable, "right_dot", fka.b().i);
                    c54.Z(enhancedAnimatedVectorDrawable, "shape", booleanValue ? fka.getIcon().a.c.a : fka.getIcon().a.c.b);
                }
                return e5f.a;
            default:
                boolean booleanValue2 = bool.booleanValue();
                fka fka2 = (fka) obj3;
                Drawable drawable2 = imageView.getDrawable();
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable2 = drawable2 instanceof EnhancedAnimatedVectorDrawable ? (EnhancedAnimatedVectorDrawable) drawable2 : null;
                if (enhancedAnimatedVectorDrawable2 != null) {
                    c54.Z(enhancedAnimatedVectorDrawable2, "cutout", fka2.b().i);
                    c54.Z(enhancedAnimatedVectorDrawable2, "gear", booleanValue2 ? fka2.getIcon().a.c.a : fka2.getIcon().a.c.b);
                }
                return e5f.a;
        }
    }
}
