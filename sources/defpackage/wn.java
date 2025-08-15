package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: wn  reason: default package */
public final class wn implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        switch (this.a) {
            case 0:
                yn ynVar = (yn) this.b;
                ynVar.P0.setSelection(i);
                if (ynVar.P0.getOnItemClickListener() != null) {
                    ynVar.P0.performItemClick(view, i, ynVar.M0.getItemId(i));
                }
                ynVar.dismiss();
                return;
            case 1:
                View view2 = null;
                u08 u08 = (u08) this.b;
                if (i < 0) {
                    wl7 wl7 = u08.s0;
                    obj = !wl7.K0.isShowing() ? null : wl7.c.getSelectedItem();
                } else {
                    obj = u08.getAdapter().getItem(i);
                }
                u08.b(u08, obj);
                AdapterView.OnItemClickListener onItemClickListener = u08.getOnItemClickListener();
                wl7 wl72 = u08.s0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (wl72.K0.isShowing()) {
                            view2 = wl72.c.getSelectedView();
                        }
                        view = view2;
                        i = !wl72.K0.isShowing() ? -1 : wl72.c.getSelectedItemPosition();
                        j = !wl72.K0.isShowing() ? Long.MIN_VALUE : wl72.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(wl72.c, view, i, j);
                }
                wl72.dismiss();
                return;
            default:
                ((o0d) this.b).onItemClicked(i, 0, (String) null);
                return;
        }
    }
}
