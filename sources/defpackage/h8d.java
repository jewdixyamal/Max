package defpackage;

/* renamed from: h8d  reason: default package */
public final class h8d extends f9d {
    public final /* synthetic */ int l;
    public final Object m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8d(long j, Object obj, int i) {
        super(j);
        this.l = i;
        this.m = obj;
    }

    public final g9d a() {
        switch (this.l) {
            case 0:
                return new i8d(this);
            case 1:
                return new i8d(this, (byte) 0);
            default:
                return new h9d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h8d(es8 es8) {
        super(0);
        this.l = 0;
        this.m = es8;
    }
}
