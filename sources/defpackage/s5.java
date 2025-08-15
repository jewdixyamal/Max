package defpackage;

import android.os.Handler;
import androidx.viewpager.widget.ViewPager;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.contacts.profile.FrgContactAvatarsLoader;

/* renamed from: s5  reason: default package */
public final /* synthetic */ class s5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActContactAvatars b;
    public final /* synthetic */ long c;

    public /* synthetic */ s5(ActContactAvatars actContactAvatars, long j, int i) {
        this.a = i;
        this.b = actContactAvatars;
        this.c = j;
    }

    public final void run() {
        long j = this.c;
        Class<pk> cls = pk.class;
        int i = 0;
        ActContactAvatars actContactAvatars = this.b;
        switch (this.a) {
            case 0:
                int i2 = ActContactAvatars.h1;
                ((el3) ((y8a) ((ed3) actContactAvatars.K0.b)).getAccessor().c(el3.class)).d(0, (String) null, (String) null);
                k4a k4a = (k4a) ((pk) ((y8a) ((ed3) actContactAvatars.K0.b)).getAccessor().c(cls));
                long d = ome.d(k4a.z(), new bgc(((p7b) k4a.y()).a.o(), j), false, 0, 12);
                if (actContactAvatars.Y0 == null) {
                    actContactAvatars.Y0 = new dx3();
                }
                actContactAvatars.Y0.add(Long.valueOf(d));
                return;
            case 1:
                int i3 = ActContactAvatars.h1;
                actContactAvatars.getClass();
                int i4 = jpc.r2;
                Handler handler = a14.i;
                a14.N(0, actContactAvatars, actContactAvatars.getString(i4));
                int currentItem = actContactAvatars.V0.getCurrentItem();
                FrgContactAvatarsLoader frgContactAvatarsLoader = actContactAvatars.X0;
                Iterator it = frgContactAvatarsLoader.D1.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (((Long) ((AbstractMap.SimpleEntry) it.next()).getValue()).equals(Long.valueOf(j))) {
                        it.remove();
                        int i6 = frgContactAvatarsLoader.G1 - 1;
                        if (i5 == i6) {
                            frgContactAvatarsLoader.G1 = i6;
                            if (i6 <= 0) {
                                i6 = 0;
                            }
                            frgContactAvatarsLoader.G1 = i6;
                        } else {
                            int i7 = frgContactAvatarsLoader.F1 - 1;
                            frgContactAvatarsLoader.F1 = i7;
                            if (i7 <= 0) {
                                i7 = 0;
                            }
                            frgContactAvatarsLoader.F1 = i7;
                        }
                    }
                    i5++;
                }
                if (actContactAvatars.X0.D1.isEmpty()) {
                    actContactAvatars.finish();
                    return;
                }
                int i8 = currentItem - 1;
                if (currentItem > 0 && actContactAvatars.c1 == currentItem) {
                    actContactAvatars.c1 = i8;
                    actContactAvatars.W0.k = i8;
                }
                FrgContactAvatarsLoader frgContactAvatarsLoader2 = actContactAvatars.X0;
                actContactAvatars.k0(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
                if (currentItem > 0) {
                    ViewPager viewPager = actContactAvatars.V0;
                    viewPager.J0 = false;
                    viewPager.v(i8, 0, false, false);
                    return;
                }
                return;
            default:
                int i9 = ActContactAvatars.h1;
                actContactAvatars.getClass();
                int i10 = jpc.j2;
                Handler handler2 = a14.i;
                a14.N(0, actContactAvatars, actContactAvatars.getString(i10));
                long j2 = this.c;
                if (j2 != 0) {
                    if (actContactAvatars.Z0 == null) {
                        actContactAvatars.Z0 = new ArrayList();
                    }
                    actContactAvatars.Z0.add(Long.valueOf(((k4a) ((pk) ((y8a) ((ed3) actContactAvatars.K0.b)).getAccessor().c(cls))).H(2, j2, (a20) null, (String) null, (String) null, (String) null, (String) null, (String) null)));
                }
                while (true) {
                    ArrayList arrayList = actContactAvatars.a1;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (((Long) ((AbstractMap.SimpleEntry) arrayList.get(i)).getValue()).equals(Long.valueOf(j2))) {
                        actContactAvatars.c1 = i;
                        actContactAvatars.W0.k = i;
                        FrgContactAvatarsLoader frgContactAvatarsLoader3 = actContactAvatars.X0;
                        actContactAvatars.k0(frgContactAvatarsLoader3.F1 + frgContactAvatarsLoader3.G1, frgContactAvatarsLoader3.D1);
                        return;
                    }
                    i++;
                }
        }
    }
}
