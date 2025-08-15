package defpackage;

/* renamed from: mg4  reason: default package */
public enum mg4 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);
    
    public static final xxc o = null;
    public final byte a;
    public final khe b;
    public final khe c;

    /* JADX WARNING: type inference failed for: r0v2, types: [xxc, java.lang.Object] */
    static {
        o = new Object();
    }

    /* access modifiers changed from: public */
    mg4(byte b2) {
        this.a = b2;
        this.b = new khe(new lg4(this, 0));
        this.c = new khe(new lg4(this, 1));
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
