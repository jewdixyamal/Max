package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: g81  reason: default package */
public final /* synthetic */ class g81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ g81(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    public final Object invoke() {
        CallHistoryPageScreen callHistoryPageScreen = this.b;
        switch (this.a) {
            case 0:
                buc buc = CallHistoryPageScreen.u0;
                return new m81(callHistoryPageScreen.requireActivity().getApplicationContext(), callHistoryPageScreen.m0(), (rg1) callHistoryPageScreen.c.getValue());
            case 1:
                buc buc2 = CallHistoryPageScreen.u0;
                return new rg1(new khe(new g81(callHistoryPageScreen, 5)), new l5g(callHistoryPageScreen, 0));
            case 2:
                buc buc3 = CallHistoryPageScreen.u0;
                if (callHistoryPageScreen.m0() != v81.MISSING) {
                    return null;
                }
                aba aba = new aba(callHistoryPageScreen.getContext(), (AttributeSet) null);
                aba.setVisibility(8);
                aba.setId(pvb.call_history_page_empty);
                aba.setIcon(woc.f0);
                aba.setTitle(new eqe(c0c.call_history_missed_calls_empty_state_title));
                return aba;
            case 3:
                buc buc4 = CallHistoryPageScreen.u0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(callHistoryPageScreen.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(pvb.call_history_list);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter((e81) callHistoryPageScreen.Z.getValue());
                callHistoryPageScreen.o = z7.m(endlessRecyclerView2);
                aba aba2 = (aba) callHistoryPageScreen.X.getValue();
                if (aba2 != null) {
                    endlessRecyclerView2.setEmptyView(aba2);
                }
                endlessRecyclerView2.setPager(new j81(callHistoryPageScreen, 0));
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setThreshold(10);
                endlessRecyclerView2.setClipToPadding(false);
                float f = (float) 0;
                float f2 = (float) 10;
                endlessRecyclerView2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                return endlessRecyclerView2;
            case 4:
                buc buc5 = CallHistoryPageScreen.u0;
                return new e81(new o9g(5, (Object) callHistoryPageScreen), jyc.a.p().c());
            default:
                buc buc6 = CallHistoryPageScreen.u0;
                return callHistoryPageScreen.getRouter();
        }
    }
}
