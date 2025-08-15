package defpackage;

import java.util.List;

/* renamed from: iu8  reason: default package */
public enum iu8 {
    UNKNOWN(0),
    SENDING(10),
    SENT(20),
    READ(30),
    ERROR(40);
    
    public static final oz7 b = null;
    public static final List c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, oz7] */
    static {
        iu8[] iu8Arr;
        v25 v25 = new v25(iu8Arr);
        b = new Object();
        c = x53.D0(v25);
    }

    /* access modifiers changed from: public */
    iu8(int i) {
        this.a = i;
    }
}
