package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;

/* renamed from: b33  reason: default package */
public final /* synthetic */ class b33 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClearRecentSearchBottomSheet b;

    public /* synthetic */ b33(ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, int i) {
        this.a = i;
        this.b = clearRecentSearchBottomSheet;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClearRecentSearchBottomSheet clearRecentSearchBottomSheet = this.b;
                clearRecentSearchBottomSheet.s0(true);
                uu3 targetController = clearRecentSearchBottomSheet.getTargetController();
                a33 a33 = targetController instanceof a33 ? (a33) targetController : null;
                if (a33 != null) {
                    gw2 n0 = ((ChatsListSearchScreen) a33).n0();
                    vxd vxd = n0.O0;
                    if (vxd == null || !vxd.isActive()) {
                        n0.O0 = j47.T(n0.a, n0.L0, (vx3) null, new pv2(n0, (Continuation) null), 2);
                        return;
                    }
                    return;
                }
                return;
            default:
                this.b.s0(true);
                return;
        }
    }
}
