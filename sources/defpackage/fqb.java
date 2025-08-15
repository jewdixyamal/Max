package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: fqb  reason: default package */
public final class fqb {
    public static final /* synthetic */ bc7[] e;
    public static final String f;
    public final y7d a;
    public final AtomicLong b = new AtomicLong();
    public final rm4 c;
    public final rm4 d;

    static {
        Class<fqb> cls = fqb.class;
        e = new bc7[]{new hob(cls, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), zr6.e(nec.a, cls, "device", "getDevice()Lru/ok/tamtam/Device;", 0)};
        f = cls.getName();
    }

    public fqb(y7d y7d, rm4 rm4, rm4 rm42) {
        this.a = y7d;
        this.c = rm4;
        this.d = rm42;
    }

    public final ri4 a() {
        bc7 bc7 = e[1];
        return (ri4) this.d.get();
    }
}
