package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: t19  reason: default package */
public final class t19 {
    public final ilc a;
    public final ct2 b;
    public v89 c;
    public final s19 d;
    public final s19 e;
    public final s19 f;
    public final p19 g;
    public final p19 h;
    public final th i;
    public final th j;
    public final th k;
    public final th l;
    public final p19 m;
    public final p19 n;
    public final p19 o;
    public final p19 p;
    public final p19 q;
    public final p19 r;
    public final p19 s;
    public final p19 t;

    public t19(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ct2(this, oneMeRoomDatabase, 1);
        this.d = new s19(this, oneMeRoomDatabase, 0);
        new s19(this, oneMeRoomDatabase, 1);
        new ha4(oneMeRoomDatabase, 1);
        this.e = new s19(this, oneMeRoomDatabase, 2);
        new ha4(oneMeRoomDatabase, 2);
        this.f = new s19(this, oneMeRoomDatabase, 3);
        this.g = new p19(oneMeRoomDatabase, 10);
        this.h = new p19(oneMeRoomDatabase, 11);
        this.i = new th(oneMeRoomDatabase, 26);
        this.j = new th(oneMeRoomDatabase, 27);
        this.k = new th(oneMeRoomDatabase, 28);
        this.l = new th(oneMeRoomDatabase, 29);
        this.m = new p19(oneMeRoomDatabase, 0);
        new p19(oneMeRoomDatabase, 1);
        this.n = new p19(oneMeRoomDatabase, 2);
        this.o = new p19(oneMeRoomDatabase, 3);
        this.p = new p19(oneMeRoomDatabase, 4);
        this.q = new p19(oneMeRoomDatabase, 5);
        this.r = new p19(oneMeRoomDatabase, 6);
        this.s = new p19(oneMeRoomDatabase, 7);
        this.t = new p19(oneMeRoomDatabase, 8);
        new p19(oneMeRoomDatabase, 9);
    }

    public static yw8 g(t19 t19, ru8 ru8, yw8 yw8, long j2, Long l2, Long l3, int i2) {
        String str;
        ru8 ru82 = ru8;
        yw8 yw82 = yw8;
        Long l4 = null;
        Long l5 = (i2 & 8) != 0 ? null : l2;
        if ((i2 & 16) == 0) {
            l4 = l3;
        }
        String str2 = yw82.h;
        String str3 = ((str2 != null && str2.length() != 0) || (str = ru82.g) == null || str.length() == 0) ? str2 : str;
        long j3 = yw82.l;
        if (j3 == 0) {
            j3 = ru82.q;
        }
        long j4 = j3;
        int i3 = yw82.k;
        if (i3 == 0) {
            i3 = ru82.p;
        }
        int i4 = i3;
        long j5 = yw82.n;
        if (j5 == 0) {
            j5 = ru82.s;
        }
        long j6 = j5;
        String str4 = yw82.p;
        if (str4 == null) {
            str4 = ru82.u;
        }
        String str5 = str4;
        String str6 = yw82.o;
        if (str6 == null) {
            str6 = ru82.t;
        }
        String str7 = str6;
        ix8 ix8 = yw82.j;
        if (ix8 == null) {
            ix8 = ru82.G;
        }
        return new yw8(ru82.a, l5 != null ? l5.longValue() : yw82.b, yw82.c, j2, yw82.e, yw82.f, l4 != null ? l4.longValue() : yw82.g, str3, yw82.i, ix8, i4, j4, ru82.r && yw82.m, j6, str7, str5, yw82.q, yw82.r, yw82.s, yw82.t, yw82.u, yw82.v, yw82.w, yw82.x, yw82.y);
    }

    public static ArrayList j(t19 t19, long j2) {
        xlc xlc;
        boolean z;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        Long l2;
        int i7;
        Boolean bool;
        t19 t192 = t19;
        t19.getClass();
        xlc a2 = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
        ey8.m(a2, 1, j2, t192);
        a2.j(2, (long) 10);
        a2.j(3, 1);
        ilc ilc = t192.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            int n2 = tfg.n(o2, "id");
            int n3 = tfg.n(o2, "server_id");
            int n4 = tfg.n(o2, "time");
            int n5 = tfg.n(o2, "update_time");
            int n6 = tfg.n(o2, "sender");
            int n7 = tfg.n(o2, "cid");
            int n8 = tfg.n(o2, "text");
            int n9 = tfg.n(o2, "delivery_status");
            int n10 = tfg.n(o2, "status");
            int n11 = tfg.n(o2, "time_local");
            int n12 = tfg.n(o2, "error");
            int n13 = tfg.n(o2, "localized_error");
            int n14 = tfg.n(o2, "attaches");
            int n15 = tfg.n(o2, "media_type");
            xlc = a2;
            try {
                int n16 = tfg.n(o2, "detect_share");
                int n17 = tfg.n(o2, "msg_link_type");
                int n18 = tfg.n(o2, "msg_link_id");
                int n19 = tfg.n(o2, "inserted_from_msg_link");
                int n20 = tfg.n(o2, "msg_link_chat_id");
                int n21 = tfg.n(o2, "msg_link_chat_name");
                int n22 = tfg.n(o2, "msg_link_chat_link");
                int n23 = tfg.n(o2, "msg_link_out_chat_id");
                int n24 = tfg.n(o2, "msg_link_out_msg_id");
                int n25 = tfg.n(o2, "type");
                int n26 = tfg.n(o2, "chat_id");
                int n27 = tfg.n(o2, "ttl");
                int n28 = tfg.n(o2, "channel_views");
                int n29 = tfg.n(o2, "channel_forwards");
                int n30 = tfg.n(o2, "view_time");
                int n31 = tfg.n(o2, "zoom");
                int n32 = tfg.n(o2, "options");
                int n33 = tfg.n(o2, "live_until");
                int n34 = tfg.n(o2, "elements");
                int n35 = tfg.n(o2, "reactions");
                int n36 = tfg.n(o2, "delayed_attrs_time_to_fire");
                int n37 = tfg.n(o2, "delayed_attrs_notify_sender");
                int i8 = n15;
                ArrayList arrayList = new ArrayList(o2.getCount());
                while (o2.moveToNext()) {
                    long j3 = o2.getLong(n2);
                    long j4 = o2.getLong(n3);
                    long j5 = o2.getLong(n4);
                    long j6 = o2.getLong(n5);
                    long j7 = o2.getLong(n6);
                    long j8 = o2.getLong(n7);
                    String string = o2.isNull(n8) ? null : o2.getString(n8);
                    int i9 = o2.getInt(n9);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n38 = oz7.n(i9);
                    int i10 = o2.getInt(n10);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i10);
                    long j9 = o2.getLong(n11);
                    String string2 = o2.isNull(n12) ? null : o2.getString(n12);
                    String string3 = o2.isNull(n13) ? null : o2.getString(n13);
                    byte[] blob = o2.isNull(n14) ? null : o2.getBlob(n14);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i11 = i8;
                    int i12 = o2.getInt(i11);
                    i8 = i11;
                    int i13 = n16;
                    int i14 = o2.getInt(i13);
                    boolean z2 = false;
                    n16 = i13;
                    int i15 = n17;
                    boolean z3 = i14 != 0;
                    int i16 = o2.getInt(i15);
                    int i17 = i15;
                    int i18 = n18;
                    long j10 = o2.getLong(i18);
                    n18 = i18;
                    int i19 = n19;
                    if (o2.getInt(i19) != 0) {
                        n19 = i19;
                        i2 = n20;
                        z = true;
                    } else {
                        n19 = i19;
                        i2 = n20;
                        z = false;
                    }
                    long j11 = o2.getLong(i2);
                    n20 = i2;
                    int i20 = n21;
                    if (o2.isNull(i20)) {
                        n21 = i20;
                        i3 = n22;
                        str = null;
                    } else {
                        str = o2.getString(i20);
                        n21 = i20;
                        i3 = n22;
                    }
                    if (o2.isNull(i3)) {
                        n22 = i3;
                        i4 = n23;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i3);
                        n22 = i3;
                        i4 = n23;
                    }
                    long j12 = o2.getLong(i4);
                    n23 = i4;
                    int i21 = n24;
                    long j13 = o2.getLong(i21);
                    n24 = i21;
                    int i22 = n25;
                    int i23 = o2.getInt(i22);
                    t19.a().getClass();
                    int a3 = ey8.a(i23);
                    n25 = i22;
                    int i24 = n26;
                    long j14 = o2.getLong(i24);
                    n26 = i24;
                    int i25 = n27;
                    int i26 = o2.getInt(i25);
                    n27 = i25;
                    int i27 = n28;
                    int i28 = o2.getInt(i27);
                    n28 = i27;
                    int i29 = n29;
                    int i30 = o2.getInt(i29);
                    n29 = i29;
                    int i31 = n30;
                    long j15 = o2.getLong(i31);
                    n30 = i31;
                    int i32 = n31;
                    int i33 = o2.getInt(i32);
                    n31 = i32;
                    int i34 = n32;
                    int i35 = o2.getInt(i34);
                    n32 = i34;
                    int i36 = n33;
                    long j16 = o2.getLong(i36);
                    n33 = i36;
                    int i37 = n34;
                    byte[] blob2 = o2.isNull(i37) ? null : o2.getBlob(i37);
                    t19.a().getClass();
                    List a4 = v89.a(blob2);
                    n34 = i37;
                    int i38 = n35;
                    if (o2.isNull(i38)) {
                        i5 = i38;
                        i6 = n13;
                        bArr = null;
                    } else {
                        i5 = i38;
                        bArr = o2.getBlob(i38);
                        i6 = n13;
                    }
                    ix8 c2 = t19.a().c(bArr);
                    int i39 = n36;
                    if (o2.isNull(i39)) {
                        i7 = n37;
                        l2 = null;
                    } else {
                        l2 = Long.valueOf(o2.getLong(i39));
                        i7 = n37;
                    }
                    Integer valueOf = o2.isNull(i7) ? null : Integer.valueOf(o2.getInt(i7));
                    if (valueOf == null) {
                        n36 = i39;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n36 = i39;
                    }
                    arrayList.add(new ru8(j3, j4, j5, j6, j7, j8, string, n38, b2, j9, string2, string3, b3, i12, z3, i16, j10, z, j11, str, str2, j12, j13, a3, j14, i26, i28, i30, j15, i33, i35, j16, a4, c2, l2, bool));
                    n37 = i7;
                    n13 = i6;
                    n17 = i17;
                    n35 = i5;
                }
                o2.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o2.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o2.close();
            xlc.n();
            throw th;
        }
    }

    public final synchronized v89 a() {
        try {
            if (this.c == null) {
                this.c = (v89) this.a.l.get(v89.class);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.c;
    }

    public final ru8 b(long j2, long j3) {
        xlc xlc;
        ru8 ru8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        xlc a2 = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        ilc ilc = this.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            int n2 = tfg.n(o2, "id");
            int n3 = tfg.n(o2, "server_id");
            int n4 = tfg.n(o2, "time");
            int n5 = tfg.n(o2, "update_time");
            int n6 = tfg.n(o2, "sender");
            int n7 = tfg.n(o2, "cid");
            int n8 = tfg.n(o2, "text");
            int n9 = tfg.n(o2, "delivery_status");
            int n10 = tfg.n(o2, "status");
            int n11 = tfg.n(o2, "time_local");
            int n12 = tfg.n(o2, "error");
            int n13 = tfg.n(o2, "localized_error");
            int n14 = tfg.n(o2, "attaches");
            int n15 = tfg.n(o2, "media_type");
            xlc = a2;
            try {
                int n16 = tfg.n(o2, "detect_share");
                int n17 = tfg.n(o2, "msg_link_type");
                int n18 = tfg.n(o2, "msg_link_id");
                int n19 = tfg.n(o2, "inserted_from_msg_link");
                int n20 = tfg.n(o2, "msg_link_chat_id");
                int n21 = tfg.n(o2, "msg_link_chat_name");
                int n22 = tfg.n(o2, "msg_link_chat_link");
                int n23 = tfg.n(o2, "msg_link_out_chat_id");
                int n24 = tfg.n(o2, "msg_link_out_msg_id");
                int n25 = tfg.n(o2, "type");
                int n26 = tfg.n(o2, "chat_id");
                int n27 = tfg.n(o2, "ttl");
                int n28 = tfg.n(o2, "channel_views");
                int n29 = tfg.n(o2, "channel_forwards");
                int n30 = tfg.n(o2, "view_time");
                int n31 = tfg.n(o2, "zoom");
                int n32 = tfg.n(o2, "options");
                int n33 = tfg.n(o2, "live_until");
                int n34 = tfg.n(o2, "elements");
                int n35 = tfg.n(o2, "reactions");
                int n36 = tfg.n(o2, "delayed_attrs_time_to_fire");
                int n37 = tfg.n(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(n2);
                    long j5 = o2.getLong(n3);
                    long j6 = o2.getLong(n4);
                    long j7 = o2.getLong(n5);
                    long j8 = o2.getLong(n6);
                    long j9 = o2.getLong(n7);
                    String string = o2.isNull(n8) ? null : o2.getString(n8);
                    int i6 = o2.getInt(n9);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 n38 = oz7.n(i6);
                    int i7 = o2.getInt(n10);
                    a().getClass();
                    vx8 b2 = v89.b(i7);
                    long j10 = o2.getLong(n11);
                    String string2 = o2.isNull(n12) ? null : o2.getString(n12);
                    String string3 = o2.isNull(n13) ? null : o2.getString(n13);
                    byte[] blob = o2.isNull(n14) ? null : o2.getBlob(n14);
                    a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i8 = o2.getInt(n15);
                    if (o2.getInt(n16) != 0) {
                        i2 = n17;
                        z = true;
                    } else {
                        i2 = n17;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(n18);
                    if (o2.getInt(n19) != 0) {
                        i3 = n20;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = n20;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = n21;
                    if (o2.isNull(i10)) {
                        i4 = n22;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = n22;
                    }
                    if (o2.isNull(i4)) {
                        i5 = n23;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = n23;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(n24);
                    int i11 = o2.getInt(n25);
                    a().getClass();
                    int a3 = ey8.a(i11);
                    long j15 = o2.getLong(n26);
                    int i12 = o2.getInt(n27);
                    int i13 = o2.getInt(n28);
                    int i14 = o2.getInt(n29);
                    long j16 = o2.getLong(n30);
                    int i15 = o2.getInt(n31);
                    int i16 = o2.getInt(n32);
                    long j17 = o2.getLong(n33);
                    int i17 = n34;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = v89.a(blob2);
                    int i18 = n35;
                    ix8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = n36;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(n37) ? null : Integer.valueOf(o2.getInt(n37));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    ru8 = new ru8(j4, j5, j6, j7, j8, j9, string, n38, b2, j10, string2, string3, b3, i8, z, i9, j11, z2, j12, str, str2, j13, j14, a3, j15, i12, i13, i14, j16, i15, i16, j17, a4, c2, valueOf, bool);
                } else {
                    ru8 = null;
                }
                o2.close();
                xlc.n();
                return ru8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o2.close();
            xlc.n();
            throw th;
        }
    }

    public final ru8 c(long j2) {
        xlc xlc;
        ru8 ru8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        xlc a2 = xlc.a(1, "SELECT * FROM messages WHERE id = ?");
        a2.j(1, j2);
        ilc ilc = this.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            int n2 = tfg.n(o2, "id");
            int n3 = tfg.n(o2, "server_id");
            int n4 = tfg.n(o2, "time");
            int n5 = tfg.n(o2, "update_time");
            int n6 = tfg.n(o2, "sender");
            int n7 = tfg.n(o2, "cid");
            int n8 = tfg.n(o2, "text");
            int n9 = tfg.n(o2, "delivery_status");
            int n10 = tfg.n(o2, "status");
            int n11 = tfg.n(o2, "time_local");
            int n12 = tfg.n(o2, "error");
            int n13 = tfg.n(o2, "localized_error");
            int n14 = tfg.n(o2, "attaches");
            int n15 = tfg.n(o2, "media_type");
            xlc = a2;
            try {
                int n16 = tfg.n(o2, "detect_share");
                int n17 = tfg.n(o2, "msg_link_type");
                int n18 = tfg.n(o2, "msg_link_id");
                int n19 = tfg.n(o2, "inserted_from_msg_link");
                int n20 = tfg.n(o2, "msg_link_chat_id");
                int n21 = tfg.n(o2, "msg_link_chat_name");
                int n22 = tfg.n(o2, "msg_link_chat_link");
                int n23 = tfg.n(o2, "msg_link_out_chat_id");
                int n24 = tfg.n(o2, "msg_link_out_msg_id");
                int n25 = tfg.n(o2, "type");
                int n26 = tfg.n(o2, "chat_id");
                int n27 = tfg.n(o2, "ttl");
                int n28 = tfg.n(o2, "channel_views");
                int n29 = tfg.n(o2, "channel_forwards");
                int n30 = tfg.n(o2, "view_time");
                int n31 = tfg.n(o2, "zoom");
                int n32 = tfg.n(o2, "options");
                int n33 = tfg.n(o2, "live_until");
                int n34 = tfg.n(o2, "elements");
                int n35 = tfg.n(o2, "reactions");
                int n36 = tfg.n(o2, "delayed_attrs_time_to_fire");
                int n37 = tfg.n(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j3 = o2.getLong(n2);
                    long j4 = o2.getLong(n3);
                    long j5 = o2.getLong(n4);
                    long j6 = o2.getLong(n5);
                    long j7 = o2.getLong(n6);
                    long j8 = o2.getLong(n7);
                    String string = o2.isNull(n8) ? null : o2.getString(n8);
                    int i6 = o2.getInt(n9);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 n38 = oz7.n(i6);
                    int i7 = o2.getInt(n10);
                    a().getClass();
                    vx8 b2 = v89.b(i7);
                    long j9 = o2.getLong(n11);
                    String string2 = o2.isNull(n12) ? null : o2.getString(n12);
                    String string3 = o2.isNull(n13) ? null : o2.getString(n13);
                    byte[] blob = o2.isNull(n14) ? null : o2.getBlob(n14);
                    a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i8 = o2.getInt(n15);
                    boolean z3 = false;
                    if (o2.getInt(n16) != 0) {
                        i2 = n17;
                        z = true;
                    } else {
                        z = false;
                        i2 = n17;
                    }
                    int i9 = o2.getInt(i2);
                    long j10 = o2.getLong(n18);
                    if (o2.getInt(n19) != 0) {
                        i3 = n20;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = n20;
                    }
                    long j11 = o2.getLong(i3);
                    int i10 = n21;
                    if (o2.isNull(i10)) {
                        i4 = n22;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = n22;
                    }
                    if (o2.isNull(i4)) {
                        i5 = n23;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = n23;
                    }
                    long j12 = o2.getLong(i5);
                    long j13 = o2.getLong(n24);
                    int i11 = o2.getInt(n25);
                    a().getClass();
                    int a3 = ey8.a(i11);
                    long j14 = o2.getLong(n26);
                    int i12 = o2.getInt(n27);
                    int i13 = o2.getInt(n28);
                    int i14 = o2.getInt(n29);
                    long j15 = o2.getLong(n30);
                    int i15 = o2.getInt(n31);
                    int i16 = o2.getInt(n32);
                    long j16 = o2.getLong(n33);
                    int i17 = n34;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = v89.a(blob2);
                    int i18 = n35;
                    ix8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = n36;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(n37) ? null : Integer.valueOf(o2.getInt(n37));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z3 = true;
                        }
                        bool = Boolean.valueOf(z3);
                    }
                    ru8 = new ru8(j3, j4, j5, j6, j7, j8, string, n38, b2, j9, string2, string3, b3, i8, z, i9, j10, z2, j11, str, str2, j12, j13, a3, j14, i12, i13, i14, j15, i15, i16, j16, a4, c2, valueOf, bool);
                } else {
                    ru8 = null;
                }
                o2.close();
                xlc.n();
                return ru8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o2.close();
            xlc.n();
            throw th;
        }
    }

    public final ArrayList d(long j2, long j3, boolean z, long j4) {
        ArrayList arrayList;
        xlc xlc;
        String str;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        byte[] bArr;
        Long l2;
        int i6;
        Boolean bool;
        xlc xlc2;
        String str3;
        int i7;
        String str4;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        Long l3;
        int i11;
        Boolean bool2;
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        String str5 = "delayed_attrs_notify_sender";
        String str6 = "delayed_attrs_time_to_fire";
        String str7 = "reactions";
        String str8 = "elements";
        String str9 = "live_until";
        String str10 = "options";
        String str11 = "zoom";
        String str12 = "view_time";
        String str13 = "channel_forwards";
        String str14 = "channel_views";
        String str15 = "ttl";
        String str16 = "chat_id";
        String str17 = "type";
        String str18 = "msg_link_out_msg_id";
        String str19 = "msg_link_out_chat_id";
        String str20 = "msg_link_chat_link";
        String str21 = "msg_link_chat_name";
        String str22 = "msg_link_chat_id";
        String str23 = "inserted_from_msg_link";
        String str24 = "msg_link_id";
        String str25 = "msg_link_type";
        String str26 = "detect_share";
        String str27 = "media_type";
        String str28 = "attaches";
        String str29 = "localized_error";
        String str30 = "error";
        String str31 = "time_local";
        String str32 = "status";
        ilc ilc = this.a;
        String str33 = "delivery_status";
        if (z) {
            String str34 = "text";
            xlc a2 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
            a2.j(1, j5);
            a2.j(2, j6);
            ey8.m(a2, 3, j7, this);
            a2.j(4, (long) 10);
            a2.j(5, (long) 40);
            ilc.b();
            Cursor o2 = ilc.o(a2, (CancellationSignal) null);
            try {
                int n2 = tfg.n(o2, "id");
                int n3 = tfg.n(o2, "server_id");
                int n4 = tfg.n(o2, "time");
                int n5 = tfg.n(o2, "update_time");
                int n6 = tfg.n(o2, "sender");
                int n7 = tfg.n(o2, "cid");
                int n8 = tfg.n(o2, str34);
                int n9 = tfg.n(o2, str33);
                int n10 = tfg.n(o2, str32);
                int n11 = tfg.n(o2, str31);
                int n12 = tfg.n(o2, str30);
                int n13 = tfg.n(o2, str29);
                int n14 = tfg.n(o2, str28);
                int n15 = tfg.n(o2, str27);
                xlc2 = a2;
                try {
                    int n16 = tfg.n(o2, str26);
                    int n17 = tfg.n(o2, str25);
                    int n18 = tfg.n(o2, str24);
                    int n19 = tfg.n(o2, str23);
                    int n20 = tfg.n(o2, str22);
                    int n21 = tfg.n(o2, str21);
                    int n22 = tfg.n(o2, str20);
                    int n23 = tfg.n(o2, str19);
                    int n24 = tfg.n(o2, str18);
                    int n25 = tfg.n(o2, str17);
                    int n26 = tfg.n(o2, str16);
                    int n27 = tfg.n(o2, str15);
                    int n28 = tfg.n(o2, str14);
                    int n29 = tfg.n(o2, str13);
                    int n30 = tfg.n(o2, str12);
                    int n31 = tfg.n(o2, str11);
                    int n32 = tfg.n(o2, str10);
                    int n33 = tfg.n(o2, str9);
                    int n34 = tfg.n(o2, str8);
                    int n35 = tfg.n(o2, str7);
                    int n36 = tfg.n(o2, str6);
                    int n37 = tfg.n(o2, str5);
                    int i12 = n15;
                    arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        long j8 = o2.getLong(n2);
                        long j9 = o2.getLong(n3);
                        long j10 = o2.getLong(n4);
                        long j11 = o2.getLong(n5);
                        long j12 = o2.getLong(n6);
                        long j13 = o2.getLong(n7);
                        String string = o2.isNull(n8) ? null : o2.getString(n8);
                        int i13 = o2.getInt(n9);
                        a().getClass();
                        iu8.b.getClass();
                        iu8 n38 = oz7.n(i13);
                        int i14 = o2.getInt(n10);
                        a().getClass();
                        vx8 b2 = v89.b(i14);
                        long j14 = o2.getLong(n11);
                        String string2 = o2.isNull(n12) ? null : o2.getString(n12);
                        String string3 = o2.isNull(n13) ? null : o2.getString(n13);
                        byte[] blob = o2.isNull(n14) ? null : o2.getBlob(n14);
                        a().getClass();
                        k8g b3 = iz7.b(blob);
                        int i15 = i12;
                        int i16 = o2.getInt(i15);
                        i12 = i15;
                        int i17 = n16;
                        boolean z2 = false;
                        n16 = i17;
                        boolean z3 = o2.getInt(i17) != 0;
                        int i18 = n17;
                        int i19 = o2.getInt(i18);
                        n17 = i18;
                        int i20 = n18;
                        long j15 = o2.getLong(i20);
                        n18 = i20;
                        int i21 = n19;
                        n19 = i21;
                        boolean z4 = o2.getInt(i21) != 0;
                        int i22 = n20;
                        long j16 = o2.getLong(i22);
                        n20 = i22;
                        int i23 = n21;
                        if (o2.isNull(i23)) {
                            n21 = i23;
                            i7 = n22;
                            str3 = null;
                        } else {
                            String string4 = o2.getString(i23);
                            n21 = i23;
                            i7 = n22;
                            str3 = string4;
                        }
                        if (o2.isNull(i7)) {
                            n22 = i7;
                            i8 = n23;
                            str4 = null;
                        } else {
                            str4 = o2.getString(i7);
                            n22 = i7;
                            i8 = n23;
                        }
                        long j17 = o2.getLong(i8);
                        n23 = i8;
                        int i24 = n24;
                        long j18 = o2.getLong(i24);
                        n24 = i24;
                        int i25 = n25;
                        int i26 = o2.getInt(i25);
                        a().getClass();
                        int a3 = ey8.a(i26);
                        n25 = i25;
                        int i27 = n26;
                        long j19 = o2.getLong(i27);
                        n26 = i27;
                        int i28 = n27;
                        int i29 = o2.getInt(i28);
                        n27 = i28;
                        int i30 = n28;
                        int i31 = o2.getInt(i30);
                        n28 = i30;
                        int i32 = n29;
                        int i33 = o2.getInt(i32);
                        n29 = i32;
                        int i34 = n30;
                        long j20 = o2.getLong(i34);
                        n30 = i34;
                        int i35 = n31;
                        int i36 = o2.getInt(i35);
                        n31 = i35;
                        int i37 = n32;
                        int i38 = o2.getInt(i37);
                        n32 = i37;
                        int i39 = n33;
                        long j21 = o2.getLong(i39);
                        n33 = i39;
                        int i40 = n34;
                        byte[] blob2 = o2.isNull(i40) ? null : o2.getBlob(i40);
                        a().getClass();
                        List a4 = v89.a(blob2);
                        n34 = i40;
                        int i41 = n35;
                        if (o2.isNull(i41)) {
                            i9 = i41;
                            i10 = n2;
                            bArr2 = null;
                        } else {
                            i9 = i41;
                            bArr2 = o2.getBlob(i41);
                            i10 = n2;
                        }
                        ix8 c2 = a().c(bArr2);
                        int i42 = n36;
                        if (o2.isNull(i42)) {
                            i11 = n37;
                            l3 = null;
                        } else {
                            l3 = Long.valueOf(o2.getLong(i42));
                            i11 = n37;
                        }
                        Integer valueOf = o2.isNull(i11) ? null : Integer.valueOf(o2.getInt(i11));
                        if (valueOf == null) {
                            n36 = i42;
                            bool2 = null;
                        } else {
                            if (valueOf.intValue() != 0) {
                                z2 = true;
                            }
                            n36 = i42;
                            bool2 = Boolean.valueOf(z2);
                        }
                        arrayList.add(new ru8(j8, j9, j10, j11, j12, j13, string, n38, b2, j14, string2, string3, b3, i16, z3, i19, j15, z4, j16, str3, str4, j17, j18, a3, j19, i29, i31, i33, j20, i36, i38, j21, a4, c2, l3, bool2));
                        n37 = i11;
                        n2 = i10;
                        n35 = i9;
                    }
                    o2.close();
                    xlc2.n();
                } catch (Throwable th) {
                    th = th;
                    o2.close();
                    xlc2.n();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                xlc2 = a2;
                o2.close();
                xlc2.n();
                throw th;
            }
        } else {
            String str35 = "text";
            String str36 = str33;
            xlc a5 = xlc.a(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
            a5.j(1, j5);
            a5.j(2, j6);
            String str37 = str27;
            ey8.m(a5, 3, j7, this);
            a5.j(4, (long) 10);
            a5.j(5, (long) 40);
            ilc.b();
            Cursor o3 = ilc.o(a5, (CancellationSignal) null);
            try {
                int n39 = tfg.n(o3, "id");
                int n40 = tfg.n(o3, "server_id");
                int n41 = tfg.n(o3, "time");
                int n42 = tfg.n(o3, "update_time");
                int n43 = tfg.n(o3, "sender");
                int n44 = tfg.n(o3, "cid");
                int n45 = tfg.n(o3, str35);
                int n46 = tfg.n(o3, str33);
                int n47 = tfg.n(o3, str32);
                int n48 = tfg.n(o3, str31);
                int n49 = tfg.n(o3, str30);
                int n50 = tfg.n(o3, str29);
                int n51 = tfg.n(o3, str28);
                int n52 = tfg.n(o3, str37);
                xlc = a5;
                try {
                    int n53 = tfg.n(o3, str26);
                    int n54 = tfg.n(o3, str25);
                    int n55 = tfg.n(o3, str24);
                    int n56 = tfg.n(o3, str23);
                    int n57 = tfg.n(o3, str22);
                    int n58 = tfg.n(o3, str21);
                    int n59 = tfg.n(o3, str20);
                    int n60 = tfg.n(o3, str19);
                    int n61 = tfg.n(o3, str18);
                    int n62 = tfg.n(o3, str17);
                    int n63 = tfg.n(o3, str16);
                    int n64 = tfg.n(o3, str15);
                    int n65 = tfg.n(o3, str14);
                    int n66 = tfg.n(o3, str13);
                    int n67 = tfg.n(o3, str12);
                    int n68 = tfg.n(o3, str11);
                    int n69 = tfg.n(o3, str10);
                    int n70 = tfg.n(o3, str9);
                    int n71 = tfg.n(o3, str8);
                    int n72 = tfg.n(o3, str7);
                    int n73 = tfg.n(o3, str6);
                    int n74 = tfg.n(o3, str5);
                    int i43 = n52;
                    arrayList = new ArrayList(o3.getCount());
                    while (o3.moveToNext()) {
                        long j22 = o3.getLong(n39);
                        long j23 = o3.getLong(n40);
                        long j24 = o3.getLong(n41);
                        long j25 = o3.getLong(n42);
                        long j26 = o3.getLong(n43);
                        long j27 = o3.getLong(n44);
                        String string5 = o3.isNull(n45) ? null : o3.getString(n45);
                        int i44 = o3.getInt(n46);
                        a().getClass();
                        iu8.b.getClass();
                        iu8 n75 = oz7.n(i44);
                        int i45 = o3.getInt(n47);
                        a().getClass();
                        vx8 b4 = v89.b(i45);
                        long j28 = o3.getLong(n48);
                        String string6 = o3.isNull(n49) ? null : o3.getString(n49);
                        String string7 = o3.isNull(n50) ? null : o3.getString(n50);
                        byte[] blob3 = o3.isNull(n51) ? null : o3.getBlob(n51);
                        a().getClass();
                        k8g b5 = iz7.b(blob3);
                        int i46 = i43;
                        int i47 = o3.getInt(i46);
                        int i48 = n49;
                        int i49 = n53;
                        boolean z5 = false;
                        n53 = i49;
                        boolean z6 = o3.getInt(i49) != 0;
                        int i50 = n54;
                        int i51 = o3.getInt(i50);
                        n54 = i50;
                        int i52 = n55;
                        long j29 = o3.getLong(i52);
                        n55 = i52;
                        int i53 = n56;
                        n56 = i53;
                        boolean z7 = o3.getInt(i53) != 0;
                        int i54 = n57;
                        long j30 = o3.getLong(i54);
                        n57 = i54;
                        int i55 = n58;
                        if (o3.isNull(i55)) {
                            n58 = i55;
                            i2 = n59;
                            str = null;
                        } else {
                            String string8 = o3.getString(i55);
                            n58 = i55;
                            i2 = n59;
                            str = string8;
                        }
                        if (o3.isNull(i2)) {
                            n59 = i2;
                            i3 = n60;
                            str2 = null;
                        } else {
                            str2 = o3.getString(i2);
                            n59 = i2;
                            i3 = n60;
                        }
                        long j31 = o3.getLong(i3);
                        n60 = i3;
                        int i56 = n61;
                        long j32 = o3.getLong(i56);
                        n61 = i56;
                        int i57 = n62;
                        int i58 = o3.getInt(i57);
                        a().getClass();
                        int a6 = ey8.a(i58);
                        n62 = i57;
                        int i59 = n63;
                        long j33 = o3.getLong(i59);
                        n63 = i59;
                        int i60 = n64;
                        int i61 = o3.getInt(i60);
                        n64 = i60;
                        int i62 = n65;
                        int i63 = o3.getInt(i62);
                        n65 = i62;
                        int i64 = n66;
                        int i65 = o3.getInt(i64);
                        n66 = i64;
                        int i66 = n67;
                        long j34 = o3.getLong(i66);
                        n67 = i66;
                        int i67 = n68;
                        int i68 = o3.getInt(i67);
                        n68 = i67;
                        int i69 = n69;
                        int i70 = o3.getInt(i69);
                        n69 = i69;
                        int i71 = n70;
                        long j35 = o3.getLong(i71);
                        n70 = i71;
                        int i72 = n71;
                        byte[] blob4 = o3.isNull(i72) ? null : o3.getBlob(i72);
                        a().getClass();
                        List a7 = v89.a(blob4);
                        n71 = i72;
                        int i73 = n72;
                        if (o3.isNull(i73)) {
                            i4 = i73;
                            i5 = n51;
                            bArr = null;
                        } else {
                            i4 = i73;
                            bArr = o3.getBlob(i73);
                            i5 = n51;
                        }
                        ix8 c3 = a().c(bArr);
                        int i74 = n73;
                        if (o3.isNull(i74)) {
                            i6 = n74;
                            l2 = null;
                        } else {
                            l2 = Long.valueOf(o3.getLong(i74));
                            i6 = n74;
                        }
                        Integer valueOf2 = o3.isNull(i6) ? null : Integer.valueOf(o3.getInt(i6));
                        if (valueOf2 == null) {
                            n73 = i74;
                            bool = null;
                        } else {
                            if (valueOf2.intValue() != 0) {
                                z5 = true;
                            }
                            n73 = i74;
                            bool = Boolean.valueOf(z5);
                        }
                        arrayList.add(new ru8(j22, j23, j24, j25, j26, j27, string5, n75, b4, j28, string6, string7, b5, i47, z6, i51, j29, z7, j30, str, str2, j31, j32, a6, j33, i61, i63, i65, j34, i68, i70, j35, a7, c3, l2, bool));
                        n74 = i6;
                        n51 = i5;
                        n49 = i48;
                        n72 = i4;
                        i43 = i46;
                    }
                    o3.close();
                    xlc.n();
                } catch (Throwable th3) {
                    th = th3;
                    o3.close();
                    xlc.n();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                xlc = a5;
                o3.close();
                xlc.n();
                throw th;
            }
        }
        return arrayList;
    }

    public final void e(long j2) {
        ilc ilc = this.a;
        ilc.b();
        p19 p19 = this.p;
        q36 f2 = p19.f();
        f2.j(1, j2);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            p19.t(f2);
        } catch (Throwable th) {
            p19.t(f2);
            throw th;
        }
    }

    public final long f(ru8 ru8) {
        ilc ilc = this.a;
        ilc.b();
        ilc.c();
        try {
            long D = this.b.D(ru8);
            ilc.r();
            return D;
        } finally {
            ilc.l();
        }
    }

    public final ru8 h(long j2, long j3) {
        xlc xlc;
        ru8 ru8;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str;
        int i4;
        String str2;
        int i5;
        Boolean bool;
        xlc a2 = xlc.a(2, "SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        ilc ilc = this.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            int n2 = tfg.n(o2, "id");
            int n3 = tfg.n(o2, "server_id");
            int n4 = tfg.n(o2, "time");
            int n5 = tfg.n(o2, "update_time");
            int n6 = tfg.n(o2, "sender");
            int n7 = tfg.n(o2, "cid");
            int n8 = tfg.n(o2, "text");
            int n9 = tfg.n(o2, "delivery_status");
            int n10 = tfg.n(o2, "status");
            int n11 = tfg.n(o2, "time_local");
            int n12 = tfg.n(o2, "error");
            int n13 = tfg.n(o2, "localized_error");
            int n14 = tfg.n(o2, "attaches");
            int n15 = tfg.n(o2, "media_type");
            xlc = a2;
            try {
                int n16 = tfg.n(o2, "detect_share");
                int n17 = tfg.n(o2, "msg_link_type");
                int n18 = tfg.n(o2, "msg_link_id");
                int n19 = tfg.n(o2, "inserted_from_msg_link");
                int n20 = tfg.n(o2, "msg_link_chat_id");
                int n21 = tfg.n(o2, "msg_link_chat_name");
                int n22 = tfg.n(o2, "msg_link_chat_link");
                int n23 = tfg.n(o2, "msg_link_out_chat_id");
                int n24 = tfg.n(o2, "msg_link_out_msg_id");
                int n25 = tfg.n(o2, "type");
                int n26 = tfg.n(o2, "chat_id");
                int n27 = tfg.n(o2, "ttl");
                int n28 = tfg.n(o2, "channel_views");
                int n29 = tfg.n(o2, "channel_forwards");
                int n30 = tfg.n(o2, "view_time");
                int n31 = tfg.n(o2, "zoom");
                int n32 = tfg.n(o2, "options");
                int n33 = tfg.n(o2, "live_until");
                int n34 = tfg.n(o2, "elements");
                int n35 = tfg.n(o2, "reactions");
                int n36 = tfg.n(o2, "delayed_attrs_time_to_fire");
                int n37 = tfg.n(o2, "delayed_attrs_notify_sender");
                if (o2.moveToFirst()) {
                    long j4 = o2.getLong(n2);
                    long j5 = o2.getLong(n3);
                    long j6 = o2.getLong(n4);
                    long j7 = o2.getLong(n5);
                    long j8 = o2.getLong(n6);
                    long j9 = o2.getLong(n7);
                    String string = o2.isNull(n8) ? null : o2.getString(n8);
                    int i6 = o2.getInt(n9);
                    a().getClass();
                    iu8.b.getClass();
                    iu8 n38 = oz7.n(i6);
                    int i7 = o2.getInt(n10);
                    a().getClass();
                    vx8 b2 = v89.b(i7);
                    long j10 = o2.getLong(n11);
                    String string2 = o2.isNull(n12) ? null : o2.getString(n12);
                    String string3 = o2.isNull(n13) ? null : o2.getString(n13);
                    byte[] blob = o2.isNull(n14) ? null : o2.getBlob(n14);
                    a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i8 = o2.getInt(n15);
                    if (o2.getInt(n16) != 0) {
                        i2 = n17;
                        z = true;
                    } else {
                        i2 = n17;
                        z = false;
                    }
                    int i9 = o2.getInt(i2);
                    long j11 = o2.getLong(n18);
                    if (o2.getInt(n19) != 0) {
                        i3 = n20;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = n20;
                    }
                    long j12 = o2.getLong(i3);
                    int i10 = n21;
                    if (o2.isNull(i10)) {
                        i4 = n22;
                        str = null;
                    } else {
                        str = o2.getString(i10);
                        i4 = n22;
                    }
                    if (o2.isNull(i4)) {
                        i5 = n23;
                        str2 = null;
                    } else {
                        str2 = o2.getString(i4);
                        i5 = n23;
                    }
                    long j13 = o2.getLong(i5);
                    long j14 = o2.getLong(n24);
                    int i11 = o2.getInt(n25);
                    a().getClass();
                    int a3 = ey8.a(i11);
                    long j15 = o2.getLong(n26);
                    int i12 = o2.getInt(n27);
                    int i13 = o2.getInt(n28);
                    int i14 = o2.getInt(n29);
                    long j16 = o2.getLong(n30);
                    int i15 = o2.getInt(n31);
                    int i16 = o2.getInt(n32);
                    long j17 = o2.getLong(n33);
                    int i17 = n34;
                    byte[] blob2 = o2.isNull(i17) ? null : o2.getBlob(i17);
                    a().getClass();
                    List a4 = v89.a(blob2);
                    int i18 = n35;
                    ix8 c2 = a().c(o2.isNull(i18) ? null : o2.getBlob(i18));
                    int i19 = n36;
                    Long valueOf = o2.isNull(i19) ? null : Long.valueOf(o2.getLong(i19));
                    Integer valueOf2 = o2.isNull(n37) ? null : Integer.valueOf(o2.getInt(n37));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(valueOf2.intValue() != 0);
                    }
                    ru8 = new ru8(j4, j5, j6, j7, j8, j9, string, n38, b2, j10, string2, string3, b3, i8, z, i9, j11, z2, j12, str, str2, j13, j14, a3, j15, i12, i13, i14, j16, i15, i16, j17, a4, c2, valueOf, bool);
                } else {
                    ru8 = null;
                }
                o2.close();
                xlc.n();
                return ru8;
            } catch (Throwable th) {
                th = th;
                o2.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a2;
            o2.close();
            xlc.n();
            throw th;
        }
    }

    public final Long i(long j2, long j3) {
        xlc a2 = xlc.a(2, "SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
        a2.j(1, j2);
        a2.j(2, j3);
        ilc ilc = this.a;
        ilc.b();
        Long l2 = null;
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            if (o2.moveToFirst()) {
                if (!o2.isNull(0)) {
                    l2 = Long.valueOf(o2.getLong(0));
                }
            }
            return l2;
        } finally {
            o2.close();
            a2.n();
        }
    }

    public final long k(long j2) {
        xlc a2 = xlc.a(1, "SELECT time FROM messages WHERE id = ?");
        a2.j(1, j2);
        ilc ilc = this.a;
        ilc.b();
        Cursor o2 = ilc.o(a2, (CancellationSignal) null);
        try {
            return o2.moveToFirst() ? o2.getLong(0) : 0;
        } finally {
            o2.close();
            a2.n();
        }
    }

    public final int l(yw8 yw8) {
        ilc ilc = this.a;
        ilc.b();
        ilc.c();
        try {
            int B = this.d.B(yw8);
            ilc.r();
            return B;
        } finally {
            ilc.l();
        }
    }

    public final int m(b6f b6f) {
        ilc ilc = this.a;
        ilc.b();
        ilc.c();
        try {
            int B = this.e.B(b6f);
            ilc.r();
            return B;
        } finally {
            ilc.l();
        }
    }

    public final void n(long j2, iu8 iu8) {
        ilc ilc = this.a;
        ilc.b();
        p19 p19 = this.h;
        q36 f2 = p19.f();
        a().getClass();
        f2.j(1, (long) iu8.a);
        f2.j(2, j2);
        try {
            ilc.c();
            f2.n();
            ilc.r();
            ilc.l();
            p19.t(f2);
        } catch (Throwable th) {
            p19.t(f2);
            throw th;
        }
    }

    public final void o(long j2, List list, vx8 vx8) {
        ilc ilc = this.a;
        ilc.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status = ? WHERE chat_id = ? AND id in (");
        a14.c(sb, list.size());
        sb.append(")");
        q36 d2 = ilc.d(sb.toString());
        a().getClass();
        d2.j(1, (long) vx8.a);
        d2.j(2, j2);
        Iterator it = list.iterator();
        int i2 = 3;
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            if (l2 == null) {
                d2.W(i2);
            } else {
                d2.j(i2, l2.longValue());
            }
            i2++;
        }
        ilc.c();
        try {
            d2.n();
            ilc.r();
        } finally {
            ilc.l();
        }
    }
}
