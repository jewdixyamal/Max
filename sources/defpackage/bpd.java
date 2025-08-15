package defpackage;

/* renamed from: bpd  reason: default package */
public enum bpd {
    ;
    
    public static final mq9 b = null;
    public final String a;

    static {
        bpd[] bpdArr;
        o = new v25(bpdArr);
        b = new mq9(16);
    }

    /* access modifiers changed from: public */
    bpd(String str) {
        this.a = str;
    }

    public static final bpd a(String str) {
        Object obj;
        b.getClass();
        v25 v25 = o;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (tpa.f(((bpd) obj).a, str)) {
                break;
            }
        }
        return (bpd) obj;
    }
}
