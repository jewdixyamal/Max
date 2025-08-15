package ru.ok.messages.contacts.profile;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgContactAvatarsLoader extends FrgBaseNonUi {
    public long B1;
    public wm3 C1;
    public final ArrayList D1 = new ArrayList();
    public int E1;
    public int F1;
    public int G1;
    public long H1;
    public boolean I1;
    public u46 J1;

    @uae
    public void onEvent(vp3 vp3) {
        List list;
        if (this.H1 == vp3.a && (list = vp3.b) != null) {
            this.H1 = 0;
            if (list.isEmpty()) {
                this.E1 = Integer.MAX_VALUE;
                return;
            }
            hm9.m("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "onEvent = " + vp3, new Object[0]);
            this.E1 = list.size() + this.E1;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = this.D1;
            linkedHashSet.addAll(arrayList);
            linkedHashSet.addAll(list);
            arrayList.clear();
            arrayList.addAll(linkedHashSet);
            int i = vp3.c;
            this.F1 = i;
            u46 u46 = this.J1;
            if (u46 != null) {
                ((ActContactAvatars) u46).k0(i + this.G1, arrayList);
            }
        }
    }

    public final void r1() {
        int i = this.E1;
        if ((i == 0 || i < this.F1) && this.H1 == 0) {
            hm9.m("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "loadNext", new Object[0]);
            long j = this.B1;
            int i2 = this.E1;
            k4a k4a = (k4a) ((pk) ((y8a) vl.b()).getAccessor().c(pk.class));
            this.H1 = k4a.v(k4a, new qu(((p7b) k4a.y()).a.o(), j, i2));
        }
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID", -1);
        this.B1 = j;
        if (j == -1) {
            wm3 wm3 = ((an3) this.Z.getParcelable("ru.ok.tamtam.extra.CONTACT_INFO")).a;
            this.C1 = wm3;
            if (wm3 != null) {
                this.B1 = wm3.a;
            } else {
                throw new IllegalArgumentException("contact_id or contact's SearchResult must be defined");
            }
        }
        if (!this.I1) {
            this.I1 = true;
            wm3 wm32 = this.C1;
            ArrayList arrayList = this.D1;
            if (wm32 != null) {
                kl7 n = nu0.n(kk0.a, kk0.X, new jy2(18, this));
                if (!n.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(n, Long.valueOf(this.C1.Y)));
                }
            } else {
                uj3 i = this.q1.g().i(this.B1, true);
                kl7 m = nu0.m(new t46(i, 0), new t46(i, 1));
                if (!m.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(m, Long.valueOf(i.a.c.e)));
                }
            }
            int size = arrayList.size();
            this.G1 = size;
            u46 u46 = this.J1;
            if (u46 != null) {
                ((ActContactAvatars) u46).k0(size, arrayList);
            }
            r1();
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (this.H1 == oi0.a) {
            this.H1 = 0;
            r1();
        }
    }
}
