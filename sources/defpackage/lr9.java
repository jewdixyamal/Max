package defpackage;

/* renamed from: lr9  reason: default package */
public final class lr9 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;

    public lr9(rm4 rm4, rm4 rm42, rm4 rm43, rm4 rm44, rm4 rm45) {
        this.a = rm4;
        this.b = rm42;
        this.c = rm43;
        this.d = rm44;
        this.e = rm45;
    }

    public final void a(mr9 mr9) {
        long j = mr9.s0;
        if (j != 0) {
            hm9.m("lr9", "setFavoritesSync: %d", Long.valueOf(j));
            ((hyc) ((q33) this.c.get())).l("user.favoritesLastSync", Long.valueOf(mr9.s0));
        }
    }
}
