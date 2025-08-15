package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: j62  reason: default package */
public final /* synthetic */ class j62 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ m62 c;

    public /* synthetic */ j62(Context context, m62 m62, int i) {
        this.a = i;
        this.b = context;
        this.c = m62;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                qe qeVar = new qe(this.b);
                m62 m62 = this.c;
                ((EnhancedAnimatedVectorDrawable) qeVar.getDrawable()).setCallback(m62);
                qeVar.a(qp4.u0.j(m62).getIcon().h);
                return qeVar;
            default:
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(this.b, woc.H);
                c54.Z(enhancedVectorDrawable, "error", qp4.u0.j(this.c).d().b.a.c);
                return enhancedVectorDrawable;
        }
    }
}
