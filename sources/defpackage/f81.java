package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: f81  reason: default package */
public final class f81 extends p04 {
    public final String w0 = f81.class.getName();
    public List x0 = nz4.a;

    public f81(uu3 uu3) {
        super(uu3, 1);
    }

    public final void E(znc znc, int i) {
        CallHistoryPageScreen callHistoryPageScreen;
        if (!znc.n()) {
            int ordinal = ((w81) this.x0.get(i)).c.ordinal();
            if (ordinal == 0) {
                buc buc = CallHistoryPageScreen.u0;
                v81 v81 = v81.ALL;
                buc.getClass();
                callHistoryPageScreen = new CallHistoryPageScreen(v81);
            } else if (ordinal == 1) {
                buc buc2 = CallHistoryPageScreen.u0;
                v81 v812 = v81.MISSING;
                buc2.getClass();
                callHistoryPageScreen = new CallHistoryPageScreen(v812);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            CallHistoryPageScreen callHistoryPageScreen2 = callHistoryPageScreen;
            callHistoryPageScreen2.setRetainViewMode(tu3.b);
            znc.R(new coc(callHistoryPageScreen2, (String) null, (zu3) null, (zu3) null, false, -1));
        }
    }

    /* renamed from: J */
    public final void y(eoc eoc) {
        eoc.G0 = null;
        super.J(eoc);
    }

    public final int j() {
        return this.x0.size();
    }
}
