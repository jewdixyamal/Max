package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* renamed from: j27  reason: default package */
public final class j27 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ int Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j27(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
        switch (i2) {
            case 1:
                this.Y = i;
                super(3, continuation);
                return;
            default:
                return;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                j27 j27 = new j27(3, (Continuation) obj3, 0);
                j27.Z = (String) obj;
                j27.Y = intValue;
                return j27.o(e5f.a);
            default:
                fka fka = (fka) obj2;
                j27 j272 = new j27(this.Y, (Continuation) obj3, 1);
                j272.Z = (ImageView) obj;
                e5f e5f = e5f.a;
                j272.o(e5f);
                return e5f;
        }
    }

    public final Object o(Object obj) {
        boolean z = true;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                int i = this.Y;
                if (!(((String) this.Z).length() == i || i == -1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                ImageView imageView = (ImageView) this.Z;
                int i2 = woc.E;
                pq9 pq9 = qp4.u0;
                bs6 icon = pq9.j(imageView).getIcon();
                Drawable b = kt3.b(imageView.getContext(), i2);
                ngg.G(b, icon.j);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                int i3 = this.Y;
                shapeDrawable.setIntrinsicWidth(i3);
                shapeDrawable.setIntrinsicHeight(i3);
                shapeDrawable.setTint(pq9.j(imageView).b().a.g);
                int G = (i3 - tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density)) / 2;
                int G2 = (i3 - tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density)) / 2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
                layerDrawable.setLayerInset(1, G, G2, G, G2);
                imageView.setImageDrawable(layerDrawable);
                return e5f.a;
        }
    }
}
