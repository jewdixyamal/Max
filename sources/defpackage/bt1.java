package defpackage;

import java.util.LinkedHashMap;

/* renamed from: bt1  reason: default package */
public final class bt1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public bt1(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [e47, java.lang.Object] */
    public static void c(bt1 bt1, String str, String str2, String str3, Long l, String str4, String str5, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        ad adVar = (ad) bt1.b.getValue();
        ky7 ky7 = new ky7();
        Integer d = ((an9) bt1.c.getValue()).d();
        if (d != null) {
            ky7.put("screen", Integer.valueOf(d.intValue()));
        }
        if (str2 != null) {
            ky7.put("call_id", str2);
        }
        if (str3 != null) {
            ky7.put("event_label_str", str3);
        }
        if (l != null) {
            ky7.put("event_label_int", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            ky7.put("custom_feedback", str4);
        }
        if (str5 != null) {
            ky7.put("error_type", str5);
        }
        ky7.put("is_group", Integer.valueOf(z ? 1 : 0));
        ky7 b2 = ky7.b();
        ? obj = new Object();
        obj.c = "CALL";
        je7 je7 = bt1.a;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.X = ((t33) ((q33) je7.getValue())).F();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.b(b2);
        adVar.j(obj.c());
    }

    public final void a(long j, LinkedHashMap linkedHashMap) {
        ky7 ky7 = new ky7();
        Integer d = ((an9) this.c.getValue()).d();
        if (d != null) {
            ky7.put("screen", Integer.valueOf(d.intValue()));
        }
        ky7.put("user_id2", Long.valueOf(j));
        ky7.putAll(linkedHashMap);
        b("ADMIN_CALL_SETTINGS_TO_USER", ky7.b());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [e47, java.lang.Object] */
    public final void b(String str, ky7 ky7) {
        ? obj = new Object();
        obj.c = "CALL";
        je7 je7 = this.a;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.X = ((t33) ((q33) je7.getValue())).F();
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.b(ky7);
        ((ad) this.b.getValue()).j(obj.c());
    }

    public final void d(int i, int i2) {
        long j;
        String str;
        if (i2 == 1) {
            j = 1;
        } else if (i2 == 2) {
            j = 2;
        } else {
            throw null;
        }
        Long valueOf = Long.valueOf(j);
        if (i == 1) {
            str = "COPY_LINK";
        } else if (i == 2) {
            str = "INSIDE_SHARE";
        } else if (i == 3) {
            str = "OUTSIDE_SHARE";
        } else {
            throw null;
        }
        c(this, "SHARE_CALL_LINK", (String) null, str, valueOf, (String) null, (String) null, true, 50);
    }

    public final void e(at1 at1, boolean z) {
        c(this, "START_CALL", (String) null, at1.a(), Long.valueOf(z ? 2 : 1), (String) null, (String) null, at1 instanceof ys1, 50);
    }
}
