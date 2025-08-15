package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.chat.FrgChatMediaLoader;

/* renamed from: zf2  reason: default package */
public final class zf2 {
    public final long a;
    public final long b;
    public final boolean c;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Set f;
    public final Set g;
    public final ztc h;
    public final ztc i;
    public final ztc j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public final Set o = Collections.newSetFromMap(new WeakHashMap());
    public final av0 p;
    public final p82 q;
    public final au8 r;
    public final ge2 s;
    public final t6b t;
    public final zu8 u;

    public zf2(long j2, Long l2, boolean z, HashSet hashSet, av0 av0, p82 p82, au8 au8, ge2 ge2, t6b t6b, zu8 zu8, ztc ztc, ztc ztc2, ztc ztc3) {
        this.p = av0;
        this.q = p82;
        this.r = au8;
        this.s = ge2;
        this.t = t6b;
        this.u = zu8;
        this.a = j2;
        this.c = z;
        this.b = l2.longValue();
        this.f = hashSet;
        this.g = d(hashSet);
        this.h = ztc;
        this.i = ztc2;
        this.j = ztc3;
        hm9.m("zf2", "newInstance: chatId = " + j2 + ", initialMessageId = " + l2, new Object[0]);
    }

    public static Set d(Set set) {
        return ql8.a.equals(set) ? b10.D0 : ql8.b.equals(set) ? b10.G0 : ql8.c.equals(set) ? b10.H0 : ql8.d.equals(set) ? b10.E0 : ql8.g.equals(set) ? b10.I0 : ql8.f.equals(set) ? b10.F0 : ql8.h.equals(set) ? b10.J0 : Collections.emptySet();
    }

    public final ArrayList a(List list, boolean z) {
        HashSet hashSet;
        hm9.m("zf2", "addMessages count = " + list.size(), new Object[0]);
        if (!this.c) {
            Collections.reverse(list);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.e;
            if (!hasNext) {
                break;
            }
            es8 es8 = (es8) it.next();
            if (!es8.a.s() && !hashSet.contains(Long.valueOf(es8.a.b))) {
                arrayList.add(es8);
            }
        }
        hm9.m("zf2", "addMessages count after checkExists = " + arrayList.size(), new Object[0]);
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = this.d;
            if (z) {
                arrayList2.addAll(arrayList);
            } else {
                arrayList2.addAll(0, arrayList);
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((es8) it2.next()).a.b));
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            hashSet.addAll(arrayList3);
        }
        return arrayList;
    }

    public final void b(boolean z) {
        new q1a(1, new vf2(this, z)).m(this.j).i(this.h).k(new iq1(new vf2(this, z), 2, ft.f));
    }

    public final void c() {
        Set<yf2> set = this.o;
        if (set != null) {
            for (yf2 yf2 : set) {
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final wf2 e(boolean z) {
        d92 d92;
        xlc xlc;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l2;
        int i9;
        Boolean bool;
        long j2 = this.a;
        p82 p82 = this.q;
        e52 C = p82.C(j2);
        if (C == null) {
            return new wf2(Collections.emptyList(), false, false, 0, 100, 0);
        }
        k92 k92 = C.b;
        Set set = this.g;
        x82 I = p82.I(k92, set);
        boolean L = p82.L(k92, set);
        ge2 ge2 = this.s;
        if (L && I.a != null) {
            ge2.getClass();
            d92 d922 = I.a;
            long j3 = d922.a;
            t19 d2 = ((k24) ge2.c.a).c.d();
            d2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND media_type in (");
            Set<Integer> set2 = this.f;
            int size = set2.size();
            a14.c(sb, size);
            sb.append(") AND inserted_from_msg_link = 0 AND status <> ");
            sb.append("?");
            int i10 = size + 4;
            xlc a2 = xlc.a(i10, sb.toString());
            a2.j(1, j2);
            a2.j(2, j3);
            a2.j(3, d922.b);
            int i11 = 4;
            for (Integer num : set2) {
                if (num == null) {
                    a2.W(i11);
                } else {
                    a2.j(i11, (long) num.intValue());
                }
                i11++;
            }
            d2.a().getClass();
            a2.j(i10, (long) 10);
            ilc ilc = d2.a;
            ilc.b();
            Cursor o2 = ilc.o(a2, (CancellationSignal) null);
            try {
                long j4 = o2.moveToFirst() ? o2.getLong(0) : 0;
                o2.close();
                a2.n();
                if (j4 == 0) {
                    hm9.m("ge2", "clearMediaChunkIfEmpty: empty chunk removed", new Object[0]);
                    p82 p822 = ge2.b;
                    p822.getClass();
                    p822.h(j2, false, new u00((Object) p822, (Object) set, (Object) null, 3));
                    e52 C2 = p82.C(j2);
                    if (C2 == null) {
                        return null;
                    }
                    I = p82.I(C2.b, set);
                    C = C2;
                }
            } catch (Throwable th) {
                o2.close();
                a2.n();
                throw th;
            }
        }
        if (!p82.L(C.b, set) || (d92 = I.a) == null) {
            hm9.m("zf2", "obsLoadNetwork: requestMediaBackward from last", new Object[0]);
            this.n = ge2.a(C, (cu8) null, false, set);
            return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        au8 au8 = this.r;
        if (z) {
            long j5 = I.c;
            if (j5 > 0) {
                cu8 q2 = au8.q(j5);
                if (q2 != null && hm9.K(q2.o, d92)) {
                    return new wf2(Collections.emptyList(), false, false, 0, 100, 0);
                }
                cu8 r2 = au8.r(j2, d92.a);
                hm9.m("zf2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hm9.W(d92), r2);
                this.n = ge2.a(C, r2, false, set);
                return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
            }
            cu8 r3 = au8.r(j2, d92.a);
            hm9.m("zf2", "obsLoadNetwork: requestMediaBackward from after chunk start %s, message=%s", hm9.W(d92), r3);
            this.n = ge2.a(C, r3, false, set);
            return new wf2(Collections.emptyList(), false, true, 0, 100, 0);
        }
        cu8 o3 = au8.o(j2);
        if (o3 != null && hm9.K(o3.o, d92)) {
            return new wf2(Collections.emptyList(), true, false, 100, 0, 0);
        }
        long j6 = d92.b;
        vlc vlc = ((k24) au8.a).c;
        t19 d3 = vlc.d();
        d3.getClass();
        xlc a3 = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? ORDER BY time DESC LIMIT ?");
        a3.j(1, j2);
        ey8.m(a3, 2, j6, d3);
        a3.j(3, (long) 10);
        a3.j(4, (long) 1);
        ilc ilc2 = d3.a;
        ilc2.b();
        Cursor o4 = ilc2.o(a3, (CancellationSignal) null);
        try {
            int n2 = tfg.n(o4, "id");
            int n3 = tfg.n(o4, "server_id");
            int n4 = tfg.n(o4, "time");
            int n5 = tfg.n(o4, "update_time");
            int n6 = tfg.n(o4, "sender");
            int n7 = tfg.n(o4, "cid");
            int n8 = tfg.n(o4, "text");
            e52 e52 = C;
            int n9 = tfg.n(o4, "delivery_status");
            Set set3 = set;
            int n10 = tfg.n(o4, "status");
            ge2 ge22 = ge2;
            int n11 = tfg.n(o4, "time_local");
            String str4 = "zf2";
            int n12 = tfg.n(o4, "error");
            d92 d923 = d92;
            int n13 = tfg.n(o4, "localized_error");
            vlc vlc2 = vlc;
            int n14 = tfg.n(o4, "attaches");
            xlc = a3;
            try {
                int n15 = tfg.n(o4, "media_type");
                int n16 = tfg.n(o4, "detect_share");
                int n17 = tfg.n(o4, "msg_link_type");
                int n18 = tfg.n(o4, "msg_link_id");
                int n19 = tfg.n(o4, "inserted_from_msg_link");
                int n20 = tfg.n(o4, "msg_link_chat_id");
                int n21 = tfg.n(o4, "msg_link_chat_name");
                int n22 = tfg.n(o4, "msg_link_chat_link");
                int n23 = tfg.n(o4, "msg_link_out_chat_id");
                int n24 = tfg.n(o4, "msg_link_out_msg_id");
                int n25 = tfg.n(o4, "type");
                int n26 = tfg.n(o4, "chat_id");
                int n27 = tfg.n(o4, "ttl");
                int n28 = tfg.n(o4, "channel_views");
                int n29 = tfg.n(o4, "channel_forwards");
                int n30 = tfg.n(o4, "view_time");
                int n31 = tfg.n(o4, "zoom");
                int n32 = tfg.n(o4, "options");
                int n33 = tfg.n(o4, "live_until");
                int n34 = tfg.n(o4, "elements");
                int n35 = tfg.n(o4, "reactions");
                int n36 = tfg.n(o4, "delayed_attrs_time_to_fire");
                int n37 = tfg.n(o4, "delayed_attrs_notify_sender");
                int i12 = n14;
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    long j7 = o4.getLong(n2);
                    long j8 = o4.getLong(n3);
                    long j9 = o4.getLong(n4);
                    long j10 = o4.getLong(n5);
                    long j11 = o4.getLong(n6);
                    long j12 = o4.getLong(n7);
                    String string = o4.isNull(n8) ? null : o4.getString(n8);
                    int i13 = o4.getInt(n9);
                    d3.a().getClass();
                    iu8.b.getClass();
                    iu8 n38 = oz7.n(i13);
                    int i14 = o4.getInt(n10);
                    d3.a().getClass();
                    vx8 b2 = v89.b(i14);
                    long j13 = o4.getLong(n11);
                    String string2 = o4.isNull(n12) ? null : o4.getString(n12);
                    if (o4.isNull(n13)) {
                        i2 = i12;
                        str = null;
                    } else {
                        str = o4.getString(n13);
                        i2 = i12;
                    }
                    byte[] blob = o4.isNull(i2) ? null : o4.getBlob(i2);
                    d3.a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i15 = n8;
                    int i16 = n15;
                    int i17 = o4.getInt(i16);
                    n15 = i16;
                    int i18 = n16;
                    if (o4.getInt(i18) != 0) {
                        n16 = i18;
                        i3 = n17;
                        z2 = true;
                    } else {
                        n16 = i18;
                        i3 = n17;
                        z2 = false;
                    }
                    int i19 = o4.getInt(i3);
                    n17 = i3;
                    int i20 = n18;
                    long j14 = o4.getLong(i20);
                    n18 = i20;
                    int i21 = n19;
                    if (o4.getInt(i21) != 0) {
                        n19 = i21;
                        i4 = n20;
                        z3 = true;
                    } else {
                        n19 = i21;
                        i4 = n20;
                        z3 = false;
                    }
                    long j15 = o4.getLong(i4);
                    n20 = i4;
                    int i22 = n21;
                    if (o4.isNull(i22)) {
                        n21 = i22;
                        i5 = n22;
                        str2 = null;
                    } else {
                        str2 = o4.getString(i22);
                        n21 = i22;
                        i5 = n22;
                    }
                    if (o4.isNull(i5)) {
                        n22 = i5;
                        i6 = n23;
                        str3 = null;
                    } else {
                        str3 = o4.getString(i5);
                        n22 = i5;
                        i6 = n23;
                    }
                    long j16 = o4.getLong(i6);
                    n23 = i6;
                    int i23 = n24;
                    long j17 = o4.getLong(i23);
                    n24 = i23;
                    int i24 = n25;
                    int i25 = o4.getInt(i24);
                    d3.a().getClass();
                    int a4 = ey8.a(i25);
                    n25 = i24;
                    int i26 = n26;
                    long j18 = o4.getLong(i26);
                    n26 = i26;
                    int i27 = n27;
                    int i28 = o4.getInt(i27);
                    n27 = i27;
                    int i29 = n28;
                    int i30 = o4.getInt(i29);
                    n28 = i29;
                    int i31 = n29;
                    int i32 = o4.getInt(i31);
                    n29 = i31;
                    int i33 = n30;
                    long j19 = o4.getLong(i33);
                    n30 = i33;
                    int i34 = n31;
                    int i35 = o4.getInt(i34);
                    n31 = i34;
                    int i36 = n32;
                    int i37 = o4.getInt(i36);
                    n32 = i36;
                    int i38 = n33;
                    long j20 = o4.getLong(i38);
                    n33 = i38;
                    int i39 = n34;
                    byte[] blob2 = o4.isNull(i39) ? null : o4.getBlob(i39);
                    d3.a().getClass();
                    List a5 = v89.a(blob2);
                    n34 = i39;
                    int i40 = n35;
                    if (o4.isNull(i40)) {
                        i7 = i40;
                        i8 = n13;
                        bArr = null;
                    } else {
                        i7 = i40;
                        bArr = o4.getBlob(i40);
                        i8 = n13;
                    }
                    ix8 c2 = d3.a().c(bArr);
                    int i41 = n36;
                    if (o4.isNull(i41)) {
                        i9 = n37;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o4.getLong(i41));
                        i9 = n37;
                    }
                    Integer valueOf = o4.isNull(i9) ? null : Integer.valueOf(o4.getInt(i9));
                    if (valueOf == null) {
                        n36 = i41;
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf.intValue() != 0);
                        n36 = i41;
                    }
                    arrayList.add(new ru8(j7, j8, j9, j10, j11, j12, string, n38, b2, j13, string2, str, b3, i17, z2, i19, j14, z3, j15, str2, str3, j16, j17, a4, j18, i28, i30, i32, j19, i35, i37, j20, a5, c2, l2, bool));
                    n37 = i9;
                    n13 = i8;
                    n8 = i15;
                    n35 = i7;
                    i12 = i2;
                }
                o4.close();
                xlc.n();
                ru8 ru8 = (ru8) x53.i0(arrayList);
                cu8 b4 = ru8 != null ? vlc2.b(ru8) : null;
                hm9.m(str4, "obsLoadNetwork: requestMediaForward from before chunk end %s, message=%s", hm9.W(d923), b4);
                this.m = ge22.a(e52, b4, true, set3);
                return new wf2(Collections.emptyList(), true, true, 100, 0, 0);
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xlc = a3;
            o4.close();
            xlc.n();
            throw th;
        }
    }

    public final void f(wf2 wf2) {
        hm9.m("zf2", "onLoadNetwork, result = %s", wf2);
        boolean isEmpty = wf2.a.isEmpty();
        boolean z = wf2.b;
        if (!isEmpty) {
            boolean z2 = this.c;
            boolean z3 = (z && !z2) || (!z && z2);
            ArrayList a2 = a(wf2.a, z3);
            Set<yf2> set = this.o;
            if (set != null) {
                if (z3) {
                    for (yf2 yf2 : set) {
                        if (yf2 != null) {
                            ActAttachesView actAttachesView = (ActAttachesView) yf2;
                            hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "onLoadNextPage, count = " + a2.size(), new Object[0]);
                            if (actAttachesView.f1.getVisibility() == 0 && actAttachesView.W0 != null) {
                                actAttachesView.W0.j(FrgChatMediaLoader.r1(a2, ActAttachesView.z1), true);
                                actAttachesView.W0.d();
                                actAttachesView.r0();
                            }
                        }
                    }
                } else {
                    for (yf2 yf22 : set) {
                        if (yf22 != null) {
                            ActAttachesView actAttachesView2 = (ActAttachesView) yf22;
                            hm9.m("ru.ok.messages.media.attaches.ActAttachesView", "onLoadPrevPage, count = " + a2.size(), new Object[0]);
                            if (actAttachesView2.f1.getVisibility() == 0 && actAttachesView2.W0 != null) {
                                actAttachesView2.W0.j(FrgChatMediaLoader.r1(a2, ActAttachesView.z1), false);
                                actAttachesView2.W0.d();
                                actAttachesView2.r0();
                            }
                        }
                    }
                }
            }
        }
        this.l = wf2.c;
        c();
        if (!this.l) {
            int i2 = wf2.d;
            if (z) {
                if (i2 >= wf2.e) {
                    f(e(false));
                    return;
                }
                c();
                f(e(true));
            } else if (i2 >= wf2.f) {
                c();
                f(e(true));
            } else {
                c();
            }
        }
    }

    @uae
    public void onEvent(l6f l6f) {
        if (l6f.b == this.a) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                long j2 = ((es8) it.next()).a.b;
                long j3 = l6f.c;
                if (j2 == j3) {
                    hm9.m("zf2", "onEvent: UpdateMessageEvent id = " + j3, new Object[0]);
                    new q1a(1, new lt1((Object) this, j3, 2)).m(this.i).i(this.h).k(new iq1(new v02(8, this), 2, ft.f));
                    return;
                }
            }
        }
    }

    @uae
    public void onEvent(gf2 gf2) {
        gf2 gf22 = gf2;
        int i2 = (gf22.a > this.m ? 1 : (gf22.a == this.m ? 0 : -1));
        oz7 oz7 = ft.f;
        ztc ztc = this.h;
        ztc ztc2 = this.i;
        long j2 = gf22.b;
        if (i2 == 0) {
            hm9.m("zf2", "onEvent, loadNextPageRequestId", new Object[0]);
            this.m = 0;
            new q1a(1, new vi0(this, j2, false)).m(ztc2).i(ztc).k(new iq1(new uf2(this, gf22, 0), 2, oz7));
        }
        if (gf22.a == this.n) {
            hm9.m("zf2", "onEvent, loadPrevPageRequestId", new Object[0]);
            this.n = 0;
            new q1a(1, new vi0(this, j2, true)).m(ztc2).i(ztc).k(new iq1(new uf2(this, gf22, 1), 2, oz7));
        }
    }

    @uae
    public void onEvent(oi0 oi0) {
        if (oi0.a == this.m) {
            hm9.k("zf2", "onEvent: chat media error in loading next page");
            this.m = 0;
            b(true);
        }
        if (oi0.a == this.n) {
            hm9.k("zf2", "onEvent: chat media error in loading prev page");
            this.n = 0;
            b(true);
        }
    }

    @uae
    public void onEvent(ut7 ut7) {
        hm9.k("zf2", "onEvent: LoginEvent");
        b(true);
    }

    @uae
    public void onEvent(to4 to4) {
        for (yf2 yf2 : this.o) {
            if (yf2 != null) {
                ActAttachesView actAttachesView = (ActAttachesView) yf2;
                hm9.q("ru.ok.messages.media.attaches.ActAttachesView", "onDownloadError: messageId=$d", Long.valueOf(to4.c));
                int i2 = jpc.E;
                Handler handler = a14.i;
                a14.N(0, actAttachesView, actAttachesView.getString(i2));
            }
        }
    }
}
