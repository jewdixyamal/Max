package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: f8a  reason: default package */
public final class f8a implements sk6 {
    public final long b;
    public final ol6 c;
    public final je7 d;
    public final je7 e;
    public boolean f;
    public final ye4 g = new ye4(10);

    public f8a(je7 je7, je7 je72, long j, ol6 ol6) {
        this.b = j;
        this.c = ol6;
        this.d = je7;
        this.e = je72;
    }

    public final boolean a() {
        return false;
    }

    public final void b() {
        this.f = true;
    }

    public final Comparator c() {
        return new ye4(11);
    }

    public final i13 d(long j) {
        return fm9.x(j, i());
    }

    public final Comparator e() {
        return this.g;
    }

    public final i13 f(long j) {
        return fm9.w(j, i());
    }

    public final long g() {
        xlc xlc;
        ng4 ng4;
        String str;
        int i;
        boolean z;
        int i2;
        boolean z2;
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
        if (!this.f) {
            return 0;
        }
        vlc vlc = ((r79) this.e.getValue()).a;
        t19 d2 = vlc.d();
        d2.getClass();
        xlc a = xlc.a(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
        ey8.m(a, 1, this.b, d2);
        a.j(2, (long) 10);
        a.j(3, 1);
        ilc ilc = d2.a;
        ilc.b();
        Cursor o = ilc.o(a, (CancellationSignal) null);
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
            xlc = a;
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
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i10 = o.getInt(n8);
                    d2.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i10);
                    int i11 = o.getInt(n9);
                    d2.a().getClass();
                    vx8 b2 = v89.b(i11);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i = i9;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i = i9;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    d2.a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i12 = n12;
                    int i13 = n14;
                    int i14 = o.getInt(i13);
                    n14 = i13;
                    int i15 = n15;
                    boolean z3 = false;
                    if (o.getInt(i15) != 0) {
                        n15 = i15;
                        i2 = n16;
                        z = true;
                    } else {
                        n15 = i15;
                        i2 = n16;
                        z = false;
                    }
                    int i16 = o.getInt(i2);
                    n16 = i2;
                    int i17 = n17;
                    long j8 = o.getLong(i17);
                    n17 = i17;
                    int i18 = n18;
                    if (o.getInt(i18) != 0) {
                        n18 = i18;
                        i3 = n19;
                        z2 = true;
                    } else {
                        n18 = i18;
                        i3 = n19;
                        z2 = false;
                    }
                    long j9 = o.getLong(i3);
                    n19 = i3;
                    int i19 = n20;
                    if (o.isNull(i19)) {
                        n20 = i19;
                        i4 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i19);
                        n20 = i19;
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
                    long j10 = o.getLong(i5);
                    n22 = i5;
                    int i20 = n23;
                    long j11 = o.getLong(i20);
                    n23 = i20;
                    int i21 = n24;
                    int i22 = o.getInt(i21);
                    d2.a().getClass();
                    int a2 = ey8.a(i22);
                    n24 = i21;
                    int i23 = n25;
                    long j12 = o.getLong(i23);
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
                    long j13 = o.getLong(i30);
                    n29 = i30;
                    int i31 = n30;
                    int i32 = o.getInt(i31);
                    n30 = i31;
                    int i33 = n31;
                    int i34 = o.getInt(i33);
                    n31 = i33;
                    int i35 = n32;
                    long j14 = o.getLong(i35);
                    n32 = i35;
                    int i36 = n33;
                    byte[] blob2 = o.isNull(i36) ? null : o.getBlob(i36);
                    d2.a().getClass();
                    List a3 = v89.a(blob2);
                    n33 = i36;
                    int i37 = n34;
                    if (o.isNull(i37)) {
                        i6 = i37;
                        i7 = i;
                        bArr = null;
                    } else {
                        i6 = i37;
                        bArr = o.getBlob(i37);
                        i7 = i;
                    }
                    ix8 c2 = d2.a().c(bArr);
                    int i38 = n35;
                    if (o.isNull(i38)) {
                        i8 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i38));
                        i8 = n36;
                    }
                    Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
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
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, str, b3, i14, z, i16, j8, z2, j9, str2, str3, j10, j11, a2, j12, i25, i27, i29, j13, i32, i34, j14, a3, c2, l, bool));
                    n36 = i8;
                    n12 = i12;
                    i9 = i7;
                    n34 = i6;
                }
                o.close();
                xlc.n();
                ru8 ru8 = (ru8) x53.i0(arrayList);
                cu8 b4 = ru8 != null ? vlc2.b(ru8) : null;
                if (b4 == null || (ng4 = b4.T0) == null || !this.c.n(ng4.a)) {
                    return 0;
                }
                return b4.b;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = a;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final long h() {
        ng4 ng4;
        vlc vlc = ((r79) this.e.getValue()).a;
        ru8 ru8 = (ru8) x53.i0(t19.j(vlc.d(), this.b));
        cu8 b2 = ru8 != null ? vlc.b(ru8) : null;
        if (b2 == null || (ng4 = b2.T0) == null || !this.c.n(ng4.a)) {
            return 0;
        }
        return b2.b;
    }

    public final List i() {
        return ((e52) j47.f0(hz4.a, new e8a(this, (Continuation) null))).b.n.d(mg4.DELAYED);
    }
}
