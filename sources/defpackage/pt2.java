package defpackage;

import android.view.ViewParent;

/* renamed from: pt2  reason: default package */
public final class pt2 implements k56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public pt2(iwc iwc, rwc rwc, lwc lwc) {
        this.b = iwc;
        this.c = rwc;
        this.o = lwc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qd5(((v4) this.o).d(yu2.class), (khe) ((je7) this.b), (khe) ((je7) this.c));
            default:
                iwc iwc = (iwc) this.b;
                ViewParent parent = iwc.getParent();
                rwc rwc = (rwc) this.c;
                if (parent != null) {
                    rwc.removeView(iwc);
                }
                lwc lwc = lwc.a;
                lwc lwc2 = (lwc) this.o;
                if (lwc2 == lwc) {
                    rwc.addView(iwc, rwc.getChildCount());
                } else {
                    rwc.addView(iwc, 0);
                }
                rwc.a(lwc2, rwc.u0, rwc.v0, new lr1(iwc, rwc, lwc2, 12));
                return Boolean.TRUE;
        }
    }

    public pt2(khe khe, v4 v4Var, khe khe2) {
        this.b = khe;
        this.o = v4Var;
        this.c = khe2;
    }
}
