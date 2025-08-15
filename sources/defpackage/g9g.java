package defpackage;

/* renamed from: g9g  reason: default package */
public enum g9g {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');
    
    public final char a;
    public final char b;

    static {
        g9g[] g9gArr;
        s0 = new v25(g9gArr);
    }

    /* access modifiers changed from: public */
    g9g(char c, char c2) {
        this.a = c;
        this.b = c2;
    }
}
