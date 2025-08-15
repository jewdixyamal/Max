package defpackage;

/* renamed from: cb7  reason: default package */
public enum cb7 implements s77 {
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(ya7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS);
    
    public final int a;
    public final ya7 b;

    /* access modifiers changed from: public */
    cb7(ya7 ya7) {
        this.a = 1 << ordinal();
        this.b = ya7;
    }

    public final boolean a() {
        return false;
    }

    public final int b() {
        return this.a;
    }
}
