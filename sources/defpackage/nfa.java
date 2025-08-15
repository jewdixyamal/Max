package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: nfa  reason: default package */
public final class nfa extends d23 implements kre {
    public static final /* synthetic */ bc7[] D0;
    public final mfa B0 = new mfa(this, 0);
    public final mfa C0 = new mfa(this, 1);

    static {
        Class<nfa> cls = nfa.class;
        D0 = new bc7[]{new oi9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Appearance;"), rh4.g(nec.a, cls, "size", "getSize()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar$Size;")};
    }

    public nfa(Context context) {
        super(context, (AttributeSet) null, tsb.circularProgressIndicatorStyle, d23.A0);
        e23 e23 = (e23) this.a;
        wq4 wq4 = new wq4(e23);
        Context context2 = getContext();
        tz6 tz6 = new tz6(context2, e23, wq4, new a23(e23));
        Resources resources = context2.getResources();
        int i = yub.indeterminate_static;
        qbf qbf = new qbf();
        ThreadLocal threadLocal = vic.a;
        qbf.a = qic.a(resources, i, (Resources.Theme) null);
        new pbf(qbf.a.getConstantState());
        tz6.y0 = qbf;
        setIndeterminateDrawable(tz6);
        setProgressDrawable(new di4(getContext(), e23, wq4));
        setIndeterminate(true);
        setTrackCornerRadius(tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density));
    }

    public static int d(gfa gfa, fka fka) {
        if (tpa.f(gfa, zea.a)) {
            return fka.e().e.a.a;
        }
        if (tpa.f(gfa, afa.a)) {
            fka.e().e.b.getClass();
            return -1;
        } else if (tpa.f(gfa, bfa.a)) {
            return fka.e().e.c.a;
        } else {
            if (tpa.f(gfa, cfa.a)) {
                return fka.e().e.e.a;
            }
            if (tpa.f(gfa, dfa.a)) {
                fka.e().e.f.getClass();
                return -15921907;
            } else if (tpa.f(gfa, ffa.a)) {
                return fka.e().e.g.a;
            } else {
                if (tpa.f(gfa, efa.a)) {
                    return fka.e().e.d.a;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final gfa getAppearance() {
        bc7 bc7 = D0[0];
        return (gfa) this.B0.b;
    }

    public final lfa getSize() {
        bc7 bc7 = D0[1];
        return (lfa) this.C0.b;
    }

    public final void onThemeChanged(fka fka) {
        setIndicatorColor(d(getAppearance(), fka));
    }

    public final void setAppearance(gfa gfa) {
        this.B0.o1(this, D0[0], gfa);
    }

    public final void setSize(lfa lfa) {
        this.C0.o1(this, D0[1], lfa);
    }
}
