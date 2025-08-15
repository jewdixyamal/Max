package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: om1  reason: default package */
public final class om1 extends hqd implements dn1 {
    public final en1 F0;

    public om1(mm1 mm1, en1 en1) {
        super(mm1);
        this.F0 = en1;
    }

    public final void A(ol7 ol7) {
        ud1 ud1 = (ud1) ol7;
        en1 en1 = this.F0;
        en1.a.add(this);
        x(en1.b);
        mm1 mm1 = (mm1) this.a;
        mm1.setOpponents(ud1.b);
        mm1.F(ud1.c, ud1.o);
        x(en1.b);
    }

    public final void B(ol7 ol7, Object obj) {
        ud1 ud1 = (ud1) ol7;
        td1 td1 = obj instanceof td1 ? (td1) obj : null;
        View view = this.a;
        if (td1 != null) {
            BitSet bitSet = (BitSet) td1.b;
            if (bitSet.get(0)) {
                ((mm1) view).setOpponents(ud1.b);
            }
            if (bitSet.get(1)) {
                ((mm1) view).F(ud1.c, ud1.o);
                return;
            }
            return;
        }
        en1 en1 = this.F0;
        en1.a.add(this);
        x(en1.b);
        mm1 mm1 = (mm1) view;
        mm1.setOpponents(ud1.b);
        mm1.F(ud1.c, ud1.o);
        x(en1.b);
    }

    public final void x(cn1 cn1) {
        int i = cn1 != null ? cn1.a : 0;
        int i2 = i == 0 ? -1 : nm1.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            View view = this.a;
            if (i2 == 1) {
                mm1 mm1 = (mm1) view;
                mm1.setStatus((CharSequence) null);
                mm1.setTitle((CharSequence) null);
            } else if (i2 == 2) {
                mm1 mm12 = (mm1) view;
                mm12.setTitle(cn1.b);
                mm12.setStatus(cn1.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
