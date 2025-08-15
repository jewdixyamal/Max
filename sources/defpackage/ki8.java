package defpackage;

/* renamed from: ki8  reason: default package */
public final /* synthetic */ class ki8 implements ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ki8(si8 si8, long j, int i) {
        this.a = i;
        this.b = si8;
        this.c = j;
    }

    public final void b(oh8 oh8) {
        switch (this.a) {
            case 0:
                this.b.f.s.Z((int) this.c);
                return;
            default:
                this.b.f.s.seekTo(this.c);
                return;
        }
    }
}
