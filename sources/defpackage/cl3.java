package defpackage;

/* renamed from: cl3  reason: default package */
public final /* synthetic */ class cl3 implements qj3, jm7, pj3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cl3(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hl3 hl3 = (hl3) obj;
                int i = hl3.m;
                boolean z = this.c;
                int i2 = this.b;
                hl3.m = z ? i2 | i : (~i2) & i;
                return;
            default:
                ((x4b) obj).H(this.b, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        ((m3b) obj).i(this.b, this.c);
    }

    public /* synthetic */ cl3(boolean z) {
        this.c = z;
        this.b = 1;
    }

    public /* synthetic */ cl3(boolean z, int i) {
        this.c = z;
        this.b = i;
    }
}
