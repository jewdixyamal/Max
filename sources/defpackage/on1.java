package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: on1  reason: default package */
public final class on1 extends FrameLayout {
    public final je7 a = tu0.r(3, new dk1(12));
    public final je7 b;
    public final je7 c;

    public on1(Context context) {
        super(context, (AttributeSet) null);
        this.b = tu0.r(3, new nn1(context, this, 0));
        this.c = tu0.r(3, new nn1(context, this, 1));
    }

    private final mn1 getNewCallTopPanel() {
        return (mn1) this.b.getValue();
    }

    private final in1 getOldCallTopPanel() {
        return (in1) this.c.getValue();
    }

    public final void a() {
        mn1 newCallTopPanel = getNewCallTopPanel();
        newCallTopPanel.L0.removeCallbacks(newCallTopPanel.M0);
        ywe ywe = newCallTopPanel.J0;
        if (ywe != null) {
            ywe.a();
        }
    }

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        if (b()) {
            mn1 newCallTopPanel = getNewCallTopPanel();
            if (!tpa.f(newCallTopPanel.H0, Boolean.valueOf(z))) {
                newCallTopPanel.H0 = Boolean.valueOf(z);
                pq9 pq9 = qp4.u0;
                newCallTopPanel.Q0.setIconTint(z ? pq9.p(newCallTopPanel).c.getIcon().f : pq9.p(newCallTopPanel).c.d().b.a.f);
            }
        }
    }

    public final void d(boolean z, vwe vwe) {
        if (b()) {
            getNewCallTopPanel().y(z, vwe);
        }
    }

    public final void e(boolean z) {
        if (b()) {
            mn1 newCallTopPanel = getNewCallTopPanel();
            ft.g(newCallTopPanel.O0, z, 0, (m56) null, 6);
            ft.g(newCallTopPanel.P0, z, 0, (m56) null, 6);
        }
    }

    public final void setAddUserCount(int i) {
        if (b()) {
            getNewCallTopPanel().setAddUserCount(i);
        }
    }

    public final void setAddUserState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setAddUserState(z);
        }
    }

    public final void setClickListener(ln1 ln1) {
        if (b()) {
            getNewCallTopPanel().setClickListener(ln1);
        } else {
            getOldCallTopPanel().setClickListener(ln1);
        }
    }

    public final void setMode(nnf nnf) {
        if (!b()) {
            getOldCallTopPanel().setMode(nnf);
        }
    }

    public final void setMoreState(boolean z) {
        if (b()) {
            getNewCallTopPanel().setMoreButtonVisible(z);
        }
    }

    public final void setStatus(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setStatus(charSequence);
        } else {
            getOldCallTopPanel().setCallTime(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (b()) {
            getNewCallTopPanel().setTitle(charSequence);
        } else {
            getOldCallTopPanel().setTitle(charSequence);
        }
    }
}
