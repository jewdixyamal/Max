package defpackage;

/* renamed from: l67  reason: default package */
public final class l67 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public l67(je7 je7, je7 je72, je7 je73) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [e47, java.lang.Object] */
    public final void a(String str, String str2, String str3) {
        ky7 ky7 = new ky7();
        je7 je7 = this.a;
        ky7.put("session_id", Long.valueOf(((t33) ((q33) je7.getValue())).F()));
        ky7.put("screen", ((an9) this.b.getValue()).d());
        ky7.put("entryPoint", str2);
        ky7.put("linkType", str3);
        ky7.put("status", "success");
        ky7 b2 = ky7.b();
        ? obj = new Object();
        obj.c = "INVITE_MAX_BANNER";
        obj.o = str;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.a = System.currentTimeMillis();
        obj.b(b2);
        ((ad) this.c.getValue()).j(obj.c());
    }

    public final void b() {
        Integer d = ((an9) this.b.getValue()).d();
        a("click_qr", (d != null && d.intValue() == 100) ? "plus" : "main", "invite_friends");
    }
}
