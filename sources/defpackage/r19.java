package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: r19  reason: default package */
public final class r19 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xlc b;
    public final /* synthetic */ t19 c;

    public /* synthetic */ r19(t19 t19, xlc xlc, int i) {
        this.a = i;
        this.c = t19;
        this.b = xlc;
    }

    private final Object a() {
        xlc xlc;
        String str;
        int i;
        boolean z;
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
        t19 t19 = this.c;
        ilc ilc = t19.a;
        xlc xlc2 = this.b;
        Cursor o = ilc.o(xlc2, (CancellationSignal) null);
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
            int n13 = tfg.n(o, "attaches");
            xlc = xlc2;
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
                int i8 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i9 = o.getInt(n8);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i9);
                    int i10 = o.getInt(n9);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i10);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i8 = i;
                    int i11 = n14;
                    int i12 = o.getInt(i11);
                    n14 = i11;
                    int i13 = n15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = n16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = n17;
                    long j8 = o.getLong(i19);
                    n17 = i19;
                    int i20 = n18;
                    if (o.getInt(i20) != 0) {
                        n18 = i20;
                        i2 = n19;
                        z = true;
                    } else {
                        n18 = i20;
                        i2 = n19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    n19 = i2;
                    int i21 = n20;
                    if (o.isNull(i21)) {
                        n20 = i21;
                        i3 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        n20 = i21;
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
                    long j10 = o.getLong(i4);
                    n22 = i4;
                    int i22 = n23;
                    long j11 = o.getLong(i22);
                    n23 = i22;
                    int i23 = n24;
                    int i24 = o.getInt(i23);
                    t19.a().getClass();
                    int a2 = ey8.a(i24);
                    n24 = i23;
                    int i25 = n25;
                    long j12 = o.getLong(i25);
                    n25 = i25;
                    int i26 = n26;
                    int i27 = o.getInt(i26);
                    n26 = i26;
                    int i28 = n27;
                    int i29 = o.getInt(i28);
                    n27 = i28;
                    int i30 = n28;
                    int i31 = o.getInt(i30);
                    n28 = i30;
                    int i32 = n29;
                    long j13 = o.getLong(i32);
                    n29 = i32;
                    int i33 = n30;
                    int i34 = o.getInt(i33);
                    n30 = i33;
                    int i35 = n31;
                    int i36 = o.getInt(i35);
                    n31 = i35;
                    int i37 = n32;
                    long j14 = o.getLong(i37);
                    n32 = i37;
                    int i38 = n33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    t19.a().getClass();
                    List a3 = v89.a(blob2);
                    n33 = i38;
                    int i39 = n34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = n;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = n;
                    }
                    ix8 c2 = t19.a().c(bArr);
                    int i40 = n35;
                    if (o.isNull(i40)) {
                        i7 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = n36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        n35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n35 = i40;
                    }
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    n36 = i7;
                    n15 = i15;
                    n = i6;
                    n16 = i18;
                    n34 = i5;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = xlc2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    private final Object b() {
        xlc xlc;
        ru8 ru8;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        t19 t19 = this.c;
        ilc ilc = t19.a;
        xlc xlc2 = this.b;
        Cursor o = ilc.o(xlc2, (CancellationSignal) null);
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
            int n13 = tfg.n(o, "attaches");
            xlc = xlc2;
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
                if (o.moveToFirst()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i3 = o.getInt(n8);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i3);
                    int i4 = o.getInt(n9);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i4);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    String string3 = o.isNull(n12) ? null : o.getString(n12);
                    byte[] blob = o.isNull(n13) ? null : o.getBlob(n13);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    int i5 = o.getInt(n14);
                    boolean z = false;
                    boolean z2 = o.getInt(n15) != 0;
                    int i6 = o.getInt(n16);
                    long j8 = o.getLong(n17);
                    boolean z3 = o.getInt(n18) != 0;
                    long j9 = o.getLong(n19);
                    int i7 = n20;
                    if (o.isNull(i7)) {
                        i = n21;
                        str = null;
                    } else {
                        str = o.getString(i7);
                        i = n21;
                    }
                    if (o.isNull(i)) {
                        i2 = n22;
                        str2 = null;
                    } else {
                        str2 = o.getString(i);
                        i2 = n22;
                    }
                    long j10 = o.getLong(i2);
                    long j11 = o.getLong(n23);
                    int i8 = o.getInt(n24);
                    t19.a().getClass();
                    int a2 = ey8.a(i8);
                    long j12 = o.getLong(n25);
                    int i9 = o.getInt(n26);
                    int i10 = o.getInt(n27);
                    int i11 = o.getInt(n28);
                    long j13 = o.getLong(n29);
                    int i12 = o.getInt(n30);
                    int i13 = o.getInt(n31);
                    long j14 = o.getLong(n32);
                    int i14 = n33;
                    byte[] blob2 = o.isNull(i14) ? null : o.getBlob(i14);
                    t19.a().getClass();
                    List a3 = v89.a(blob2);
                    int i15 = n34;
                    ix8 c2 = t19.a().c(o.isNull(i15) ? null : o.getBlob(i15));
                    int i16 = n35;
                    Long valueOf = o.isNull(i16) ? null : Long.valueOf(o.getLong(i16));
                    Integer valueOf2 = o.isNull(n36) ? null : Integer.valueOf(o.getInt(n36));
                    if (valueOf2 == null) {
                        bool = null;
                    } else {
                        if (valueOf2.intValue() != 0) {
                            z = true;
                        }
                        bool = Boolean.valueOf(z);
                    }
                    ru8 = new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, string3, b3, i5, z2, i6, j8, z3, j9, str, str2, j10, j11, a2, j12, i9, i10, i11, j13, i12, i13, j14, a3, c2, valueOf, bool);
                } else {
                    ru8 = null;
                }
                o.close();
                xlc.n();
                return ru8;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = xlc2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    private final Object c() {
        xlc xlc;
        String str;
        int i;
        boolean z;
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
        t19 t19 = this.c;
        ilc ilc = t19.a;
        xlc xlc2 = this.b;
        Cursor o = ilc.o(xlc2, (CancellationSignal) null);
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
            int n13 = tfg.n(o, "attaches");
            xlc = xlc2;
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
                int i8 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i9 = o.getInt(n8);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i9);
                    int i10 = o.getInt(n9);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i10);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i8 = i;
                    int i11 = n14;
                    int i12 = o.getInt(i11);
                    n14 = i11;
                    int i13 = n15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = n16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = n17;
                    long j8 = o.getLong(i19);
                    n17 = i19;
                    int i20 = n18;
                    if (o.getInt(i20) != 0) {
                        n18 = i20;
                        i2 = n19;
                        z = true;
                    } else {
                        n18 = i20;
                        i2 = n19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    n19 = i2;
                    int i21 = n20;
                    if (o.isNull(i21)) {
                        n20 = i21;
                        i3 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        n20 = i21;
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
                    long j10 = o.getLong(i4);
                    n22 = i4;
                    int i22 = n23;
                    long j11 = o.getLong(i22);
                    n23 = i22;
                    int i23 = n24;
                    int i24 = o.getInt(i23);
                    t19.a().getClass();
                    int a2 = ey8.a(i24);
                    n24 = i23;
                    int i25 = n25;
                    long j12 = o.getLong(i25);
                    n25 = i25;
                    int i26 = n26;
                    int i27 = o.getInt(i26);
                    n26 = i26;
                    int i28 = n27;
                    int i29 = o.getInt(i28);
                    n27 = i28;
                    int i30 = n28;
                    int i31 = o.getInt(i30);
                    n28 = i30;
                    int i32 = n29;
                    long j13 = o.getLong(i32);
                    n29 = i32;
                    int i33 = n30;
                    int i34 = o.getInt(i33);
                    n30 = i33;
                    int i35 = n31;
                    int i36 = o.getInt(i35);
                    n31 = i35;
                    int i37 = n32;
                    long j14 = o.getLong(i37);
                    n32 = i37;
                    int i38 = n33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    t19.a().getClass();
                    List a3 = v89.a(blob2);
                    n33 = i38;
                    int i39 = n34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = n;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = n;
                    }
                    ix8 c2 = t19.a().c(bArr);
                    int i40 = n35;
                    if (o.isNull(i40)) {
                        i7 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = n36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        n35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n35 = i40;
                    }
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    n36 = i7;
                    n15 = i15;
                    n = i6;
                    n16 = i18;
                    n34 = i5;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = xlc2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    private final Object d() {
        xlc xlc;
        String str;
        int i;
        boolean z;
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
        t19 t19 = this.c;
        ilc ilc = t19.a;
        xlc xlc2 = this.b;
        Cursor o = ilc.o(xlc2, (CancellationSignal) null);
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
            int n13 = tfg.n(o, "attaches");
            xlc = xlc2;
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
                int i8 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i9 = o.getInt(n8);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i9);
                    int i10 = o.getInt(n9);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i10);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i8 = i;
                    int i11 = n14;
                    int i12 = o.getInt(i11);
                    n14 = i11;
                    int i13 = n15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = n16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = n17;
                    long j8 = o.getLong(i19);
                    n17 = i19;
                    int i20 = n18;
                    if (o.getInt(i20) != 0) {
                        n18 = i20;
                        i2 = n19;
                        z = true;
                    } else {
                        n18 = i20;
                        i2 = n19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    n19 = i2;
                    int i21 = n20;
                    if (o.isNull(i21)) {
                        n20 = i21;
                        i3 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        n20 = i21;
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
                    long j10 = o.getLong(i4);
                    n22 = i4;
                    int i22 = n23;
                    long j11 = o.getLong(i22);
                    n23 = i22;
                    int i23 = n24;
                    int i24 = o.getInt(i23);
                    t19.a().getClass();
                    int a2 = ey8.a(i24);
                    n24 = i23;
                    int i25 = n25;
                    long j12 = o.getLong(i25);
                    n25 = i25;
                    int i26 = n26;
                    int i27 = o.getInt(i26);
                    n26 = i26;
                    int i28 = n27;
                    int i29 = o.getInt(i28);
                    n27 = i28;
                    int i30 = n28;
                    int i31 = o.getInt(i30);
                    n28 = i30;
                    int i32 = n29;
                    long j13 = o.getLong(i32);
                    n29 = i32;
                    int i33 = n30;
                    int i34 = o.getInt(i33);
                    n30 = i33;
                    int i35 = n31;
                    int i36 = o.getInt(i35);
                    n31 = i35;
                    int i37 = n32;
                    long j14 = o.getLong(i37);
                    n32 = i37;
                    int i38 = n33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    t19.a().getClass();
                    List a3 = v89.a(blob2);
                    n33 = i38;
                    int i39 = n34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = n;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = n;
                    }
                    ix8 c2 = t19.a().c(bArr);
                    int i40 = n35;
                    if (o.isNull(i40)) {
                        i7 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = n36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        n35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n35 = i40;
                    }
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    n36 = i7;
                    n15 = i15;
                    n = i6;
                    n16 = i18;
                    n34 = i5;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = xlc2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    private final Object e() {
        xlc xlc;
        String str;
        int i;
        boolean z;
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
        t19 t19 = this.c;
        ilc ilc = t19.a;
        xlc xlc2 = this.b;
        Cursor o = ilc.o(xlc2, (CancellationSignal) null);
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
            int n13 = tfg.n(o, "attaches");
            xlc = xlc2;
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
                int i8 = n13;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    long j = o.getLong(n);
                    long j2 = o.getLong(n2);
                    long j3 = o.getLong(n3);
                    long j4 = o.getLong(n4);
                    long j5 = o.getLong(n5);
                    long j6 = o.getLong(n6);
                    String string = o.isNull(n7) ? null : o.getString(n7);
                    int i9 = o.getInt(n8);
                    t19.a().getClass();
                    iu8.b.getClass();
                    iu8 n37 = oz7.n(i9);
                    int i10 = o.getInt(n9);
                    t19.a().getClass();
                    vx8 b2 = v89.b(i10);
                    long j7 = o.getLong(n10);
                    String string2 = o.isNull(n11) ? null : o.getString(n11);
                    if (o.isNull(n12)) {
                        i = i8;
                        str = null;
                    } else {
                        str = o.getString(n12);
                        i = i8;
                    }
                    byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                    t19.a().getClass();
                    k8g b3 = iz7.b(blob);
                    i8 = i;
                    int i11 = n14;
                    int i12 = o.getInt(i11);
                    n14 = i11;
                    int i13 = n15;
                    boolean z2 = false;
                    boolean z3 = o.getInt(i13) != 0;
                    int i14 = n16;
                    int i15 = i13;
                    int i16 = i14;
                    int i17 = o.getInt(i16);
                    int i18 = i16;
                    int i19 = n17;
                    long j8 = o.getLong(i19);
                    n17 = i19;
                    int i20 = n18;
                    if (o.getInt(i20) != 0) {
                        n18 = i20;
                        i2 = n19;
                        z = true;
                    } else {
                        n18 = i20;
                        i2 = n19;
                        z = false;
                    }
                    long j9 = o.getLong(i2);
                    n19 = i2;
                    int i21 = n20;
                    if (o.isNull(i21)) {
                        n20 = i21;
                        i3 = n21;
                        str2 = null;
                    } else {
                        str2 = o.getString(i21);
                        n20 = i21;
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
                    long j10 = o.getLong(i4);
                    n22 = i4;
                    int i22 = n23;
                    long j11 = o.getLong(i22);
                    n23 = i22;
                    int i23 = n24;
                    int i24 = o.getInt(i23);
                    t19.a().getClass();
                    int a2 = ey8.a(i24);
                    n24 = i23;
                    int i25 = n25;
                    long j12 = o.getLong(i25);
                    n25 = i25;
                    int i26 = n26;
                    int i27 = o.getInt(i26);
                    n26 = i26;
                    int i28 = n27;
                    int i29 = o.getInt(i28);
                    n27 = i28;
                    int i30 = n28;
                    int i31 = o.getInt(i30);
                    n28 = i30;
                    int i32 = n29;
                    long j13 = o.getLong(i32);
                    n29 = i32;
                    int i33 = n30;
                    int i34 = o.getInt(i33);
                    n30 = i33;
                    int i35 = n31;
                    int i36 = o.getInt(i35);
                    n31 = i35;
                    int i37 = n32;
                    long j14 = o.getLong(i37);
                    n32 = i37;
                    int i38 = n33;
                    byte[] blob2 = o.isNull(i38) ? null : o.getBlob(i38);
                    t19.a().getClass();
                    List a3 = v89.a(blob2);
                    n33 = i38;
                    int i39 = n34;
                    if (o.isNull(i39)) {
                        i5 = i39;
                        i6 = n;
                        bArr = null;
                    } else {
                        i5 = i39;
                        bArr = o.getBlob(i39);
                        i6 = n;
                    }
                    ix8 c2 = t19.a().c(bArr);
                    int i40 = n35;
                    if (o.isNull(i40)) {
                        i7 = n36;
                        l = null;
                    } else {
                        l = Long.valueOf(o.getLong(i40));
                        i7 = n36;
                    }
                    Integer valueOf = o.isNull(i7) ? null : Integer.valueOf(o.getInt(i7));
                    if (valueOf == null) {
                        n35 = i40;
                        bool = null;
                    } else {
                        if (valueOf.intValue() != 0) {
                            z2 = true;
                        }
                        bool = Boolean.valueOf(z2);
                        n35 = i40;
                    }
                    arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, str, b3, i12, z3, i17, j8, z, j9, str2, str3, j10, j11, a2, j12, i27, i29, i31, j13, i34, i36, j14, a3, c2, l, bool));
                    n36 = i7;
                    n15 = i15;
                    n = i6;
                    n16 = i18;
                    n34 = i5;
                }
                o.close();
                xlc.n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                xlc.n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xlc = xlc2;
            o.close();
            xlc.n();
            throw th;
        }
    }

    public final Object call() {
        xlc xlc;
        ru8 ru8;
        String str;
        int i;
        String str2;
        int i2;
        Boolean bool;
        xlc xlc2;
        String str3;
        int i3;
        boolean z;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        Long l;
        int i9;
        Boolean bool2;
        switch (this.a) {
            case 0:
                t19 t19 = this.c;
                ilc ilc = t19.a;
                xlc xlc3 = this.b;
                Cursor o = ilc.o(xlc3, (CancellationSignal) null);
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
                    int n13 = tfg.n(o, "attaches");
                    xlc = xlc3;
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
                        if (o.moveToFirst()) {
                            long j = o.getLong(n);
                            long j2 = o.getLong(n2);
                            long j3 = o.getLong(n3);
                            long j4 = o.getLong(n4);
                            long j5 = o.getLong(n5);
                            long j6 = o.getLong(n6);
                            String string = o.isNull(n7) ? null : o.getString(n7);
                            int i10 = o.getInt(n8);
                            t19.a().getClass();
                            iu8.b.getClass();
                            iu8 n37 = oz7.n(i10);
                            int i11 = o.getInt(n9);
                            t19.a().getClass();
                            vx8 b2 = v89.b(i11);
                            long j7 = o.getLong(n10);
                            String string2 = o.isNull(n11) ? null : o.getString(n11);
                            String string3 = o.isNull(n12) ? null : o.getString(n12);
                            byte[] blob = o.isNull(n13) ? null : o.getBlob(n13);
                            t19.a().getClass();
                            k8g b3 = iz7.b(blob);
                            int i12 = o.getInt(n14);
                            boolean z2 = false;
                            boolean z3 = o.getInt(n15) != 0;
                            int i13 = o.getInt(n16);
                            long j8 = o.getLong(n17);
                            boolean z4 = o.getInt(n18) != 0;
                            long j9 = o.getLong(n19);
                            int i14 = n20;
                            if (o.isNull(i14)) {
                                i = n21;
                                str = null;
                            } else {
                                str = o.getString(i14);
                                i = n21;
                            }
                            if (o.isNull(i)) {
                                i2 = n22;
                                str2 = null;
                            } else {
                                str2 = o.getString(i);
                                i2 = n22;
                            }
                            long j10 = o.getLong(i2);
                            long j11 = o.getLong(n23);
                            int i15 = o.getInt(n24);
                            t19.a().getClass();
                            int a2 = ey8.a(i15);
                            long j12 = o.getLong(n25);
                            int i16 = o.getInt(n26);
                            int i17 = o.getInt(n27);
                            int i18 = o.getInt(n28);
                            long j13 = o.getLong(n29);
                            int i19 = o.getInt(n30);
                            int i20 = o.getInt(n31);
                            long j14 = o.getLong(n32);
                            int i21 = n33;
                            byte[] blob2 = o.isNull(i21) ? null : o.getBlob(i21);
                            t19.a().getClass();
                            List a3 = v89.a(blob2);
                            int i22 = n34;
                            ix8 c2 = t19.a().c(o.isNull(i22) ? null : o.getBlob(i22));
                            int i23 = n35;
                            Long valueOf = o.isNull(i23) ? null : Long.valueOf(o.getLong(i23));
                            Integer valueOf2 = o.isNull(n36) ? null : Integer.valueOf(o.getInt(n36));
                            if (valueOf2 == null) {
                                bool = null;
                            } else {
                                if (valueOf2.intValue() != 0) {
                                    z2 = true;
                                }
                                bool = Boolean.valueOf(z2);
                            }
                            ru8 = new ru8(j, j2, j3, j4, j5, j6, string, n37, b2, j7, string2, string3, b3, i12, z3, i13, j8, z4, j9, str, str2, j10, j11, a2, j12, i16, i17, i18, j13, i19, i20, j14, a3, c2, valueOf, bool);
                        } else {
                            ru8 = null;
                        }
                        o.close();
                        xlc.n();
                        return ru8;
                    } catch (Throwable th) {
                        th = th;
                        o.close();
                        xlc.n();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    xlc = xlc3;
                    o.close();
                    xlc.n();
                    throw th;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            default:
                t19 t192 = this.c;
                ilc ilc2 = t192.a;
                xlc xlc4 = this.b;
                Cursor o2 = ilc2.o(xlc4, (CancellationSignal) null);
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
                    int n48 = tfg.n(o2, "error");
                    int n49 = tfg.n(o2, "localized_error");
                    int n50 = tfg.n(o2, "attaches");
                    xlc2 = xlc4;
                    try {
                        int n51 = tfg.n(o2, "media_type");
                        int n52 = tfg.n(o2, "detect_share");
                        int n53 = tfg.n(o2, "msg_link_type");
                        int n54 = tfg.n(o2, "msg_link_id");
                        int n55 = tfg.n(o2, "inserted_from_msg_link");
                        int n56 = tfg.n(o2, "msg_link_chat_id");
                        int n57 = tfg.n(o2, "msg_link_chat_name");
                        int n58 = tfg.n(o2, "msg_link_chat_link");
                        int n59 = tfg.n(o2, "msg_link_out_chat_id");
                        int n60 = tfg.n(o2, "msg_link_out_msg_id");
                        int n61 = tfg.n(o2, "type");
                        int n62 = tfg.n(o2, "chat_id");
                        int n63 = tfg.n(o2, "ttl");
                        int n64 = tfg.n(o2, "channel_views");
                        int n65 = tfg.n(o2, "channel_forwards");
                        int n66 = tfg.n(o2, "view_time");
                        int n67 = tfg.n(o2, "zoom");
                        int n68 = tfg.n(o2, "options");
                        int n69 = tfg.n(o2, "live_until");
                        int n70 = tfg.n(o2, "elements");
                        int n71 = tfg.n(o2, "reactions");
                        int n72 = tfg.n(o2, "delayed_attrs_time_to_fire");
                        int n73 = tfg.n(o2, "delayed_attrs_notify_sender");
                        int i24 = n50;
                        ArrayList arrayList = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            long j15 = o2.getLong(n38);
                            long j16 = o2.getLong(n39);
                            long j17 = o2.getLong(n40);
                            long j18 = o2.getLong(n41);
                            long j19 = o2.getLong(n42);
                            long j20 = o2.getLong(n43);
                            String string4 = o2.isNull(n44) ? null : o2.getString(n44);
                            int i25 = o2.getInt(n45);
                            t192.a().getClass();
                            iu8.b.getClass();
                            iu8 n74 = oz7.n(i25);
                            int i26 = o2.getInt(n46);
                            t192.a().getClass();
                            vx8 b4 = v89.b(i26);
                            long j21 = o2.getLong(n47);
                            String string5 = o2.isNull(n48) ? null : o2.getString(n48);
                            if (o2.isNull(n49)) {
                                i3 = i24;
                                str3 = null;
                            } else {
                                str3 = o2.getString(n49);
                                i3 = i24;
                            }
                            byte[] blob3 = o2.isNull(i3) ? null : o2.getBlob(i3);
                            t192.a().getClass();
                            k8g b5 = iz7.b(blob3);
                            i24 = i3;
                            int i27 = n51;
                            int i28 = o2.getInt(i27);
                            n51 = i27;
                            int i29 = n52;
                            boolean z5 = false;
                            boolean z6 = o2.getInt(i29) != 0;
                            int i30 = n53;
                            int i31 = i29;
                            int i32 = i30;
                            int i33 = o2.getInt(i32);
                            int i34 = i32;
                            int i35 = n54;
                            long j22 = o2.getLong(i35);
                            n54 = i35;
                            int i36 = n55;
                            if (o2.getInt(i36) != 0) {
                                n55 = i36;
                                i4 = n56;
                                z = true;
                            } else {
                                n55 = i36;
                                i4 = n56;
                                z = false;
                            }
                            long j23 = o2.getLong(i4);
                            n56 = i4;
                            int i37 = n57;
                            if (o2.isNull(i37)) {
                                n57 = i37;
                                i5 = n58;
                                str4 = null;
                            } else {
                                str4 = o2.getString(i37);
                                n57 = i37;
                                i5 = n58;
                            }
                            if (o2.isNull(i5)) {
                                n58 = i5;
                                i6 = n59;
                                str5 = null;
                            } else {
                                str5 = o2.getString(i5);
                                n58 = i5;
                                i6 = n59;
                            }
                            long j24 = o2.getLong(i6);
                            n59 = i6;
                            int i38 = n60;
                            long j25 = o2.getLong(i38);
                            n60 = i38;
                            int i39 = n61;
                            int i40 = o2.getInt(i39);
                            t192.a().getClass();
                            int a4 = ey8.a(i40);
                            n61 = i39;
                            int i41 = n62;
                            long j26 = o2.getLong(i41);
                            n62 = i41;
                            int i42 = n63;
                            int i43 = o2.getInt(i42);
                            n63 = i42;
                            int i44 = n64;
                            int i45 = o2.getInt(i44);
                            n64 = i44;
                            int i46 = n65;
                            int i47 = o2.getInt(i46);
                            n65 = i46;
                            int i48 = n66;
                            long j27 = o2.getLong(i48);
                            n66 = i48;
                            int i49 = n67;
                            int i50 = o2.getInt(i49);
                            n67 = i49;
                            int i51 = n68;
                            int i52 = o2.getInt(i51);
                            n68 = i51;
                            int i53 = n69;
                            long j28 = o2.getLong(i53);
                            n69 = i53;
                            int i54 = n70;
                            byte[] blob4 = o2.isNull(i54) ? null : o2.getBlob(i54);
                            t192.a().getClass();
                            List a5 = v89.a(blob4);
                            n70 = i54;
                            int i55 = n71;
                            if (o2.isNull(i55)) {
                                i7 = i55;
                                i8 = n38;
                                bArr = null;
                            } else {
                                i7 = i55;
                                bArr = o2.getBlob(i55);
                                i8 = n38;
                            }
                            ix8 c3 = t192.a().c(bArr);
                            int i56 = n72;
                            if (o2.isNull(i56)) {
                                i9 = n73;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i56));
                                i9 = n73;
                            }
                            Integer valueOf3 = o2.isNull(i9) ? null : Integer.valueOf(o2.getInt(i9));
                            if (valueOf3 == null) {
                                n72 = i56;
                                bool2 = null;
                            } else {
                                if (valueOf3.intValue() != 0) {
                                    z5 = true;
                                }
                                bool2 = Boolean.valueOf(z5);
                                n72 = i56;
                            }
                            arrayList.add(new ru8(j15, j16, j17, j18, j19, j20, string4, n74, b4, j21, string5, str3, b5, i28, z6, i33, j22, z, j23, str4, str5, j24, j25, a4, j26, i43, i45, i47, j27, i50, i52, j28, a5, c3, l, bool2));
                            n73 = i9;
                            n52 = i31;
                            n38 = i8;
                            n53 = i34;
                            n71 = i7;
                        }
                        o2.close();
                        xlc2.n();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        o2.close();
                        xlc2.n();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    xlc2 = xlc4;
                    o2.close();
                    xlc2.n();
                    throw th;
                }
        }
    }
}
