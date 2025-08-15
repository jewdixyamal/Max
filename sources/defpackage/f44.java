package defpackage;

/* renamed from: f44  reason: default package */
public final class f44 {
    public static final f44 f = new f44(false, false, vv7.a, false, (je5) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final je5 d;
    public final gi9 e;

    public f44(boolean z, boolean z2, gi9 gi9, boolean z3, je5 je5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = je5;
        gi9 gi92 = new gi9(gi9.d);
        gi92.b(gi9);
        this.e = gi92;
    }

    public final String toString() {
        return "DispatchParams(retry=" + this.a + ", skipDebounce=" + this.b + ", allChats=" + this.c + ", serverChats=" + this.e + ", notification=" + this.d + ")";
    }
}
