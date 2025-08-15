package defpackage;

/* renamed from: ucc  reason: default package */
public final /* synthetic */ class ucc implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ adc b;
    public final /* synthetic */ nb0 c;

    public /* synthetic */ ucc(adc adc, nb0 nb0, int i) {
        this.a = i;
        this.b = adc;
        this.c = nb0;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                adc adc = this.b;
                n05 n05 = adc.F;
                bkb bkb = new bkb(false, adc, lq1, this.c);
                q6d q6d = adc.e;
                d15 d15 = (d15) n05;
                synchronized (d15.b) {
                    d15.r = bkb;
                    d15.s = q6d;
                }
                return "videoEncodingFuture";
            default:
                adc adc2 = this.b;
                adc2.getClass();
                vx1 vx1 = new vx1(adc2, 4, lq1);
                e70 e70 = adc2.E;
                q6d q6d2 = adc2.e;
                e70.a.execute(new f5((Object) e70, (Object) q6d2, (Object) new l7b(adc2, 3, vx1), 3));
                d15 d152 = adc2.H;
                m5d m5d = new m5d(adc2, lq1, vx1, this.c, 12);
                synchronized (d152.b) {
                    d152.r = m5d;
                    d152.s = q6d2;
                }
                return "audioEncodingFuture";
        }
    }
}
