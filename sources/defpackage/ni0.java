package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: ni0  reason: default package */
public abstract class ni0 extends LinearLayout implements kre {
    public ni0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        int G = tu0.G(((float) 14) * fk4.d().getDisplayMetrics().density);
        setPadding(G, G, G, G);
        pq9 pq9 = qp4.u0;
        e17 e17 = new e17(fk4.d().getDisplayMetrics().density * 2.0f, fk4.d().getDisplayMetrics().density * 24.0f, pq9.j(this).a().s().f.c);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, pq9.j(this).a().s().b.x);
        e17.h.o1(e17, e17.j[0], gradientDrawable);
        setBackground(e17);
    }

    public void onThemeChanged(fka fka) {
        Drawable background = getBackground();
        e17 e17 = background instanceof e17 ? (e17) background : null;
        if (e17 != null) {
            pq9 pq9 = qp4.u0;
            int i = pq9.j(this).a().s().f.c;
            bc7[] bc7Arr = e17.j;
            e17.i.o1(e17, bc7Arr[1], Integer.valueOf(i));
            e17.h.o1(e17, bc7Arr[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, pq9.j(this).a().s().b.x));
        }
    }
}
