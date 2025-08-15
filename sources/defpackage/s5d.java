package defpackage;

import android.text.Layout;

/* renamed from: s5d  reason: default package */
public final class s5d extends dle implements u5d {
    public s5d() {
        super((m56) new w8c(5));
    }

    public final int h0() {
        if (!br7.H((je7) this.c)) {
            return 0;
        }
        return rh4.c((float) 4, fk4.d().getDisplayMetrics().density, L());
    }

    public final void setAlias(Layout layout) {
        if (layout == null) {
            je7 je7 = (je7) this.c;
            if (je7.a()) {
                ((t5d) je7.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ((t5d) Q()).setLayout(layout);
        Q().setVisibility(0);
        t();
    }

    public final void setAliasColor(int i) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            ((t5d) je7.getValue()).setTextColor(i);
        }
    }
}
