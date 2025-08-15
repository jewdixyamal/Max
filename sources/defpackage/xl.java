package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: xl  reason: default package */
public final /* synthetic */ class xl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Integer X;
    public final /* synthetic */ fm a;
    public final /* synthetic */ ColorStateList b;
    public final /* synthetic */ ColorStateList c;
    public final /* synthetic */ q18 o;

    public /* synthetic */ xl(fm fmVar, ColorStateList colorStateList, ColorStateList colorStateList2, q18 q18, Integer num) {
        this.a = fmVar;
        this.b = colorStateList;
        this.c = colorStateList2;
        this.o = q18;
        this.X = num;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        fm fmVar = this.a;
        fmVar.getClass();
        int N = mr0.N(this.b.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c.getDefaultColor());
        ColorStateList valueOf = ColorStateList.valueOf(N);
        q18 q18 = this.o;
        q18.l(valueOf);
        if (!(fmVar.J0 == null || (num = fmVar.K0) == null || !num.equals(this.X))) {
            aq4.g(fmVar.J0, N);
        }
        ArrayList arrayList = fmVar.F0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                au1.r(it.next());
                if (q18.a.c != null) {
                    throw null;
                }
            }
        }
    }
}
