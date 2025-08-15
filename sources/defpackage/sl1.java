package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: sl1  reason: default package */
public final class sl1 {
    public final a4c a;
    public final kg1 b;
    public final va8 c;
    public final kd1 d;
    public final id1 e;
    public final h7b f;
    public final imc g;
    public final vte h;

    public sl1(a4c a4c, kg1 kg1, va8 va8, kd1 kd1, id1 id1, h7b h7b, imc imc, vte vte) {
        this.a = a4c;
        this.b = kg1;
        this.c = va8;
        this.d = kd1;
        this.e = id1;
        this.f = h7b;
        this.g = imc;
        this.h = vte;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: wmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: wmc} */
    /* JADX WARNING: type inference failed for: r5v1, types: [rpa] */
    /* JADX WARNING: type inference failed for: r6v1, types: [rpa] */
    /* JADX WARNING: type inference failed for: r7v2, types: [rpa] */
    /* JADX WARNING: type inference failed for: r8v2, types: [rpa] */
    /* JADX WARNING: type inference failed for: r9v1, types: [rpa] */
    /* JADX WARNING: type inference failed for: r11v3, types: [rpa] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.hpd r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            yad r3 = new yad
            int r2 = r1.a
            r3.<init>(r2)
            pq9 r2 = new pq9
            r2.<init>()
            pq9 r4 = new pq9
            r4.<init>()
            pq9 r5 = new pq9
            r5.<init>()
            pq9 r6 = new pq9
            r6.<init>()
            pq9 r7 = new pq9
            r7.<init>()
            pq9 r8 = new pq9
            r8.<init>()
            wmc r9 = new wmc
            java.lang.String r10 = r1.b
            r11 = 0
            r9.<init>(r10, r11)
            java.lang.Boolean r10 = r1.c
            if (r10 == 0) goto L_0x003b
            wmc r2 = new wmc
            r11 = 0
            r2.<init>(r10, r11)
        L_0x003b:
            r10 = r2
            java.util.List r2 = r1.d
            if (r2 == 0) goto L_0x0046
            wmc r4 = new wmc
            r11 = 0
            r4.<init>(r2, r11)
        L_0x0046:
            r11 = r4
            java.util.List r2 = r1.e
            if (r2 == 0) goto L_0x0053
            wmc r4 = new wmc
            r5 = 0
            r4.<init>(r2, r5)
            r12 = r4
            goto L_0x0054
        L_0x0053:
            r12 = r5
        L_0x0054:
            java.util.List r2 = r1.f
            if (r2 == 0) goto L_0x0060
            wmc r4 = new wmc
            r5 = 0
            r4.<init>(r2, r5)
            r13 = r4
            goto L_0x0061
        L_0x0060:
            r13 = r6
        L_0x0061:
            java.lang.Integer r2 = r1.h
            if (r2 == 0) goto L_0x0075
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            wmc r4 = new wmc
            r5 = 0
            r4.<init>(r2, r5)
            r14 = r4
            goto L_0x0076
        L_0x0075:
            r14 = r7
        L_0x0076:
            r2 = 0
            java.lang.Long r4 = r1.g
            if (r4 == 0) goto L_0x0097
            long r4 = r4.longValue()
            vte r6 = r0.h
            wte r6 = (defpackage.wte) r6
            java.lang.Long r6 = r6.a()
            if (r6 == 0) goto L_0x0097
            long r6 = r6.longValue()
            long r4 = r4 - r6
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
        L_0x0097:
            if (r2 == 0) goto L_0x00a9
            long r4 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            wmc r4 = new wmc
            r5 = 0
            r4.<init>(r2, r5)
            r15 = r4
            goto L_0x00aa
        L_0x00a9:
            r15 = r8
        L_0x00aa:
            wmc r8 = new wmc
            bg1 r2 = r1.m
            r4 = 0
            r8.<init>(r2, r4)
            x30 r7 = new x30
            r16 = 0
            r2 = r7
            r4 = r9
            r5 = r10
            r6 = r11
            r11 = r7
            r7 = r12
            r10 = r8
            r8 = r13
            r9 = r14
            r13 = r11
            r11 = r15
            r12 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            va8 r2 = r0.c
            kl1 r2 = r2.m(r13)
            if (r2 != 0) goto L_0x00cf
            return
        L_0x00cf:
            kg1 r3 = r0.b
            yad r4 = r2.a
            java.util.List r5 = r2.d
            if (r5 == 0) goto L_0x00e6
            fg1 r6 = r3.a
            bg1 r6 = r6.a
            boolean r5 = defpackage.x53.c0(r5, r6)
            r6 = 1
            if (r5 != r6) goto L_0x00e6
            r3.p(r4)
            goto L_0x00f3
        L_0x00e6:
            zad r5 = r3.j
            boolean r5 = defpackage.tpa.f(r4, r5)
            if (r5 == 0) goto L_0x00f3
            xad r5 = defpackage.xad.a
            r3.p(r5)
        L_0x00f3:
            id1 r0 = r0.e
            fpd r1 = r1.l
            if (r1 == 0) goto L_0x012b
            fg1 r5 = r3.a
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x010a
            zad r5 = r3.k
            boolean r5 = defpackage.tpa.f(r5, r4)
            if (r5 != 0) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            eqa r1 = r1.a
            java.util.List r5 = r1.a
            r3.g(r4, r5)
            java.util.List r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L_0x0117:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x012b
            java.lang.Object r3 = r1.next()
            dg1 r3 = (defpackage.dg1) r3
            hqa r5 = r0.n
            bg1 r6 = r3.b
            r5.onStateChanged(r6, r3)
            goto L_0x0117
        L_0x012b:
            ebd r0 = r0.f
            ql1 r1 = new ql1
            tad r2 = defpackage.mqd.I(r2)
            r1.<init>(r4, r2)
            r0.onRoomUpdated(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl1.a(hpd):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [rpa, java.lang.Object] */
    public final void b(boolean z, bg1 bg1, yad yad) {
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        ? obj5 = new Object();
        ? obj6 = new Object();
        ? obj7 = new Object();
        if (z) {
            bg1 = null;
        }
        this.c.m(new x30(yad, obj, obj2, obj3, obj4, obj5, obj6, new wmc(bg1, false), obj7, true));
    }

    public final void c(boolean z) {
        if (z) {
            om8 om8 = new om8(27, this);
            om8 om82 = new om8(28, this);
            imc imc = this.g;
            rod rod = (rod) ((k56) imc.c).invoke();
            if (rod == null) {
                om82.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-rooms");
            rod.j(jSONObject, new hy0(imc, om82, om8, 1), new nt(imc, om82, 6));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v0, types: [rpa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v0, types: [rpa, java.lang.Object] */
    public final void d(cbd cbd) {
        cbd cbd2 = cbd;
        dbd dbd = dbd.a;
        Set set = cbd2.a;
        boolean contains = set.contains(dbd);
        hpd hpd = cbd2.c;
        if (contains && hpd != null) {
            a(hpd);
        }
        boolean contains2 = set.contains(dbd.c);
        va8 va8 = this.c;
        int i = cbd2.b;
        if (contains2) {
            yad yad = new yad(i);
            ? obj = new Object();
            ? obj2 = new Object();
            ? obj3 = new Object();
            ? obj4 = new Object();
            ? obj5 = new Object();
            ? obj6 = new Object();
            wmc wmc = new wmc(Boolean.valueOf(!cbd2.d), false);
            Long l = null;
            Long l2 = hpd != null ? hpd.g : null;
            if (l2 != null) {
                long longValue = l2.longValue();
                Long a2 = ((wte) this.h).a();
                if (a2 != null) {
                    l = Long.valueOf(System.currentTimeMillis() + (longValue - a2.longValue()));
                }
            }
            va8.m(new x30(yad, obj, wmc, obj2, obj3, obj4, obj5, obj6, new wmc(l, false), false));
        }
        set.contains(dbd.o);
        if (set.contains(dbd.b)) {
            yad yad2 = new yad(i);
            kg1 kg1 = this.b;
            if (tpa.f(kg1.j, yad2)) {
                kg1.p(xad.a);
            }
            ((HashMap) va8.c).remove(yad2);
            ((id1) va8.b).f.onRoomRemoved(new pl1(yad2));
        }
    }

    public final void e(ipd ipd) {
        id1 id1;
        List<hpd> list = ipd.b;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (hpd hpd : list) {
            arrayList.add(new yad(hpd.a));
        }
        Set H0 = x53.H0(arrayList);
        va8 va8 = this.c;
        for (yad yad : x53.H0(((HashMap) va8.c).keySet())) {
            if (!H0.contains(yad)) {
                ((HashMap) va8.c).remove(yad);
                ((id1) va8.b).f.onRoomRemoved(new pl1(yad));
            }
        }
        for (hpd a2 : list) {
            a(a2);
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            id1 = this.e;
            if (!hasNext) {
                break;
            }
            hpd hpd2 = (hpd) it.next();
            id1.g.a(new qz7((Object) hpd2.i, 8, (Object) new yad(hpd2.a)));
        }
        for (hpd hpd3 : list) {
            id1.q.onUrlSharingInfoUpdated(new zn1(new yad(hpd3.a), hpd3.n));
        }
        for (hpd hpd4 : list) {
            id1.h.a(new ph4((Object) hpd4.j, (Object) new yad(hpd4.a)));
        }
        for (hpd hpd5 : list) {
            this.d.l(hpd5.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", 2, new yad(hpd5.a), true);
        }
        zad zad = ipd.a;
        if (!(zad instanceof xad)) {
            kg1 kg1 = this.b;
            if (!tpa.f(kg1.k, zad)) {
                kg1.n(zad);
                id1.f.onCurrentParticipantActiveRoomChanged(new nl1(zad, zad instanceof yad ? va8.x((yad) zad) : null));
            }
            this.f.w(new w4d(15, (Object) zad), new ey3(this, 1, zad), new om8(26, this));
        }
    }
}
