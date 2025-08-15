package defpackage;

/* renamed from: it8  reason: default package */
public final class it8 {
    public final je7 a;
    public final je7 b;

    public it8(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [e47, java.lang.Object] */
    public final void a(long j, int i, tx8 tx8, int i2) {
        String str;
        ad adVar = (ad) this.a.getValue();
        kpa kpa = new kpa("message_id", Long.valueOf(j));
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    throw null;
                }
            }
        }
        us f = br7.f(kpa, new kpa("element_type", Integer.valueOf(i3)), new kpa("source_id", Long.valueOf(tx8.a)), new kpa("source_type", Integer.valueOf(tx8.b)));
        ? obj = new Object();
        obj.a = System.currentTimeMillis();
        obj.c = "MESSAGE_CLICKABLE_ELEMENT_ACTIONS";
        if (i2 == 1) {
            str = "clicked_clickable_element";
        } else if (i2 == 2) {
            str = "clicked_copy";
        } else if (i2 == 3) {
            str = "clicked_open_link";
        } else if (i2 == 4) {
            str = "clicked_open_mail";
        } else if (i2 == 5) {
            str = "clicked_call";
        } else {
            throw null;
        }
        obj.o = str;
        je7 je7 = this.b;
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.b(f);
        obj.X = ((t33) ((q33) je7.getValue())).F();
        adVar.j(obj.c());
    }
}
