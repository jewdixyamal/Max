package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: cx5  reason: default package */
public final class cx5 implements cje {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cx5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(eje eje) {
        y5a tabItem;
        Object obj;
        String str = null;
        switch (this.a) {
            case 0:
                View view = eje.e;
                vja vja = view instanceof vja ? (vja) view : null;
                if (!(vja == null || (tabItem = vja.getTabItem()) == null)) {
                    str = tabItem.a;
                }
                ((x30) this.b).u0 = str;
                return;
            case 1:
                int i = 0;
                if (eje.d > 0) {
                    bc7[] bc7Arr = NeuroAvatarsScreen.M0;
                    ((NeuroAvatarsScreen) this.b).m0().setExpanded(false);
                }
                bc7[] bc7Arr2 = NeuroAvatarsScreen.M0;
                wp9 r0 = ((NeuroAvatarsScreen) this.b).r0();
                int i2 = eje.d;
                if (i2 != r0.Y) {
                    Set keySet = ((Map) r0.y0.getValue()).keySet();
                    boolean z = keySet instanceof List;
                    if (z) {
                        obj = ((List) keySet).get(i2);
                    } else {
                        e63 e63 = new e63(i2);
                        if (z) {
                            List list = (List) keySet;
                            if (i2 < 0 || i2 >= list.size()) {
                                e63.invoke(Integer.valueOf(i2));
                                throw null;
                            }
                            obj = list.get(i2);
                        } else if (i2 >= 0) {
                            int i3 = 0;
                            for (Object next : keySet) {
                                int i4 = i3 + 1;
                                if (i2 == i3) {
                                    obj = next;
                                } else {
                                    i3 = i4;
                                }
                            }
                            e63.invoke(Integer.valueOf(i2));
                            throw null;
                        } else {
                            e63.invoke(Integer.valueOf(i2));
                            throw null;
                        }
                    }
                    int intValue = ((Number) obj).intValue();
                    Iterator it = ((List) r0.X.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                        } else if (((qo9) it.next()).c != intValue) {
                            i++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    r0.Y = i2;
                    r0.v0.g(new ro9(i2, valueOf));
                    return;
                }
                return;
            case 2:
                ((ViewPager) this.b).setCurrentItem(eje.d);
                return;
            default:
                ((ViewPager2) this.b).e(eje.d, true);
                return;
        }
    }
}
