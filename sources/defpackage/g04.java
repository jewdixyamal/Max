package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: g04  reason: default package */
public final class g04 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g04(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onChanged() {
        switch (this.a) {
            case 0:
                h04 h04 = (h04) this.b;
                h04.a = true;
                h04.notifyDataSetChanged();
                return;
            case 1:
                wl7 wl7 = (wl7) this.b;
                if (wl7.K0.isShowing()) {
                    wl7.f();
                    return;
                }
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }

    public final void onInvalidated() {
        switch (this.a) {
            case 0:
                h04 h04 = (h04) this.b;
                h04.a = false;
                h04.notifyDataSetInvalidated();
                return;
            case 1:
                ((wl7) this.b).dismiss();
                return;
            case 2:
                ((TabLayout) this.b).j();
                return;
            default:
                ((ViewPager) this.b).f();
                return;
        }
    }
}
