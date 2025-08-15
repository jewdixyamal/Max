package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: au8  reason: default package */
public final class au8 {
    public final c34 a;
    public final av0 b;
    public final m7b c;
    public final sna d;
    public final s8g e;
    public final t6b f;
    public final rm4 g;
    public final ztc h;
    public qj3 i;

    public au8(c34 c34, av0 av0, m7b m7b, sna sna, s8g s8g, t6b t6b, rm4 rm4, ztc ztc) {
        this.a = c34;
        this.b = av0;
        this.c = m7b;
        this.d = sna;
        this.e = s8g;
        this.f = t6b;
        this.g = rm4;
        this.h = ztc;
    }

    public final void A(long j, long j2) {
        t19 d2 = ((k24) this.a).c.d();
        ilc ilc = d2.a;
        ilc.b();
        th thVar = d2.k;
        q36 f2 = thVar.f();
        f2.j(1, j2);
        f2.j(2, j);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            thVar.t(f2);
        } catch (Throwable th) {
            thVar.t(f2);
            throw th;
        }
    }

    public final long a(long j, long j2) {
        hm9.m("au8", "countMessagesFrom chatId = %d, timeFrom = %d", Long.valueOf(j), Long.valueOf(j2));
        t19 d2 = ((k24) this.a).c.d();
        d2.getClass();
        xlc a2 = xlc.a(4, "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = ? AND status <> ?");
        a2.j(1, j);
        a2.j(2, j2);
        ey8.m(a2, 3, (long) 0, d2);
        a2.j(4, (long) 10);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            return o.moveToFirst() ? o.getLong(0) : 0;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final void b(long j, long j2, long j3) {
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        long j4 = j;
        long j5 = j3;
        k24 k24 = (k24) this.a;
        vlc vlc = k24.c;
        t19 d2 = vlc.d();
        d2.getClass();
        xlc a2 = xlc.a(2, "SELECT * FROM messages WHERE time >= ? AND time <= ? AND msg_link_id > 0");
        a2.j(1, j2);
        a2.j(2, Long.MAX_VALUE);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "time");
            int n4 = tfg.n(o, "update_time");
            int n5 = tfg.n(o, "sender");
            int n6 = tfg.n(o, "cid");
            int n7 = tfg.n(o, "text");
            int n8 = tfg.n(o, "delivery_status");
            int n9 = tfg.n(o, "status");
            int n10 = tfg.n(o, "time_local");
            int n11 = tfg.n(o, "error");
            k24 k242 = k24;
            int n12 = tfg.n(o, "localized_error");
            vlc vlc2 = vlc;
            int n13 = tfg.n(o, "attaches");
            xlc = a2;
            try {
                int n14 = tfg.n(o, "media_type");
                int n15 = tfg.n(o, "detect_share");
                int n16 = tfg.n(o, "msg_link_type");
                int n17 = tfg.n(o, "msg_link_id");
                int n18 = tfg.n(o, "inserted_from_msg_link");
                int n19 = tfg.n(o, "msg_link_chat_id");
                int n20 = tfg.n(o, "msg_link_chat_name");
                int n21 = tfg.n(o, "msg_link_chat_link");
                int n22 = tfg.n(o, "msg_link_out_chat_id");
                int n23 = tfg.n(o, "msg_link_out_msg_id");
                int n24 = tfg.n(o, "type");
                int n25 = tfg.n(o, "chat_id");
                int n26 = tfg.n(o, "ttl");
                int n27 = tfg.n(o, "channel_views");
                int n28 = tfg.n(o, "channel_forwards");
                int n29 = tfg.n(o, "view_time");
                int n30 = tfg.n(o, "zoom");
                int n31 = tfg.n(o, "options");
                int n32 = tfg.n(o, "live_until");
                int n33 = tfg.n(o, "elements");
                int n34 = tfg.n(o, "reactions");
                int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                int i10 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j6 = o.getLong(n);
                    long j7 = o.getLong(n2);
                    long j8 = o.getLong(n3);
                    long j9 = o.getLong(n4);
                    long j10 = o.getLong(n5);
                    long j11 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i11 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i11);
                    int i12 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i12);
                    long j12 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i13 = n5;
                    int i14 = n14;
                    int i15 = o.getInt(i14);
                    n14 = i14;
                    int i16 = n15;
                    boolean z3 = false;
                    if (o.getInt(i16) != 0) {
                        n15 = i16;
                        i3 = n16;
                        z = true;
                    } else {
                        n15 = i16;
                        i3 = n16;
                        z = false;
                    }
                    int i17 = o.getInt(i3);
                    n16 = i3;
                    int i18 = n17;
                    long j13 = o.getLong(i18);
                    n17 = i18;
                    int i19 = n18;
                    if (o.getInt(i19) != 0) {
                        n18 = i19;
                        i4 = n19;
                        z2 = true;
                    } else {
                        n18 = i19;
                        i4 = n19;
                        z2 = false;
                    }
                    long j14 = o.getLong(i4);
                    n19 = i4;
                    int i20 = n20;
                    if (o.isNull(i20)) {
                        n20 = i20;
                        i5 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i20);
                        n20 = i20;
                        i5 = n21;
                    }
                    if (o.isNull(i5)) {
                        n21 = i5;
                        i6 = n22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        n21 = i5;
                        i6 = n22;
                    }
                    long j15 = o.getLong(i6);
                    n22 = i6;
                    int i21 = n23;
                    long j16 = o.getLong(i21);
                    n23 = i21;
                    int i22 = n24;
                    int i23 = o.getInt(i22);
                    d2.a().getClass();
                    int a3 = ey8.a(i23);
                    n24 = i22;
                    int i24 = n25;
                    long j17 = o.getLong(i24);
                    n25 = i24;
                    int i25 = n26;
                    int i26 = o.getInt(i25);
                    n26 = i25;
                    int i27 = n27;
                    int i28 = o.getInt(i27);
                    n27 = i27;
                    int i29 = n28;
                    int i30 = o.getInt(i29);
                    n28 = i29;
                    int i31 = n29;
                    long j18 = o.getLong(i31);
                    n29 = i31;
                    int i32 = n30;
                    int i33 = o.getInt(i32);
                    n30 = i32;
                    int i34 = n31;
                    int i35 = o.getInt(i34);
                    n31 = i34;
                    int i36 = n32;
                    long j19 = o.getLong(i36);
                    n32 = i36;
                    int i37 = n33;
                    byte[] blob2 = o.isNull(i37) ? null : o.getBlob(i37);
                    d2.a().getClass();
                    List a4 = v89.a(blob2);
                    n33 = i37;
                    int i38 = n34;
                    if (o.isNull(i38)) {
                        i7 = i38;
                        i8 = n12;
                        bArr = null;
                    } else {
                        i7 = i38;
                        bArr = o.getBlob(i38);
                        i8 = n12;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i39 = n35;
                    if (o.isNull(i39)) {
                        i9 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i39));
                        i9 = n36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        n35 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        n35 = i39;
                    }
                    arrayList.add(new ru8(j6, j7, j8, j9, j10, j11, string, n37, b2, j12, string2, str, b3, i15, z, i17, j13, z2, j14, str2, str3, j15, j16, a3, j17, i26, i28, i30, j18, i33, i35, j19, a4, c2, l, bool));
                    n36 = i9;
                    n12 = i8;
                    n5 = i13;
                    n34 = i7;
                    i10 = i2;
                }
                o.close();
                xlc.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlc2.b((ru8) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        cu8 cu8 = ((cu8) it2.next()).C0;
                        arrayList3.add(Long.valueOf(cu8 != null ? cu8.b : 0));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                vlc vlc3 = k242.c;
                mg4 mg4 = mg4.REGULAR;
                vlc3.getClass();
                int ordinal = mg4.ordinal();
                int i40 = 4;
                if (ordinal == 0) {
                    ilc ilc2 = vlc3.d().a;
                    ilc2.b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND id NOT IN (");
                    a14.c(sb, arrayList3.size());
                    sb.append(")");
                    q36 d3 = ilc2.d(sb.toString());
                    d3.j(1, j);
                    d3.j(2, j2);
                    d3.j(3, j3);
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Long l2 = (Long) it3.next();
                        if (l2 == null) {
                            d3.W(i40);
                        } else {
                            d3.j(i40, l2.longValue());
                        }
                        i40++;
                    }
                    ilc2.c();
                    try {
                        d3.n();
                        ilc2.r();
                    } finally {
                        ilc2.l();
                    }
                } else if (ordinal == 1) {
                    ilc ilc3 = vlc3.d().a;
                    ilc3.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND id NOT IN (");
                    a14.c(sb2, arrayList3.size());
                    sb2.append(")");
                    q36 d4 = ilc3.d(sb2.toString());
                    d4.j(1, j);
                    d4.j(2, j2);
                    d4.j(3, j3);
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Long l3 = (Long) it4.next();
                        if (l3 == null) {
                            d4.W(i40);
                        } else {
                            d4.j(i40, l3.longValue());
                        }
                        i40++;
                    }
                    ilc3.c();
                    try {
                        d4.n();
                        ilc3.r();
                    } finally {
                        ilc3.l();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.b.c(new re9(j, j2, j3, mg4.REGULAR));
            } catch (Throwable th2) {
                th = th2;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final void c(long j, Collection collection) {
        Long valueOf = Long.valueOf(j);
        jy2 jy2 = new jy2(28, new hj8(10));
        StringBuilder sb = new StringBuilder();
        x53.l0(collection, sb, ",", "[", "]", -1, "", jy2);
        hm9.m("au8", "deleteMessages %d ids = %s", valueOf, sb.toString());
        this.d.getClass();
        if (j != 0) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sna.b(j, ((Long) it.next()).longValue());
            }
        }
        t6b t6b = this.f;
        t6b.getClass();
        for (Number longValue : x53.D0(collection)) {
            t6b.c.remove(Long.valueOf(longValue.longValue()));
        }
        t19 d2 = ((k24) this.a).c.d();
        List<Long> D0 = x53.D0(collection);
        ilc ilc = d2.a;
        ilc.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM messages WHERE chat_id = ? AND id in (");
        a14.c(sb2, D0.size());
        sb2.append(")");
        q36 d3 = ilc.d(sb2.toString());
        d3.j(1, j);
        int i2 = 2;
        for (Long l : D0) {
            if (l == null) {
                d3.W(i2);
            } else {
                d3.j(i2, l.longValue());
            }
            i2++;
        }
        ilc.c();
        try {
            d3.n();
            ilc.r();
        } finally {
            ilc.l();
        }
    }

    public final int d(long j, long j2, mg4 mg4) {
        ConcurrentHashMap concurrentHashMap = this.f.c;
        int i2 = 0;
        for (u6b u6b : x53.D0(concurrentHashMap.values())) {
            cu8 cu8 = u6b.d;
            if (cu8.t0 == j) {
                int i3 = mg4 == null ? -1 : s6b.$EnumSwitchMapping$0[mg4.ordinal()];
                long j3 = cu8.b;
                if (i3 == -1 || i3 == 1) {
                    if (cu8.o <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else if (i3 == 2) {
                    ng4 ng4 = cu8.T0;
                    if (ng4 != null && ng4.a <= j2) {
                        concurrentHashMap.remove(Long.valueOf(j3));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                i2++;
            }
        }
        if (i2 > 0) {
            hm9.m("t6b", "clearPreprocessedDataInChat: chatId = %d, itemType = %s, count = %d", Long.valueOf(j), mg4, Integer.valueOf(i2));
        }
        return ((k24) this.a).c.a(j, j2, mg4);
    }

    public final boolean e(long j, long j2) {
        return ((k24) this.a).c.d().i(j, j2) != null;
    }

    public final long f(long j, long j2, fs8 fs8) {
        List singletonList = Collections.singletonList(fs8);
        qj3 qj3 = this.i;
        if (qj3 != null) {
            try {
                qj3.accept(singletonList);
            } catch (Throwable th) {
                hm9.p("au8", "validateMessages: exception", th);
            }
        }
        return ((k24) this.a).c.e(j, j2, fs8);
    }

    public final void g(long j, long j2, List list) {
        qj3 qj3 = this.i;
        if (qj3 != null) {
            try {
                qj3.accept(list);
            } catch (Throwable th) {
                hm9.p("au8", "validateMessages: exception", th);
            }
        }
        vlc vlc = ((k24) this.a).c;
        ((OneMeRoomDatabase) vlc.a.m()).q(new v60(list, vlc, j, j2, 2));
    }

    public final void h(Map map) {
        vlc vlc = ((k24) this.a).c;
        ((OneMeRoomDatabase) vlc.a.m()).q(new flc(map, 1, vlc));
    }

    public final ArrayList i(long j) {
        vlc vlc;
        ArrayList<ru8> arrayList;
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        xlc xlc2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j2 = j;
        vlc vlc2 = ((k24) this.a).c;
        vlc2.getClass();
        int ordinal = mg4.REGULAR.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        if (ordinal == 0) {
            vlc = vlc2;
            String str32 = "error";
            t19 d2 = vlc.d();
            d2.getClass();
            String str33 = str30;
            String str34 = str31;
            xlc a2 = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.j(1, j2);
            a2.j(2, (long) -1);
            ilc ilc = d2.a;
            ilc.b();
            Cursor o = ilc.o(a2, (CancellationSignal) null);
            try {
                int n = tfg.n(o, "id");
                int n2 = tfg.n(o, "server_id");
                int n3 = tfg.n(o, "time");
                int n4 = tfg.n(o, "update_time");
                int n5 = tfg.n(o, "sender");
                int n6 = tfg.n(o, "cid");
                int n7 = tfg.n(o, "text");
                int n8 = tfg.n(o, "delivery_status");
                int n9 = tfg.n(o, "status");
                int n10 = tfg.n(o, "time_local");
                int n11 = tfg.n(o, str32);
                int n12 = tfg.n(o, str34);
                int n13 = tfg.n(o, str33);
                xlc = a2;
                try {
                    int n14 = tfg.n(o, str29);
                    int n15 = tfg.n(o, str28);
                    int n16 = tfg.n(o, str27);
                    int n17 = tfg.n(o, str26);
                    int n18 = tfg.n(o, str25);
                    int n19 = tfg.n(o, str24);
                    int n20 = tfg.n(o, str23);
                    int n21 = tfg.n(o, str22);
                    int n22 = tfg.n(o, str21);
                    int n23 = tfg.n(o, str20);
                    int n24 = tfg.n(o, str19);
                    int n25 = tfg.n(o, str18);
                    int n26 = tfg.n(o, str17);
                    int n27 = tfg.n(o, str16);
                    int n28 = tfg.n(o, str15);
                    int n29 = tfg.n(o, str14);
                    int n30 = tfg.n(o, str13);
                    int n31 = tfg.n(o, str12);
                    int n32 = tfg.n(o, str11);
                    int n33 = tfg.n(o, str10);
                    int n34 = tfg.n(o, str9);
                    int n35 = tfg.n(o, str8);
                    int n36 = tfg.n(o, str7);
                    int i16 = n13;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(n);
                        long j4 = o.getLong(n2);
                        long j5 = o.getLong(n3);
                        long j6 = o.getLong(n4);
                        long j7 = o.getLong(n5);
                        long j8 = o.getLong(n6);
                        String string = o.isNull(n7) ? null : o.getString(n7);
                        int i17 = o.getInt(n8);
                        d2.a().getClass();
                        iu8.b.getClass();
                        iu8 n37 = oz7.n(i17);
                        int i18 = o.getInt(n9);
                        d2.a().getClass();
                        vx8 b2 = v89.b(i18);
                        long j9 = o.getLong(n10);
                        String string2 = o.isNull(n11) ? null : o.getString(n11);
                        if (o.isNull(n12)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(n12);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        k8g b3 = iz7.b(blob);
                        int i19 = n;
                        int i20 = n14;
                        int i21 = o.getInt(i20);
                        n14 = i20;
                        int i22 = n15;
                        int i23 = o.getInt(i22);
                        n15 = i22;
                        int i24 = n16;
                        boolean z3 = i23 != 0;
                        int i25 = o.getInt(i24);
                        n16 = i24;
                        int i26 = n17;
                        long j10 = o.getLong(i26);
                        n17 = i26;
                        int i27 = n18;
                        if (o.getInt(i27) != 0) {
                            n18 = i27;
                            i3 = n19;
                            z = true;
                        } else {
                            n18 = i27;
                            i3 = n19;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        n19 = i3;
                        int i28 = n20;
                        if (o.isNull(i28)) {
                            n20 = i28;
                            i4 = n21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i28);
                            n20 = i28;
                            i4 = n21;
                        }
                        if (o.isNull(i4)) {
                            n21 = i4;
                            i5 = n22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            n21 = i4;
                            i5 = n22;
                        }
                        long j12 = o.getLong(i5);
                        n22 = i5;
                        int i29 = n23;
                        long j13 = o.getLong(i29);
                        n23 = i29;
                        int i30 = n24;
                        int i31 = o.getInt(i30);
                        d2.a().getClass();
                        int a3 = ey8.a(i31);
                        n24 = i30;
                        int i32 = n25;
                        long j14 = o.getLong(i32);
                        n25 = i32;
                        int i33 = n26;
                        int i34 = o.getInt(i33);
                        n26 = i33;
                        int i35 = n27;
                        int i36 = o.getInt(i35);
                        n27 = i35;
                        int i37 = n28;
                        int i38 = o.getInt(i37);
                        n28 = i37;
                        int i39 = n29;
                        long j15 = o.getLong(i39);
                        n29 = i39;
                        int i40 = n30;
                        int i41 = o.getInt(i40);
                        n30 = i40;
                        int i42 = n31;
                        int i43 = o.getInt(i42);
                        n31 = i42;
                        int i44 = n32;
                        long j16 = o.getLong(i44);
                        n32 = i44;
                        int i45 = n33;
                        byte[] blob2 = o.isNull(i45) ? null : o.getBlob(i45);
                        d2.a().getClass();
                        List a4 = v89.a(blob2);
                        n33 = i45;
                        int i46 = n34;
                        if (o.isNull(i46)) {
                            i6 = i46;
                            i7 = i2;
                            bArr = null;
                        } else {
                            i6 = i46;
                            bArr = o.getBlob(i46);
                            i7 = i2;
                        }
                        ix8 c2 = d2.a().c(bArr);
                        int i47 = n35;
                        if (o.isNull(i47)) {
                            i8 = n36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i47));
                            i8 = n36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            n35 = i47;
                            bool = null;
                        } else {
                            n35 = i47;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList2.add(new ru8(j3, j4, j5, j6, j7, j8, string, n37, b2, j9, string2, str, b3, i21, z3, i25, j10, z, j11, str2, str3, j12, j13, a3, j14, i34, i36, i38, j15, i41, i43, j16, a4, c2, l, bool));
                        n36 = i8;
                        n = i19;
                        i16 = i7;
                        n34 = i6;
                    }
                    o.close();
                    xlc.n();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    xlc.n();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                xlc = a2;
                o.close();
                xlc.n();
                throw th;
            }
        } else if (ordinal == 1) {
            t19 d3 = vlc2.d();
            d3.getClass();
            vlc = vlc2;
            String str35 = "error";
            xlc a5 = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
            a5.j(1, j2);
            a5.j(2, (long) -1);
            ilc ilc2 = d3.a;
            ilc2.b();
            Cursor o2 = ilc2.o(a5, (CancellationSignal) null);
            try {
                int n38 = tfg.n(o2, "id");
                int n39 = tfg.n(o2, "server_id");
                int n40 = tfg.n(o2, "time");
                int n41 = tfg.n(o2, "update_time");
                int n42 = tfg.n(o2, "sender");
                int n43 = tfg.n(o2, "cid");
                int n44 = tfg.n(o2, "text");
                int n45 = tfg.n(o2, "delivery_status");
                int n46 = tfg.n(o2, "status");
                int n47 = tfg.n(o2, "time_local");
                int n48 = tfg.n(o2, str35);
                int n49 = tfg.n(o2, str31);
                int n50 = tfg.n(o2, str30);
                xlc2 = a5;
                try {
                    int n51 = tfg.n(o2, str29);
                    int n52 = tfg.n(o2, str28);
                    int n53 = tfg.n(o2, str27);
                    int n54 = tfg.n(o2, str26);
                    int n55 = tfg.n(o2, str25);
                    int n56 = tfg.n(o2, str24);
                    int n57 = tfg.n(o2, str23);
                    int n58 = tfg.n(o2, str22);
                    int n59 = tfg.n(o2, str21);
                    int n60 = tfg.n(o2, str20);
                    int n61 = tfg.n(o2, str19);
                    int n62 = tfg.n(o2, str18);
                    int n63 = tfg.n(o2, str17);
                    int n64 = tfg.n(o2, str16);
                    int n65 = tfg.n(o2, str15);
                    int n66 = tfg.n(o2, str14);
                    int n67 = tfg.n(o2, str13);
                    int n68 = tfg.n(o2, str12);
                    int n69 = tfg.n(o2, str11);
                    int n70 = tfg.n(o2, str10);
                    int n71 = tfg.n(o2, str9);
                    int n72 = tfg.n(o2, str8);
                    int n73 = tfg.n(o2, str7);
                    int i48 = n50;
                    arrayList = new ArrayList<>(o2.getCount());
                    while (o2.moveToNext()) {
                        long j17 = o2.getLong(n38);
                        long j18 = o2.getLong(n39);
                        long j19 = o2.getLong(n40);
                        long j20 = o2.getLong(n41);
                        long j21 = o2.getLong(n42);
                        long j22 = o2.getLong(n43);
                        String string3 = o2.isNull(n44) ? null : o2.getString(n44);
                        int i49 = o2.getInt(n45);
                        d3.a().getClass();
                        iu8.b.getClass();
                        iu8 n74 = oz7.n(i49);
                        int i50 = o2.getInt(n46);
                        d3.a().getClass();
                        vx8 b4 = v89.b(i50);
                        long j23 = o2.getLong(n47);
                        String string4 = o2.isNull(n48) ? null : o2.getString(n48);
                        if (o2.isNull(n49)) {
                            i9 = i48;
                            str4 = null;
                        } else {
                            str4 = o2.getString(n49);
                            i9 = i48;
                        }
                        byte[] blob3 = o2.isNull(i9) ? null : o2.getBlob(i9);
                        d3.a().getClass();
                        k8g b5 = iz7.b(blob3);
                        int i51 = n38;
                        int i52 = n51;
                        int i53 = o2.getInt(i52);
                        n51 = i52;
                        int i54 = n52;
                        int i55 = o2.getInt(i54);
                        n52 = i54;
                        int i56 = n53;
                        boolean z4 = i55 != 0;
                        int i57 = o2.getInt(i56);
                        n53 = i56;
                        int i58 = n54;
                        long j24 = o2.getLong(i58);
                        n54 = i58;
                        int i59 = n55;
                        if (o2.getInt(i59) != 0) {
                            n55 = i59;
                            i10 = n56;
                            z2 = true;
                        } else {
                            n55 = i59;
                            i10 = n56;
                            z2 = false;
                        }
                        long j25 = o2.getLong(i10);
                        n56 = i10;
                        int i60 = n57;
                        if (o2.isNull(i60)) {
                            n57 = i60;
                            i11 = n58;
                            str5 = null;
                        } else {
                            str5 = o2.getString(i60);
                            n57 = i60;
                            i11 = n58;
                        }
                        if (o2.isNull(i11)) {
                            n58 = i11;
                            i12 = n59;
                            str6 = null;
                        } else {
                            str6 = o2.getString(i11);
                            n58 = i11;
                            i12 = n59;
                        }
                        long j26 = o2.getLong(i12);
                        n59 = i12;
                        int i61 = n60;
                        long j27 = o2.getLong(i61);
                        n60 = i61;
                        int i62 = n61;
                        int i63 = o2.getInt(i62);
                        d3.a().getClass();
                        int a6 = ey8.a(i63);
                        n61 = i62;
                        int i64 = n62;
                        long j28 = o2.getLong(i64);
                        n62 = i64;
                        int i65 = n63;
                        int i66 = o2.getInt(i65);
                        n63 = i65;
                        int i67 = n64;
                        int i68 = o2.getInt(i67);
                        n64 = i67;
                        int i69 = n65;
                        int i70 = o2.getInt(i69);
                        n65 = i69;
                        int i71 = n66;
                        long j29 = o2.getLong(i71);
                        n66 = i71;
                        int i72 = n67;
                        int i73 = o2.getInt(i72);
                        n67 = i72;
                        int i74 = n68;
                        int i75 = o2.getInt(i74);
                        n68 = i74;
                        int i76 = n69;
                        long j30 = o2.getLong(i76);
                        n69 = i76;
                        int i77 = n70;
                        byte[] blob4 = o2.isNull(i77) ? null : o2.getBlob(i77);
                        d3.a().getClass();
                        List a7 = v89.a(blob4);
                        n70 = i77;
                        int i78 = n71;
                        if (o2.isNull(i78)) {
                            i13 = i78;
                            i14 = n39;
                            bArr2 = null;
                        } else {
                            i13 = i78;
                            bArr2 = o2.getBlob(i78);
                            i14 = n39;
                        }
                        ix8 c3 = d3.a().c(bArr2);
                        int i79 = n72;
                        if (o2.isNull(i79)) {
                            i15 = n73;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o2.getLong(i79));
                            i15 = n73;
                        }
                        Integer valueOf2 = o2.isNull(i15) ? null : Integer.valueOf(o2.getInt(i15));
                        if (valueOf2 == null) {
                            n72 = i79;
                            bool2 = null;
                        } else {
                            n72 = i79;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ru8(j17, j18, j19, j20, j21, j22, string3, n74, b4, j23, string4, str4, b5, i53, z4, i57, j24, z2, j25, str5, str6, j26, j27, a6, j28, i66, i68, i70, j29, i73, i75, j30, a7, c3, l2, bool2));
                        n73 = i15;
                        n39 = i14;
                        n38 = i51;
                        n71 = i13;
                        i48 = i9;
                    }
                    o2.close();
                    xlc2.n();
                } catch (Throwable th3) {
                    th = th3;
                    o2.close();
                    xlc2.n();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                xlc2 = a5;
                o2.close();
                xlc2.n();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList, 10));
        for (ru8 b6 : arrayList) {
            arrayList3.add(vlc.b(b6));
        }
        return arrayList3;
    }

    public final cu8 j(long j, long j2) {
        vlc vlc = ((k24) this.a).c;
        ru8 b2 = vlc.d().b(j, j2);
        if (b2 != null) {
            return vlc.b(b2);
        }
        return null;
    }

    public final ArrayList k(long j, Collection collection) {
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        vlc vlc = ((k24) this.a).c;
        t19 d2 = vlc.d();
        List<Long> D0 = x53.D0(collection);
        d2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM messages WHERE chat_id = ? AND server_id in (");
        int size = D0.size();
        a14.c(sb, size);
        sb.append(")");
        xlc a2 = xlc.a(size + 1, sb.toString());
        a2.j(1, j);
        int i9 = 2;
        for (Long l2 : D0) {
            if (l2 == null) {
                a2.W(i9);
            } else {
                a2.j(i9, l2.longValue());
            }
            i9++;
        }
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "time");
            int n4 = tfg.n(o, "update_time");
            int n5 = tfg.n(o, "sender");
            int n6 = tfg.n(o, "cid");
            int n7 = tfg.n(o, "text");
            int n8 = tfg.n(o, "delivery_status");
            int n9 = tfg.n(o, "status");
            int n10 = tfg.n(o, "time_local");
            int n11 = tfg.n(o, "error");
            int n12 = tfg.n(o, "localized_error");
            vlc vlc2 = vlc;
            int n13 = tfg.n(o, "attaches");
            xlc = a2;
            try {
                int n14 = tfg.n(o, "media_type");
                int n15 = tfg.n(o, "detect_share");
                int n16 = tfg.n(o, "msg_link_type");
                int n17 = tfg.n(o, "msg_link_id");
                int n18 = tfg.n(o, "inserted_from_msg_link");
                int n19 = tfg.n(o, "msg_link_chat_id");
                int n20 = tfg.n(o, "msg_link_chat_name");
                int n21 = tfg.n(o, "msg_link_chat_link");
                int n22 = tfg.n(o, "msg_link_out_chat_id");
                int n23 = tfg.n(o, "msg_link_out_msg_id");
                int n24 = tfg.n(o, "type");
                int n25 = tfg.n(o, "chat_id");
                int n26 = tfg.n(o, "ttl");
                int n27 = tfg.n(o, "channel_views");
                int n28 = tfg.n(o, "channel_forwards");
                int n29 = tfg.n(o, "view_time");
                int n30 = tfg.n(o, "zoom");
                int n31 = tfg.n(o, "options");
                int n32 = tfg.n(o, "live_until");
                int n33 = tfg.n(o, "elements");
                int n34 = tfg.n(o, "reactions");
                int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                int i10 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(n);
                    long j3 = o.getLong(n2);
                    long j4 = o.getLong(n3);
                    long j5 = o.getLong(n4);
                    long j6 = o.getLong(n5);
                    long j7 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i11 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i11);
                    int i12 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i12);
                    long j8 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i10 = i2;
                    int i13 = n14;
                    int i14 = o.getInt(i13);
                    n14 = i13;
                    int i15 = n15;
                    int i16 = o.getInt(i15);
                    boolean z2 = false;
                    n15 = i15;
                    int i17 = n16;
                    boolean z3 = i16 != 0;
                    int i18 = o.getInt(i17);
                    int i19 = i17;
                    int i20 = n17;
                    long j9 = o.getLong(i20);
                    n17 = i20;
                    int i21 = n18;
                    if (o.getInt(i21) != 0) {
                        n18 = i21;
                        i3 = n19;
                        z = true;
                    } else {
                        n18 = i21;
                        i3 = n19;
                        z = false;
                    }
                    long j10 = o.getLong(i3);
                    n19 = i3;
                    int i22 = n20;
                    if (o.isNull(i22)) {
                        n20 = i22;
                        i4 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i22);
                        n20 = i22;
                        i4 = n21;
                    }
                    if (o.isNull(i4)) {
                        n21 = i4;
                        i5 = n22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i4);
                        n21 = i4;
                        i5 = n22;
                    }
                    long j11 = o.getLong(i5);
                    n22 = i5;
                    int i23 = n23;
                    long j12 = o.getLong(i23);
                    n23 = i23;
                    int i24 = n24;
                    int i25 = o.getInt(i24);
                    d2.a().getClass();
                    int a3 = ey8.a(i25);
                    n24 = i24;
                    int i26 = n25;
                    long j13 = o.getLong(i26);
                    n25 = i26;
                    int i27 = n26;
                    int i28 = o.getInt(i27);
                    n26 = i27;
                    int i29 = n27;
                    int i30 = o.getInt(i29);
                    n27 = i29;
                    int i31 = n28;
                    int i32 = o.getInt(i31);
                    n28 = i31;
                    int i33 = n29;
                    long j14 = o.getLong(i33);
                    n29 = i33;
                    int i34 = n30;
                    int i35 = o.getInt(i34);
                    n30 = i34;
                    int i36 = n31;
                    int i37 = o.getInt(i36);
                    n31 = i36;
                    int i38 = n32;
                    long j15 = o.getLong(i38);
                    n32 = i38;
                    int i39 = n33;
                    byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                    d2.a().getClass();
                    List a4 = v89.a(blob2);
                    n33 = i39;
                    int i40 = n34;
                    if (o.isNull(i40)) {
                        i6 = i40;
                        i7 = n11;
                        bArr = null;
                    } else {
                        i6 = i40;
                        bArr = o.getBlob(i40);
                        i7 = n11;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i41 = n35;
                    if (o.isNull(i41)) {
                        i8 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i41));
                        i8 = n36;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                    if (valueOf == null) {
                        n35 = i41;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n35 = i41;
                    }
                    arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string, n37, b2, j8, string2, str, b3, i14, z3, i18, j9, z, j10, str2, str3, j11, j12, a3, j13, i28, i30, i32, j14, i35, i37, j15, a4, c2, l, bool));
                    n36 = i8;
                    n11 = i7;
                    n16 = i19;
                    n34 = i6;
                }
                o.close();
                xlc.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlc2.b((ru8) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [qpd, us] */
    public final us l(ArrayList arrayList) {
        vlc vlc = ((k24) this.a).c;
        vlc.getClass();
        at atVar = new at(2, arrayList);
        np8.h(200, 200);
        um5 d0 = l6d.d0(new r1f(new dtd(atVar, 200, 200), new wz7(29, vlc)), n71.t0);
        ? qpd = new qpd(0);
        pk5 pk5 = new pk5(d0);
        while (pk5.hasNext()) {
            cu8 b2 = vlc.b((ru8) pk5.next());
            qpd.put(Long.valueOf(b2.b), b2);
        }
        return qpd;
    }

    public final ArrayList m(long j, long j2) {
        xlc xlc;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        zu8 zu8 = (zu8) this.g.get();
        vlc vlc = ((k24) this.a).c;
        t19 d2 = vlc.d();
        Set<Integer> singleton = Collections.singleton(8);
        d2.getClass();
        StringBuilder l2 = au1.l("SELECT * FROM messages WHERE media_type in (");
        int size = singleton.size();
        a14.c(l2, size);
        l2.append(") AND time >= ");
        l2.append("?");
        l2.append(" AND time <= ");
        l2.append("?");
        l2.append(" AND inserted_from_msg_link = 0 AND status <> ");
        l2.append("?");
        l2.append(" ORDER BY time DESC LIMIT ");
        l2.append("?");
        int i8 = size + 4;
        xlc a2 = xlc.a(i8, l2.toString());
        int i9 = 1;
        for (Integer num : singleton) {
            if (num == null) {
                a2.W(i9);
            } else {
                a2.j(i9, (long) num.intValue());
            }
            i9++;
        }
        a2.j(size + 1, j);
        a2.j(size + 2, j2);
        d2.a().getClass();
        a2.j(size + 3, (long) 10);
        a2.j(i8, (long) 100);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "time");
            int n4 = tfg.n(o, "update_time");
            int n5 = tfg.n(o, "sender");
            int n6 = tfg.n(o, "cid");
            int n7 = tfg.n(o, "text");
            int n8 = tfg.n(o, "delivery_status");
            int n9 = tfg.n(o, "status");
            int n10 = tfg.n(o, "time_local");
            int n11 = tfg.n(o, "error");
            zu8 zu82 = zu8;
            int n12 = tfg.n(o, "localized_error");
            vlc vlc2 = vlc;
            int n13 = tfg.n(o, "attaches");
            xlc = a2;
            try {
                int n14 = tfg.n(o, "media_type");
                int n15 = tfg.n(o, "detect_share");
                int n16 = tfg.n(o, "msg_link_type");
                int n17 = tfg.n(o, "msg_link_id");
                int n18 = tfg.n(o, "inserted_from_msg_link");
                int n19 = tfg.n(o, "msg_link_chat_id");
                int n20 = tfg.n(o, "msg_link_chat_name");
                int n21 = tfg.n(o, "msg_link_chat_link");
                int n22 = tfg.n(o, "msg_link_out_chat_id");
                int n23 = tfg.n(o, "msg_link_out_msg_id");
                int n24 = tfg.n(o, "type");
                int n25 = tfg.n(o, "chat_id");
                int n26 = tfg.n(o, "ttl");
                int n27 = tfg.n(o, "channel_views");
                int n28 = tfg.n(o, "channel_forwards");
                int n29 = tfg.n(o, "view_time");
                int n30 = tfg.n(o, "zoom");
                int n31 = tfg.n(o, "options");
                int n32 = tfg.n(o, "live_until");
                int n33 = tfg.n(o, "elements");
                int n34 = tfg.n(o, "reactions");
                int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                int i10 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j3 = o.getLong(n);
                    long j4 = o.getLong(n2);
                    long j5 = o.getLong(n3);
                    long j6 = o.getLong(n4);
                    long j7 = o.getLong(n5);
                    long j8 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i11 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i11);
                    int i12 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i12);
                    long j9 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i10 = i2;
                    int i13 = n14;
                    int i14 = o.getInt(i13);
                    n14 = i13;
                    int i15 = n15;
                    boolean z = false;
                    n15 = i15;
                    boolean z2 = o.getInt(i15) != 0;
                    int i16 = n16;
                    int i17 = o.getInt(i16);
                    n16 = i16;
                    int i18 = n17;
                    long j10 = o.getLong(i18);
                    n17 = i18;
                    int i19 = n18;
                    boolean z3 = o.getInt(i19) != 0;
                    int i20 = n19;
                    int i21 = i19;
                    int i22 = i20;
                    long j11 = o.getLong(i22);
                    int i23 = i22;
                    int i24 = n20;
                    if (o.isNull(i24)) {
                        n20 = i24;
                        i3 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i24);
                        n20 = i24;
                        i3 = n21;
                    }
                    if (o.isNull(i3)) {
                        n21 = i3;
                        i4 = n22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i3);
                        n21 = i3;
                        i4 = n22;
                    }
                    long j12 = o.getLong(i4);
                    n22 = i4;
                    int i25 = n23;
                    long j13 = o.getLong(i25);
                    n23 = i25;
                    int i26 = n24;
                    int i27 = o.getInt(i26);
                    d2.a().getClass();
                    int a3 = ey8.a(i27);
                    n24 = i26;
                    int i28 = n25;
                    long j14 = o.getLong(i28);
                    n25 = i28;
                    int i29 = n26;
                    int i30 = o.getInt(i29);
                    n26 = i29;
                    int i31 = n27;
                    int i32 = o.getInt(i31);
                    n27 = i31;
                    int i33 = n28;
                    int i34 = o.getInt(i33);
                    n28 = i33;
                    int i35 = n29;
                    long j15 = o.getLong(i35);
                    n29 = i35;
                    int i36 = n30;
                    int i37 = o.getInt(i36);
                    n30 = i36;
                    int i38 = n31;
                    int i39 = o.getInt(i38);
                    n31 = i38;
                    int i40 = n32;
                    long j16 = o.getLong(i40);
                    n32 = i40;
                    int i41 = n33;
                    byte[] blob2 = o.isNull(i41) ? null : o.getBlob(i41);
                    d2.a().getClass();
                    List a4 = v89.a(blob2);
                    n33 = i41;
                    int i42 = n34;
                    if (o.isNull(i42)) {
                        i5 = i42;
                        i6 = n12;
                        bArr = null;
                    } else {
                        i5 = i42;
                        bArr = o.getBlob(i42);
                        i6 = n12;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i43 = n35;
                    if (o.isNull(i43)) {
                        i7 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i43));
                        i7 = n36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        n35 = i43;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                        n35 = i43;
                    }
                    arrayList.add(new ru8(j3, j4, j5, j6, j7, j8, string, n37, b2, j9, string2, str, b3, i14, z2, i17, j10, z3, j11, str2, str3, j12, j13, a3, j14, i30, i32, i34, j15, i37, i39, j16, a4, c2, l, bool));
                    n36 = i7;
                    n18 = i21;
                    n12 = i6;
                    n19 = i23;
                    n34 = i5;
                }
                o.close();
                xlc.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlc2.b((ru8) it.next()));
                }
                return zu82.b(arrayList2);
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final ArrayList n(long j, long j2, long j3, boolean z, mg4 mg4) {
        vlc vlc;
        ArrayList<ru8> arrayList;
        xlc xlc;
        String str;
        int i2;
        String str2;
        int i3;
        String str3;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l;
        int i7;
        Boolean bool;
        xlc xlc2;
        String str4;
        int i8;
        String str5;
        int i9;
        String str6;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        Long l2;
        int i13;
        Boolean bool2;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z2 = z;
        StringBuilder k = au1.k(j4, "selectFromTo chatId = ", "; timeFrom = ");
        k.append(j5);
        au1.q(j6, "; timeTo = ", "; backwards = ", k);
        k.append(z2);
        hm9.m("au8", k.toString(), new Object[0]);
        vlc vlc2 = ((k24) this.a).c;
        vlc2.getClass();
        int ordinal = mg4.ordinal();
        if (ordinal == 0) {
            vlc = vlc2;
            arrayList = vlc.d().d(j, j2, z, j3);
        } else if (ordinal == 1) {
            t19 d2 = vlc2.d();
            ilc ilc = d2.a;
            vlc = vlc2;
            String str7 = "delayed_attrs_notify_sender";
            String str8 = "delayed_attrs_time_to_fire";
            String str9 = "reactions";
            String str10 = "elements";
            String str11 = "live_until";
            String str12 = "options";
            String str13 = "zoom";
            String str14 = "view_time";
            String str15 = "channel_forwards";
            String str16 = "channel_views";
            String str17 = "ttl";
            String str18 = "chat_id";
            String str19 = "type";
            String str20 = "msg_link_out_msg_id";
            String str21 = "msg_link_out_chat_id";
            String str22 = "msg_link_chat_link";
            String str23 = "msg_link_chat_name";
            String str24 = "msg_link_chat_id";
            String str25 = "inserted_from_msg_link";
            String str26 = "msg_link_id";
            String str27 = "msg_link_type";
            String str28 = "detect_share";
            String str29 = "media_type";
            String str30 = "attaches";
            String str31 = "localized_error";
            String str32 = "error";
            String str33 = "time_local";
            String str34 = "status";
            String str35 = "delivery_status";
            String str36 = "text";
            if (z2) {
                String str37 = "cid";
                xlc a2 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
                a2.j(1, j4);
                a2.j(2, j5);
                ey8.m(a2, 3, j6, d2);
                a2.j(4, (long) 10);
                a2.j(5, (long) 40);
                ilc.b();
                Cursor o = ilc.o(a2, (CancellationSignal) null);
                try {
                    int n = tfg.n(o, "id");
                    int n2 = tfg.n(o, "server_id");
                    int n3 = tfg.n(o, "time");
                    int n4 = tfg.n(o, "update_time");
                    int n5 = tfg.n(o, "sender");
                    int n6 = tfg.n(o, str37);
                    int n7 = tfg.n(o, str36);
                    int n8 = tfg.n(o, str35);
                    int n9 = tfg.n(o, str34);
                    int n10 = tfg.n(o, str33);
                    int n11 = tfg.n(o, str32);
                    int n12 = tfg.n(o, str31);
                    int n13 = tfg.n(o, str30);
                    xlc2 = a2;
                    try {
                        int n14 = tfg.n(o, str29);
                        int n15 = tfg.n(o, str28);
                        int n16 = tfg.n(o, str27);
                        int n17 = tfg.n(o, str26);
                        int n18 = tfg.n(o, str25);
                        int n19 = tfg.n(o, str24);
                        int n20 = tfg.n(o, str23);
                        int n21 = tfg.n(o, str22);
                        int n22 = tfg.n(o, str21);
                        int n23 = tfg.n(o, str20);
                        int n24 = tfg.n(o, str19);
                        int n25 = tfg.n(o, str18);
                        int n26 = tfg.n(o, str17);
                        int n27 = tfg.n(o, str16);
                        int n28 = tfg.n(o, str15);
                        int n29 = tfg.n(o, str14);
                        int n30 = tfg.n(o, str13);
                        int n31 = tfg.n(o, str12);
                        int n32 = tfg.n(o, str11);
                        int n33 = tfg.n(o, str10);
                        int n34 = tfg.n(o, str9);
                        int n35 = tfg.n(o, str8);
                        int n36 = tfg.n(o, str7);
                        int i14 = n13;
                        arrayList = new ArrayList<>(o.getCount());
                        while (o.moveToNext()) {
                            long j7 = o.getLong(n);
                            long j8 = o.getLong(n2);
                            long j9 = o.getLong(n3);
                            long j10 = o.getLong(n4);
                            long j11 = o.getLong(n5);
                            long j12 = o.getLong(n6);
                            String string = o.isNull(n7) ? null : o.getString(n7);
                            int i15 = o.getInt(n8);
                            d2.a().getClass();
                            iu8.b.getClass();
                            iu8 n37 = oz7.n(i15);
                            int i16 = o.getInt(n9);
                            d2.a().getClass();
                            vx8 b2 = v89.b(i16);
                            long j13 = o.getLong(n10);
                            String string2 = o.isNull(n11) ? null : o.getString(n11);
                            if (o.isNull(n12)) {
                                i8 = i14;
                                str4 = null;
                            } else {
                                str4 = o.getString(n12);
                                i8 = i14;
                            }
                            byte[] blob = o.isNull(i8) ? null : o.getBlob(i8);
                            d2.a().getClass();
                            k8g b3 = iz7.b(blob);
                            int i17 = n;
                            int i18 = n14;
                            int i19 = o.getInt(i18);
                            n14 = i18;
                            int i20 = n15;
                            n15 = i20;
                            boolean z3 = o.getInt(i20) != 0;
                            int i21 = n16;
                            int i22 = o.getInt(i21);
                            n16 = i21;
                            int i23 = n17;
                            long j14 = o.getLong(i23);
                            n17 = i23;
                            int i24 = n18;
                            n18 = i24;
                            boolean z4 = o.getInt(i24) != 0;
                            int i25 = n19;
                            long j15 = o.getLong(i25);
                            n19 = i25;
                            int i26 = n20;
                            if (o.isNull(i26)) {
                                n20 = i26;
                                i9 = n21;
                                str5 = null;
                            } else {
                                str5 = o.getString(i26);
                                n20 = i26;
                                i9 = n21;
                            }
                            if (o.isNull(i9)) {
                                n21 = i9;
                                i10 = n22;
                                str6 = null;
                            } else {
                                str6 = o.getString(i9);
                                n21 = i9;
                                i10 = n22;
                            }
                            long j16 = o.getLong(i10);
                            n22 = i10;
                            int i27 = n23;
                            long j17 = o.getLong(i27);
                            n23 = i27;
                            int i28 = n24;
                            int i29 = o.getInt(i28);
                            d2.a().getClass();
                            int a3 = ey8.a(i29);
                            n24 = i28;
                            int i30 = n25;
                            long j18 = o.getLong(i30);
                            n25 = i30;
                            int i31 = n26;
                            int i32 = o.getInt(i31);
                            n26 = i31;
                            int i33 = n27;
                            int i34 = o.getInt(i33);
                            n27 = i33;
                            int i35 = n28;
                            int i36 = o.getInt(i35);
                            n28 = i35;
                            int i37 = n29;
                            long j19 = o.getLong(i37);
                            n29 = i37;
                            int i38 = n30;
                            int i39 = o.getInt(i38);
                            n30 = i38;
                            int i40 = n31;
                            int i41 = o.getInt(i40);
                            n31 = i40;
                            int i42 = n32;
                            long j20 = o.getLong(i42);
                            n32 = i42;
                            int i43 = n33;
                            byte[] blob2 = o.isNull(i43) ? null : o.getBlob(i43);
                            d2.a().getClass();
                            List a4 = v89.a(blob2);
                            n33 = i43;
                            int i44 = n34;
                            if (o.isNull(i44)) {
                                i11 = i44;
                                i12 = n2;
                                bArr2 = null;
                            } else {
                                i11 = i44;
                                bArr2 = o.getBlob(i44);
                                i12 = n2;
                            }
                            ix8 c2 = d2.a().c(bArr2);
                            int i45 = n35;
                            if (o.isNull(i45)) {
                                i13 = n36;
                                l2 = null;
                            } else {
                                l2 = Long.valueOf(o.getLong(i45));
                                i13 = n36;
                            }
                            Integer valueOf = o.isNull(i13) ? null : Integer.valueOf(o.getInt(i13));
                            if (valueOf == null) {
                                n35 = i45;
                                bool2 = null;
                            } else {
                                n35 = i45;
                                bool2 = Boolean.valueOf(valueOf.intValue() != 0);
                            }
                            arrayList.add(new ru8(j7, j8, j9, j10, j11, j12, string, n37, b2, j13, string2, str4, b3, i19, z3, i22, j14, z4, j15, str5, str6, j16, j17, a3, j18, i32, i34, i36, j19, i39, i41, j20, a4, c2, l2, bool2));
                            n36 = i13;
                            n2 = i12;
                            n = i17;
                            n34 = i11;
                            i14 = i8;
                        }
                        o.close();
                        xlc2.n();
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        xlc2.n();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xlc2 = a2;
                    o.close();
                    xlc2.n();
                    throw th;
                }
            } else {
                String str38 = "cid";
                xlc a5 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire >= ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
                a5.j(1, j4);
                a5.j(2, j5);
                ey8.m(a5, 3, j6, d2);
                a5.j(4, (long) 10);
                a5.j(5, (long) 40);
                ilc.b();
                Cursor o2 = ilc.o(a5, (CancellationSignal) null);
                try {
                    int n38 = tfg.n(o2, "id");
                    int n39 = tfg.n(o2, "server_id");
                    int n40 = tfg.n(o2, "time");
                    int n41 = tfg.n(o2, "update_time");
                    int n42 = tfg.n(o2, "sender");
                    int n43 = tfg.n(o2, str38);
                    int n44 = tfg.n(o2, str36);
                    int n45 = tfg.n(o2, str35);
                    int n46 = tfg.n(o2, str34);
                    int n47 = tfg.n(o2, str33);
                    int n48 = tfg.n(o2, str32);
                    int n49 = tfg.n(o2, str31);
                    int n50 = tfg.n(o2, str30);
                    xlc = a5;
                    try {
                        int n51 = tfg.n(o2, str29);
                        int n52 = tfg.n(o2, str28);
                        int n53 = tfg.n(o2, str27);
                        int n54 = tfg.n(o2, str26);
                        int n55 = tfg.n(o2, str25);
                        int n56 = tfg.n(o2, str24);
                        int n57 = tfg.n(o2, str23);
                        int n58 = tfg.n(o2, str22);
                        int n59 = tfg.n(o2, str21);
                        int n60 = tfg.n(o2, str20);
                        int n61 = tfg.n(o2, str19);
                        int n62 = tfg.n(o2, str18);
                        int n63 = tfg.n(o2, str17);
                        int n64 = tfg.n(o2, str16);
                        int n65 = tfg.n(o2, str15);
                        int n66 = tfg.n(o2, str14);
                        int n67 = tfg.n(o2, str13);
                        int n68 = tfg.n(o2, str12);
                        int n69 = tfg.n(o2, str11);
                        int n70 = tfg.n(o2, str10);
                        int n71 = tfg.n(o2, str9);
                        int n72 = tfg.n(o2, str8);
                        int n73 = tfg.n(o2, str7);
                        int i46 = n50;
                        arrayList = new ArrayList<>(o2.getCount());
                        while (o2.moveToNext()) {
                            long j21 = o2.getLong(n38);
                            long j22 = o2.getLong(n39);
                            long j23 = o2.getLong(n40);
                            long j24 = o2.getLong(n41);
                            long j25 = o2.getLong(n42);
                            long j26 = o2.getLong(n43);
                            String string3 = o2.isNull(n44) ? null : o2.getString(n44);
                            int i47 = o2.getInt(n45);
                            d2.a().getClass();
                            iu8.b.getClass();
                            iu8 n74 = oz7.n(i47);
                            int i48 = o2.getInt(n46);
                            d2.a().getClass();
                            vx8 b4 = v89.b(i48);
                            long j27 = o2.getLong(n47);
                            String string4 = o2.isNull(n48) ? null : o2.getString(n48);
                            if (o2.isNull(n49)) {
                                i2 = i46;
                                str = null;
                            } else {
                                str = o2.getString(n49);
                                i2 = i46;
                            }
                            byte[] blob3 = o2.isNull(i2) ? null : o2.getBlob(i2);
                            d2.a().getClass();
                            k8g b5 = iz7.b(blob3);
                            int i49 = n49;
                            int i50 = n51;
                            int i51 = o2.getInt(i50);
                            n51 = i50;
                            int i52 = n52;
                            n52 = i52;
                            boolean z5 = o2.getInt(i52) != 0;
                            int i53 = n53;
                            int i54 = o2.getInt(i53);
                            n53 = i53;
                            int i55 = n54;
                            long j28 = o2.getLong(i55);
                            n54 = i55;
                            int i56 = n55;
                            n55 = i56;
                            boolean z6 = o2.getInt(i56) != 0;
                            int i57 = n56;
                            long j29 = o2.getLong(i57);
                            n56 = i57;
                            int i58 = n57;
                            if (o2.isNull(i58)) {
                                n57 = i58;
                                i3 = n58;
                                str2 = null;
                            } else {
                                str2 = o2.getString(i58);
                                n57 = i58;
                                i3 = n58;
                            }
                            if (o2.isNull(i3)) {
                                n58 = i3;
                                i4 = n59;
                                str3 = null;
                            } else {
                                str3 = o2.getString(i3);
                                n58 = i3;
                                i4 = n59;
                            }
                            long j30 = o2.getLong(i4);
                            n59 = i4;
                            int i59 = n60;
                            long j31 = o2.getLong(i59);
                            n60 = i59;
                            int i60 = n61;
                            int i61 = o2.getInt(i60);
                            d2.a().getClass();
                            int a6 = ey8.a(i61);
                            n61 = i60;
                            int i62 = n62;
                            long j32 = o2.getLong(i62);
                            n62 = i62;
                            int i63 = n63;
                            int i64 = o2.getInt(i63);
                            n63 = i63;
                            int i65 = n64;
                            int i66 = o2.getInt(i65);
                            n64 = i65;
                            int i67 = n65;
                            int i68 = o2.getInt(i67);
                            n65 = i67;
                            int i69 = n66;
                            long j33 = o2.getLong(i69);
                            n66 = i69;
                            int i70 = n67;
                            int i71 = o2.getInt(i70);
                            n67 = i70;
                            int i72 = n68;
                            int i73 = o2.getInt(i72);
                            n68 = i72;
                            int i74 = n69;
                            long j34 = o2.getLong(i74);
                            n69 = i74;
                            int i75 = n70;
                            byte[] blob4 = o2.isNull(i75) ? null : o2.getBlob(i75);
                            d2.a().getClass();
                            List a7 = v89.a(blob4);
                            n70 = i75;
                            int i76 = n71;
                            if (o2.isNull(i76)) {
                                i5 = i76;
                                i6 = i2;
                                bArr = null;
                            } else {
                                i5 = i76;
                                bArr = o2.getBlob(i76);
                                i6 = i2;
                            }
                            ix8 c3 = d2.a().c(bArr);
                            int i77 = n72;
                            if (o2.isNull(i77)) {
                                i7 = n73;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i77));
                                i7 = n73;
                            }
                            Integer valueOf2 = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                            if (valueOf2 == null) {
                                n72 = i77;
                                bool = null;
                            } else {
                                n72 = i77;
                                bool = Boolean.valueOf(valueOf2.intValue() != 0);
                            }
                            arrayList.add(new ru8(j21, j22, j23, j24, j25, j26, string3, n74, b4, j27, string4, str, b5, i51, z5, i54, j28, z6, j29, str2, str3, j30, j31, a6, j32, i64, i66, i68, j33, i71, i73, j34, a7, c3, l, bool));
                            n73 = i7;
                            n49 = i49;
                            i46 = i6;
                            n71 = i5;
                        }
                        o2.close();
                        xlc.n();
                    } catch (Throwable th3) {
                        th = th3;
                        o2.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xlc = a5;
                    o2.close();
                    xlc.n();
                    throw th;
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        for (ru8 b6 : arrayList) {
            arrayList2.add(vlc.b(b6));
        }
        if (z) {
            Collections.reverse(arrayList2);
        }
        return arrayList2;
    }

    public final cu8 o(long j) {
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        vlc vlc = ((k24) this.a).c;
        t19 d2 = vlc.d();
        d2.getClass();
        xlc a2 = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND server_id > 0 AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
        ey8.m(a2, 1, j, d2);
        a2.j(2, (long) 10);
        a2.j(3, (long) 1);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "time");
            int n4 = tfg.n(o, "update_time");
            int n5 = tfg.n(o, "sender");
            int n6 = tfg.n(o, "cid");
            int n7 = tfg.n(o, "text");
            int n8 = tfg.n(o, "delivery_status");
            int n9 = tfg.n(o, "status");
            int n10 = tfg.n(o, "time_local");
            int n11 = tfg.n(o, "error");
            int n12 = tfg.n(o, "localized_error");
            vlc vlc2 = vlc;
            int n13 = tfg.n(o, "attaches");
            xlc = a2;
            try {
                int n14 = tfg.n(o, "media_type");
                int n15 = tfg.n(o, "detect_share");
                int n16 = tfg.n(o, "msg_link_type");
                int n17 = tfg.n(o, "msg_link_id");
                int n18 = tfg.n(o, "inserted_from_msg_link");
                int n19 = tfg.n(o, "msg_link_chat_id");
                int n20 = tfg.n(o, "msg_link_chat_name");
                int n21 = tfg.n(o, "msg_link_chat_link");
                int n22 = tfg.n(o, "msg_link_out_chat_id");
                int n23 = tfg.n(o, "msg_link_out_msg_id");
                int n24 = tfg.n(o, "type");
                int n25 = tfg.n(o, "chat_id");
                int n26 = tfg.n(o, "ttl");
                int n27 = tfg.n(o, "channel_views");
                int n28 = tfg.n(o, "channel_forwards");
                int n29 = tfg.n(o, "view_time");
                int n30 = tfg.n(o, "zoom");
                int n31 = tfg.n(o, "options");
                int n32 = tfg.n(o, "live_until");
                int n33 = tfg.n(o, "elements");
                int n34 = tfg.n(o, "reactions");
                int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                int i10 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(n);
                    long j3 = o.getLong(n2);
                    long j4 = o.getLong(n3);
                    long j5 = o.getLong(n4);
                    long j6 = o.getLong(n5);
                    long j7 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i11 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i11);
                    int i12 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i12);
                    long j8 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i10 = i2;
                    int i13 = n14;
                    int i14 = o.getInt(i13);
                    n14 = i13;
                    int i15 = n15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        n15 = i15;
                        i3 = n16;
                        z = true;
                    } else {
                        n15 = i15;
                        i3 = n16;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    n16 = i3;
                    int i17 = n17;
                    long j9 = o.getLong(i17);
                    n17 = i17;
                    int i18 = n18;
                    if (o.getInt(i18) != 0) {
                        n18 = i18;
                        i4 = n19;
                        z2 = true;
                    } else {
                        n18 = i18;
                        i4 = n19;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    n19 = i4;
                    int i19 = n20;
                    if (o.isNull(i19)) {
                        n20 = i19;
                        i5 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        n20 = i19;
                        i5 = n21;
                    }
                    if (o.isNull(i5)) {
                        n21 = i5;
                        i6 = n22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        n21 = i5;
                        i6 = n22;
                    }
                    long j11 = o.getLong(i6);
                    n22 = i6;
                    int i20 = n23;
                    long j12 = o.getLong(i20);
                    n23 = i20;
                    int i21 = n24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a3 = ey8.a(i22);
                    n24 = i21;
                    int i23 = n25;
                    long j13 = o.getLong(i23);
                    n25 = i23;
                    int i24 = n26;
                    int i25 = o.getInt(i24);
                    n26 = i24;
                    int i26 = n27;
                    int i27 = o.getInt(i26);
                    n27 = i26;
                    int i28 = n28;
                    int i29 = o.getInt(i28);
                    n28 = i28;
                    int i30 = n29;
                    long j14 = o.getLong(i30);
                    n29 = i30;
                    int i31 = n30;
                    int i32 = o.getInt(i31);
                    n30 = i31;
                    int i33 = n31;
                    int i34 = o.getInt(i33);
                    n31 = i33;
                    int i35 = n32;
                    long j15 = o.getLong(i35);
                    n32 = i35;
                    int i36 = n33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a4 = v89.a(blob2);
                    n33 = i36;
                    int i37 = n34;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = n11;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = n11;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i38 = n35;
                    if (o.isNull(i38)) {
                        i9 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = n36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        n35 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        n35 = i38;
                    }
                    arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string, n37, b2, j8, string2, str, b3, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, a3, j13, i25, i27, i29, j14, i32, i34, j15, a4, c2, l, bool));
                    n36 = i9;
                    n11 = i8;
                    n34 = i7;
                }
                o.close();
                xlc.n();
                ru8 ru8 = (ru8) x53.i0(arrayList);
                if (ru8 != null) {
                    return vlc2.b(ru8);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final cu8 p(long j, mg4 mg4) {
        vlc vlc;
        ArrayList<ru8> arrayList;
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j2 = j;
        vlc vlc2 = ((k24) this.a).c;
        vlc2.getClass();
        int ordinal = mg4.ordinal();
        if (ordinal == 0) {
            t19 d2 = vlc2.d();
            d2.getClass();
            xlc a2 = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC LIMIT ?");
            ey8.m(a2, 1, j2, d2);
            a2.j(2, (long) 10);
            a2.j(3, 1);
            ilc ilc = d2.a;
            ilc.b();
            Cursor o = ilc.o(a2, (CancellationSignal) null);
            try {
                int n = tfg.n(o, "id");
                int n2 = tfg.n(o, "server_id");
                int n3 = tfg.n(o, "time");
                int n4 = tfg.n(o, "update_time");
                int n5 = tfg.n(o, "sender");
                int n6 = tfg.n(o, "cid");
                int n7 = tfg.n(o, "text");
                int n8 = tfg.n(o, "delivery_status");
                int n9 = tfg.n(o, "status");
                int n10 = tfg.n(o, "time_local");
                int n11 = tfg.n(o, "error");
                int n12 = tfg.n(o, "localized_error");
                vlc = vlc2;
                int n13 = tfg.n(o, "attaches");
                xlc = a2;
                try {
                    int n14 = tfg.n(o, "media_type");
                    int n15 = tfg.n(o, "detect_share");
                    int n16 = tfg.n(o, "msg_link_type");
                    int n17 = tfg.n(o, "msg_link_id");
                    int n18 = tfg.n(o, "inserted_from_msg_link");
                    int n19 = tfg.n(o, "msg_link_chat_id");
                    int n20 = tfg.n(o, "msg_link_chat_name");
                    int n21 = tfg.n(o, "msg_link_chat_link");
                    int n22 = tfg.n(o, "msg_link_out_chat_id");
                    int n23 = tfg.n(o, "msg_link_out_msg_id");
                    int n24 = tfg.n(o, "type");
                    int n25 = tfg.n(o, "chat_id");
                    int n26 = tfg.n(o, "ttl");
                    int n27 = tfg.n(o, "channel_views");
                    int n28 = tfg.n(o, "channel_forwards");
                    int n29 = tfg.n(o, "view_time");
                    int n30 = tfg.n(o, "zoom");
                    int n31 = tfg.n(o, "options");
                    int n32 = tfg.n(o, "live_until");
                    int n33 = tfg.n(o, "elements");
                    int n34 = tfg.n(o, "reactions");
                    int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                    int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                    int i9 = n13;
                    ArrayList arrayList2 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j3 = o.getLong(n);
                        long j4 = o.getLong(n2);
                        long j5 = o.getLong(n3);
                        long j6 = o.getLong(n4);
                        long j7 = o.getLong(n5);
                        long j8 = o.getLong(n6);
                        String string = o.isNull(n7) ? null : o.getString(n7);
                        int i10 = o.getInt(n8);
                        d2.a().getClass();
                        iu8.b.getClass();
                        iu8 n37 = oz7.n(i10);
                        int i11 = o.getInt(n9);
                        d2.a().getClass();
                        vx8 b2 = v89.b(i11);
                        long j9 = o.getLong(n10);
                        String string2 = o.isNull(n11) ? null : o.getString(n11);
                        if (o.isNull(n12)) {
                            i2 = i9;
                            str = null;
                        } else {
                            str = o.getString(n12);
                            i2 = i9;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        k8g b3 = iz7.b(blob);
                        int i12 = n;
                        int i13 = n14;
                        int i14 = o.getInt(i13);
                        n14 = i13;
                        int i15 = n15;
                        int i16 = o.getInt(i15);
                        boolean z2 = false;
                        n15 = i15;
                        int i17 = n16;
                        boolean z3 = i16 != 0;
                        int i18 = o.getInt(i17);
                        int i19 = i17;
                        int i20 = n17;
                        long j10 = o.getLong(i20);
                        n17 = i20;
                        int i21 = n18;
                        if (o.getInt(i21) != 0) {
                            n18 = i21;
                            i3 = n19;
                            z = true;
                        } else {
                            n18 = i21;
                            i3 = n19;
                            z = false;
                        }
                        long j11 = o.getLong(i3);
                        n19 = i3;
                        int i22 = n20;
                        if (o.isNull(i22)) {
                            n20 = i22;
                            i4 = n21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i22);
                            n20 = i22;
                            i4 = n21;
                        }
                        if (o.isNull(i4)) {
                            n21 = i4;
                            i5 = n22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            n21 = i4;
                            i5 = n22;
                        }
                        long j12 = o.getLong(i5);
                        n22 = i5;
                        int i23 = n23;
                        long j13 = o.getLong(i23);
                        n23 = i23;
                        int i24 = n24;
                        int i25 = o.getInt(i24);
                        d2.a().getClass();
                        int a3 = ey8.a(i25);
                        n24 = i24;
                        int i26 = n25;
                        long j14 = o.getLong(i26);
                        n25 = i26;
                        int i27 = n26;
                        int i28 = o.getInt(i27);
                        n26 = i27;
                        int i29 = n27;
                        int i30 = o.getInt(i29);
                        n27 = i29;
                        int i31 = n28;
                        int i32 = o.getInt(i31);
                        n28 = i31;
                        int i33 = n29;
                        long j15 = o.getLong(i33);
                        n29 = i33;
                        int i34 = n30;
                        int i35 = o.getInt(i34);
                        n30 = i34;
                        int i36 = n31;
                        int i37 = o.getInt(i36);
                        n31 = i36;
                        int i38 = n32;
                        long j16 = o.getLong(i38);
                        n32 = i38;
                        int i39 = n33;
                        byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                        d2.a().getClass();
                        List a4 = v89.a(blob2);
                        n33 = i39;
                        int i40 = n34;
                        if (o.isNull(i40)) {
                            i6 = i40;
                            i7 = n10;
                            bArr = null;
                        } else {
                            i6 = i40;
                            bArr = o.getBlob(i40);
                            i7 = n10;
                        }
                        ix8 c2 = d2.a().c(bArr);
                        int i41 = n35;
                        if (o.isNull(i41)) {
                            i8 = n36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i41));
                            i8 = n36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            n35 = i41;
                            bool = null;
                        } else {
                            if (valueOf.intValue() != 0) {
                                z2 = true;
                            }
                            bool = Boolean.valueOf(z2);
                            n35 = i41;
                        }
                        arrayList2.add(new ru8(j3, j4, j5, j6, j7, j8, string, n37, b2, j9, string2, str, b3, i14, z3, i18, j10, z, j11, str2, str3, j12, j13, a3, j14, i28, i30, i32, j15, i35, i37, j16, a4, c2, l, bool));
                        n36 = i8;
                        n10 = i7;
                        n = i12;
                        n16 = i19;
                        n34 = i6;
                        i9 = i2;
                    }
                    o.close();
                    xlc.n();
                    arrayList = arrayList2;
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    xlc.n();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                xlc = a2;
                o.close();
                xlc.n();
                throw th;
            }
        } else if (ordinal == 1) {
            arrayList = t19.j(vlc2.d(), j2);
            vlc = vlc2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList, 10));
        for (ru8 b4 : arrayList) {
            arrayList3.add(vlc.b(b4));
        }
        return (cu8) x53.i0(arrayList3);
    }

    public final cu8 q(long j) {
        vlc vlc = ((k24) this.a).c;
        ru8 c2 = vlc.d().c(j);
        if (c2 != null) {
            return vlc.b(c2);
        }
        return null;
    }

    public final cu8 r(long j, long j2) {
        vlc vlc;
        ArrayList arrayList;
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        xlc xlc2;
        String str4;
        int i9;
        boolean z2;
        int i10;
        String str5;
        int i11;
        String str6;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Long l2;
        int i15;
        Boolean bool2;
        long j3 = j;
        long j4 = j2;
        mg4 mg4 = mg4.REGULAR;
        vlc vlc2 = ((k24) this.a).c;
        vlc2.getClass();
        int ordinal = mg4.ordinal();
        String str7 = "delayed_attrs_notify_sender";
        String str8 = "delayed_attrs_time_to_fire";
        String str9 = "reactions";
        String str10 = "elements";
        String str11 = "live_until";
        String str12 = "options";
        String str13 = "zoom";
        String str14 = "view_time";
        String str15 = "channel_forwards";
        String str16 = "channel_views";
        String str17 = "ttl";
        String str18 = "chat_id";
        String str19 = "type";
        String str20 = "msg_link_out_msg_id";
        String str21 = "msg_link_out_chat_id";
        String str22 = "msg_link_chat_link";
        String str23 = "msg_link_chat_name";
        String str24 = "msg_link_chat_id";
        String str25 = "inserted_from_msg_link";
        String str26 = "msg_link_id";
        String str27 = "msg_link_type";
        String str28 = "detect_share";
        String str29 = "media_type";
        String str30 = "attaches";
        String str31 = "localized_error";
        String str32 = "error";
        String str33 = "time_local";
        if (ordinal == 0) {
            vlc = vlc2;
            String str34 = str32;
            String str35 = str33;
            String str36 = str31;
            t19 d2 = vlc.d();
            d2.getClass();
            String str37 = str34;
            String str38 = str35;
            xlc a2 = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC LIMIT ?");
            a2.j(1, j3);
            ey8.m(a2, 2, j4, d2);
            a2.j(3, (long) 10);
            a2.j(4, (long) 1);
            ilc ilc = d2.a;
            ilc.b();
            Cursor o = ilc.o(a2, (CancellationSignal) null);
            try {
                int n = tfg.n(o, "id");
                int n2 = tfg.n(o, "server_id");
                int n3 = tfg.n(o, "time");
                int n4 = tfg.n(o, "update_time");
                int n5 = tfg.n(o, "sender");
                int n6 = tfg.n(o, "cid");
                int n7 = tfg.n(o, "text");
                int n8 = tfg.n(o, "delivery_status");
                int n9 = tfg.n(o, "status");
                int n10 = tfg.n(o, str38);
                int n11 = tfg.n(o, str37);
                int n12 = tfg.n(o, str36);
                int n13 = tfg.n(o, str30);
                xlc = a2;
                try {
                    int n14 = tfg.n(o, str29);
                    int n15 = tfg.n(o, str28);
                    int n16 = tfg.n(o, str27);
                    int n17 = tfg.n(o, str26);
                    int n18 = tfg.n(o, str25);
                    int n19 = tfg.n(o, str24);
                    int n20 = tfg.n(o, str23);
                    int n21 = tfg.n(o, str22);
                    int n22 = tfg.n(o, str21);
                    int n23 = tfg.n(o, str20);
                    int n24 = tfg.n(o, str19);
                    int n25 = tfg.n(o, str18);
                    int n26 = tfg.n(o, str17);
                    int n27 = tfg.n(o, str16);
                    int n28 = tfg.n(o, str15);
                    int n29 = tfg.n(o, str14);
                    int n30 = tfg.n(o, str13);
                    int n31 = tfg.n(o, str12);
                    int n32 = tfg.n(o, str11);
                    int n33 = tfg.n(o, str10);
                    int n34 = tfg.n(o, str9);
                    int n35 = tfg.n(o, str8);
                    int n36 = tfg.n(o, str7);
                    int i16 = n13;
                    arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        long j5 = o.getLong(n);
                        long j6 = o.getLong(n2);
                        long j7 = o.getLong(n3);
                        long j8 = o.getLong(n4);
                        long j9 = o.getLong(n5);
                        long j10 = o.getLong(n6);
                        String string = o.isNull(n7) ? null : o.getString(n7);
                        int i17 = o.getInt(n8);
                        d2.a().getClass();
                        iu8.b.getClass();
                        iu8 n37 = oz7.n(i17);
                        int i18 = o.getInt(n9);
                        d2.a().getClass();
                        vx8 b2 = v89.b(i18);
                        long j11 = o.getLong(n10);
                        String string2 = o.isNull(n11) ? null : o.getString(n11);
                        if (o.isNull(n12)) {
                            i2 = i16;
                            str = null;
                        } else {
                            str = o.getString(n12);
                            i2 = i16;
                        }
                        byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                        d2.a().getClass();
                        k8g b3 = iz7.b(blob);
                        int i19 = n;
                        int i20 = n14;
                        int i21 = o.getInt(i20);
                        n14 = i20;
                        int i22 = n15;
                        n15 = i22;
                        boolean z3 = o.getInt(i22) != 0;
                        int i23 = n16;
                        int i24 = o.getInt(i23);
                        n16 = i23;
                        int i25 = n17;
                        long j12 = o.getLong(i25);
                        n17 = i25;
                        int i26 = n18;
                        if (o.getInt(i26) != 0) {
                            n18 = i26;
                            i3 = n19;
                            z = true;
                        } else {
                            n18 = i26;
                            i3 = n19;
                            z = false;
                        }
                        long j13 = o.getLong(i3);
                        n19 = i3;
                        int i27 = n20;
                        if (o.isNull(i27)) {
                            n20 = i27;
                            i4 = n21;
                            str2 = null;
                        } else {
                            str2 = o.getString(i27);
                            n20 = i27;
                            i4 = n21;
                        }
                        if (o.isNull(i4)) {
                            n21 = i4;
                            i5 = n22;
                            str3 = null;
                        } else {
                            str3 = o.getString(i4);
                            n21 = i4;
                            i5 = n22;
                        }
                        long j14 = o.getLong(i5);
                        n22 = i5;
                        int i28 = n23;
                        long j15 = o.getLong(i28);
                        n23 = i28;
                        int i29 = n24;
                        int i30 = o.getInt(i29);
                        d2.a().getClass();
                        int a3 = ey8.a(i30);
                        n24 = i29;
                        int i31 = n25;
                        long j16 = o.getLong(i31);
                        n25 = i31;
                        int i32 = n26;
                        int i33 = o.getInt(i32);
                        n26 = i32;
                        int i34 = n27;
                        int i35 = o.getInt(i34);
                        n27 = i34;
                        int i36 = n28;
                        int i37 = o.getInt(i36);
                        n28 = i36;
                        int i38 = n29;
                        long j17 = o.getLong(i38);
                        n29 = i38;
                        int i39 = n30;
                        int i40 = o.getInt(i39);
                        n30 = i39;
                        int i41 = n31;
                        int i42 = o.getInt(i41);
                        n31 = i41;
                        int i43 = n32;
                        long j18 = o.getLong(i43);
                        n32 = i43;
                        int i44 = n33;
                        byte[] blob2 = o.isNull(i44) ? null : o.getBlob(i44);
                        d2.a().getClass();
                        List a4 = v89.a(blob2);
                        n33 = i44;
                        int i45 = n34;
                        if (o.isNull(i45)) {
                            i6 = i45;
                            i7 = n12;
                            bArr = null;
                        } else {
                            i6 = i45;
                            bArr = o.getBlob(i45);
                            i7 = n12;
                        }
                        ix8 c2 = d2.a().c(bArr);
                        int i46 = n35;
                        if (o.isNull(i46)) {
                            i8 = n36;
                            l = null;
                        } else {
                            l = Long.valueOf(o.getLong(i46));
                            i8 = n36;
                        }
                        Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                        if (valueOf == null) {
                            n35 = i46;
                            bool = null;
                        } else {
                            n35 = i46;
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        }
                        arrayList.add(new ru8(j5, j6, j7, j8, j9, j10, string, n37, b2, j11, string2, str, b3, i21, z3, i24, j12, z, j13, str2, str3, j14, j15, a3, j16, i33, i35, i37, j17, i40, i42, j18, a4, c2, l, bool));
                        n36 = i8;
                        n12 = i7;
                        n = i19;
                        n34 = i6;
                        i16 = i2;
                    }
                    o.close();
                    xlc.n();
                } catch (Throwable th) {
                    th = th;
                    o.close();
                    xlc.n();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                xlc = a2;
                o.close();
                xlc.n();
                throw th;
            }
        } else if (ordinal == 1) {
            t19 d3 = vlc2.d();
            d3.getClass();
            vlc = vlc2;
            String str39 = "status";
            xlc a5 = xlc.a(4, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY time ASC LIMIT ?");
            a5.j(1, j3);
            ey8.m(a5, 2, j4, d3);
            a5.j(3, (long) 10);
            a5.j(4, (long) 1);
            ilc ilc2 = d3.a;
            ilc2.b();
            Cursor o2 = ilc2.o(a5, (CancellationSignal) null);
            try {
                int n38 = tfg.n(o2, "id");
                int n39 = tfg.n(o2, "server_id");
                int n40 = tfg.n(o2, "time");
                int n41 = tfg.n(o2, "update_time");
                int n42 = tfg.n(o2, "sender");
                int n43 = tfg.n(o2, "cid");
                int n44 = tfg.n(o2, "text");
                int n45 = tfg.n(o2, "delivery_status");
                int n46 = tfg.n(o2, str39);
                int n47 = tfg.n(o2, str33);
                int n48 = tfg.n(o2, str32);
                int n49 = tfg.n(o2, str31);
                int n50 = tfg.n(o2, str30);
                xlc2 = a5;
                try {
                    int n51 = tfg.n(o2, str29);
                    int n52 = tfg.n(o2, str28);
                    int n53 = tfg.n(o2, str27);
                    int n54 = tfg.n(o2, str26);
                    int n55 = tfg.n(o2, str25);
                    int n56 = tfg.n(o2, str24);
                    int n57 = tfg.n(o2, str23);
                    int n58 = tfg.n(o2, str22);
                    int n59 = tfg.n(o2, str21);
                    int n60 = tfg.n(o2, str20);
                    int n61 = tfg.n(o2, str19);
                    int n62 = tfg.n(o2, str18);
                    int n63 = tfg.n(o2, str17);
                    int n64 = tfg.n(o2, str16);
                    int n65 = tfg.n(o2, str15);
                    int n66 = tfg.n(o2, str14);
                    int n67 = tfg.n(o2, str13);
                    int n68 = tfg.n(o2, str12);
                    int n69 = tfg.n(o2, str11);
                    int n70 = tfg.n(o2, str10);
                    int n71 = tfg.n(o2, str9);
                    int n72 = tfg.n(o2, str8);
                    int n73 = tfg.n(o2, str7);
                    int i47 = n50;
                    arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        long j19 = o2.getLong(n38);
                        long j20 = o2.getLong(n39);
                        long j21 = o2.getLong(n40);
                        long j22 = o2.getLong(n41);
                        long j23 = o2.getLong(n42);
                        long j24 = o2.getLong(n43);
                        String string3 = o2.isNull(n44) ? null : o2.getString(n44);
                        int i48 = o2.getInt(n45);
                        d3.a().getClass();
                        iu8.b.getClass();
                        iu8 n74 = oz7.n(i48);
                        int i49 = o2.getInt(n46);
                        d3.a().getClass();
                        vx8 b4 = v89.b(i49);
                        long j25 = o2.getLong(n47);
                        String string4 = o2.isNull(n48) ? null : o2.getString(n48);
                        if (o2.isNull(n49)) {
                            i9 = i47;
                            str4 = null;
                        } else {
                            str4 = o2.getString(n49);
                            i9 = i47;
                        }
                        byte[] blob3 = o2.isNull(i9) ? null : o2.getBlob(i9);
                        d3.a().getClass();
                        k8g b5 = iz7.b(blob3);
                        int i50 = n38;
                        int i51 = n51;
                        int i52 = o2.getInt(i51);
                        n51 = i51;
                        int i53 = n52;
                        n52 = i53;
                        boolean z4 = o2.getInt(i53) != 0;
                        int i54 = n53;
                        int i55 = o2.getInt(i54);
                        n53 = i54;
                        int i56 = n54;
                        long j26 = o2.getLong(i56);
                        n54 = i56;
                        int i57 = n55;
                        if (o2.getInt(i57) != 0) {
                            n55 = i57;
                            i10 = n56;
                            z2 = true;
                        } else {
                            n55 = i57;
                            i10 = n56;
                            z2 = false;
                        }
                        long j27 = o2.getLong(i10);
                        n56 = i10;
                        int i58 = n57;
                        if (o2.isNull(i58)) {
                            n57 = i58;
                            i11 = n58;
                            str5 = null;
                        } else {
                            str5 = o2.getString(i58);
                            n57 = i58;
                            i11 = n58;
                        }
                        if (o2.isNull(i11)) {
                            n58 = i11;
                            i12 = n59;
                            str6 = null;
                        } else {
                            str6 = o2.getString(i11);
                            n58 = i11;
                            i12 = n59;
                        }
                        long j28 = o2.getLong(i12);
                        n59 = i12;
                        int i59 = n60;
                        long j29 = o2.getLong(i59);
                        n60 = i59;
                        int i60 = n61;
                        int i61 = o2.getInt(i60);
                        d3.a().getClass();
                        int a6 = ey8.a(i61);
                        n61 = i60;
                        int i62 = n62;
                        long j30 = o2.getLong(i62);
                        n62 = i62;
                        int i63 = n63;
                        int i64 = o2.getInt(i63);
                        n63 = i63;
                        int i65 = n64;
                        int i66 = o2.getInt(i65);
                        n64 = i65;
                        int i67 = n65;
                        int i68 = o2.getInt(i67);
                        n65 = i67;
                        int i69 = n66;
                        long j31 = o2.getLong(i69);
                        n66 = i69;
                        int i70 = n67;
                        int i71 = o2.getInt(i70);
                        n67 = i70;
                        int i72 = n68;
                        int i73 = o2.getInt(i72);
                        n68 = i72;
                        int i74 = n69;
                        long j32 = o2.getLong(i74);
                        n69 = i74;
                        int i75 = n70;
                        byte[] blob4 = o2.isNull(i75) ? null : o2.getBlob(i75);
                        d3.a().getClass();
                        List a7 = v89.a(blob4);
                        n70 = i75;
                        int i76 = n71;
                        if (o2.isNull(i76)) {
                            i13 = i76;
                            i14 = n39;
                            bArr2 = null;
                        } else {
                            i13 = i76;
                            bArr2 = o2.getBlob(i76);
                            i14 = n39;
                        }
                        ix8 c3 = d3.a().c(bArr2);
                        int i77 = n72;
                        if (o2.isNull(i77)) {
                            i15 = n73;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o2.getLong(i77));
                            i15 = n73;
                        }
                        Integer valueOf2 = o2.isNull(i15) ? null : Integer.valueOf(o2.getInt(i15));
                        if (valueOf2 == null) {
                            n72 = i77;
                            bool2 = null;
                        } else {
                            n72 = i77;
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        arrayList.add(new ru8(j19, j20, j21, j22, j23, j24, string3, n74, b4, j25, string4, str4, b5, i52, z4, i55, j26, z2, j27, str5, str6, j28, j29, a6, j30, i64, i66, i68, j31, i71, i73, j32, a7, c3, l2, bool2));
                        n73 = i15;
                        n39 = i14;
                        n38 = i50;
                        n71 = i13;
                        i47 = i9;
                    }
                    o2.close();
                    xlc2.n();
                } catch (Throwable th3) {
                    th = th3;
                    o2.close();
                    xlc2.n();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                xlc2 = a5;
                o2.close();
                xlc2.n();
                throw th;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ru8 ru8 = (ru8) x53.i0(arrayList);
        if (ru8 != null) {
            return vlc.b(ru8);
        }
        return null;
    }

    public final ArrayList s() {
        xlc xlc;
        String str;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        String str2;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool;
        oz7 oz7 = iu8.b;
        vlc vlc = ((k24) this.a).c;
        t19 d2 = vlc.d();
        d2.getClass();
        xlc a2 = xlc.a(2, "SELECT * FROM messages WHERE delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        d2.a().getClass();
        long j = (long) 10;
        ey8.m(a2, 1, j, d2);
        a2.j(2, j);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "server_id");
            int n3 = tfg.n(o, "time");
            int n4 = tfg.n(o, "update_time");
            int n5 = tfg.n(o, "sender");
            int n6 = tfg.n(o, "cid");
            int n7 = tfg.n(o, "text");
            int n8 = tfg.n(o, "delivery_status");
            int n9 = tfg.n(o, "status");
            int n10 = tfg.n(o, "time_local");
            int n11 = tfg.n(o, "error");
            int n12 = tfg.n(o, "localized_error");
            vlc vlc2 = vlc;
            int n13 = tfg.n(o, "attaches");
            xlc = a2;
            try {
                int n14 = tfg.n(o, "media_type");
                int n15 = tfg.n(o, "detect_share");
                int n16 = tfg.n(o, "msg_link_type");
                int n17 = tfg.n(o, "msg_link_id");
                int n18 = tfg.n(o, "inserted_from_msg_link");
                int n19 = tfg.n(o, "msg_link_chat_id");
                int n20 = tfg.n(o, "msg_link_chat_name");
                int n21 = tfg.n(o, "msg_link_chat_link");
                int n22 = tfg.n(o, "msg_link_out_chat_id");
                int n23 = tfg.n(o, "msg_link_out_msg_id");
                int n24 = tfg.n(o, "type");
                int n25 = tfg.n(o, "chat_id");
                int n26 = tfg.n(o, "ttl");
                int n27 = tfg.n(o, "channel_views");
                int n28 = tfg.n(o, "channel_forwards");
                int n29 = tfg.n(o, "view_time");
                int n30 = tfg.n(o, "zoom");
                int n31 = tfg.n(o, "options");
                int n32 = tfg.n(o, "live_until");
                int n33 = tfg.n(o, "elements");
                int n34 = tfg.n(o, "reactions");
                int n35 = tfg.n(o, "delayed_attrs_time_to_fire");
                int n36 = tfg.n(o, "delayed_attrs_notify_sender");
                int i10 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j2 = o.getLong(n);
                    long j3 = o.getLong(n2);
                    long j4 = o.getLong(n3);
                    long j5 = o.getLong(n4);
                    long j6 = o.getLong(n5);
                    long j7 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i11 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i11);
                    int i12 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i12);
                    long j8 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i2 = i10;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i2 = i10;
                    }
                    byte[] blob = o.isNull(i2) ? null : o.getBlob(i2);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i10 = i2;
                    int i13 = n14;
                    int i14 = o.getInt(i13);
                    n14 = i13;
                    int i15 = n15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        n15 = i15;
                        i3 = n16;
                        z = true;
                    } else {
                        n15 = i15;
                        i3 = n16;
                        z = false;
                    }
                    int i16 = o.getInt(i3);
                    n16 = i3;
                    int i17 = n17;
                    long j9 = o.getLong(i17);
                    n17 = i17;
                    int i18 = n18;
                    if (o.getInt(i18) != 0) {
                        n18 = i18;
                        i4 = n19;
                        z2 = true;
                    } else {
                        n18 = i18;
                        i4 = n19;
                        z2 = false;
                    }
                    long j10 = o.getLong(i4);
                    n19 = i4;
                    int i19 = n20;
                    if (o.isNull(i19)) {
                        n20 = i19;
                        i5 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        n20 = i19;
                        i5 = n21;
                    }
                    if (o.isNull(i5)) {
                        n21 = i5;
                        i6 = n22;
                        str3 = null;
                    } else {
                        str3 = o.getString(i5);
                        n21 = i5;
                        i6 = n22;
                    }
                    long j11 = o.getLong(i6);
                    n22 = i6;
                    int i20 = n23;
                    long j12 = o.getLong(i20);
                    n23 = i20;
                    int i21 = n24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a3 = ey8.a(i22);
                    n24 = i21;
                    int i23 = n25;
                    long j13 = o.getLong(i23);
                    n25 = i23;
                    int i24 = n26;
                    int i25 = o.getInt(i24);
                    n26 = i24;
                    int i26 = n27;
                    int i27 = o.getInt(i26);
                    n27 = i26;
                    int i28 = n28;
                    int i29 = o.getInt(i28);
                    n28 = i28;
                    int i30 = n29;
                    long j14 = o.getLong(i30);
                    n29 = i30;
                    int i31 = n30;
                    int i32 = o.getInt(i31);
                    n30 = i31;
                    int i33 = n31;
                    int i34 = o.getInt(i33);
                    n31 = i33;
                    int i35 = n32;
                    long j15 = o.getLong(i35);
                    n32 = i35;
                    int i36 = n33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a4 = v89.a(blob2);
                    n33 = i36;
                    int i37 = n34;
                    if (o.isNull(i37)) {
                        i7 = i37;
                        i8 = n12;
                        bArr = null;
                    } else {
                        i7 = i37;
                        bArr = o.getBlob(i37);
                        i8 = n12;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i38 = n35;
                    if (o.isNull(i38)) {
                        i9 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i9 = n36;
                    }
                    Integer valueOf = o.isNull(i9) ? null : Integer.valueOf(o.getInt(i9));
                    if (valueOf == null) {
                        n35 = i38;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                        n35 = i38;
                    }
                    arrayList.add(new ru8(j2, j3, j4, j5, j6, j7, string, n37, b2, j8, string2, str, b3, i14, z, i16, j9, z2, j10, str2, str3, j11, j12, a3, j13, i25, i27, i29, j14, i32, i34, j15, a4, c2, l, bool));
                    n36 = i9;
                    n12 = i8;
                    n34 = i7;
                }
                o.close();
                xlc.n();
                ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vlc2.b((ru8) it.next()));
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final cu8 t(cu8 cu8, String str, qj3 qj3) {
        w4d w4d = cqc.a;
        cqc.a(new wt8(this, cu8, str, qj3), (ztc) w4d.b, (f6) null, new m82(str, 3), (ztc) null);
        try {
            m20 C = cu8.z0.C();
            tpa.K(C, str, qj3);
            bu8 H = cu8.H();
            H.n = C.c();
            return H.a();
        } catch (Throwable unused) {
            hm9.p("au8", "Can't update attach localId = " + str, (Throwable) null);
            return cu8;
        }
    }

    public final es8 u(cu8 cu8, String str, d20 d20) {
        cu8 t = t(cu8, str, new y98((Object) this, 11, (Object) d20));
        zu8 zu8 = (zu8) this.g.get();
        cu8 a2 = t.H().a();
        zu8.getClass();
        return zu8.a(zu8, a2);
    }

    public final void v(long j, String str, qj3 qj3) {
        ((k24) this.a).c.n(j, new y98((Object) str, 10, (Object) qj3));
    }

    public final void w(cu8 cu8, k8g k8g) {
        ((k24) this.a).c.n(cu8.b, new xt8(cu8, k8g, 0));
    }

    public final void x(cu8 cu8, iu8 iu8) {
        k24 k24 = (k24) this.a;
        vlc vlc = k24.c;
        vlc.d().n(cu8.b, iu8);
        if (iu8 == iu8.ERROR && cu8.n()) {
            k24.c.n(cu8.b, new yt8(0, (Object) this));
        }
    }

    public final void y(long j, long j2, vx8 vx8) {
        t19 d2 = ((k24) this.a).c.d();
        ilc ilc = d2.a;
        ilc.b();
        th thVar = d2.l;
        q36 f2 = thVar.f();
        d2.a().getClass();
        f2.j(1, (long) vx8.a);
        f2.j(2, j);
        f2.j(3, j2);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            thVar.t(f2);
        } catch (Throwable th) {
            thVar.t(f2);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void z(long j, String str, List list, p82 p82, vx8 vx8) {
        t19 d2 = ((k24) this.a).c.d();
        r6f r6f = new r6f(j, str, list, vx8);
        ilc ilc = d2.a;
        ilc.b();
        ilc.c();
        try {
            d2.f.B(r6f);
            ilc.r();
            ilc.l();
            cu8 q = q(j);
            if (q != null) {
                this.f.b(p82.C(q.t0), q);
            }
        } catch (Throwable th) {
            ilc.l();
            throw th;
        }
    }
}
