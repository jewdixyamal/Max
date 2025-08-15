package ru.ok.messages.media.chat;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgChatMediaLoader extends FrgBaseNonUi {
    public zf2 B1;

    public static ArrayList r1(List list, HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            es8 es8 = (es8) it.next();
            int i = 0;
            while (true) {
                if (i >= es8.a.z0.i()) {
                    break;
                } else if (hashSet.contains(es8.a.z0.h(i).a)) {
                    arrayList.add(es8);
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        HashSet hashSet = new HashSet(this.Z.getIntegerArrayList("ru.ok.tamtam.extra.TYPES"));
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.DESC_ORDER");
        long j2 = this.Z.getLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", -1);
        xf2 xf2 = (xf2) this.q1.getAccessor().c(xf2.class);
        Long valueOf = Long.valueOf(j2);
        xf2.getClass();
        ztc ztc = xf2.b;
        ztc ztc2 = xf2.c;
        av0 av0 = xf2.d;
        p82 p82 = xf2.e;
        au8 au8 = xf2.f;
        ge2 ge2 = xf2.g;
        t6b t6b = xf2.h;
        zu8 zu8 = xf2.i;
        ztc ztc3 = xf2.a;
        ztc ztc4 = ztc2;
        HashSet hashSet2 = hashSet;
        zf2 zf2 = r3;
        zf2 zf22 = new zf2(j, valueOf, z, hashSet, av0, p82, au8, ge2, t6b, zu8, ztc3, ztc, ztc4);
        this.B1 = zf2;
        zf2.p.d(zf2);
        if (hashSet2.equals(ql8.d)) {
            zf2 zf23 = this.B1;
            if (!zf23.k) {
                hm9.m("zf2", "load: start", new Object[0]);
                zf23.d.clear();
                zf23.b(false);
            }
        }
    }

    public final void y0() {
        zf2 zf2 = this.B1;
        zf2.p.f(zf2);
        super.y0();
    }
}
