package defpackage;

import android.os.SystemClock;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nof  reason: default package */
public final class nof implements u4, qj3, ifg {
    public final Object a;

    public /* synthetic */ nof(Object obj) {
        this.a = obj;
    }

    public void accept(Object obj) {
        c4c c4c = (c4c) obj;
        vk8 vk8 = (vk8) this.a;
        ((wte) ((vte) vk8.j)).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (Map.Entry entry : ((HashMap) vk8.d).entrySet()) {
            m1e m1e = (m1e) entry.getKey();
            bbg bbg = (bbg) entry.getValue();
            if ((bbg.b.toMillis(bbg.a) + bbg.c) - 10 < elapsedRealtime) {
                bbg.c = elapsedRealtime;
                m1e.a(c4c);
            }
        }
    }

    public boolean b(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) ((m5d) this.a).X;
        if (viewPager2.F0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    public Object r() {
        fig fig = (fig) ((ifg) this.a).r();
        if (fig != null) {
            return fig;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public nof(pkg pkg, hm7 hm7) {
        this.a = pkg;
    }
}
