package defpackage;

/* renamed from: joc  reason: default package */
public final /* synthetic */ class joc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ koc b;
    public final /* synthetic */ long c;

    public /* synthetic */ joc(koc koc, long j, int i) {
        this.a = i;
        this.b = koc;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                koc koc = this.b;
                koc.m.offer(Long.valueOf(this.c));
                koc.b();
                return;
            default:
                koc koc2 = this.b;
                koc2.getClass();
                koc2.f.post(new joc(koc2, this.c, 0));
                return;
        }
    }
}
