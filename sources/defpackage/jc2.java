package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jc2  reason: default package */
public final class jc2 {
    public final p82 a;
    public final au8 b;
    public final m7b c;
    public final s8g d;
    public final cea e;
    public final av0 f;
    public final eoe g;
    public final ztc h;

    public jc2(p82 p82, au8 au8, m7b m7b, s8g s8g, cea cea, av0 av0, eoe eoe, ztc ztc) {
        this.a = p82;
        this.b = au8;
        this.c = m7b;
        this.d = s8g;
        this.e = cea;
        this.f = av0;
        this.g = eoe;
        this.h = ztc;
    }

    public final void a(long j, long j2, long j3, int i, long j4, int i2, long j5, dc2 dc2, mg4 mg4) {
        List list;
        p82 p82;
        List list2;
        List list3;
        List list4;
        List list5;
        long j6 = j2;
        dc2 dc22 = dc2;
        mg4 mg42 = mg4;
        hm9.m("jc2", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s", Long.valueOf(j2), nu0.G(Long.valueOf(j3)), Integer.valueOf(i), Long.valueOf(j4), Integer.valueOf(i2), Long.valueOf(j5), Integer.valueOf(dc22.c.size()), mg4.name());
        p82 p822 = this.a;
        e52 C = p822.C(j6);
        if (C != null) {
            k92 k92 = C.b;
            hm9.m("jc2", "onChatHistory, chat create time = %s", nu0.G(Long.valueOf(k92.f)));
            int ordinal = mg4.ordinal();
            m7b m7b = this.c;
            List<fs8> list6 = dc22.c;
            long j7 = C.a;
            if (ordinal == 0) {
                if (list6.isEmpty()) {
                    list3 = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (fs8 fs8 : list6) {
                        List list7 = list6;
                        p82 p823 = p822;
                        if (fs8.b >= k92.f) {
                            arrayList.add(fs8);
                        }
                        list6 = list7;
                        p822 = p823;
                    }
                    list3 = arrayList;
                }
                list = list6;
                p82 = p822;
                if (list3.isEmpty()) {
                    list4 = Collections.emptyList();
                } else {
                    list4 = nd7.p(list3, new z72(3, this.g.h(0, iua.TYPE_MSG_EDIT)));
                }
                if (list4.size() > 0) {
                    if (!list4.isEmpty()) {
                        this.b.g(j7, ((p7b) m7b).a.t(), list4);
                    }
                    s9d s9d = new s9d(j7);
                    s8g s8g = this.d;
                    s8g.a(s9d);
                    s8g.a(new s9d(j7, mg42));
                    p7b p7b = (p7b) m7b;
                    boolean O = C.O(p7b.a, p7b.c);
                    long j8 = k92.a;
                    if (!O) {
                        this.e.f(j8);
                    } else {
                        hm9.m("jc2", "onChatHistory: %d is globally muted", Long.valueOf(j8));
                    }
                }
                list2 = list4;
            } else if (ordinal == 1) {
                saf saf = new saf(buc.s0, mg4.DELAYED);
                ic2 ic2 = new ic2(this, j6, 0);
                if (list6.isEmpty()) {
                    list5 = list6;
                } else {
                    list5 = saf.a(list6, new rpc(13, saf), new w8c(21), (m56) null, ic2, (m56) null);
                }
                if (!list5.isEmpty()) {
                    this.b.g(j7, ((p7b) m7b).a.t(), list5);
                }
                list2 = list5;
                list = list6;
                p82 = p822;
            } else {
                throw new IllegalStateException("Unexpected value: " + mg42);
            }
            List list8 = list;
            long j9 = C.a;
            List list9 = list2;
            q72 q72 = r1;
            e52 e52 = C;
            q72 q722 = new q72(p82, list2, j3, i2, j5, i, j4, mg4, j9);
            p82.h(j9, false, q72);
            int size = list9.size();
            av0 av0 = this.f;
            if (size > 0) {
                List<fs8> list10 = list9;
                long j10 = ((fs8) list10.get(0)).b;
                long j11 = ((fs8) list10.get(list10.size() - 1)).b;
                int size2 = list10.size();
                ArrayList arrayList2 = new ArrayList(z53.S(list10, 10));
                for (fs8 fs82 : list10) {
                    arrayList2.add(Long.valueOf(fs82.a));
                }
                av0.c(new ec2(j, e52.a, j10, j11, size2, mg4, arrayList2));
                return;
            }
            int size3 = list8.size();
            nz4 nz4 = nz4.a;
            av0.c(new ec2(j, e52.a, j3, j3, size3, mg4, nz4));
        }
    }
}
