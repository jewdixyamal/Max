package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: gg9  reason: default package */
public final /* synthetic */ class gg9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg9 b;

    public /* synthetic */ gg9(jg9 jg9, int i) {
        this.a = i;
        this.b = jg9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                return e5f.a;
            default:
                Context context = this.b.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yfa.k);
                pq9 pq9 = qp4.u0;
                c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9, context).k);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                float f = (float) 24;
                gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                gradientDrawable.setColor(pq9.b(context).i().b().e);
                gradientDrawable.setStroke(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), pq9.b(context).i().i().c);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
