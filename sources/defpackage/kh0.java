package defpackage;

/* renamed from: kh0  reason: default package */
public final class kh0 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final zh9 d = new zh9(6);
    public final zh9 e = new zh9(6);
    public final zh9 f = new zh9(6);

    public kh0(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        int i = f37.a;
    }

    public final void a(int i, int i2, int i3) {
        Integer d2 = ((an9) this.c.getValue()).d();
        if (d2 != null) {
            b(i, d2.intValue(), i2, i3, ((t33) ((q33) this.a.getValue())).F(), "clicked");
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [e47, java.lang.Object] */
    public final void b(int i, int i2, int i3, int i4, long j, String str) {
        String str2;
        String str3;
        String str4;
        ad adVar = (ad) this.b.getValue();
        ky7 ky7 = new ky7();
        if (i == 1) {
            str2 = "push";
        } else if (i == 2) {
            str2 = "contacts";
        } else if (i == 3) {
            str2 = "mic";
        } else {
            throw null;
        }
        ky7.put("bannerType", str2);
        ky7.put("screen", Integer.valueOf(i2));
        if (i3 == 1) {
            str3 = "small";
        } else if (i3 == 2) {
            str3 = "medium";
        } else if (i3 == 3) {
            str3 = "large";
        } else {
            throw null;
        }
        ky7.put("bannerSize", str3);
        if (i4 == 1) {
            str4 = "carousel";
        } else if (i4 == 2) {
            str4 = "banner";
        } else {
            throw null;
        }
        ky7.put("bannerShowType", str4);
        ky7 b2 = ky7.b();
        ? obj = new Object();
        obj.c = "BANNER";
        obj.b = ((hyc) ((q33) this.a.getValue())).t();
        obj.X = j;
        obj.o = str;
        obj.a = System.currentTimeMillis();
        obj.b(b2);
        adVar.j(obj.c());
    }
}
