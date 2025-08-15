package defpackage;

import android.content.Context;

/* renamed from: i2f  reason: default package */
public final class i2f extends Thread {
    public final /* synthetic */ ccd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i2f(ccd ccd, Context context, String str, long j) {
        super("TransmuxTranscodeHelper:Mp4Info");
        this.a = ccd;
        this.b = context;
        this.c = str;
        this.o = j;
    }

    public final void run() {
        ccd ccd = this.a;
        try {
            ccd.l(zd9.a(this.b, this.o, this.c));
        } catch (Exception e) {
            ccd.m(e);
        }
    }
}
