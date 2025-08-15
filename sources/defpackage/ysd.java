package defpackage;

/* renamed from: ysd  reason: default package */
public final class ysd {
    public static final /* synthetic */ bc7[] g;
    public final xsd a = new xsd(this, 0);
    public final xsd b;
    public final xsd c;
    public float d;
    public int e;
    public float f;

    static {
        Class<ysd> cls = ysd.class;
        g = new bc7[]{new oi9(cls, "from", "getFrom$common_release()F"), rh4.g(nec.a, cls, "to", "getTo$common_release()F"), new oi9(cls, "stepSize", "getStepSize$common_release()F")};
    }

    public ysd() {
        xsd xsd = new xsd(this, 1);
        this.b = xsd;
        this.c = new xsd(this, 2);
        this.e = a();
        float b2 = this.d - b();
        bc7 bc7 = g[1];
        this.f = ote.d(b2 / (((Number) xsd.b).floatValue() - b()), 0.0f, 1.0f);
    }

    public final int a() {
        bc7[] bc7Arr = g;
        bc7 bc7 = bc7Arr[1];
        bc7 bc72 = bc7Arr[2];
        return tu0.G((((Number) this.b.b).floatValue() - b()) / ((Number) this.c.b).floatValue()) + 1;
    }

    public final float b() {
        bc7 bc7 = g[0];
        return ((Number) this.a.b).floatValue();
    }

    public final void c(float f2) {
        float b2 = b();
        bc7[] bc7Arr = g;
        bc7 bc7 = bc7Arr[1];
        xsd xsd = this.b;
        float d2 = ote.d(f2, b2, ((Number) xsd.b).floatValue());
        this.d = d2;
        float b3 = d2 - b();
        bc7 bc72 = bc7Arr[1];
        this.f = ote.d(b3 / (((Number) xsd.b).floatValue() - b()), 0.0f, 1.0f);
    }
}
