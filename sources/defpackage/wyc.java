package defpackage;

import android.view.View;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: wyc  reason: default package */
public final /* synthetic */ class wyc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchMessageBottomWidget b;

    public /* synthetic */ wyc(SearchMessageBottomWidget searchMessageBottomWidget, int i) {
        this.a = i;
        this.b = searchMessageBottomWidget;
    }

    public final void onClick(View view) {
        SearchMessageBottomWidget searchMessageBottomWidget = this.b;
        switch (this.a) {
            case 0:
                if (searchMessageBottomWidget.Z) {
                    il2 il2 = (il2) searchMessageBottomWidget.q0().o.a;
                    int i = il2.d;
                    if (i - 1 >= 0) {
                        int i2 = i - 1;
                        il2.d = i2;
                        fl2 fl2 = il2.g;
                        if (fl2 != null) {
                            fl2.d(i2, il2.k);
                        }
                        fl2 fl22 = il2.g;
                        if (fl22 != null) {
                            fl22.e((nx8) il2.f.get(il2.d - 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (searchMessageBottomWidget.Y) {
                    il2 il22 = (il2) searchMessageBottomWidget.q0().o.a;
                    int i3 = il22.d + 1;
                    ArrayList arrayList = il22.f;
                    if (i3 <= arrayList.size()) {
                        int i4 = il22.d + 1;
                        il22.d = i4;
                        fl2 fl23 = il22.g;
                        if (fl23 != null) {
                            fl23.d(i4, il22.k);
                        }
                        fl2 fl24 = il22.g;
                        if (fl24 != null) {
                            fl24.e((nx8) arrayList.get(il22.d - 1));
                        }
                        if (il22.d + 1 <= arrayList.size() && il22.g != null) {
                            nx8 nx8 = (nx8) arrayList.get(il22.d - 1);
                        }
                    }
                    String str = il22.c;
                    if (il22.h && arrayList.size() - il22.d < 5 && il22.j != 0 && str != null && str.length() != 0) {
                        hm9.m("il2", "Search for next messages", new Object[0]);
                        il22.h = false;
                        j47.T(il22.e, (lx3) null, (vx3) null, new gl2(il22, str, il22.j, (Continuation) null), 3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
